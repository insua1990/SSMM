package paintimage2d;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class IconoColor extends ImageIcon{
     
    private Color color;
    
    
    public IconoColor(Color c){
       this.color = c;
    }
    
    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

   
    
    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
            //Diseño mi propio icono con color variable
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(color);
            
            g2d.fillRoundRect(5,5,20,20,12,12);
            g2d.setColor(Color.DARK_GRAY);
            g2d.drawRoundRect(5,5,20,20,12,12); 
    }
    
    
}
