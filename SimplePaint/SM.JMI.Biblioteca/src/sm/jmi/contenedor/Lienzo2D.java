package sm.jmi.contenedor;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import sm.jmi.graficos.*;

public class Lienzo2D extends JPanel implements MouseListener, MouseMotionListener {

    private int figura;

    private List<Shape> vShape;
    
    private boolean edicion,alisado,transparencia,relleno;
    private boolean Figura3clickActiva;
    
    private Shape formaActual;
    private Shape figuraSeleccionada;
    private Shape clip;
    
    private int grosorTrazo;
    private float[] patronTrazoActual;
    private Stroke trazoActual;
    private int tipoRelleno;
    private Color color1grad,color2grad;
    private Paint rellenoActual;
    private float gradoTransparencia;
    private Composite transparenciaActual;
    private RenderingHints alisarActual;
    
    private Point puntoinicio;
    private Point puntofin;
    
    private final Stroke trazoMarco;
    private MiBoundingBox marcoSeleccion;

    public int getTipoRelleno() {
        return tipoRelleno;
    }

    public void setTipoRelleno(int tipoRelleno) {
        this.tipoRelleno = tipoRelleno;
    }

    public Color getColor1grad() {
        return color1grad;
    }

    public void setColor1grad(Color color1grad) {
        this.color1grad = color1grad;
    }

    public Color getColor2grad() {
        return color2grad;
    }

    public void setColor2grad(Color color2grad) {
        this.color2grad = color2grad;
    }

    public float getGradoTransparencia() {
        return gradoTransparencia;
    }

    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
        this.transparenciaActual = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
    }

    public float[] getPatronTrazoActual() {
        return patronTrazoActual;
    }

    public void setPatronTrazoActual(float[] patronTrazoActual) {
        this.patronTrazoActual = patronTrazoActual;
        this.trazoActual = new BasicStroke(this.grosorTrazo,BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 1.0f, this.patronTrazoActual, 1.0f);
    }

    public int getGrosorTrazo() {
        return grosorTrazo;
    }

    public void setGrosorTrazo(int grosorTrazo) {
        this.grosorTrazo = grosorTrazo;
        this.trazoActual = new BasicStroke(this.grosorTrazo,BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 1.0f, this.patronTrazoActual, 1.0f);
    }

    public Shape getClip() {
        return clip;
    }

    public void setClip(Shape clip) {
        this.clip = clip;
    }
    
    public int getFigura() {
        return this.figura;
    }

    public void setFigura(int tipo) {
        this.figura = tipo;
    }

    public Point getPuntoinicio() {
        return puntoinicio;
    }

    public void setPuntoinicio(Point puntoinicio) {
        this.puntoinicio = puntoinicio;
    }

    public Point getPuntofin() {
        return puntofin;
    }

    public void setPuntofin(Point puntofin) {
        this.puntofin = puntofin;
    }
    
    public boolean isEdicion() {
        return edicion;
    }

    public void setEdicion(boolean edicion) {
        this.edicion = edicion;
    }

    public Point getPuntoInicio() {
        return puntoinicio;
    }

    public void setPuntoInicio(Point puntoinicio) {
        this.puntoinicio = puntoinicio;
    }

    public List<Shape> getvShape() {
        return vShape;
    }

    public void setvShape(List<Shape> vShape) {
        this.vShape = vShape;
    }

    public Shape getFiguraSeleccionada() {
        return figuraSeleccionada;
    }

    public void setFiguraSeleccionada(Shape figuraSeleccionada) {
        this.figuraSeleccionada = figuraSeleccionada;
    }

    public Shape getFormaActual() {
        return formaActual;
    }

    public void setFormaActual(Shape formaActual) {
        this.formaActual = formaActual;
    }

    public Composite getTransparenciaActual() {
        return transparenciaActual;
    }

    public void setTransparenciaActual(float gradoTrans) {
        this.gradoTransparencia = gradoTrans;
        this.transparenciaActual = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTrans);
    }

    public RenderingHints getAlisarActual() {
        return alisarActual;
    }

    public void setAlisarActual(RenderingHints alisarActual) {
        this.alisarActual = alisarActual;
    }

    public Paint getRellenoActual() {
        return rellenoActual;
    }

    public void setRellenoActual(Paint rellenoActua) {
        this.rellenoActual = rellenoActua;
    }

    public boolean isFigura3clickActiva() {
        return Figura3clickActiva;
    }

    public void setFigura3clickActiva(boolean Figura3clickActiva) {
        this.Figura3clickActiva = Figura3clickActiva;
    }

    public MiBoundingBox getMarcoSeleccion() {
        return marcoSeleccion;
    }

    public void setMarcoSeleccion(MiBoundingBox marcoSeleccion) {
        this.marcoSeleccion = marcoSeleccion;
    }

    public Stroke getTrazoActual() {
        return trazoActual;
    }

    public void setTrazoActual(Stroke grosor) {
        this.trazoActual = grosor;
    }

    public boolean isAlisado() {
        return alisado;
    }

    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }

    public boolean isTransparencia() {
        return transparencia;
    }

    public void setTransparencia(boolean transparencia) {
        this.transparencia = transparencia;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

  

    public Lienzo2D() {
        this.setLocation(1, 1);
        addMouseListener(this);
        addMouseMotionListener(this);
        
        this.vShape = new ArrayList<>();
        
        this.relleno = false;
        this.alisado = false;
        this.edicion = false;
        this.transparencia = false;
        this.Figura3clickActiva = false;
        
        this.figuraSeleccionada = null;
        this.formaActual = null;
        this.figura = 0;
        
        this.puntoinicio = null;
        this.puntofin = null;
    
        this.alisarActual = new RenderingHints(null, ui);
        this.grosorTrazo = 1;
        this.patronTrazoActual = null;
        this.trazoActual = new BasicStroke(this.grosorTrazo,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazoActual,1.0f);
        this.color1grad = new Color(0,0,0);
        this.color2grad = new Color(0,0,0);
        this.rellenoActual = Color.BLACK;
        
        this.gradoTransparencia = 1.0f;
        this.transparenciaActual = null;
        this.marcoSeleccion = null;
        this.trazoMarco = new BasicStroke(3.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,1.0f,new float[]{10.0f,10.0f},1.0f);

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.clip(clip);
        pintarFormas(g2d);
    }

    

    public void pintarFormas(Graphics2D g2d) {
        for (Shape S : vShape) {
            
            setAtributos(g2d, S);
            
            if(S instanceof Rectangulo){
                if(((Rectangulo)S).isFill()) g2d.fill(S);
            }else if(S instanceof RectanguloRedondeado){
                if(((RectanguloRedondeado)S).isFill()) g2d.fill(S);
            }else if(S instanceof Elipse){
                if(((Elipse)S).isFill()) g2d.fill(S);
            }
            
            g2d.draw(S);
        }
        
        if(edicion){
                if(marcoSeleccion!=null){
                    g2d.setStroke(trazoMarco);
                    g2d.setColor(Color.black);
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2d.draw(marcoSeleccion);
                }
        }
    }
    
    private void setAtributos(Graphics2D g2d,Shape S){
            RenderingHints alisado1 = null;
            Composite transparencia1 = null;
            Paint relleno1 =  null;
            Stroke trazo1 = null;
            if(S instanceof Punto){
                alisado1 = ((Punto)S).getAlisado();
                transparencia1 = ((Punto)S).getTransparencia();
                relleno1 = ((Punto)S).getRelleno();
                trazo1 = ((Punto)S).getTrazo();
            }else if(S instanceof Linea){
                alisado1 = ((Linea)S).getAlisado();
                transparencia1 = ((Linea)S).getTransparencia();
                relleno1 = ((Linea)S).getRelleno();
                trazo1 = ((Linea)S).getTrazo();
            }else if(S instanceof Rectangulo){
                alisado1 = ((Rectangulo)S).getAlisado();
                transparencia1 = ((Rectangulo)S).getTransparencia();
                relleno1 = ((Rectangulo)S).getRelleno();
                trazo1 = ((Rectangulo)S).getTrazo();
            }else if(S instanceof RectanguloRedondeado){
                alisado1 = ((RectanguloRedondeado)S).getAlisado();
                transparencia1 = ((RectanguloRedondeado)S).getTransparencia();
                relleno1 = ((RectanguloRedondeado)S).getRelleno();
                trazo1 = ((RectanguloRedondeado)S).getTrazo();
            }else if(S instanceof Elipse){
                alisado1 = ((Elipse)S).getAlisado();
                transparencia1 = ((Elipse)S).getTransparencia();
                relleno1 = ((Elipse)S).getRelleno();
                trazo1 = ((Elipse)S).getTrazo();
            }else if(S instanceof Curva){
                alisado1 = ((Curva)S).getAlisado();
                transparencia1 = ((Curva)S).getTransparencia();
                relleno1 = ((Curva)S).getRelleno();
                trazo1 = ((Curva)S).getTrazo();
            }
            
            g2d.setStroke(trazo1);
            g2d.setComposite(transparencia1);
            g2d.setPaint(relleno1);
            g2d.setRenderingHints(alisado1);
            
    }

    
    
    @Override
    public void mousePressed(MouseEvent evt) {
        puntoinicio = evt.getPoint();
        if(!edicion){
            crearForma(puntoinicio);
        }else{
            seleccionarForma(puntoinicio);
        }
        repaint();
    }
    private void crearForma(Point p) {
        switch (figura) {
            case 0:
                Punto p1 = new Punto(p);
                p1.setGrosor(grosorTrazo);
                p1.setRelleno(rellenoActual);
                p1.setGradoTransparencia(gradoTransparencia);
                p1.setAlisado(alisarActual);
                formaActual = p1;
                break;
            case 1:
                Linea l = new Linea(p,p);
                l.setGrosor(grosorTrazo);
                l.setColorgrad1(color1grad);
                l.setColorGrad2(color2grad);
                l.setTipoRelleno(tipoRelleno);
                l.setRelleno();
                l.setGradoTransparencia(gradoTransparencia);
                l.setAlisado(alisarActual);
                l.setPatronTrazo(patronTrazoActual);
                formaActual =  l;              
                break;
            case 2:
                Rectangulo r = new Rectangulo(p);
                r.setGrosor(grosorTrazo);
                r.setFill(relleno);
                r.setColorgrad1(color1grad);
                r.setColorGrad2(color2grad);
                r.setTipoRelleno(tipoRelleno);
                r.setRelleno();
                r.setGradoTransparencia(gradoTransparencia);
                r.setAlisado(alisarActual);
                r.setPatronTrazo(patronTrazoActual);
                formaActual =  r;            
                break;
            case 3:
                Elipse e =  new Elipse(p);        
                e.setGrosor(grosorTrazo);
                e.setFill(relleno);
                e.setColorgrad1(color1grad);
                e.setColorGrad2(color2grad);
                e.setTipoRelleno(tipoRelleno);
                e.setRelleno();
                e.setGradoTransparencia(gradoTransparencia);
                e.setAlisado(alisarActual);
                e.setPatronTrazo(patronTrazoActual);
                formaActual =  e;             
                break;
            case 4: 
                RectanguloRedondeado rr = new RectanguloRedondeado(p);
                rr.setGrosor(grosorTrazo);
                rr.setFill(relleno);
                rr.setColorgrad1(color1grad);
                rr.setColorGrad2(color2grad);
                rr.setTipoRelleno(tipoRelleno);
                rr.setRelleno();;
                rr.setGradoTransparencia(gradoTransparencia);
                rr.setAlisado(alisarActual);
                rr.setPatronTrazo(patronTrazoActual);
                formaActual =  rr;            
                break;
            case 5:
                Curva c = new Curva(p,p,null);
                c.setGrosor(grosorTrazo);
                c.setColorgrad1(color1grad);
                c.setColorGrad2(color2grad);
                c.setTipoRelleno(tipoRelleno);
                c.setRelleno();
                c.setGradoTransparencia(gradoTransparencia);
                c.setAlisado(alisarActual);
                c.setPatronTrazo(patronTrazoActual);
                formaActual = c;
                break;
        }
        
        vShape.add(formaActual);

    }

    
   
    private void seleccionarForma(Point p) {
        
        boolean encontrado = false;
        int i = vShape.size() - 1;
        
        while (i >= 0 && !encontrado) {
               
            figuraSeleccionada = vShape.get(i);
            
            if(figuraSeleccionada instanceof Punto){
                if(((Punto)figuraSeleccionada).contains(p)) encontrado = true;
            }else if(figuraSeleccionada instanceof Linea){
                if(((Linea)figuraSeleccionada).contains(p)) encontrado = true;
            }else if(figuraSeleccionada instanceof Curva){
                if(((Curva)figuraSeleccionada).contains(p)) encontrado = true;
            }else{
                if(((RectangularShape)figuraSeleccionada).contains(p)) encontrado = true;
            }
                
            i--;
            
            if(encontrado) {
                marcoSeleccion = new MiBoundingBox(figuraSeleccionada.getBounds2D());
            }else{
                marcoSeleccion = null;
                figuraSeleccionada = null;
            }
                
        }
        
    }
    
    @Override
    public void mouseDragged(MouseEvent evt) {
        puntofin = evt.getPoint();
        if(edicion){
            moverForma(puntoinicio,puntofin);
            puntoinicio = puntofin;
        }else{
            actualizarForma(); 
        }
        repaint(); 
    }
    
    private void moverForma(Point pIni, Point pFin) {
        if(figuraSeleccionada!=null){
            if(figuraSeleccionada instanceof Punto){
                ((Punto)figuraSeleccionada).setLocation(pIni,pFin);
            }else if(figuraSeleccionada instanceof Linea){
                ((Linea)figuraSeleccionada).setLocation(pIni,pFin);
                ((Linea)figuraSeleccionada).setRelleno();
            }else if(figuraSeleccionada instanceof Rectangulo){
                ((Rectangulo)figuraSeleccionada).setLocation(pIni,pFin);
                ((Rectangulo)figuraSeleccionada).setRelleno();
            }else if(figuraSeleccionada instanceof RectanguloRedondeado){
                ((RectanguloRedondeado)figuraSeleccionada).setLocation(pIni,pFin);
                ((RectanguloRedondeado)figuraSeleccionada).setRelleno();
            }else if(figuraSeleccionada instanceof Elipse){
                ((Elipse)figuraSeleccionada).setLocation(pIni,pFin);
                ((Elipse)figuraSeleccionada).setRelleno();
            }else if(figuraSeleccionada instanceof Curva){
                ((Curva)figuraSeleccionada).setLocation(pIni,pFin);
                ((Curva)figuraSeleccionada).setRelleno();
            }
            marcoSeleccion = new MiBoundingBox(figuraSeleccionada.getBounds2D());
        }
    }
    
    private void actualizarForma() {
        if(formaActual!=null){
            if(formaActual instanceof Linea){
                ((Linea)formaActual).setLine(puntoinicio,puntofin);
                ((Linea)formaActual).setRelleno();
            }else if(formaActual instanceof Curva){
                ((Curva)formaActual).setCurve(puntoinicio,puntofin,null);
                ((Curva)formaActual).setRelleno();
            }else{
                if(!(formaActual instanceof Punto))((RectangularShape)formaActual).setFrameFromDiagonal(puntoinicio, puntofin);
                
                if(formaActual instanceof Rectangulo){
                    ((Rectangulo)formaActual).setRelleno();
                }else if(formaActual instanceof RectanguloRedondeado){
                    ((RectanguloRedondeado)formaActual).setRelleno();
                }else if(formaActual instanceof Elipse){
                    ((Elipse)formaActual).setRelleno();
                }
            }
        }
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        this.formaActual = null;
        if(!edicion){
            this.marcoSeleccion = null;
        }
        
        repaint();
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    
}
