package paintimage2d;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

class ListaIconoColor extends DefaultListCellRenderer{ 
    
    private Vector<IconoColor> vIconoColor;
    
     
    public ListaIconoColor(Vector <IconoColor> vIconoColor){ 
        this.vIconoColor = vIconoColor; 
    } 

    public Vector<IconoColor> getvIconoColor() {
        return vIconoColor;
    }

    public void setvIconoColor(Vector<IconoColor> vIconoColor) {
        this.vIconoColor = vIconoColor;
    }
    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean cellHasFocus)
    {  
        // Hago un casting llamando al método del padre para ver los efectos por defecto al 
        // pasar por encima de una celda
        
        JLabel celda = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); 
        celda.setPreferredSize(new Dimension(30,30));
        
        IconoColor icon = (IconoColor)value; 
        celda.setIcon(icon); 
        
        return celda; 
    } 
} 
