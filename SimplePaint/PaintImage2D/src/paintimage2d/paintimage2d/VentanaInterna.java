/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintimage2d;

import java.awt.Dimension;
import javax.swing.event.EventListenerList;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.plaf.ComponentUI;
import sm.jmi.contenedor.LienzoImagen2D;

/**
 *
 * @author Jose Manuel
 */
public class VentanaInterna extends javax.swing.JInternalFrame implements InternalFrameListener{

    private LienzoImagen2D lienzointerno;
    private VentanaPrincipal padre;
    
    public LienzoImagen2D getLienzointerno() {
        return lienzointerno;
    }
    
    
    
    public void setLienzointerno(LienzoImagen2D lienzointerno) {
        this.lienzointerno = lienzointerno;
    }

    public boolean isIsClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public boolean isIsMaximum() {
        return isMaximum;
    }

    public void setIsMaximum(boolean isMaximum) {
        this.isMaximum = isMaximum;
    }

    public boolean isIconable() {
        return iconable;
    }

    public void setIconable(boolean iconable) {
        this.iconable = iconable;
    }

    public boolean isIsIcon() {
        return isIcon;
    }

    public void setIsIcon(boolean isIcon) {
        this.isIcon = isIcon;
    }

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public VentanaPrincipal getPadre() {
        return padre;
    }

    public void setPadre(VentanaPrincipal padre) {
        this.padre = padre;
    }

    
    
    public VentanaInterna(VentanaPrincipal vp,String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable,int x, int y) {
        super(title, resizable, closable, maximizable, iconifiable);
        this.setPreferredSize(new Dimension(960,580));
        this.setLocation(x, y);
        addInternalFrameListener(this);
        this.padre = vp;
        
            
        };

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
      
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
      
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {  
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

   
    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
    

   @Override
   public void internalFrameActivated(InternalFrameEvent e) {
        padre.actualiza(this.lienzointerno);
     
 
    }

 
}
