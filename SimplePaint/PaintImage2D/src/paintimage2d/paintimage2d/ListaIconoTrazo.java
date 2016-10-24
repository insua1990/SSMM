/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintimage2d;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Jose Manuel
 */
public class ListaIconoTrazo extends DefaultListCellRenderer{
    private Vector<IconoTrazo> vIconoTrazo;
    
     
    public ListaIconoTrazo(Vector<IconoTrazo> vIconotrazo){ 
        this.vIconoTrazo = vIconotrazo; 
    } 

    public Vector<IconoTrazo> getvIconoTrazo() {
        return vIconoTrazo;
    }

    public void setvIconoTrazo(Vector<IconoTrazo> vIconotrazo) {
        this.vIconoTrazo = vIconotrazo;
    }
    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean cellHasFocus)
    {  
        // Hago un casting llamando al método del padre para ver los efectos por defecto al 
        // pasar por encima de una celda
        
        JLabel celda = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); 
        celda.setPreferredSize(new Dimension(90,30));
        
        IconoTrazo icon = (IconoTrazo)value; 
        celda.setIcon(icon); 
        
        return celda; 
    } 
}
