package sm.jmi.graficos;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangulo extends Rectangle2D.Double
{
    private int grosor;
    private Stroke trazo;
    private Paint relleno;
    private RenderingHints alisado;
    private float gradoTransparencia;
    private Composite transparencia;
    private boolean fill;
    private Color colorGrad1,colorGrad2;
    private float[] patronTrazo;
    private int tipoRelleno;

    public float getGradoTransparencia() {
        return gradoTransparencia;
    }

    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
    }

    public int getTipoRelleno() {
        return tipoRelleno;
    }

    public void setTipoRelleno(int tipoRelleno) {
        this.tipoRelleno = tipoRelleno;
        
    }
    
    public float[] getPatronTrazo() {
        return patronTrazo;
    }

    public void setPatronTrazo(float[] patronTrazo) {
        this.patronTrazo = patronTrazo;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
    }

    public Color getColorGrad1() {
        return colorGrad1;
    }

    public void setColorGrad1(Color colorGrad1) {
        this.colorGrad1 = colorGrad1;
        
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
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
    }
    
    public Color getColorgrad1() {
        return colorGrad1;
    }

    public void setColorgrad1(Color colorgrad1) {
        this.colorGrad1 = colorgrad1;
        
    }

    public Color getColorGrad2() {
        return colorGrad2;
    }

    public void setColorGrad2(Color colorGrad2) {
        this.colorGrad2 = colorGrad2;
        
    }
    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
        
    }
    public Stroke getTrazo() {
        return trazo;
    }

    public Paint getRelleno() {
        return relleno;
    }

    public void setRelleno(){
        Point2D p1 = new Point((int)this.x,(int)this.y);
        Point2D p2 = new Point((int)this.x+(int)this.width,(int)this.y);
        Point2D p3 = new Point((int)this.x,(int)this.y+(int)this.height);
        if(isFill()){
            if(colorGrad2!=null){
                if(tipoRelleno == 0){
                    this.relleno = new GradientPaint(p1, colorGrad1, p2, colorGrad2);
                }else if(tipoRelleno == 1){
                    this.relleno = new GradientPaint(p1, colorGrad1, p3, colorGrad2);
                }
            }else 
                this.relleno = new GradientPaint(p1, colorGrad1, p2, colorGrad1);
        }else 
            this.relleno = colorGrad1; 
       
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

    
    public Rectangulo(Rectangle2D r){
        super(r.getX(),r.getY(),r.getWidth(),r.getHeight());
        this.fill = false;
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = Color.BLACK;
    }
    
    public Rectangulo(Point p){
        super(p.x,p.y,0,0);
        this.fill = false;
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = Color.BLACK;
    }
    
    public Rectangulo(Point p,double width,double height){
        super(p.x,p.y,width,height);
        this.fill = false;
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = Color.BLACK;
    }
    
    public Rectangulo(Point2D p,double width,double height){
        super(p.getX(),p.getY(),width,height);
        this.fill = false;
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = Color.BLACK;
    }
    
    public Rectangulo(double x,double y,double width,double height){
        super(x,y,width,height);
        this.fill = false;
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = Color.BLACK;
    }
    
    public void setLocation(Point inicio,Point ancla){
        double dx = ancla.x - inicio.x;
        double dy = ancla.y - inicio.y;
        
        double xFin = this.x + this.width + dx; 
        double yFin = this.y + this.height + dy;
        
        this.setFrameFromDiagonal(this.x+dx,this.y+dy,xFin,yFin);
    }
    
    
}
