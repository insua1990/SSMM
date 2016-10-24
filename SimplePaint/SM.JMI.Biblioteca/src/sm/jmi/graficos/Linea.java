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

public class Linea extends java.awt.geom.Line2D.Double {

    private int grosor;
    private Stroke trazo;
    private Color colorgrad1,colorGrad2;
    private int tipoRelleno;
    private Paint relleno;
    private RenderingHints alisado;
    private float[] patronTrazo;
    private float gradoTransparencia;
    private Composite transparencia;

    public float getGradoTransparencia() {
        return gradoTransparencia;
    }

    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,this.gradoTransparencia);
    }
    
    public int getTipoRelleno() {
        return tipoRelleno;
    }

    public void setTipoRelleno(int tipoRelleno) {
        this.tipoRelleno = tipoRelleno;
        
    }
    public void setRelleno(Paint relleno) {
        this.relleno = relleno;
    }

    public float[] getPatronTrazo() {
        return patronTrazo;
    }

    public void setPatronTrazo(float[] patronTrazo) {
        this.patronTrazo = patronTrazo;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
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
        return colorgrad1;
    }

    public void setColorgrad1(Color colorgrad1) {
        this.colorgrad1 = colorgrad1;
    }

    public Color getColorGrad2() {
        return colorGrad2;
    }

    public void setColorGrad2(Color colorGrad2) {
        this.colorGrad2 = colorGrad2;
    }

    public Stroke getTrazo() {
        return trazo;
    }

    public Paint getRelleno() {
        return relleno;
    }

    public void setRelleno() {
        Point2D p1 = this.getP1();
        Point2D p2 = new Point((int)getP2().getX(),(int)getP1().getY());
        Point2D p3 = new Point((int)getP1().getX(),(int)getP2().getY());
        
        if(colorGrad2!=null){
            if(tipoRelleno == 0){
                this.relleno = new GradientPaint(p1, colorgrad1, p2, colorGrad2);
            }else if(tipoRelleno == 1){
                this.relleno = new GradientPaint(p1, colorgrad1, p3, colorGrad2);
            }
        }else 
            this.relleno = new GradientPaint(p1, colorgrad1, p2, colorgrad1); 
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

    public Linea(Point2D a, Point2D b){
        super(a,b);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.colorgrad1 = Color.BLACK;
        this.colorGrad2 = null;
    }
    
    public Linea(Point a, Point b){
        super(a,b);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.colorgrad1 = Color.BLACK;
        this.colorGrad2 = null;
    }
    
    public boolean contains(Point p){
        return this.ptLineDist(p)<=2.0;
    } 
    
    public void setLocation(Point2D puntoinicio,Point2D puntoAncla)
    {
        double dx = puntoAncla.getX() - puntoinicio.getX(); 
        double dy = puntoAncla.getY() - puntoinicio.getY();
        
        Point2D puntoIni = new Point2D.Double(this.x1 + dx,this.y1 + dy);
        Point2D puntoFin = new Point2D.Double(this.x2 + dx,this.y2 + dy);
        
        setLine(puntoIni, puntoFin);
    }
  
}
