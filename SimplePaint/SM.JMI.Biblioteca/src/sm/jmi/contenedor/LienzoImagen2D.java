package sm.jmi.contenedor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Jose Manuel
 */
public class LienzoImagen2D extends Lienzo2D{
    
    private BufferedImage imagenPanel;
    private boolean drawVector;
    private Rectangle2D clippropio;
    
    
    public LienzoImagen2D(){
        this.clippropio = new Rectangle2D.Float(1,1,200,200);
        imagenPanel = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
        this.drawVector = false;
        
    }

    public Rectangle2D getClippropio() {
        return clippropio;
    }

    public void setClippropio(Rectangle2D clip) {
        this.clippropio = clip;
    }
    
    public boolean isDrawVector() {
        return drawVector;
    }

    public void setDrawVector(boolean drawVector) {
        this.drawVector = drawVector;
    }

    public void setImagenPanel(BufferedImage imagenPanel) {
        this.imagenPanel = imagenPanel;
        if(imagenPanel!=null) {
            super.setPreferredSize(new Dimension(imagenPanel.getWidth(),imagenPanel.getHeight()));
            setClippropio(new Rectangle2D.Double(1, 1,imagenPanel.getWidth(),imagenPanel.getHeight()));
            this.setClip(clippropio);
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setClip(clippropio);
        Graphics2D g2d = (Graphics2D)g;
        if(imagenPanel!=null) g2d.drawImage(imagenPanel,1,1,this);
        g2d.draw(clippropio);
        
        
    }
    
    
    
    public BufferedImage getImagenPanel(boolean drawVector){ 
        drawVector = getvShape().isEmpty();
        if (drawVector){ 
            
            return imagenPanel;
            
        }else{
            return imagenPanel;
        }
       
    }
    
    public void escalar(int ancho, int alto) {
        double w = imagenPanel.getWidth();
        double h = imagenPanel.getHeight();
        
        AffineTransform escalado = new AffineTransform();
        double escaladox,escaladoy;
        escaladox = ancho/w; 
        escaladoy = alto/h; 
        
        BufferedImage aux = new BufferedImage(ancho,alto,imagenPanel.getType());
        Graphics2D g2d = aux.createGraphics();
        g2d.setTransform(escalado);
        g2d.scale(escaladox, escaladoy);
        g2d.drawImage(imagenPanel,0,0,(int)w,(int)h,null);
        
        this.setImagenPanel(aux);
    }
    
    public void redimensionar(int ancho, int alto) {

        int w = imagenPanel.getWidth();
        int h = imagenPanel.getHeight();
        
        BufferedImage aux = new BufferedImage(ancho,alto, imagenPanel.getType());
        Graphics2D g2d = aux.createGraphics();
        g2d.fillRect(0,0,aux.getWidth(),aux.getHeight());
        g2d.drawImage(imagenPanel,0,0,w, h,null);
        
        this.setImagenPanel(aux);
    }
    
    public void imagenBlanca(int ancho,int alto){
        BufferedImage aux = new BufferedImage(ancho, alto, imagenPanel.getType());
        Graphics2D g2d = aux.createGraphics();
        g2d.fillRect(0,0,ancho,alto);
        g2d.drawImage(aux,0,0,ancho,alto,null);
        
        this.setImagenPanel(aux);
    }
}
