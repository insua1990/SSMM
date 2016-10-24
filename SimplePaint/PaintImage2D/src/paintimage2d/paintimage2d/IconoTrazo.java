package paintimage2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.ImageIcon;

public class IconoTrazo extends ImageIcon{
    private float[] patronTrazo;
    private Stroke trazo;

    public float[] getPatronTrazo() {
        return patronTrazo;
    }

    public void setPatronTrazo(float[] patronTrazo) {
        this.patronTrazo = patronTrazo;
    }

    public Stroke getTrazo() {
        return trazo;
    }

    public void setTrazo(Stroke trazo) {
        this.trazo = trazo;
    }

    public IconoTrazo(float[] patron) {
       
        this.patronTrazo = patron;
        this.trazo = new BasicStroke(2.0f,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,1.0f,patronTrazo,1.0f);
    }
    
    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.BLACK);
            g2d.setStroke(trazo);
            g2d.drawLine(10,14,60,14);
            
    }
}
