/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintimage2d;

import java.awt.geom.Rectangle2D;
import javafx.geometry.BoundingBox;

/**
 *
 * @author Jose Manuel
 */
public class MiBoundingBox extends BoundingBox{
    

    public MiBoundingBox(Rectangle2D rect){
        super(rect.getX(),rect.getY(),rect.getWidth(),rect.getHeight());
        
    }
    
    public MiBoundingBox(double minX, double minY, double minZ, double width, double height, double depth) {
        super(minX, minY, minZ, width, height, depth);
    }
    
    
}
