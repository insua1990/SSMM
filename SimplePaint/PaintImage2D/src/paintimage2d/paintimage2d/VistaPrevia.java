package paintimage2d;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;

public class VistaPrevia extends javax.swing.JPanel {

    private int tipo;
    private Color colorPrincipal,colorSecuandario;
    private int orientacion;

    public VistaPrevia() {
        this.tipo = 2;
        this.colorPrincipal = null;
        this.colorSecuandario = null;
        this.orientacion = 1;
    }

    
    
    public VistaPrevia(int tipo, Color colorPrincipal, Color colorSecuandario, boolean horizontal) {
        this.tipo = tipo;
        this.colorPrincipal = colorPrincipal;
        this.colorSecuandario = colorSecuandario;
        this.orientacion = 1;
    }

    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public Color getColorSecuandario() {
        return colorSecuandario;
    }

    public void setColorSecuandario(Color colorSecuandario) {
        this.colorSecuandario = colorSecuandario;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(int horizontal) {
        this.orientacion = horizontal;
    }
     
    private void pintarFondoLiso(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(colorPrincipal);

        g2d.fillRect(0,0,this.getWidth()-2,this.getHeight()-2);
    }
    private void pintarFondoDegradado(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Paint p;
        if(orientacion == 0){
            p = new GradientPaint(new Point(0,0), colorPrincipal,new Point(this.getWidth(),0), colorSecuandario);
        }else{
            p = new GradientPaint(new Point(0,0), colorPrincipal,new Point(0,this.getHeight()), colorSecuandario);
        }
        g2d.setPaint(p);
        g2d.fillRect(0,0,this.getWidth()-2,this.getHeight()-2);
        
        
    }
     private void pintarFondoVacio(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);

        g2d.drawRect(0,0,this.getWidth()-2,this.getHeight()-2);
    }
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        if(this.tipo == 0){
            pintarFondoLiso(g);
        }else if(this.tipo == 1){
            pintarFondoDegradado(g);
        }else if(this.tipo == 2){
            pintarFondoVacio(g);
        }
    }
}