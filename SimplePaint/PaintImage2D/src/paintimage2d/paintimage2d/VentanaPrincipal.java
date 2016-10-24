package paintimage2d;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import sm.jmi.contenedor.LienzoImagen2D;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import sm.jmi.graficos.Curva;
import sm.jmi.graficos.Elipse;
import sm.jmi.graficos.Linea;
import sm.jmi.graficos.Punto;
import sm.jmi.graficos.Rectangulo;
import sm.jmi.graficos.RectanguloRedondeado;
 
public class VentanaPrincipal extends javax.swing.JFrame {

    private int posx, posy;
 
    private Vector<IconoColor> vIconos;
    private Vector<IconoTrazo> vTrazos;
     
    public VentanaPrincipal() {
        this.setPreferredSize(new Dimension(1300,700));
        this.posx = 0;
        this.posy = 0;
        
        vIconos = new Vector<>();
        vTrazos = new Vector<>();
        
        vTrazos.add(new IconoTrazo(null));
        vTrazos.add(new IconoTrazo(new float[]{10.0f,10.0f}));
        
        vIconos.add(new IconoColor(Color.black));
        vIconos.add(new IconoColor(Color.red));
        vIconos.add(new IconoColor(Color.blue));
        vIconos.add(new IconoColor(Color.green));
        vIconos.add(new IconoColor(Color.yellow));    
        vIconos.add(new IconoColor(Color.white));

        initComponents();
        etiquetar();
        
        colores.setRenderer(new ListaIconoColor(vIconos));
        colores.setPreferredSize(new Dimension(55, 35));
        
        trazos.setRenderer(new ListaIconoTrazo(vTrazos));
        trazos.setPreferredSize(new Dimension(90, 35));
       
         for (IconoTrazo it : vTrazos) {
            trazos.addItem(it);
        }
        
        for (IconoColor ic : vIconos) {
            colores.addItem(ic);
        }
 
        GrupoBotones.add(Elipse);
        GrupoBotones.add(Punto);
        GrupoBotones.add(Linea);
        GrupoBotones.add(Rectangulo);
        GrupoBotones.add(Editar);
        
        Punto.setSelected(true);
        
        setLocationRelativeTo(null);
        setTitle("PaintImage2D");
    }

    public JDesktopPane getEscritorio() {
        return Escritorio;
    }

    public void setEscritorio(JDesktopPane Escritorio) {
        this.Escritorio = Escritorio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        BarraHerramientasImagen = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        AumetarTamaño = new javax.swing.JButton();
        DisminuirTamaño = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Rotar90 = new javax.swing.JButton();
        Rotar180 = new javax.swing.JButton();
        Rotar270 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Oscurecer = new javax.swing.JButton();
        Iluminar = new javax.swing.JButton();
        Contraste = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Brillo = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        Umbral = new javax.swing.JSlider();
        jPanel6 = new javax.swing.JPanel();
        Sinusoidal = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        BarraHerramientas = new javax.swing.JToolBar();
        BarraFormas = new javax.swing.JToolBar();
        Nuevo = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        Punto = new javax.swing.JToggleButton();
        Linea = new javax.swing.JToggleButton();
        Rectangulo = new javax.swing.JToggleButton();
        Elipse = new javax.swing.JToggleButton();
        Editar = new javax.swing.JToggleButton();
        BarraFormato = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        trazos = new javax.swing.JComboBox();
        Grosor = new javax.swing.JSpinner();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        colores = new javax.swing.JComboBox();
        MasColores = new javax.swing.JToggleButton();
        Relleno = new javax.swing.JToggleButton();
        Alisado = new javax.swing.JToggleButton();
        Transparencia = new javax.swing.JSlider();
        Escritorio = new javax.swing.JDesktopPane();
        PanelBarraEstado = new javax.swing.JPanel();
        BarraEstado = new javax.swing.JLabel();
        Coordenadas = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        ArchivoNuevo = new javax.swing.JMenuItem();
        ArchivoAbrir = new javax.swing.JMenuItem();
        ArchivoGuardar = new javax.swing.JMenuItem();
        Ver = new javax.swing.JMenu();
        VerBarraEstado = new javax.swing.JCheckBoxMenuItem();
        VerBarraFormas = new javax.swing.JCheckBoxMenuItem();
        VerBarraFormato = new javax.swing.JCheckBoxMenuItem();
        VerBarraImagen = new javax.swing.JCheckBoxMenuItem();
        Imagen = new javax.swing.JMenu();
        NuevoTamañoImagen = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(763, 579));

        BarraHerramientasImagen.setFloatable(false);
        BarraHerramientasImagen.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BarraHerramientasImagen.setRollover(true);
        BarraHerramientasImagen.setBorderPainted(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambiar tamaño", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(150, 88));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 88));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 88));

        AumetarTamaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/aumentar.png"))); // NOI18N
        AumetarTamaño.setAlignmentX(0.5F);
        AumetarTamaño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AumetarTamaño.setMaximumSize(new java.awt.Dimension(30, 30));
        AumetarTamaño.setMinimumSize(new java.awt.Dimension(30, 30));
        AumetarTamaño.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel1.add(AumetarTamaño);

        DisminuirTamaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/disminuir.png"))); // NOI18N
        DisminuirTamaño.setAlignmentX(0.5F);
        DisminuirTamaño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DisminuirTamaño.setMaximumSize(new java.awt.Dimension(30, 30));
        DisminuirTamaño.setMinimumSize(new java.awt.Dimension(30, 30));
        DisminuirTamaño.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel1.add(DisminuirTamaño);

        BarraHerramientasImagen.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rotación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 88));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 88));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 88));

        Rotar90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/rotacion90.png"))); // NOI18N
        Rotar90.setAlignmentX(0.5F);
        Rotar90.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rotar90.setMaximumSize(new java.awt.Dimension(30, 30));
        Rotar90.setMinimumSize(new java.awt.Dimension(30, 30));
        Rotar90.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel2.add(Rotar90);

        Rotar180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/rotacion180.png"))); // NOI18N
        Rotar180.setAlignmentX(0.5F);
        Rotar180.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rotar180.setMaximumSize(new java.awt.Dimension(30, 30));
        Rotar180.setMinimumSize(new java.awt.Dimension(30, 30));
        Rotar180.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel2.add(Rotar180);

        Rotar270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/rotacion270.png"))); // NOI18N
        Rotar270.setAlignmentX(0.5F);
        Rotar270.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rotar270.setMaximumSize(new java.awt.Dimension(30, 30));
        Rotar270.setMinimumSize(new java.awt.Dimension(30, 30));
        Rotar270.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel2.add(Rotar270);

        BarraHerramientasImagen.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Luz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setMaximumSize(new java.awt.Dimension(150, 88));
        jPanel3.setMinimumSize(new java.awt.Dimension(150, 88));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 88));

        Oscurecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/oscurecer.png"))); // NOI18N
        Oscurecer.setAlignmentX(0.5F);
        Oscurecer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Oscurecer.setMaximumSize(new java.awt.Dimension(30, 30));
        Oscurecer.setMinimumSize(new java.awt.Dimension(30, 30));
        Oscurecer.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(Oscurecer);

        Iluminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/iluminar.png"))); // NOI18N
        Iluminar.setAlignmentX(0.5F);
        Iluminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Iluminar.setMaximumSize(new java.awt.Dimension(30, 30));
        Iluminar.setMinimumSize(new java.awt.Dimension(30, 30));
        Iluminar.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(Iluminar);

        Contraste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/contraste.png"))); // NOI18N
        Contraste.setAlignmentX(0.5F);
        Contraste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Contraste.setMaximumSize(new java.awt.Dimension(30, 30));
        Contraste.setMinimumSize(new java.awt.Dimension(30, 30));
        Contraste.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(Contraste);

        BarraHerramientasImagen.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brillo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setMaximumSize(new java.awt.Dimension(150, 88));
        jPanel4.setMinimumSize(new java.awt.Dimension(150, 88));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 70));

        Brillo.setMaximum(255);
        Brillo.setMinimum(-255);
        Brillo.setValue(0);
        Brillo.setMinimumSize(new java.awt.Dimension(120, 23));
        Brillo.setPreferredSize(new java.awt.Dimension(120, 23));
        jPanel4.add(Brillo);

        BarraHerramientasImagen.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Umbralizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setMaximumSize(new java.awt.Dimension(150, 88));
        jPanel5.setMinimumSize(new java.awt.Dimension(150, 88));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 70));

        Umbral.setMaximum(255);
        Umbral.setValue(0);
        Umbral.setMinimumSize(new java.awt.Dimension(120, 23));
        Umbral.setPreferredSize(new java.awt.Dimension(120, 23));
        jPanel5.add(Umbral);

        BarraHerramientasImagen.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Otros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setMaximumSize(new java.awt.Dimension(150, 88));
        jPanel6.setMinimumSize(new java.awt.Dimension(150, 88));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 88));

        Sinusoidal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/sinusoidal.png"))); // NOI18N
        Sinusoidal.setAlignmentX(0.5F);
        Sinusoidal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sinusoidal.setMaximumSize(new java.awt.Dimension(30, 30));
        Sinusoidal.setMinimumSize(new java.awt.Dimension(30, 30));
        Sinusoidal.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(Sinusoidal);

        Sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/suma.png"))); // NOI18N
        Sumar.setAlignmentX(0.5F);
        Sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sumar.setMaximumSize(new java.awt.Dimension(30, 30));
        Sumar.setMinimumSize(new java.awt.Dimension(30, 30));
        Sumar.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(Sumar);

        Restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/resta.png"))); // NOI18N
        Restar.setAlignmentX(0.5F);
        Restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Restar.setMaximumSize(new java.awt.Dimension(30, 30));
        Restar.setMinimumSize(new java.awt.Dimension(30, 30));
        Restar.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(Restar);

        BarraHerramientasImagen.add(jPanel6);

        getContentPane().add(BarraHerramientasImagen, java.awt.BorderLayout.EAST);

        BarraHerramientas.setFloatable(false);
        BarraHerramientas.setRollover(true);

        BarraFormas.setFloatable(false);
        BarraFormas.setRollover(true);
        BarraFormas.setBorderPainted(false);

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/nuevo.png"))); // NOI18N
        Nuevo.setFocusable(false);
        Nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoNuevo(evt);
            }
        });
        BarraFormas.add(Nuevo);

        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/abrir.png"))); // NOI18N
        Abrir.setFocusable(false);
        Abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoAbrir(evt);
            }
        });
        BarraFormas.add(Abrir);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/guardar.png"))); // NOI18N
        Guardar.setFocusable(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoGuardar(evt);
            }
        });
        BarraFormas.add(Guardar);
        BarraFormas.add(jSeparator1);

        Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/punto.png"))); // NOI18N
        Punto.setFocusable(false);
        Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Punto.setMaximumSize(new java.awt.Dimension(31, 31));
        Punto.setMinimumSize(new java.awt.Dimension(31, 31));
        Punto.setPreferredSize(new java.awt.Dimension(31, 31));
        Punto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFigura(evt);
            }
        });
        BarraFormas.add(Punto);

        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/linea.png"))); // NOI18N
        Linea.setFocusable(false);
        Linea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Linea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFigura(evt);
            }
        });
        BarraFormas.add(Linea);

        Rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/rectangulo.png"))); // NOI18N
        Rectangulo.setFocusable(false);
        Rectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFigura(evt);
            }
        });
        BarraFormas.add(Rectangulo);

        Elipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/elipse.png"))); // NOI18N
        Elipse.setFocusable(false);
        Elipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Elipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Elipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFigura(evt);
            }
        });
        BarraFormas.add(Elipse);

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/seleccion.png"))); // NOI18N
        Editar.setFocusable(false);
        Editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFigura(evt);
            }
        });
        BarraFormas.add(Editar);

        BarraHerramientas.add(BarraFormas);

        BarraFormato.setFloatable(false);
        BarraFormato.setRollover(true);
        BarraFormato.setBorderPainted(false);
        BarraFormato.add(jSeparator2);

        trazos.setMaximumSize(new java.awt.Dimension(70, 30));
        trazos.setMinimumSize(new java.awt.Dimension(70, 30));
        trazos.setPreferredSize(new java.awt.Dimension(70, 30));
        trazos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazosActionPerformed(evt);
            }
        });
        BarraFormato.add(trazos);

        Grosor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        Grosor.setEditor(new javax.swing.JSpinner.NumberEditor(Grosor, ""));
        Grosor.setMinimumSize(new java.awt.Dimension(60, 30));
        Grosor.setPreferredSize(new java.awt.Dimension(60, 30));
        Grosor.setValue(1);
        Grosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GrosorStateChanged(evt);
            }
        });
        BarraFormato.add(Grosor);
        BarraFormato.add(jSeparator3);

        colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloresActionPerformed(evt);
            }
        });
        BarraFormato.add(colores);

        MasColores.setIcon(new IconoColor(Color.BLACK));
        MasColores.setAlignmentX(0.5F);
        MasColores.setFocusable(false);
        MasColores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MasColores.setMaximumSize(new java.awt.Dimension(31, 31));
        MasColores.setMinimumSize(new java.awt.Dimension(31, 31));
        MasColores.setPreferredSize(new java.awt.Dimension(31, 31));
        MasColores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MasColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasColoresActionPerformed(evt);
            }
        });
        BarraFormato.add(MasColores);

        Relleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/rellenar.png"))); // NOI18N
        Relleno.setFocusable(false);
        Relleno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Relleno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Relleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoActionPerformed(evt);
            }
        });
        BarraFormato.add(Relleno);

        Alisado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/alisar.png"))); // NOI18N
        Alisado.setFocusable(false);
        Alisado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Alisado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Alisado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlisadoActionPerformed(evt);
            }
        });
        BarraFormato.add(Alisado);

        Transparencia.setMaximum(10);
        Transparencia.setToolTipText("");
        Transparencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Transparencia.setMaximumSize(new java.awt.Dimension(50, 23));
        Transparencia.setMinimumSize(new java.awt.Dimension(50, 23));
        Transparencia.setPreferredSize(new java.awt.Dimension(50, 23));
        Transparencia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TransparenciaStateChanged(evt);
            }
        });
        BarraFormato.add(Transparencia);

        BarraHerramientas.add(BarraFormato);

        getContentPane().add(BarraHerramientas, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, java.awt.BorderLayout.CENTER);

        PanelBarraEstado.setMaximumSize(new java.awt.Dimension(34, 20));
        PanelBarraEstado.setMinimumSize(new java.awt.Dimension(34, 20));
        PanelBarraEstado.setPreferredSize(new java.awt.Dimension(34, 20));
        PanelBarraEstado.setLayout(new java.awt.BorderLayout());

        BarraEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BarraEstado.setText("Punto");
        BarraEstado.setPreferredSize(new java.awt.Dimension(150, 14));
        PanelBarraEstado.add(BarraEstado, java.awt.BorderLayout.WEST);

        Coordenadas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Coordenadas.setMaximumSize(new java.awt.Dimension(60, 14));
        Coordenadas.setMinimumSize(new java.awt.Dimension(60, 14));
        Coordenadas.setPreferredSize(new java.awt.Dimension(200, 14));
        PanelBarraEstado.add(Coordenadas, java.awt.BorderLayout.EAST);

        getContentPane().add(PanelBarraEstado, java.awt.BorderLayout.SOUTH);

        Archivo.setText("Archivo");

        ArchivoNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        ArchivoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/nuevo.png"))); // NOI18N
        ArchivoNuevo.setText("Nuevo");
        ArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoNuevo(evt);
            }
        });
        Archivo.add(ArchivoNuevo);

        ArchivoAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        ArchivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/abrir.png"))); // NOI18N
        ArchivoAbrir.setText("Abrir...");
        ArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoAbrir(evt);
            }
        });
        Archivo.add(ArchivoAbrir);

        ArchivoGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        ArchivoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPaint/guardar.png"))); // NOI18N
        ArchivoGuardar.setText("Guardar");
        ArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoGuardar(evt);
            }
        });
        Archivo.add(ArchivoGuardar);

        MenuPrincipal.add(Archivo);

        Ver.setText("Ver");

        VerBarraEstado.setSelected(true);
        VerBarraEstado.setText("Ver barra estado");
        VerBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarraEstadoActionPerformed(evt);
            }
        });
        Ver.add(VerBarraEstado);

        VerBarraFormas.setSelected(true);
        VerBarraFormas.setText("Ver barra formas");
        VerBarraFormas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarraFormasActionPerformed(evt);
            }
        });
        Ver.add(VerBarraFormas);

        VerBarraFormato.setSelected(true);
        VerBarraFormato.setText("Ver barra formato");
        VerBarraFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarraFormatoActionPerformed(evt);
            }
        });
        Ver.add(VerBarraFormato);

        VerBarraImagen.setSelected(true);
        VerBarraImagen.setText("Ver barra imagen");
        VerBarraImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarraImagenActionPerformed(evt);
            }
        });
        Ver.add(VerBarraImagen);

        MenuPrincipal.add(Ver);

        Imagen.setText("Imagen");

        NuevoTamañoImagen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        NuevoTamañoImagen.setText("Tamaño nueva imagen");
        NuevoTamañoImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTamañoImagenActionPerformed(evt);
            }
        });
        Imagen.add(NuevoTamañoImagen);

        MenuPrincipal.add(Imagen);

        Ayuda.setText("Ayuda");

        AcercaDe.setText("Acerca de...");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        Ayuda.add(AcercaDe);

        MenuPrincipal.add(Ayuda);

        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarraEstadoActionPerformed
        PanelBarraEstado.setVisible(VerBarraEstado.isSelected());
    }//GEN-LAST:event_VerBarraEstadoActionPerformed

    private void VerBarraFormasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarraFormasActionPerformed
        BarraFormas.setVisible(VerBarraFormas.isSelected());
    }//GEN-LAST:event_VerBarraFormasActionPerformed

    private void VerBarraFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarraFormatoActionPerformed
        BarraFormato.setVisible(VerBarraFormato.isSelected());
    }//GEN-LAST:event_VerBarraFormatoActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, "Autor : Jose Manuel Martínez de la Insua\n"
                + "Práctica Final Sistemas Multimedia", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void NuevoTamañoImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTamañoImagenActionPerformed
        if (Escritorio.getSelectedFrame() != null) {
            VentanaImagen vim;
            try {
                vim = new VentanaImagen(this, true, (VentanaInterna) Escritorio.getSelectedFrame());
                vim.setLocationRelativeTo(this);
                vim.setVisible(true);
            } catch (BadLocationException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_NuevoTamañoImagenActionPerformed

    private void ArchivoNuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoNuevo
        if (Escritorio.getSelectedFrame() != null) {
            posx = Escritorio.getSelectedFrame().getLocation().x;
            posy = Escritorio.getSelectedFrame().getLocation().y;
            crearVentana(posx + 25, posy + 25);
        } else {
            crearVentana(0, 0);
        }
        
    }//GEN-LAST:event_ArchivoNuevo

    private void ArchivoAbrir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoAbrir

        if (Escritorio.getSelectedFrame() != null) {
            posx = Escritorio.getSelectedFrame().getLocation().x;
            posy = Escritorio.getSelectedFrame().getLocation().y;
        } else {
            posx = -25;
            posy = -25;
        }

        JFileChooser dlg = new JFileChooser();

        FileFilter filter1 = new FileNameExtensionFilter("JPG", "jpg");
        FileFilter filter2 = new FileNameExtensionFilter("PNG", "png");
        FileFilter filter3 = new FileNameExtensionFilter("BMP", "bmp");
        FileFilter filter4 = new FileNameExtensionFilter("GIF", "gif");
        FileFilter filter5 = new FileNameExtensionFilter("JPEG", "jpeg");
        FileFilter filter6 = new FileNameExtensionFilter("WBMP", "wbmp");

        dlg.addChoosableFileFilter(filter1);
        dlg.addChoosableFileFilter(filter2);
        dlg.addChoosableFileFilter(filter3);
        dlg.addChoosableFileFilter(filter4);
        dlg.addChoosableFileFilter(filter5);
        dlg.addChoosableFileFilter(filter6);

        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            boolean formatopermitido = false;
            for (String s : ImageIO.getReaderFormatNames()) {
                if ((f.getAbsoluteFile().toString().endsWith(s))) {
                    formatopermitido = true;
                }
            }
            if (formatopermitido) {
                try {
                    BufferedImage img = ImageIO.read(f);
                    VentanaInterna vi = new VentanaInterna(this, f.getName(), true, true, true, true, posx + 25, posy + 25);
                    Escritorio.add(vi);
                    LienzoImagen2D l = new LienzoImagen2D();
                    vi.setLienzointerno(l);
                    vi.add(l);
                    JScrollPane scroll = new JScrollPane(l);
                    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    vi.add(scroll);
                    vi.getLienzointerno().setImagenPanel(img);
                    vi.pack();
                    vi.setVisible(true);

                } catch (Exception ex) {
                    System.err.println("Error al leer la imagen");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error formato no reconocido\n"
                        + "Formatos reconocidos:\n .PNG , .JPG , .BMP"
                        + " .JEPG ,.WBMP, .GIF", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ArchivoAbrir

    private void ArchivoGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoGuardar

        VentanaInterna vi = (VentanaInterna) Escritorio.getSelectedFrame();
        if (vi != null) {
            JFileChooser dlg = new JFileChooser();

            FileFilter filter1 = new FileNameExtensionFilter("JPG", "jpg");
            FileFilter filter2 = new FileNameExtensionFilter("PNG", "png");
            FileFilter filter3 = new FileNameExtensionFilter("BMP", "bmp");
            FileFilter filter4 = new FileNameExtensionFilter("GIF", "gif");
            FileFilter filter5 = new FileNameExtensionFilter("JPEG", "jpeg");

            dlg.addChoosableFileFilter(filter1);
            dlg.addChoosableFileFilter(filter2);
            dlg.addChoosableFileFilter(filter3);
            dlg.addChoosableFileFilter(filter4);
            dlg.addChoosableFileFilter(filter5);

            int resp = dlg.showSaveDialog(this);
            if (resp == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedImage img =null;
                    boolean pintado = !(vi.getLienzointerno().getvShape().isEmpty());
                    if(pintado)img = vi.getLienzointerno().getImagenPanel(true);
                    else img = vi.getLienzointerno().getImagenPanel(false);
                    if (img != null) {
                        boolean formatopermitido = false;
                        for (String s : ImageIO.getWriterFormatNames()) {
                            if ((s.equals(dlg.getFileFilter().getDescription()))) {
                                formatopermitido = true;
                            }
                        }

                        if (formatopermitido) {
                            String ruta = dlg.getSelectedFile().getAbsolutePath() + "." + dlg.getFileFilter().getDescription().toLowerCase();
                            ImageIO.write(img, dlg.getFileFilter().getDescription(), new File(ruta));
                            vi.setTitle(dlg.getSelectedFile().getName());
                        } else {
                            JOptionPane.showMessageDialog(this, "Formato de archivo no seleccionado\n"
                                    + "Selecciona extensión\n Error al guardar. ",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception ex) {
                    System.err.println("Error al guardar la imagen");
                }
            }
        }
        
    }//GEN-LAST:event_ArchivoGuardar

    private void setFigura(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFigura
        if (Escritorio.getSelectedFrame() != null) {
            ((JToggleButton)evt.getSource()).setSelected(true);
            ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setEdicion(evt.getSource() == Editar);

            if (evt.getSource() == Editar) {
                BarraEstado.setText("Editar");
            }else{
                ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setMarcoSeleccion(null);
                ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFiguraSeleccionada(null);
                if (evt.getSource() == Punto) {
                    ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFigura(0);
                    BarraEstado.setText("Punto");
                } else if (evt.getSource() == Linea) {
                    ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFigura(1);
                    BarraEstado.setText("Linea");
                } else if (evt.getSource() == Rectangulo) {
                    ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFigura(2);
                    BarraEstado.setText("Rectangulo");
                } else if (evt.getSource() == Elipse) {
                    ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFigura(3);
                    BarraEstado.setText("Elipse");
                }/*else if (evt.getSource() == RectanguloRedondeado) {
                    ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFigura(4);
                    BarraEstado.setText("Rectangulo Redondeado");
                }else if (evt.getSource() == Curva) {
                    ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setFigura(3);
                    BarraEstado.setText("Curva");
                }*/
            }
            
        }
        
    }//GEN-LAST:event_setFigura

    private void GrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GrosorStateChanged
        if (Escritorio.getSelectedFrame() != null) {
            if(Editar.isSelected()){
                Shape forma = ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().getFiguraSeleccionada();
                    if(forma instanceof Punto){
                        ((Punto)forma).setGrosor((int)Grosor.getValue());
                    }else if(forma instanceof Linea){
                        ((Linea)forma).setGrosor((int)Grosor.getValue());
                    }else if(forma instanceof Rectangulo){
                        ((Rectangulo)forma).setGrosor((int)Grosor.getValue());
                    }else if(forma instanceof Elipse){
                        ((Elipse)forma).setGrosor((int)Grosor.getValue());
                    }else if(forma instanceof RectanguloRedondeado){
                        ((RectanguloRedondeado)forma).setGrosor((int)Grosor.getValue());
                    }else if(forma instanceof Curva){
                        ((Curva)forma).setGrosor((int)Grosor.getValue());
                    }
            }else{
                ((VentanaInterna) (Escritorio.getSelectedFrame())).getLienzointerno().setGrosorTrazo((int) ((JSpinner) evt.getSource()).getValue());
            }
        }
        repaint();
    }//GEN-LAST:event_GrosorStateChanged

    private void RellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoActionPerformed
        
        if (Escritorio.getSelectedFrame() != null) {
            
            VentanaRelleno vr;
            vr = new VentanaRelleno(this,true, (VentanaInterna) Escritorio.getSelectedFrame());
            vr.setLocationRelativeTo(this);
            vr.setVisible(true);
            
        }
        repaint();
        Relleno.setSelected(false);
    }//GEN-LAST:event_RellenoActionPerformed

    private void AlisadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlisadoActionPerformed
        if (Escritorio.getSelectedFrame() != null) {
            if(Editar.isSelected()){
                Shape forma = (((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().getFiguraSeleccionada());
                RenderingHints alisado = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                if(forma instanceof Punto){
                    if(Alisado.isSelected())((Punto)forma).setAlisado(alisado);
                    else ((Punto)forma).setAlisado(new RenderingHints(null, null));
                }else if(forma instanceof Linea){
                    if(Alisado.isSelected())((Linea)forma).setAlisado(alisado);
                    else ((Linea)forma).setAlisado(new RenderingHints(null, null));
                }else if(forma instanceof Rectangulo){
                    if(Alisado.isSelected())((Rectangulo)forma).setAlisado(alisado);
                    else ((Rectangulo)forma).setAlisado(new RenderingHints(null, null));
                }else if(forma instanceof Elipse){
                    if(Alisado.isSelected())((Elipse)forma).setAlisado(alisado);
                    else ((Elipse)forma).setAlisado(new RenderingHints(null, null));
                }else if(forma instanceof RectanguloRedondeado){
                    if(Alisado.isSelected())((RectanguloRedondeado)forma).setAlisado(alisado);
                    else ((RectanguloRedondeado)forma).setAlisado(new RenderingHints(null, null));
                }else if(forma instanceof Curva){
                    if(Alisado.isSelected())((Curva)forma).setAlisado(alisado);
                    else ((Curva)forma).setAlisado(new RenderingHints(null, null));
                } 
               
            }else{
                 if(Alisado.isSelected())((VentanaInterna) (Escritorio.getSelectedFrame())).getLienzointerno().setAlisarActual(
                        new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
                else((VentanaInterna) (Escritorio.getSelectedFrame())).getLienzointerno().setAlisarActual(new RenderingHints(null, null));
                 
            } 
            ((VentanaInterna) (Escritorio.getSelectedFrame())).getLienzointerno().setAlisado(Alisado.isSelected());
        }
        repaint();
    }//GEN-LAST:event_AlisadoActionPerformed

    private void coloresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloresActionPerformed

        IconoColor ic = (IconoColor) ((JComboBox) evt.getSource()).getSelectedItem();
         Color c = ic.getColor();

        VentanaInterna vi = ((VentanaInterna)(Escritorio.getSelectedFrame()));
        
        if(vi!=null && c!=null){
            Shape forma = vi.getLienzointerno().getFiguraSeleccionada();
            if(forma!=null){
                 if(forma instanceof Punto){
                     ((Punto)forma).setRelleno(c);
                 }else if(forma instanceof Linea){
                    ((Linea)forma).setColorgrad1(c);
                    ((Linea)forma).setColorGrad2(c);
                    ((Linea)forma).setTipoRelleno(0);
                    ((Linea)forma).setRelleno();
                 }else if(forma instanceof Rectangulo){
                     ((Rectangulo)forma).setColorgrad1(c);
                    ((Rectangulo)forma).setColorGrad2(c);
                    ((Rectangulo)forma).setTipoRelleno(0);
                    ((Rectangulo)forma).setRelleno();
                 }else if(forma instanceof Curva){
                     ((Curva)forma).setColorgrad1(c);
                    ((Curva)forma).setColorGrad2(c);
                    ((Curva)forma).setTipoRelleno(0);
                    ((Curva)forma).setRelleno();
                 }else if(forma instanceof RectanguloRedondeado){
                    ((RectanguloRedondeado)forma).setColorgrad1(c);
                    ((RectanguloRedondeado)forma).setColorGrad2(c);
                    ((RectanguloRedondeado)forma).setTipoRelleno(0);
                    ((RectanguloRedondeado)forma).setRelleno();
                 }else if(forma instanceof Elipse){
                    ((Elipse)forma).setColorgrad1(c);
                    ((Elipse)forma).setColorGrad2(c);
                    ((Elipse)forma).setTipoRelleno(0);
                    ((Elipse)forma).setRelleno();
                 }      
            }
            vi.getLienzointerno().setRellenoActual(c);
            vi.getLienzointerno().setColor1grad(c);
            vi.getLienzointerno().setColor2grad(c);
        }
        repaint();
    }//GEN-LAST:event_coloresActionPerformed

    private void trazosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazosActionPerformed
        IconoTrazo it = (IconoTrazo) ((JComboBox) evt.getSource()).getSelectedItem();
        if (Escritorio.getSelectedFrame() != null) {
            Shape forma = (((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().getFiguraSeleccionada());
            if(Editar.isSelected()){
                if(forma instanceof Linea){
                    ((Linea)forma).setPatronTrazo(it.getPatronTrazo());
                }else if(forma instanceof Rectangulo){
                    ((Rectangulo)forma).setPatronTrazo(it.getPatronTrazo());
                }else if(forma instanceof Elipse){
                    ((Elipse)forma).setPatronTrazo(it.getPatronTrazo());
                }else if(forma instanceof RectanguloRedondeado){
                    ((RectanguloRedondeado)forma).setPatronTrazo(it.getPatronTrazo());
                }else if(forma instanceof Curva){
                    ((Curva)forma).setPatronTrazo(it.getPatronTrazo());
                } 
            }else{ 
                ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().setPatronTrazoActual(it.getPatronTrazo()); 
            }
        }
        repaint();
    }//GEN-LAST:event_trazosActionPerformed

    private void VerBarraImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarraImagenActionPerformed
        BarraHerramientasImagen.setVisible(VerBarraImagen.isSelected());
    }//GEN-LAST:event_VerBarraImagenActionPerformed

    private void TransparenciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TransparenciaStateChanged
        float valor = Transparencia.getValue()/10.0f;
        if (Escritorio.getSelectedFrame() != null) {
            
            if(Editar.isSelected()){
                Shape forma = (((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().getFiguraSeleccionada());
                if(forma instanceof Punto){
                    ((Punto)forma).setGradoTransparencia(valor);
                }else if(forma instanceof Linea){
                    ((Linea)forma).setGradoTransparencia(valor);
                }else if(forma instanceof Rectangulo){
                    ((Rectangulo)forma).setGradoTransparencia(valor);;
                }else if(forma instanceof Elipse){
                    ((Elipse)forma).setGradoTransparencia(valor);
                }else if(forma instanceof RectanguloRedondeado){
                    ((RectanguloRedondeado)forma).setGradoTransparencia(valor);
                }else if(forma instanceof Curva){
                    ((Curva)forma).setGradoTransparencia(valor); 
                } 
            }
            ((VentanaInterna) (Escritorio.getSelectedFrame())).getLienzointerno().setTransparenciaActual(valor);
                
            
        }
        repaint();
    }//GEN-LAST:event_TransparenciaStateChanged

    private void MasColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasColoresActionPerformed
        VentanaInterna vi = ((VentanaInterna)(Escritorio.getSelectedFrame()));
        Color c = JColorChooser.showDialog(this,"Elige color",vi.getLienzointerno().getColor1grad());
        if(vi!=null && c!=null){
            Shape forma = vi.getLienzointerno().getFiguraSeleccionada();
            if(forma!=null){
                 if(forma instanceof Punto){
                     ((Punto)forma).setRelleno(c);
                 }else if(forma instanceof Linea){
                    ((Linea)forma).setColorgrad1(c);
                    ((Linea)forma).setColorGrad2(c);
                    ((Linea)forma).setTipoRelleno(0);
                    ((Linea)forma).setRelleno();
                 }else if(forma instanceof Rectangulo){
                     ((Rectangulo)forma).setColorgrad1(c);
                    ((Rectangulo)forma).setColorGrad2(c);
                    ((Rectangulo)forma).setTipoRelleno(0);
                    ((Rectangulo)forma).setRelleno();
                 }else if(forma instanceof Curva){
                     ((Curva)forma).setColorgrad1(c);
                    ((Curva)forma).setColorGrad2(c);
                    ((Curva)forma).setTipoRelleno(0);
                    ((Curva)forma).setRelleno();
                 }else if(forma instanceof RectanguloRedondeado){
                    ((RectanguloRedondeado)forma).setColorgrad1(c);
                    ((RectanguloRedondeado)forma).setColorGrad2(c);
                    ((RectanguloRedondeado)forma).setTipoRelleno(0);
                    ((RectanguloRedondeado)forma).setRelleno();
                 }else if(forma instanceof Elipse){
                    ((Elipse)forma).setColorgrad1(c);
                    ((Elipse)forma).setColorGrad2(c);
                    ((Elipse)forma).setTipoRelleno(0);
                    ((Elipse)forma).setRelleno();
                 }      
            }
            vi.getLienzointerno().setRellenoActual(c);
            vi.getLienzointerno().setColor1grad(c);
            vi.getLienzointerno().setColor2grad(c);
        }
        MasColores.setIcon(new IconoColor(c));
        repaint();
    }//GEN-LAST:event_MasColoresActionPerformed

    private void etiquetar() {
        Punto.setToolTipText("Punto");
        Rectangulo.setToolTipText("Rectángulo");
        Elipse.setToolTipText("Elipse");
        Linea.setToolTipText("Línea");
        Editar.setToolTipText("Editar");
        Abrir.setToolTipText("Abrir...");
        Guardar.setToolTipText("Guardar...");
        Nuevo.setToolTipText("Nueva imagen");
        colores.setToolTipText("Lista Colores");
        Transparencia.setToolTipText("Transparencia");
        Alisado.setToolTipText("Alisado");
        Relleno.setToolTipText("Relleno");
        Grosor.setToolTipText("Grosor");
        Coordenadas.setToolTipText("Coordenadas");
        trazos.setToolTipText("Tipo Trazo");
        Rotar90.setToolTipText("Rotar 90 grados");
        Rotar180.setToolTipText("Rotar 180 grados");
        Rotar270.setToolTipText("Rotar 270 grados");
        Oscurecer.setToolTipText("Oscurecer");
        Iluminar.setToolTipText("Iluminar");
        Contraste.setToolTipText("Aplicar contraste");
        
    }

    public void actualiza(LienzoImagen2D L) {
           Alisado.setSelected(L.isAlisado());
           Transparencia.setValue((int) (L.getGradoTransparencia()*10));
           Grosor.setValue(L.getGrosorTrazo());
           if(!L.isEdicion()){
            switch(L.getFigura()){
                case 0:
                    Punto.setSelected(true);
                    break;
                case 1:
                    Linea.setSelected(true);
                    break;
                case 2:
                    Rectangulo.setSelected(true);
                    break;
                case 3:
                    Elipse.setSelected(true);
                    break;
 //               case 4:
 //                   RectanguloRedondeado.setSelected(true);
 //                   break;
 //               case 5:
 //                   Curva..setSelected(true);
 //                   break;
            }   
           }else
               Editar.setSelected(true);
           
           if(L.getRellenoActual() == Color.BLACK){
               colores.setSelectedIndex(0);
           }else if(L.getRellenoActual() == Color.RED){
               colores.setSelectedIndex(1);
           }else if(L.getRellenoActual() == Color.BLUE){
               colores.setSelectedIndex(2);
           }else if(L.getRellenoActual()==Color.GREEN){
               colores.setSelectedIndex(3);
           }else if(L.getRellenoActual()==Color.YELLOW){
               colores.setSelectedIndex(4);
           }
           if(L.getPatronTrazoActual()==null){
               trazos.setSelectedIndex(0);
           }else{
               trazos.setSelectedIndex(1);
           }
    }

  
    
    public void crearVentana(int x, int y) {
        VentanaInterna vi = new VentanaInterna(this, "Nuevo Lienzo", true, true, true, true, x, y);
        Escritorio.add(vi);
        LienzoImagen2D l = new LienzoImagen2D();
        vi.setLienzointerno(l);
        vi.add(l);
        vi.pack();
        vi.setVisible(true);
        JScrollPane scroll = new JScrollPane(l);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        vi.add(scroll);
        ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().imagenBlanca(940,540);
        ((VentanaInterna) Escritorio.getSelectedFrame()).getLienzointerno().repaint();
        
    }

    public void setCoordenadasRaton(Point p) {
        String valor = "(" + p.getX() + "," + p.getY() + ")";
        Coordenadas.setText(valor);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JToggleButton Alisado;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem ArchivoAbrir;
    private javax.swing.JMenuItem ArchivoGuardar;
    private javax.swing.JMenuItem ArchivoNuevo;
    private javax.swing.JButton AumetarTamaño;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JLabel BarraEstado;
    private javax.swing.JToolBar BarraFormas;
    private javax.swing.JToolBar BarraFormato;
    private javax.swing.JToolBar BarraHerramientas;
    private javax.swing.JToolBar BarraHerramientasImagen;
    private javax.swing.JSlider Brillo;
    private javax.swing.JButton Contraste;
    private javax.swing.JLabel Coordenadas;
    private javax.swing.JButton DisminuirTamaño;
    private javax.swing.JToggleButton Editar;
    private javax.swing.JToggleButton Elipse;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JSpinner Grosor;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Iluminar;
    private javax.swing.JMenu Imagen;
    private javax.swing.JToggleButton Linea;
    private javax.swing.JToggleButton MasColores;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JButton Nuevo;
    private javax.swing.JMenuItem NuevoTamañoImagen;
    private javax.swing.JButton Oscurecer;
    private javax.swing.JPanel PanelBarraEstado;
    private javax.swing.JToggleButton Punto;
    private javax.swing.JToggleButton Rectangulo;
    private javax.swing.JToggleButton Relleno;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Rotar180;
    private javax.swing.JButton Rotar270;
    private javax.swing.JButton Rotar90;
    private javax.swing.JButton Sinusoidal;
    private javax.swing.JButton Sumar;
    private javax.swing.JSlider Transparencia;
    private javax.swing.JSlider Umbral;
    private javax.swing.JMenu Ver;
    private javax.swing.JCheckBoxMenuItem VerBarraEstado;
    private javax.swing.JCheckBoxMenuItem VerBarraFormas;
    private javax.swing.JCheckBoxMenuItem VerBarraFormato;
    private javax.swing.JCheckBoxMenuItem VerBarraImagen;
    private javax.swing.JComboBox colores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JComboBox trazos;
    // End of variables declaration//GEN-END:variables
}
