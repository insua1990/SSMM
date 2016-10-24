package sm.jmi.graficos;

import java.awt.geom.Rectangle2D;

public class MiBoundingBox extends Rectangulo{
    
    public MiBoundingBox(Rectangle2D r) {
         
        super(r.getX()-25,r.getY()-25,r.getWidth()+50,r.getHeight()+50);
    }
    
}
