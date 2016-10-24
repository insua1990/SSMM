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
import java.awt.geom.QuadCurve2D;

public class Curva extends QuadCurve2D.Double{
    
    
    private int grosor;
    private Stroke trazo;
    private Paint relleno;
    private RenderingHints alisado;
    private float gradoTransparencia;
    private Composite transparencia;
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
    public void setRelleno(Paint relleno) {
        this.relleno = relleno;
    }

    public void setColorGrad1(Color colorGrad1) {
        this.colorGrad1 = colorGrad1;
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
                    this.relleno = new GradientPaint(p1, colorGrad1, p2, colorGrad2);
                }else if(tipoRelleno == 1){
                    this.relleno = new GradientPaint(p1, colorGrad1, p3, colorGrad2);
                }
            }else 
                this.relleno = new GradientPaint(p1, colorGrad1, p2, colorGrad1);
        
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

    public Curva(){
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = null;
    }
    
    public Curva(Point p1,Point p2,Point pc){
        super(p1.x,p1.y,pc.x,pc.y,p2.x,p2.y);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = null;
    }
    
    public Curva(Point2D p1,Point2D p2,Point2D pc){
        super(p1.getX(),p1.getY(),pc.getX(),pc.getY(),p2.getX(),p2.getY());
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = null;
    }
    
    public Curva(double p1x,double p1y,double pcx,double pcy,double p2x,double p2y){
        super(p1x,p1y,pcx,pcy,p2x,p2y);
        this.grosor = 1;
        this.patronTrazo = null;
        this.trazo = new BasicStroke(this.grosor,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,this.patronTrazo,1.0f);
        this.gradoTransparencia = 1.0f;
        this.transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.gradoTransparencia);
        this.alisado = new RenderingHints(null, null);
        this.relleno = new Color(0,0,0);
        this.colorGrad1 = Color.BLACK;
        this.colorGrad2 = null;
    }
    
    public boolean contains(Point p){
        Linea linea1 = new Linea(this.getP1(),this.getCtrlPt());
        Linea linea2 = new Linea(this.getP2(),this.getCtrlPt());
        return(linea1.ptLineDist(p)<3 || linea2.ptLineDist(p)<3);
    }
    
    public void setLocation(Point puntoinicio,Point puntoAncla)
    {
        double dx = puntoAncla.x - puntoinicio.x; 
        double dy = puntoAncla.y - puntoinicio.y;
        
        Point2D puntoini = new Point2D.Double(getX1()+dx,getY1()+dy);
        Point2D puntofin = new Point2D.Double(getX2() + dx, getY2() + dy);
        Point2D puntoctrl = new Point2D.Double(getCtrlX() + dx, getCtrlY() + dy);
        
        setCurve(puntoini,puntofin,puntoctrl);
    }
}
