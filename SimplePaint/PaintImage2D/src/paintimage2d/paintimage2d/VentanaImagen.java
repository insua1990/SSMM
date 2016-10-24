package paintimage2d;

import javax.swing.JButton;
import javax.swing.text.BadLocationException;

public class VentanaImagen extends javax.swing.JDialog {

    VentanaInterna vi;
    
    public VentanaImagen(java.awt.Frame parent, boolean modal,VentanaInterna vi) throws BadLocationException{
        super(parent, modal);
        initComponents();
        this.vi=vi;
        Escalar.setVisible(false);
        Redimensionar.setVisible(false);
        alto.setText(Integer.toString(vi.getLienzointerno().getImagenPanel(false).getHeight()));
        ancho.setText(Integer.toString(vi.getLienzointerno().getImagenPanel(false).getWidth()));
        alto.setPadre(this);
        ancho.setPadre(this);
    }

    public VentanaInterna getVi() {
        return vi;
    }

    public void setVi(VentanaInterna vi) {
        this.vi = vi;
    }

    public JButton getEscalar() {
        return Escalar;
    }

    public void setEscalar(JButton Escalar) {
        this.Escalar = Escalar;
    }

    public JButton getRedimensionar() {
        return Redimensionar;
    }

    public void setRedimensionar(JButton Redimensionar) {
        this.Redimensionar = Redimensionar;
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        try {
            ancho = new paintimage2d.CeldaTamañoImagen();
        } catch (javax.swing.text.BadLocationException e1) {
            e1.printStackTrace();
        }
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        try {
            alto = new paintimage2d.CeldaTamañoImagen();
        } catch (javax.swing.text.BadLocationException e1) {
            e1.printStackTrace();
        }
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Redimensionar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Escalar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tamaño nueva imagen");
        setResizable(false);

        jLabel1.setText("Introduce el tamaño de la imagen: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(2, 3));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Ancho :");
        jPanel2.add(jLabel3);

        ancho.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(ancho);

        jLabel4.setText(" px");
        jPanel2.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Alto :");
        jPanel2.add(jLabel5);

        alto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(alto);

        jLabel2.setText(" px");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        Redimensionar.setText("Redimensionar");
        Redimensionar.setSelected(true);
        Redimensionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedimensionarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Escalar.setText("Escalar");
        Escalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscalarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(Escalar)
                .addGap(18, 18, 18)
                .addComponent(Redimensionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancelar)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Redimensionar)
                    .addComponent(Cancelar)
                    .addComponent(Escalar))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed
 
    private void RedimensionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedimensionarActionPerformed
        int w = Integer.parseInt(ancho.getText());
        int h = Integer.parseInt(alto.getText());
        ((VentanaInterna)((VentanaPrincipal)this.getParent()).getEscritorio().getSelectedFrame()).getLienzointerno().redimensionar(w, h);
        this.setVisible(false);
        ((VentanaInterna)((VentanaPrincipal)this.getParent()).getEscritorio().getSelectedFrame()).getLienzointerno().repaint();
    }//GEN-LAST:event_RedimensionarActionPerformed

    private void EscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscalarActionPerformed
        int w = Integer.parseInt(ancho.getText());
        int h = Integer.parseInt(alto.getText());
        ((VentanaInterna)((VentanaPrincipal)this.getParent()).getEscritorio().getSelectedFrame()).getLienzointerno().escalar( w, h);
        this.setVisible(false);
        ((VentanaInterna)((VentanaPrincipal)this.getParent()).getEscritorio().getSelectedFrame()).getLienzointerno().repaint();
    }//GEN-LAST:event_EscalarActionPerformed
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Escalar;
    private javax.swing.JButton Redimensionar;
    private paintimage2d.CeldaTamañoImagen alto;
    private paintimage2d.CeldaTamañoImagen ancho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
