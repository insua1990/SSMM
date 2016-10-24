package paintimage2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class CeldaTamañoImagen extends JTextField implements KeyListener{
    
    boolean bloquearDelete,bloquearSuprimir,bloqueoTotal;
    int posicionActualCursor;
    VentanaImagen padre;
    
    public CeldaTamañoImagen() throws BadLocationException {
        this.setDocument(new LimitadorCelda4digitos());
        addKeyListener(this);
        this.bloquearDelete =false;
        this.bloquearSuprimir =false;
        this.bloqueoTotal=false;
        this.posicionActualCursor=0;
    }

    public CeldaTamañoImagen(String text) throws BadLocationException {
        super(text);
        this.setDocument(new LimitadorCelda4digitos());
        addKeyListener(this);
        this.bloquearDelete =false;
        this.bloquearSuprimir =false;
        this.bloqueoTotal=false;
        this.posicionActualCursor=0;
        this.setText(text);
        
    }

    public VentanaImagen getPadre() {
        return padre;
    }

    public void setPadre(VentanaImagen padre) {
        this.padre = padre;
    }

    
    
    public void setBloquear(int cursor,String text,int tam){
        // Contamos los ceros que hay en la celda y 
        // guardamos la posición del digito que no sea cero (con uno va bien)
        int contadorCeros= 0;
        int pos=-1;
        int a = getSelectionStart();
        int b = getSelectionEnd();
        for(int i = 0; i<tam;i++){
            if(text.charAt(i)=='0') {
                contadorCeros++; 
            }else{
                pos=i;
            }
        }
        // Si son todos ceros menos 1 y el cursor esta a la derecha 
        // del unico digito no 0 y no hemos seleccionado con el raton varias cifras
        bloquearDelete = (contadorCeros==tam-1 && cursor==pos+1 && a-b==0 );
        
        // Si son todo ceros menos uno y el cursor está a la izq del único digito
        // que no es cero (nunca habrá ceros a la izq por eso no pregunto si a-b==0)
        bloquearSuprimir = (contadorCeros==tam-1 && cursor==pos );
    }
    
    public void setBloqueoConSeleccion(int cursor,String text,int tam){
        // Cuando selecciono varias cifras con el ratón
        int a = getSelectionStart();
        int b = getSelectionEnd();
        boolean puedoborrar=true;
        if(a>b){
            int aux = b;
            b = a;
            a = aux;
        }
        
        // Recorro la celda y miro si lo que me queda sin seleccionar es 0
        // para bloquear supr y backspace
        int i= 0;    
        while(i<tam && puedoborrar){
            if(!(i>=a && i<b)) {
                if(text.charAt(i)!='0') puedoborrar=false; 
            }
            i++;
        }
        bloqueoTotal = puedoborrar;
    }
    
    public void limpiarCerosIzq(String text,int tam){
        // esta func limpia los ceros innecesarios que me queden a la 
        // izq despues de una operación de escritura o borrado
        
        int contadorCeros=0;
        boolean puedoLimpiar = true;
        int i=0;
        while(puedoLimpiar && i<tam){
            if(text.charAt(i)=='0') 
                contadorCeros++; 
            else 
                puedoLimpiar=false;
            i++;
        }

        if(contadorCeros!=0){
            char[] aux= new char[tam-contadorCeros];
            int posVectorAux=0;
            for (int k = contadorCeros;k<tam;k++) {
                aux[posVectorAux] = text.charAt(k);
                posVectorAux++;
            }
            this.setText(String.valueOf(aux));
            this.setCaretPosition(0);
        }
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        if(e.getKeyChar()=='0' && posicionActualCursor==0)
            e.consume();
        
        if(bloqueoTotal && (!(Character.isDigit(e.getKeyChar())) || e.getKeyChar()=='0')) e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        String textoactual = this.getText();
        posicionActualCursor = this.getCaretPosition();
        int tamtextoactual = textoactual.length();
        
        setBloquear(posicionActualCursor,textoactual,tamtextoactual);
        setBloqueoConSeleccion(posicionActualCursor,textoactual,tamtextoactual);
        
        if(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE && (bloquearDelete || bloqueoTotal))
            e.consume();
        
        if(e.getExtendedKeyCode() == KeyEvent.VK_DELETE && (bloquearSuprimir|| bloqueoTotal))
            e.consume();
        
        if(bloqueoTotal) 
            e.consume();
        
        if(Character.isDigit(e.getKeyChar()) || e.getExtendedKeyCode() == KeyEvent.VK_DELETE ||
                e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE){
            this.getPadre().getEscalar().setVisible(true);
            this.getPadre().getRedimensionar().setVisible(true);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        posicionActualCursor = this.getCaretPosition();
        String textoactual = this.getText();
        int tamtextoactual = textoactual.length();
        
        limpiarCerosIzq(textoactual,tamtextoactual);
    }
    
}
