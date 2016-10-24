
package paintimage2d;

import java.awt.Color;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import sm.jmi.graficos.Curva;
import sm.jmi.graficos.Elipse;
import sm.jmi.graficos.Linea;
import sm.jmi.graficos.Punto;
import sm.jmi.graficos.Rectangulo;
import sm.jmi.graficos.RectanguloRedondeado;


public class VentanaRelleno extends javax.swing.JDialog {

    VentanaInterna vi;
    Color principal,secundario;
    int tipoRelleno;
    boolean relleno;
    
    public VentanaInterna getVi() {
        return vi;
    }

    public void setVi(VentanaInterna vi) {
        this.vi = vi;
    }

    public VentanaRelleno(java.awt.Frame parent, boolean modal,VentanaInterna vi) {
        super(parent, modal);
        initComponents();
        this.Color2.setVisible(false);
        this.Color1.setVisible(false);
        this.Vertical.setVisible(false);
        this.horizontal.setVisible(false);
        this.separador.setVisible(false);
        this.vi = vi;
        this.BotonesTipo.add(Liso);
        this.BotonesTipo.add(Degradado);
        this.BotonesTipo.add(SinRelleno);
        this.BotonesOrientacion.add(horizontal);
        this.BotonesOrientacion.add(Vertical);
        this.setTitle("Relleno de forma");
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonesTipo = new javax.swing.ButtonGroup();
        BotonesOrientacion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Liso = new javax.swing.JRadioButton();
        Degradado = new javax.swing.JRadioButton();
        horizontal = new javax.swing.JRadioButton();
        Vertical = new javax.swing.JRadioButton();
        separador = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Color1 = new javax.swing.JButton();
        Color2 = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SinRelleno = new javax.swing.JRadioButton();
        vistaPrevia = new paintimage2d.VistaPrevia();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 306));
        setSize(new java.awt.Dimension(400, 306));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Selecciona el tipo de relleno:");

        Liso.setText("Liso");
        Liso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisoActionPerformed(evt);
            }
        });

        Degradado.setText("Degradado");
        Degradado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DegradadoActionPerformed(evt);
            }
        });

        horizontal.setText("Horizontal");
        horizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontalActionPerformed(evt);
            }
        });

        Vertical.setSelected(true);
        Vertical.setText("Vertical");
        Vertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerticalActionPerformed(evt);
            }
        });

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Color de relleno:");

        Color1.setBackground(new java.awt.Color(0, 0, 0));
        Color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColor(evt);
            }
        });

        Color2.setBackground(new java.awt.Color(0, 0, 0));
        Color2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColor(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Vista previa");

        SinRelleno.setSelected(true);
        SinRelleno.setText("Sin Relleno");
        SinRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinRellenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vistaPreviaLayout = new javax.swing.GroupLayout(vistaPrevia);
        vistaPrevia.setLayout(vistaPreviaLayout);
        vistaPreviaLayout.setHorizontalGroup(
            vistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        vistaPreviaLayout.setVerticalGroup(
            vistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Degradado)
                                    .addComponent(Liso)
                                    .addComponent(SinRelleno))
                                .addGap(60, 60, 60)
                                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horizontal)
                                    .addComponent(Vertical)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addGap(18, 18, 18)
                .addComponent(cancelar)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Color1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Color2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(vistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(SinRelleno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Liso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Degradado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(horizontal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Vertical)))))
                .addGap(48, 48, 48)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Color1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Color2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(vistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisoActionPerformed
        if(Liso.isSelected()){
          this.Color2.setVisible(false);
          this.Vertical.setVisible(false);
          this.horizontal.setVisible(false);
          this.separador.setVisible(false);  
          this.Color1.setVisible(true);
          vistaPrevia.setTipo(0);
          vistaPrevia.setColorPrincipal(this.Color1.getBackground());
          vistaPrevia.setColorSecuandario(this.Color1.getBackground());
          this.relleno = true;
        }
        this.vistaPrevia.repaint();
    }//GEN-LAST:event_LisoActionPerformed

    private void DegradadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DegradadoActionPerformed
        if(Degradado.isSelected()){
            this.Color2.setVisible(true);
            this.Vertical.setVisible(true);
            this.horizontal.setVisible(true);
            this.Color1.setVisible(true);
            this.separador.setVisible(true);
            vistaPrevia.setTipo(1);
            vistaPrevia.setColorPrincipal(this.Color1.getBackground());
            vistaPrevia.setColorSecuandario(this.Color2.getBackground());
            this.relleno = true;
        }
        this.vistaPrevia.repaint();
    }//GEN-LAST:event_DegradadoActionPerformed

    private void horizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontalActionPerformed
        if(horizontal.isSelected()){
            vistaPrevia.setOrientacion(0);
        }
        this.vistaPrevia.repaint();
    }//GEN-LAST:event_horizontalActionPerformed

    private void VerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerticalActionPerformed
        if(Vertical.isSelected()){
            vistaPrevia.setOrientacion(1);
        }
        this.vistaPrevia.repaint();
    }//GEN-LAST:event_VerticalActionPerformed

    private void setColor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setColor
        
        Color c = JColorChooser.showDialog(this, "Elige un color",((JButton) evt.getSource()).getBackground());
        ((JButton) evt.getSource()).setBackground(c);
        if(this.Color2.isVisible()){
            vistaPrevia.setColorPrincipal(this.Color1.getBackground());
            vistaPrevia.setColorSecuandario(this.Color2.getBackground());
        }else{
            vistaPrevia.setColorPrincipal(this.Color1.getBackground());
            vistaPrevia.setColorSecuandario(this.Color1.getBackground());
        }
        this.vistaPrevia.repaint();
    }//GEN-LAST:event_setColor

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
            getRelleno();
            
            Shape forma = vi.getLienzointerno().getFiguraSeleccionada();
            if(forma!=null){
                    if(forma instanceof Punto){
                        ((Punto)forma).setRelleno(principal);
                    }else if(forma instanceof Linea){
                        ((Linea)forma).setColorgrad1(principal);
                        ((Linea)forma).setColorGrad2(secundario);
                        ((Linea)forma).setTipoRelleno(tipoRelleno);
                        ((Linea)forma).setRelleno();
                    }else if(forma instanceof Rectangulo){
                        ((Rectangulo)forma).setFill(relleno);
                        ((Rectangulo)forma).setColorgrad1(principal);
                        ((Rectangulo)forma).setColorGrad2(secundario);
                        ((Rectangulo)forma).setTipoRelleno(tipoRelleno);
                        ((Rectangulo)forma).setRelleno();
                    }else if(forma instanceof Elipse){
                        ((Elipse)forma).setFill(relleno);
                        ((Elipse)forma).setColorgrad1(principal);
                        ((Elipse)forma).setColorGrad2(secundario);
                        ((Elipse)forma).setTipoRelleno(tipoRelleno);
                        ((Elipse)forma).setRelleno();
                    }else if(forma instanceof RectanguloRedondeado){
                        ((RectanguloRedondeado)forma).setFill(relleno);
                        ((RectanguloRedondeado)forma).setColorgrad1(principal);
                        ((RectanguloRedondeado)forma).setColorGrad2(secundario);
                        ((RectanguloRedondeado)forma).setTipoRelleno(tipoRelleno);
                        ((RectanguloRedondeado)forma).setRelleno();
                    }else if(forma instanceof Curva){
                        ((Linea)forma).setColorgrad1(principal);
                        ((Linea)forma).setColorGrad2(secundario);
                        ((Linea)forma).setTipoRelleno(tipoRelleno);
                    } 
                
            }else{
                vi.getLienzointerno().setTipoRelleno(tipoRelleno);
                vi.getLienzointerno().setRelleno(relleno);
                vi.getLienzointerno().setColor1grad(principal);
                vi.getLienzointerno().setColor2grad(secundario);
            }
            vi.getLienzointerno().repaint();
        
            this.setVisible(false);
    }//GEN-LAST:event_aceptarActionPerformed

    private void SinRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinRellenoActionPerformed
        if(SinRelleno.isSelected()){
          this.Color2.setVisible(false);
          this.Color1.setVisible(false);
          this.Vertical.setVisible(false);
          this.horizontal.setVisible(false);
          this.separador.setVisible(false);
          this.vistaPrevia.setTipo(2);
          vistaPrevia.setColorPrincipal(null);
          vistaPrevia.setColorSecuandario(null);
          this.relleno = false;
          this.vistaPrevia.repaint();
        }
        
    }//GEN-LAST:event_SinRellenoActionPerformed

    private void getRelleno(){
        
        if(Liso.isSelected()){
            principal = Color1.getBackground();
            secundario = Color1.getBackground();
        }else if(Degradado.isSelected()){
            if(horizontal.isSelected()){
                tipoRelleno = 0;
                principal = Color1.getBackground();
                secundario = Color2.getBackground();
            }else if(Vertical.isSelected()){
                tipoRelleno = 1;
                principal = Color1.getBackground();
                secundario = Color2.getBackground();
            }
        }else if(SinRelleno.isSelected()){
            principal = vi.getLienzointerno().getColor1grad();
            secundario = vi.getLienzointerno().getColor2grad();
        }
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonesOrientacion;
    private javax.swing.ButtonGroup BotonesTipo;
    private javax.swing.JButton Color1;
    private javax.swing.JButton Color2;
    private javax.swing.JRadioButton Degradado;
    private javax.swing.JRadioButton Liso;
    private javax.swing.JRadioButton SinRelleno;
    private javax.swing.JRadioButton Vertical;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JRadioButton horizontal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator separador;
    private paintimage2d.VistaPrevia vistaPrevia;
    // End of variables declaration//GEN-END:variables
}
