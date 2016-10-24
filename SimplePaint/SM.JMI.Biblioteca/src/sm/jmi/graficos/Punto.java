package sm.jmi.graficos;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class Punto extends Rectangle2D.Double{
    
    private int grosor;
    private Stroke trazo;
    private Paint relleno;
    private RenderingHints alisado;
    private float gradoTransparencia;
    private Composite transparencia;

    public float getGradoTransparencia() {
        return gradoTransparencia;
    }

    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
         this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
    }
    
    public void setTrazo(Stroke trazo) {
        this.trazo = trazo;
    }

    public void setTransparencia(Composite transparencia) {
        this.transparencia = transparencia;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
        this.trazo = new BasicStroke(this.grosor);
    }
    
    public Stroke getTrazo() {
        return trazo;
    }
    
    public Paint getRelleno() {
        return relleno;
    }

    public void setRelleno(Paint relleno) {
        this.relleno = relleno;
    }

    public RenderingHints getAlisado() {
        return alisado;
    }

    public void setAlisado(RenderingHints alisado) {
        this.alisado = alisado;
    }

    public Composite getTransparencia() {
        return transparencia;
    }

    
    public Punto(Point p){
        super(p.x,p.y,0,0);
        this.grosor = 1;
        this.gradoTransparencia = 1.0f;
        this.trazo = new BasicStroke(this.grosor);
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        
    }
    
    public Punto(Point2D p){
        super(p.getX(),p.getY(),0,0);
        this.grosor = 1;
        this.gradoTransparencia = 1.0f;
        this.trazo = new BasicStroke(this.grosor);
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
    }

    public boolean contains(Point p){
        return Math.abs((this.x-p.x)) < 3 && Math.abs((this.y-p.y)) < 3;
    }
    
    public void setLocation(Point puntoInicio,Point puntoAncla){
        double dx = puntoAncla.x - puntoInicio.x;
        double dy = puntoAncla.y - puntoInicio.y;
        
        double xFin = this.x + this.width + dx; 
        double yFin = this.y + this.height + dy;
        
        this.setFrameFromDiagonal(this.x+dx,this.y+dy,xFin,yFin);   
    }
     
    
}
