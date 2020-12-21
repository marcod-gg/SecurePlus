
package app.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;


public final class UIProfesional extends javax.swing.JFrame {
    
//Crear colores de tema
    Color colorPrimary = new Color(26,188,156);
    Color colorSecondary = new Color(44,62,80);
    Color colorSuccess = new Color(40,167,69);
    Color colorInfo = new Color(23,162,184);
    Color colorWarning = new Color(255,193,7);
    Color colorDanger = new Color(220,53,69);
    Color colorLight = new Color(248,249,250);
    Color colorDark = new Color(52,58,64);
    Color colorBtnAgregar = new Color(24,184,150);
    Color colorFooter = new Color (27,37,47);

    public UIProfesional() {
        //Iniciar Componentes
        initComponents();
        
        //Aplicación a pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Solo panel de inicio
        VerPanel(pnlInicio);
        
        this.lblAsesoriaRegistroID.setVisible(false);
        this.lblMejoraRegistroID.setVisible(false);
        this.lblCapacitacionRegistroID.setVisible(false);
        this.lblVisitaRegistroID.setVisible(false);
    }
    
    public void VerPanel(JPanel panel){
        pnlMiPerfil.setVisible(false);
        pnlMejoras.setVisible(false);
        pnlCapacitaciones.setVisible(false);
        pnlAsesorias.setVisible(false);
        pnlVisitas.setVisible(false);
        container.setVisible(false);
        pnlInicio.setVisible(false);
        panel.setVisible(true);
    }
    
    public void verMenu(JPanel panel){
        int pos = panel.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-1000, 70 , 0, 2, panel);
        }else{
            Animacion.Animacion.subir(70, -1000, 0, 2, panel);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        LogoSP = new javax.swing.JLabel();
        btnCapacitaciones = new javax.swing.JButton();
        btnVisitas = new javax.swing.JButton();
        btnAsesorias = new javax.swing.JButton();
        btnChecklists = new javax.swing.JButton();
        btnMejoras = new javax.swing.JButton();
        btnNotify = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuNotificaciones = new javax.swing.JPanel();
        menuSesion = new javax.swing.JPanel();
        btnMiPerfil = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlCapacitaciones = new javax.swing.JPanel();
        pnlVerCapacitaciones = new javax.swing.JPanel();
        btnAgregarCapacitacion = new javax.swing.JButton();
        lblTituloCapacitaciones = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCapacitaciones = new javax.swing.JTable();
        btnVerCapacitacionRegistros = new javax.swing.JButton();
        lblTituloCapacitacionesRegistro = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCapacitacionRegistros = new javax.swing.JTable();
        btnAgregarCapacitacionRegistro = new javax.swing.JButton();
        lblCapacitacionRegistroID = new javax.swing.JLabel();
        pnlAgregarCapacitaciones = new javax.swing.JPanel();
        HeaderAgregarCapacitacion = new javax.swing.JPanel();
        btnCerrar5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblUser16 = new javax.swing.JLabel();
        lblUser19 = new javax.swing.JLabel();
        lblUser20 = new javax.swing.JLabel();
        lblUser21 = new javax.swing.JLabel();
        lblUser22 = new javax.swing.JLabel();
        lblUser23 = new javax.swing.JLabel();
        txtAgregarCapacitacionTema = new javax.swing.JTextField();
        txtAgregarCapacitacionDireccion = new javax.swing.JTextField();
        dateAgregarCapacitacionDesde = new com.toedter.calendar.JDateChooser();
        dateAgregarCapacitacionHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAgregarCapacitacionDescripcion = new javax.swing.JTextArea();
        cbxAgregarCapacitacionEmpresa = new javax.swing.JComboBox<>();
        btnAgregarCapacitacionGuardar = new javax.swing.JButton();
        btnAgregarCapacitacionLimpiar = new javax.swing.JButton();
        pnlAgregarCapacitacionesRegistro = new javax.swing.JPanel();
        HeaderAgregarCapacitacionRegistro = new javax.swing.JPanel();
        btnCerrar6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblUser24 = new javax.swing.JLabel();
        lblUser25 = new javax.swing.JLabel();
        lblUser26 = new javax.swing.JLabel();
        txtAgregarCapacitacionRegistroRut = new javax.swing.JTextField();
        txtAgregarCapacitacionRegistroNombre = new javax.swing.JTextField();
        txtAgregarCapacitacionRegistroCargo = new javax.swing.JTextField();
        btnAgregarCapacitacionRegistroGuardar = new javax.swing.JButton();
        btnAgregarCapacitacionRegistroLimpiar = new javax.swing.JButton();
        chbAgregarCapacitacionRegistroPresente = new javax.swing.JCheckBox();
        pnlVisitas = new javax.swing.JPanel();
        pnlVerVisitas = new javax.swing.JPanel();
        btnAgregarVisita = new javax.swing.JButton();
        lblTituloVisitas = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblVisitas = new javax.swing.JTable();
        btnVerVisitaRegistros = new javax.swing.JButton();
        lblTituloVisitasRegistro = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblVisitasRegistro = new javax.swing.JTable();
        btnAgregarVisitaRegistro = new javax.swing.JButton();
        lblVisitaRegistroID = new javax.swing.JLabel();
        pnlAgregarVisita = new javax.swing.JPanel();
        HeaderAgregarVisita = new javax.swing.JPanel();
        btnCerrar7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblUser27 = new javax.swing.JLabel();
        lblUser36 = new javax.swing.JLabel();
        lblUser37 = new javax.swing.JLabel();
        lblUser38 = new javax.swing.JLabel();
        lblUser39 = new javax.swing.JLabel();
        lblUser40 = new javax.swing.JLabel();
        txtAgregarVisitaTema = new javax.swing.JTextField();
        txtAgregarVisitaDireccion = new javax.swing.JTextField();
        dateAgregarVisitaDesde = new com.toedter.calendar.JDateChooser();
        dateAgregarVisitaHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAgregarVisitaDescripcion = new javax.swing.JTextArea();
        cbxAgregarVisitaEmpresa = new javax.swing.JComboBox<>();
        btnAgregarVisitaGuardar = new javax.swing.JButton();
        btnAgregarVisitaLimpiar = new javax.swing.JButton();
        pnlAgregarVisitaRegistro = new javax.swing.JPanel();
        HeaderAgregarVisitaRegistro = new javax.swing.JPanel();
        btnCerrar8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblUser41 = new javax.swing.JLabel();
        lblUser42 = new javax.swing.JLabel();
        lblUser43 = new javax.swing.JLabel();
        txtAgregarVisitaRegistroRut = new javax.swing.JTextField();
        txtAgregarVisitaRegistroNombre = new javax.swing.JTextField();
        txtAgregarVisitaRegistroCargo = new javax.swing.JTextField();
        btnAgregarVisitaRegistroGuardar = new javax.swing.JButton();
        btnAgregarVisitaRegistroLimpiar = new javax.swing.JButton();
        chbAgregarVisitaRegistroPresente = new javax.swing.JCheckBox();
        pnlAsesorias = new javax.swing.JPanel();
        pnlVerAsesorias = new javax.swing.JPanel();
        btnAgregarAsesoria = new javax.swing.JButton();
        lblTituloAsesorias = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAsesorias = new javax.swing.JTable();
        btnVerAsesoriaRegistros = new javax.swing.JButton();
        lblTituloAsesoriaRegistro = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAsesoriaRegistros = new javax.swing.JTable();
        lblAsesoriaRegistroID = new javax.swing.JLabel();
        btnAgregarAsesoriaRegistro = new javax.swing.JButton();
        pnlAgregarAsesorias = new javax.swing.JPanel();
        HeaderAgregarAsesoria = new javax.swing.JPanel();
        btnCerrar2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblUser6 = new javax.swing.JLabel();
        lblUser7 = new javax.swing.JLabel();
        lblUser8 = new javax.swing.JLabel();
        lblUser9 = new javax.swing.JLabel();
        lblUser17 = new javax.swing.JLabel();
        lblUser18 = new javax.swing.JLabel();
        txtAgregarAsesoriaTema = new javax.swing.JTextField();
        txtAgregarAsesoriaDireccion = new javax.swing.JTextField();
        dateAgregarAsesoriaDesde = new com.toedter.calendar.JDateChooser();
        dateAgregarAsesoriaHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAgregarAsesoriaDescripcion = new javax.swing.JTextArea();
        cbxAgregarAsesoriaEmpresa = new javax.swing.JComboBox<>();
        btnAgregarAsesoriaGuardar = new javax.swing.JButton();
        btnAgregarAsesoriaLimpiar = new javax.swing.JButton();
        pnlAgregarAsesoriaRegistro = new javax.swing.JPanel();
        HeaderAgregarCliente2 = new javax.swing.JPanel();
        btnCerrar4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblUser13 = new javax.swing.JLabel();
        lblUser14 = new javax.swing.JLabel();
        lblUser15 = new javax.swing.JLabel();
        txtAgregarAsesoriaRegistroRut = new javax.swing.JTextField();
        txtAgregarAsesoriaRegistroNombre = new javax.swing.JTextField();
        txtAgregarAsesoriaRegistroCargo = new javax.swing.JTextField();
        btnAgregarAsesoriaRegistroGuardar = new javax.swing.JButton();
        btnAgregarAsesoriaRegistroLimpiar = new javax.swing.JButton();
        chbAgregarAsesoriaRegistroPresente = new javax.swing.JCheckBox();
        pnlMejoras = new javax.swing.JPanel();
        pnlVerMejoras = new javax.swing.JPanel();
        btnAgregarMejora = new javax.swing.JButton();
        lblTituloMejoras = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblMejoras = new javax.swing.JTable();
        btnVerMejoraRegistros = new javax.swing.JButton();
        lblTituloMejorasRegistro = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblMejorasRegistro = new javax.swing.JTable();
        btnAgregarMejoraRegistro = new javax.swing.JButton();
        lblMejoraRegistroID = new javax.swing.JLabel();
        pnlAgregarMejora = new javax.swing.JPanel();
        HeaderAgregarMejora = new javax.swing.JPanel();
        btnCerrar11 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblUser53 = new javax.swing.JLabel();
        lblUser54 = new javax.swing.JLabel();
        lblUser55 = new javax.swing.JLabel();
        lblUser56 = new javax.swing.JLabel();
        lblUser57 = new javax.swing.JLabel();
        lblUser58 = new javax.swing.JLabel();
        txtAgregarMejoraTema = new javax.swing.JTextField();
        txtAgregarMejoraDireccion = new javax.swing.JTextField();
        dateAgregarMejoraDesde = new com.toedter.calendar.JDateChooser();
        dateAgregarMejoraHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtAgregarMejoraDescripcion = new javax.swing.JTextArea();
        cbxAgregarMejoraEmpresa = new javax.swing.JComboBox<>();
        btnAgregarMejoraGuardar = new javax.swing.JButton();
        btnAgregarMejoraLimpiar = new javax.swing.JButton();
        pnlAgregarMejoraRegistro = new javax.swing.JPanel();
        HeaderAgregarMejoraRegistro = new javax.swing.JPanel();
        btnCerrar12 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblUser59 = new javax.swing.JLabel();
        lblUser60 = new javax.swing.JLabel();
        lblUser61 = new javax.swing.JLabel();
        txtAgregarMejoraRegistroRut = new javax.swing.JTextField();
        txtAgregarMejoraRegistroNombre = new javax.swing.JTextField();
        txtAgregarMejoraRegistroCargo = new javax.swing.JTextField();
        btnAgregarMejoraRegistroGuardar = new javax.swing.JButton();
        btnAgregarMejoraRegistroLimpiar = new javax.swing.JButton();
        chbAgregarMejoraRegistroPresente = new javax.swing.JCheckBox();
        pnlMiPerfil = new javax.swing.JPanel();
        pnlHeaderEditar1 = new javax.swing.JPanel();
        btnMiPerfilCerrar = new javax.swing.JButton();
        lblEditarClienteID1 = new javax.swing.JLabel();
        lblEditarClienteTitulo1 = new javax.swing.JLabel();
        lblUser28 = new javax.swing.JLabel();
        lblUser29 = new javax.swing.JLabel();
        lblUser30 = new javax.swing.JLabel();
        lblUser31 = new javax.swing.JLabel();
        lblUser32 = new javax.swing.JLabel();
        lblUser33 = new javax.swing.JLabel();
        lblUser34 = new javax.swing.JLabel();
        txtMiPerfilRUT = new javax.swing.JTextField();
        txtMiPerfilNombres = new javax.swing.JTextField();
        txtMiPerfilAPaterno = new javax.swing.JTextField();
        txtMiPerfilAMaterno = new javax.swing.JTextField();
        txtMiPerfilNPassword = new javax.swing.JTextField();
        txtMiPerfilRPassword = new javax.swing.JTextField();
        txtMiPerfilPassword = new javax.swing.JTextField();
        btnMiPerfilActualizar = new javax.swing.JButton();
        txtMiPerfilMail = new javax.swing.JTextField();
        lblUser35 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(colorSecondary);
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/splogo_1.png"))); // NOI18N
        LogoSP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LogoSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoSP.setPreferredSize(new java.awt.Dimension(200, 70));
        LogoSP.setRequestFocusEnabled(false);
        LogoSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoSPMouseClicked(evt);
            }
        });
        Header.add(LogoSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        btnCapacitaciones.setBackground(colorSecondary);
        btnCapacitaciones.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCapacitaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCapacitaciones.setText("CAPACITACIONES");
        btnCapacitaciones.setBorder(null);
        btnCapacitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapacitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapacitacionesMouseClicked(evt);
            }
        });
        btnCapacitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapacitacionesActionPerformed(evt);
            }
        });
        Header.add(btnCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 200, 70));

        btnVisitas.setBackground(colorSecondary);
        btnVisitas.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVisitas.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitas.setText("VISITAS");
        btnVisitas.setBorder(null);
        btnVisitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisitasMouseClicked(evt);
            }
        });
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
            }
        });
        Header.add(btnVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 70));

        btnAsesorias.setBackground(colorSecondary);
        btnAsesorias.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAsesorias.setForeground(new java.awt.Color(255, 255, 255));
        btnAsesorias.setText("ASESORIAS");
        btnAsesorias.setBorder(null);
        btnAsesorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsesorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsesoriasMouseClicked(evt);
            }
        });
        btnAsesorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsesoriasActionPerformed(evt);
            }
        });
        Header.add(btnAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 200, 70));

        btnChecklists.setBackground(colorSecondary);
        btnChecklists.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnChecklists.setForeground(new java.awt.Color(255, 255, 255));
        btnChecklists.setText("CHECKLIST");
        btnChecklists.setBorder(null);
        btnChecklists.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChecklists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChecklistsMouseClicked(evt);
            }
        });
        btnChecklists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecklistsActionPerformed(evt);
            }
        });
        Header.add(btnChecklists, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 200, 70));

        btnMejoras.setBackground(colorSecondary);
        btnMejoras.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnMejoras.setForeground(new java.awt.Color(255, 255, 255));
        btnMejoras.setText("MEJORAS");
        btnMejoras.setBorder(null);
        btnMejoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMejoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMejorasMouseClicked(evt);
            }
        });
        btnMejoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejorasActionPerformed(evt);
            }
        });
        Header.add(btnMejoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 200, 70));

        btnNotify.setBackground(colorSecondary);
        btnNotify.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnNotify.setForeground(new java.awt.Color(255, 255, 255));
        btnNotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/campana_1.png"))); // NOI18N
        btnNotify.setBorder(null);
        btnNotify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotify.setPreferredSize(new java.awt.Dimension(70, 70));
        btnNotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyActionPerformed(evt);
            }
        });
        Header.add(btnNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 0, -1, -1));

        btnUser.setBackground(colorSecondary);
        btnUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/user_1.png"))); // NOI18N
        btnUser.setText("SesionUsuario");
        btnUser.setBorder(null);
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.setPreferredSize(new java.awt.Dimension(200, 70));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        Header.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 0, -1, -1));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 70));

        Footer.setBackground(colorFooter);
        Footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(colorFooter);
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © Secure Plus 2020");
        Footer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1900, 30));

        jPanel1.add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1040, 1920, 40));

        menuNotificaciones.setBackground(colorSecondary);

        javax.swing.GroupLayout menuNotificacionesLayout = new javax.swing.GroupLayout(menuNotificaciones);
        menuNotificaciones.setLayout(menuNotificacionesLayout);
        menuNotificacionesLayout.setHorizontalGroup(
            menuNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        menuNotificacionesLayout.setVerticalGroup(
            menuNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(menuNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, -300, 200, 300));

        menuSesion.setBackground(colorSecondary);
        menuSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiPerfil.setBackground(colorSecondary);
        btnMiPerfil.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnMiPerfil.setText("Mi perfil");
        btnMiPerfil.setBorder(null);
        btnMiPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMiPerfil.setPreferredSize(new java.awt.Dimension(200, 70));
        btnMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilActionPerformed(evt);
            }
        });
        menuSesion.add(btnMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        btnCerrarSesion.setBackground(colorSecondary);
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 70));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        menuSesion.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        btnSalir.setBackground(colorSecondary);
        btnSalir.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPreferredSize(new java.awt.Dimension(200, 70));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuSesion.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jPanel1.add(menuSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, -1000, -1, -1));

        pnlInicio.setBackground(new java.awt.Color(255, 255, 255));
        pnlInicio.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/SP-portada_1.png"))); // NOI18N
        pnlInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1930, 980));

        jPanel1.add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlCapacitaciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlCapacitaciones.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlCapacitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerCapacitaciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerCapacitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarCapacitacion.setBackground(colorBtnAgregar);
        btnAgregarCapacitacion.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCapacitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapacitacion.setText("Nueva Capacitacion");
        btnAgregarCapacitacion.setBorder(null);
        btnAgregarCapacitacion.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarCapacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCapacitacionActionPerformed(evt);
            }
        });
        pnlVerCapacitaciones.add(btnAgregarCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 50, 180, -1));

        lblTituloCapacitaciones.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloCapacitaciones.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloCapacitaciones.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloCapacitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCapacitaciones.setText("CAPACITACIONES");
        pnlVerCapacitaciones.add(lblTituloCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1280, 50));

        jScrollPane5.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblCapacitaciones.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblCapacitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tema", "Desde", "Hasta", "Dirección", "Estado", "Profesional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblCapacitaciones);

        pnlVerCapacitaciones.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 310));

        btnVerCapacitacionRegistros.setBackground(colorBtnAgregar);
        btnVerCapacitacionRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVerCapacitacionRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCapacitacionRegistros.setText("Ver Registros");
        btnVerCapacitacionRegistros.setBorder(null);
        btnVerCapacitacionRegistros.setPreferredSize(new java.awt.Dimension(200, 60));
        btnVerCapacitacionRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCapacitacionRegistrosActionPerformed(evt);
            }
        });
        pnlVerCapacitaciones.add(btnVerCapacitacionRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 160, -1));

        lblTituloCapacitacionesRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloCapacitacionesRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloCapacitacionesRegistro.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloCapacitacionesRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCapacitacionesRegistro.setText("Registros");
        pnlVerCapacitaciones.add(lblTituloCapacitacionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 1280, 50));

        jScrollPane8.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblCapacitacionRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblCapacitacionRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "Nombre", "Cargo", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblCapacitacionRegistros);

        pnlVerCapacitaciones.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 320));

        btnAgregarCapacitacionRegistro.setBackground(colorBtnAgregar);
        btnAgregarCapacitacionRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCapacitacionRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapacitacionRegistro.setText("Agregar registro");
        btnAgregarCapacitacionRegistro.setBorder(null);
        btnAgregarCapacitacionRegistro.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarCapacitacionRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCapacitacionRegistroActionPerformed(evt);
            }
        });
        pnlVerCapacitaciones.add(btnAgregarCapacitacionRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 470, 160, -1));
        pnlVerCapacitaciones.add(lblCapacitacionRegistroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 880, -1, -1));

        pnlCapacitaciones.add(pnlVerCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlAgregarCapacitaciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarCapacitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarCapacitaciones.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarCapacitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarCapacitacion.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarCapacitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarCapacitacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar5.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar5.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar5.setBorder(null);
        btnCerrar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar5ActionPerformed(evt);
            }
        });
        HeaderAgregarCapacitacion.add(btnCerrar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INGRESAR NUEVA CAPACITACION");
        HeaderAgregarCapacitacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarCapacitaciones.add(HeaderAgregarCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser16.setBackground(new java.awt.Color(0, 0, 0));
        lblUser16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser16.setForeground(new java.awt.Color(0, 0, 0));
        lblUser16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser16.setText("Tema");
        lblUser16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitaciones.add(lblUser16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser19.setBackground(new java.awt.Color(0, 0, 0));
        lblUser19.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser19.setForeground(new java.awt.Color(0, 0, 0));
        lblUser19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser19.setText("Dirección");
        lblUser19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitaciones.add(lblUser19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser20.setBackground(new java.awt.Color(0, 0, 0));
        lblUser20.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser20.setForeground(new java.awt.Color(0, 0, 0));
        lblUser20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser20.setText("Desde");
        lblUser20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitaciones.add(lblUser20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        lblUser21.setBackground(new java.awt.Color(0, 0, 0));
        lblUser21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser21.setForeground(new java.awt.Color(0, 0, 0));
        lblUser21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser21.setText("Hasta");
        lblUser21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitaciones.add(lblUser21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 40));

        lblUser22.setBackground(new java.awt.Color(0, 0, 0));
        lblUser22.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser22.setForeground(new java.awt.Color(0, 0, 0));
        lblUser22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser22.setText("Descripción");
        lblUser22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitaciones.add(lblUser22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lblUser23.setBackground(new java.awt.Color(0, 0, 0));
        lblUser23.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser23.setForeground(new java.awt.Color(0, 0, 0));
        lblUser23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser23.setText("Empresa");
        lblUser23.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitaciones.add(lblUser23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 40));

        txtAgregarCapacitacionTema.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtAgregarCapacitacionTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarCapacitacionTemaActionPerformed(evt);
            }
        });
        pnlAgregarCapacitaciones.add(txtAgregarCapacitacionTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarCapacitacionDireccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCapacitaciones.add(txtAgregarCapacitacionDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));
        pnlAgregarCapacitaciones.add(dateAgregarCapacitacionDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));
        pnlAgregarCapacitaciones.add(dateAgregarCapacitacionHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 40));

        txtAgregarCapacitacionDescripcion.setColumns(20);
        txtAgregarCapacitacionDescripcion.setRows(5);
        jScrollPane9.setViewportView(txtAgregarCapacitacionDescripcion);

        pnlAgregarCapacitaciones.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 440, 180));
        pnlAgregarCapacitaciones.add(cbxAgregarCapacitacionEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

        btnAgregarCapacitacionGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarCapacitacionGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCapacitacionGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapacitacionGuardar.setText("Guardar");
        btnAgregarCapacitacionGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCapacitacionGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCapacitacionGuardarActionPerformed(evt);
            }
        });
        pnlAgregarCapacitaciones.add(btnAgregarCapacitacionGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 300, 40));

        btnAgregarCapacitacionLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarCapacitacionLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCapacitacionLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapacitacionLimpiar.setText("Limpiar");
        btnAgregarCapacitacionLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarCapacitaciones.add(btnAgregarCapacitacionLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 300, 40));

        pnlCapacitaciones.add(pnlAgregarCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarCapacitacionesRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarCapacitacionesRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarCapacitacionesRegistro.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarCapacitacionesRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarCapacitacionRegistro.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarCapacitacionRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarCapacitacionRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar6.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar6.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar6.setBorder(null);
        btnCerrar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar6ActionPerformed(evt);
            }
        });
        HeaderAgregarCapacitacionRegistro.add(btnCerrar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NUEVO REGISTRO DE CAPACITACION");
        HeaderAgregarCapacitacionRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarCapacitacionesRegistro.add(HeaderAgregarCapacitacionRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser24.setBackground(new java.awt.Color(0, 0, 0));
        lblUser24.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser24.setForeground(new java.awt.Color(0, 0, 0));
        lblUser24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser24.setText("Rut");
        lblUser24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitacionesRegistro.add(lblUser24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser25.setBackground(new java.awt.Color(0, 0, 0));
        lblUser25.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser25.setForeground(new java.awt.Color(0, 0, 0));
        lblUser25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser25.setText("Nombre");
        lblUser25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitacionesRegistro.add(lblUser25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser26.setBackground(new java.awt.Color(0, 0, 0));
        lblUser26.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser26.setForeground(new java.awt.Color(0, 0, 0));
        lblUser26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser26.setText("Cargo");
        lblUser26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCapacitacionesRegistro.add(lblUser26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        txtAgregarCapacitacionRegistroRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCapacitacionesRegistro.add(txtAgregarCapacitacionRegistroRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarCapacitacionRegistroNombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCapacitacionesRegistro.add(txtAgregarCapacitacionRegistroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));

        txtAgregarCapacitacionRegistroCargo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCapacitacionesRegistro.add(txtAgregarCapacitacionRegistroCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 440, 38));

        btnAgregarCapacitacionRegistroGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarCapacitacionRegistroGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCapacitacionRegistroGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapacitacionRegistroGuardar.setText("Guardar");
        btnAgregarCapacitacionRegistroGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCapacitacionRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCapacitacionRegistroGuardarActionPerformed(evt);
            }
        });
        pnlAgregarCapacitacionesRegistro.add(btnAgregarCapacitacionRegistroGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 220, 40));

        btnAgregarCapacitacionRegistroLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarCapacitacionRegistroLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCapacitacionRegistroLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapacitacionRegistroLimpiar.setText("Limpiar");
        btnAgregarCapacitacionRegistroLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarCapacitacionesRegistro.add(btnAgregarCapacitacionRegistroLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 40));

        chbAgregarCapacitacionRegistroPresente.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        chbAgregarCapacitacionRegistroPresente.setText("Presente");
        chbAgregarCapacitacionRegistroPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAgregarCapacitacionRegistroPresenteActionPerformed(evt);
            }
        });
        pnlAgregarCapacitacionesRegistro.add(chbAgregarCapacitacionRegistroPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, 40));

        pnlCapacitaciones.add(pnlAgregarCapacitacionesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlVisitas.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisitas.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlVisitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerVisitas.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerVisitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarVisita.setBackground(colorBtnAgregar);
        btnAgregarVisita.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarVisita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVisita.setText("Nueva Visita");
        btnAgregarVisita.setBorder(null);
        btnAgregarVisita.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVisitaActionPerformed(evt);
            }
        });
        pnlVerVisitas.add(btnAgregarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 50, 160, -1));

        lblTituloVisitas.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloVisitas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloVisitas.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloVisitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloVisitas.setText("VISITAS");
        pnlVerVisitas.add(lblTituloVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1280, 50));

        jScrollPane10.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblVisitas.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblVisitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tema", "Desde", "Hasta", "Dirección", "Estado", "Profesional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tblVisitas);

        pnlVerVisitas.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 310));

        btnVerVisitaRegistros.setBackground(colorBtnAgregar);
        btnVerVisitaRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVerVisitaRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerVisitaRegistros.setText("Ver Registros");
        btnVerVisitaRegistros.setBorder(null);
        btnVerVisitaRegistros.setPreferredSize(new java.awt.Dimension(200, 60));
        btnVerVisitaRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVisitaRegistrosActionPerformed(evt);
            }
        });
        pnlVerVisitas.add(btnVerVisitaRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 160, -1));

        lblTituloVisitasRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloVisitasRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloVisitasRegistro.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloVisitasRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloVisitasRegistro.setText("Registros");
        pnlVerVisitas.add(lblTituloVisitasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 1280, 50));

        jScrollPane11.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblVisitasRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblVisitasRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "Nombre", "Cargo", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblVisitasRegistro);

        pnlVerVisitas.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 320));

        btnAgregarVisitaRegistro.setBackground(colorBtnAgregar);
        btnAgregarVisitaRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarVisitaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVisitaRegistro.setText("Agregar registro");
        btnAgregarVisitaRegistro.setBorder(null);
        btnAgregarVisitaRegistro.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarVisitaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVisitaRegistroActionPerformed(evt);
            }
        });
        pnlVerVisitas.add(btnAgregarVisitaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 470, 160, -1));
        pnlVerVisitas.add(lblVisitaRegistroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 880, -1, -1));

        pnlVisitas.add(pnlVerVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlAgregarVisita.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarVisita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarVisita.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarVisita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarVisita.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarVisita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarVisita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar7.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar7.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar7.setBorder(null);
        btnCerrar7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar7ActionPerformed(evt);
            }
        });
        HeaderAgregarVisita.add(btnCerrar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REGISTRAR NUEVA VISITA");
        HeaderAgregarVisita.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarVisita.add(HeaderAgregarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser27.setBackground(new java.awt.Color(0, 0, 0));
        lblUser27.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser27.setForeground(new java.awt.Color(0, 0, 0));
        lblUser27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser27.setText("Tema");
        lblUser27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisita.add(lblUser27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser36.setBackground(new java.awt.Color(0, 0, 0));
        lblUser36.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser36.setForeground(new java.awt.Color(0, 0, 0));
        lblUser36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser36.setText("Dirección");
        lblUser36.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisita.add(lblUser36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser37.setBackground(new java.awt.Color(0, 0, 0));
        lblUser37.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser37.setForeground(new java.awt.Color(0, 0, 0));
        lblUser37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser37.setText("Desde");
        lblUser37.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisita.add(lblUser37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        lblUser38.setBackground(new java.awt.Color(0, 0, 0));
        lblUser38.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser38.setForeground(new java.awt.Color(0, 0, 0));
        lblUser38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser38.setText("Hasta");
        lblUser38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisita.add(lblUser38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 40));

        lblUser39.setBackground(new java.awt.Color(0, 0, 0));
        lblUser39.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser39.setForeground(new java.awt.Color(0, 0, 0));
        lblUser39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser39.setText("Descripción");
        lblUser39.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisita.add(lblUser39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lblUser40.setBackground(new java.awt.Color(0, 0, 0));
        lblUser40.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser40.setForeground(new java.awt.Color(0, 0, 0));
        lblUser40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser40.setText("Empresa");
        lblUser40.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisita.add(lblUser40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 40));

        txtAgregarVisitaTema.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarVisita.add(txtAgregarVisitaTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarVisitaDireccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarVisita.add(txtAgregarVisitaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));
        pnlAgregarVisita.add(dateAgregarVisitaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));
        pnlAgregarVisita.add(dateAgregarVisitaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 40));

        txtAgregarVisitaDescripcion.setColumns(20);
        txtAgregarVisitaDescripcion.setRows(5);
        jScrollPane12.setViewportView(txtAgregarVisitaDescripcion);

        pnlAgregarVisita.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 440, 180));
        pnlAgregarVisita.add(cbxAgregarVisitaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

        btnAgregarVisitaGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarVisitaGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarVisitaGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVisitaGuardar.setText("Guardar");
        btnAgregarVisitaGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarVisitaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVisitaGuardarActionPerformed(evt);
            }
        });
        pnlAgregarVisita.add(btnAgregarVisitaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 300, 40));

        btnAgregarVisitaLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarVisitaLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarVisitaLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVisitaLimpiar.setText("Limpiar");
        btnAgregarVisitaLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarVisita.add(btnAgregarVisitaLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 300, 40));

        pnlVisitas.add(pnlAgregarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarVisitaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarVisitaRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarVisitaRegistro.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarVisitaRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarVisitaRegistro.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarVisitaRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarVisitaRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar8.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar8.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar8.setBorder(null);
        btnCerrar8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar8ActionPerformed(evt);
            }
        });
        HeaderAgregarVisitaRegistro.add(btnCerrar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NUEVO REGISTRO DE VISITA");
        HeaderAgregarVisitaRegistro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarVisitaRegistro.add(HeaderAgregarVisitaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser41.setBackground(new java.awt.Color(0, 0, 0));
        lblUser41.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser41.setForeground(new java.awt.Color(0, 0, 0));
        lblUser41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser41.setText("Rut");
        lblUser41.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisitaRegistro.add(lblUser41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser42.setBackground(new java.awt.Color(0, 0, 0));
        lblUser42.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser42.setForeground(new java.awt.Color(0, 0, 0));
        lblUser42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser42.setText("Nombre");
        lblUser42.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisitaRegistro.add(lblUser42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser43.setBackground(new java.awt.Color(0, 0, 0));
        lblUser43.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser43.setForeground(new java.awt.Color(0, 0, 0));
        lblUser43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser43.setText("Cargo");
        lblUser43.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarVisitaRegistro.add(lblUser43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        txtAgregarVisitaRegistroRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarVisitaRegistro.add(txtAgregarVisitaRegistroRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarVisitaRegistroNombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarVisitaRegistro.add(txtAgregarVisitaRegistroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));

        txtAgregarVisitaRegistroCargo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarVisitaRegistro.add(txtAgregarVisitaRegistroCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 440, 38));

        btnAgregarVisitaRegistroGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarVisitaRegistroGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarVisitaRegistroGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVisitaRegistroGuardar.setText("Guardar");
        btnAgregarVisitaRegistroGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarVisitaRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVisitaRegistroGuardarActionPerformed(evt);
            }
        });
        pnlAgregarVisitaRegistro.add(btnAgregarVisitaRegistroGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 220, 40));

        btnAgregarVisitaRegistroLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarVisitaRegistroLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarVisitaRegistroLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVisitaRegistroLimpiar.setText("Limpiar");
        btnAgregarVisitaRegistroLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarVisitaRegistro.add(btnAgregarVisitaRegistroLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 40));

        chbAgregarVisitaRegistroPresente.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        chbAgregarVisitaRegistroPresente.setText("Presente");
        chbAgregarVisitaRegistroPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAgregarVisitaRegistroPresenteActionPerformed(evt);
            }
        });
        pnlAgregarVisitaRegistro.add(chbAgregarVisitaRegistroPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, 40));

        pnlVisitas.add(pnlAgregarVisitaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlAsesorias.setBackground(new java.awt.Color(255, 255, 255));
        pnlAsesorias.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlAsesorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerAsesorias.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerAsesorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarAsesoria.setBackground(colorBtnAgregar);
        btnAgregarAsesoria.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAsesoria.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAsesoria.setText("+ Solicitar Nueva");
        btnAgregarAsesoria.setBorder(null);
        btnAgregarAsesoria.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarAsesoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsesoriaActionPerformed(evt);
            }
        });
        pnlVerAsesorias.add(btnAgregarAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 50, -1, -1));

        lblTituloAsesorias.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloAsesorias.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloAsesorias.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloAsesorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAsesorias.setText("ASESORIAS");
        pnlVerAsesorias.add(lblTituloAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1280, 50));

        jScrollPane6.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblAsesorias.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblAsesorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tema", "Desde", "Hasta", "Dirección", "Estado", "Profesional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblAsesorias);

        pnlVerAsesorias.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 310));

        btnVerAsesoriaRegistros.setBackground(colorBtnAgregar);
        btnVerAsesoriaRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVerAsesoriaRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAsesoriaRegistros.setText("Ver Registros");
        btnVerAsesoriaRegistros.setBorder(null);
        btnVerAsesoriaRegistros.setPreferredSize(new java.awt.Dimension(200, 60));
        btnVerAsesoriaRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAsesoriaRegistrosActionPerformed(evt);
            }
        });
        pnlVerAsesorias.add(btnVerAsesoriaRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 160, -1));

        lblTituloAsesoriaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloAsesoriaRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloAsesoriaRegistro.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloAsesoriaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAsesoriaRegistro.setText("Registros");
        pnlVerAsesorias.add(lblTituloAsesoriaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 1280, 50));

        jScrollPane7.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblAsesoriaRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblAsesoriaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "Nombre", "Cargo", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblAsesoriaRegistros);

        pnlVerAsesorias.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 320));

        lblAsesoriaRegistroID.setText("-1");
        pnlVerAsesorias.add(lblAsesoriaRegistroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 880, -1, -1));

        btnAgregarAsesoriaRegistro.setBackground(colorBtnAgregar);
        btnAgregarAsesoriaRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAsesoriaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAsesoriaRegistro.setText("Agregar registro");
        btnAgregarAsesoriaRegistro.setBorder(null);
        btnAgregarAsesoriaRegistro.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarAsesoriaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsesoriaRegistroActionPerformed(evt);
            }
        });
        pnlVerAsesorias.add(btnAgregarAsesoriaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 470, 160, -1));

        pnlAsesorias.add(pnlVerAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlAgregarAsesorias.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarAsesorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarAsesorias.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarAsesorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarAsesoria.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarAsesoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarAsesoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar2.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar2.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar2.setBorder(null);
        btnCerrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar2ActionPerformed(evt);
            }
        });
        HeaderAgregarAsesoria.add(btnCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SOLICITAR ASESORIA ESPECIAL");
        HeaderAgregarAsesoria.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarAsesorias.add(HeaderAgregarAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser6.setBackground(new java.awt.Color(0, 0, 0));
        lblUser6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser6.setForeground(new java.awt.Color(0, 0, 0));
        lblUser6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser6.setText("Tema");
        lblUser6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesorias.add(lblUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser7.setBackground(new java.awt.Color(0, 0, 0));
        lblUser7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser7.setForeground(new java.awt.Color(0, 0, 0));
        lblUser7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser7.setText("Dirección");
        lblUser7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesorias.add(lblUser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser8.setBackground(new java.awt.Color(0, 0, 0));
        lblUser8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser8.setForeground(new java.awt.Color(0, 0, 0));
        lblUser8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser8.setText("Desde");
        lblUser8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesorias.add(lblUser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        lblUser9.setBackground(new java.awt.Color(0, 0, 0));
        lblUser9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser9.setForeground(new java.awt.Color(0, 0, 0));
        lblUser9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser9.setText("Hasta");
        lblUser9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesorias.add(lblUser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 40));

        lblUser17.setBackground(new java.awt.Color(0, 0, 0));
        lblUser17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser17.setForeground(new java.awt.Color(0, 0, 0));
        lblUser17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser17.setText("Descripción");
        lblUser17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesorias.add(lblUser17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lblUser18.setBackground(new java.awt.Color(0, 0, 0));
        lblUser18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser18.setForeground(new java.awt.Color(0, 0, 0));
        lblUser18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser18.setText("Empresa");
        lblUser18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesorias.add(lblUser18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 40));

        txtAgregarAsesoriaTema.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAsesorias.add(txtAgregarAsesoriaTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarAsesoriaDireccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAsesorias.add(txtAgregarAsesoriaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));
        pnlAgregarAsesorias.add(dateAgregarAsesoriaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));
        pnlAgregarAsesorias.add(dateAgregarAsesoriaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 40));

        txtAgregarAsesoriaDescripcion.setColumns(20);
        txtAgregarAsesoriaDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtAgregarAsesoriaDescripcion);

        pnlAgregarAsesorias.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 440, 180));
        pnlAgregarAsesorias.add(cbxAgregarAsesoriaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

        btnAgregarAsesoriaGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarAsesoriaGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAsesoriaGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAsesoriaGuardar.setText("Guardar");
        btnAgregarAsesoriaGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarAsesoriaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsesoriaGuardarActionPerformed(evt);
            }
        });
        pnlAgregarAsesorias.add(btnAgregarAsesoriaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 300, 40));

        btnAgregarAsesoriaLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarAsesoriaLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAsesoriaLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAsesoriaLimpiar.setText("Limpiar");
        btnAgregarAsesoriaLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarAsesorias.add(btnAgregarAsesoriaLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 300, 40));

        pnlAsesorias.add(pnlAgregarAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarAsesoriaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarAsesoriaRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarAsesoriaRegistro.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarAsesoriaRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarCliente2.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarCliente2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarCliente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar4.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar4.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar4.setBorder(null);
        btnCerrar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar4ActionPerformed(evt);
            }
        });
        HeaderAgregarCliente2.add(btnCerrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NUEVO REGISTRO DE ASESORIA");
        HeaderAgregarCliente2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarAsesoriaRegistro.add(HeaderAgregarCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser13.setBackground(new java.awt.Color(0, 0, 0));
        lblUser13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser13.setForeground(new java.awt.Color(0, 0, 0));
        lblUser13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser13.setText("Rut");
        lblUser13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesoriaRegistro.add(lblUser13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser14.setBackground(new java.awt.Color(0, 0, 0));
        lblUser14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser14.setForeground(new java.awt.Color(0, 0, 0));
        lblUser14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser14.setText("Nombre");
        lblUser14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesoriaRegistro.add(lblUser14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser15.setBackground(new java.awt.Color(0, 0, 0));
        lblUser15.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser15.setForeground(new java.awt.Color(0, 0, 0));
        lblUser15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser15.setText("Cargo");
        lblUser15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAsesoriaRegistro.add(lblUser15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        txtAgregarAsesoriaRegistroRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAsesoriaRegistro.add(txtAgregarAsesoriaRegistroRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarAsesoriaRegistroNombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAsesoriaRegistro.add(txtAgregarAsesoriaRegistroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));

        txtAgregarAsesoriaRegistroCargo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAsesoriaRegistro.add(txtAgregarAsesoriaRegistroCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 440, 38));

        btnAgregarAsesoriaRegistroGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarAsesoriaRegistroGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAsesoriaRegistroGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAsesoriaRegistroGuardar.setText("Guardar");
        btnAgregarAsesoriaRegistroGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarAsesoriaRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsesoriaRegistroGuardarActionPerformed(evt);
            }
        });
        pnlAgregarAsesoriaRegistro.add(btnAgregarAsesoriaRegistroGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 220, 40));

        btnAgregarAsesoriaRegistroLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarAsesoriaRegistroLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAsesoriaRegistroLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAsesoriaRegistroLimpiar.setText("Limpiar");
        btnAgregarAsesoriaRegistroLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarAsesoriaRegistro.add(btnAgregarAsesoriaRegistroLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 40));

        chbAgregarAsesoriaRegistroPresente.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        chbAgregarAsesoriaRegistroPresente.setSelected(true);
        chbAgregarAsesoriaRegistroPresente.setText("Presente");
        chbAgregarAsesoriaRegistroPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAgregarAsesoriaRegistroPresenteActionPerformed(evt);
            }
        });
        pnlAgregarAsesoriaRegistro.add(chbAgregarAsesoriaRegistroPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, 40));

        pnlAsesorias.add(pnlAgregarAsesoriaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlMejoras.setBackground(new java.awt.Color(255, 255, 255));
        pnlMejoras.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlMejoras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerMejoras.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerMejoras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarMejora.setBackground(colorBtnAgregar);
        btnAgregarMejora.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarMejora.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMejora.setText("Nueva Mejora");
        btnAgregarMejora.setBorder(null);
        btnAgregarMejora.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarMejora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMejoraActionPerformed(evt);
            }
        });
        pnlVerMejoras.add(btnAgregarMejora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 50, 160, -1));

        lblTituloMejoras.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloMejoras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloMejoras.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloMejoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMejoras.setText("MEJORAS");
        pnlVerMejoras.add(lblTituloMejoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1280, 50));

        jScrollPane16.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblMejoras.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblMejoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tema", "Desde", "Hasta", "Dirección", "Estado", "Profesional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(tblMejoras);

        pnlVerMejoras.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 310));

        btnVerMejoraRegistros.setBackground(colorBtnAgregar);
        btnVerMejoraRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVerMejoraRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMejoraRegistros.setText("Ver Registros");
        btnVerMejoraRegistros.setBorder(null);
        btnVerMejoraRegistros.setPreferredSize(new java.awt.Dimension(200, 60));
        btnVerMejoraRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMejoraRegistrosActionPerformed(evt);
            }
        });
        pnlVerMejoras.add(btnVerMejoraRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 160, -1));

        lblTituloMejorasRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloMejorasRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloMejorasRegistro.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloMejorasRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMejorasRegistro.setText("Registros");
        pnlVerMejoras.add(lblTituloMejorasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 1280, 50));

        jScrollPane17.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblMejorasRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblMejorasRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "Nombre", "Cargo", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(tblMejorasRegistro);

        pnlVerMejoras.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 320));

        btnAgregarMejoraRegistro.setBackground(colorBtnAgregar);
        btnAgregarMejoraRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarMejoraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMejoraRegistro.setText("Agregar registro");
        btnAgregarMejoraRegistro.setBorder(null);
        btnAgregarMejoraRegistro.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarMejoraRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMejoraRegistroActionPerformed(evt);
            }
        });
        pnlVerMejoras.add(btnAgregarMejoraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 470, 160, -1));
        pnlVerMejoras.add(lblMejoraRegistroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 880, -1, -1));

        pnlMejoras.add(pnlVerMejoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlAgregarMejora.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarMejora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarMejora.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarMejora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarMejora.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarMejora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarMejora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar11.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar11.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar11.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar11.setBorder(null);
        btnCerrar11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar11ActionPerformed(evt);
            }
        });
        HeaderAgregarMejora.add(btnCerrar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REPORTAR NUEVO ACCIDENTE");
        HeaderAgregarMejora.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarMejora.add(HeaderAgregarMejora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser53.setBackground(new java.awt.Color(0, 0, 0));
        lblUser53.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser53.setForeground(new java.awt.Color(0, 0, 0));
        lblUser53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser53.setText("Tema");
        lblUser53.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejora.add(lblUser53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser54.setBackground(new java.awt.Color(0, 0, 0));
        lblUser54.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser54.setForeground(new java.awt.Color(0, 0, 0));
        lblUser54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser54.setText("Dirección");
        lblUser54.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejora.add(lblUser54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser55.setBackground(new java.awt.Color(0, 0, 0));
        lblUser55.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser55.setForeground(new java.awt.Color(0, 0, 0));
        lblUser55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser55.setText("Desde");
        lblUser55.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejora.add(lblUser55, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        lblUser56.setBackground(new java.awt.Color(0, 0, 0));
        lblUser56.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser56.setForeground(new java.awt.Color(0, 0, 0));
        lblUser56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser56.setText("Hasta");
        lblUser56.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejora.add(lblUser56, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 40));

        lblUser57.setBackground(new java.awt.Color(0, 0, 0));
        lblUser57.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser57.setForeground(new java.awt.Color(0, 0, 0));
        lblUser57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser57.setText("Descripción");
        lblUser57.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejora.add(lblUser57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lblUser58.setBackground(new java.awt.Color(0, 0, 0));
        lblUser58.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser58.setForeground(new java.awt.Color(0, 0, 0));
        lblUser58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser58.setText("Empresa");
        lblUser58.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejora.add(lblUser58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 40));

        txtAgregarMejoraTema.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarMejora.add(txtAgregarMejoraTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarMejoraDireccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarMejora.add(txtAgregarMejoraDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));
        pnlAgregarMejora.add(dateAgregarMejoraDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));
        pnlAgregarMejora.add(dateAgregarMejoraHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 40));

        txtAgregarMejoraDescripcion.setColumns(20);
        txtAgregarMejoraDescripcion.setRows(5);
        jScrollPane18.setViewportView(txtAgregarMejoraDescripcion);

        pnlAgregarMejora.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 440, 180));
        pnlAgregarMejora.add(cbxAgregarMejoraEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

        btnAgregarMejoraGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarMejoraGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarMejoraGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMejoraGuardar.setText("Guardar");
        btnAgregarMejoraGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarMejoraGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMejoraGuardarActionPerformed(evt);
            }
        });
        pnlAgregarMejora.add(btnAgregarMejoraGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 300, 40));

        btnAgregarMejoraLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarMejoraLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarMejoraLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMejoraLimpiar.setText("Limpiar");
        btnAgregarMejoraLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarMejora.add(btnAgregarMejoraLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 300, 40));

        pnlMejoras.add(pnlAgregarMejora, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarMejoraRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarMejoraRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarMejoraRegistro.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarMejoraRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarMejoraRegistro.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarMejoraRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarMejoraRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar12.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar12.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar12.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar12.setBorder(null);
        btnCerrar12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar12ActionPerformed(evt);
            }
        });
        HeaderAgregarMejoraRegistro.add(btnCerrar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("NUEVO REGISTRO DE MEJORA");
        HeaderAgregarMejoraRegistro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarMejoraRegistro.add(HeaderAgregarMejoraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser59.setBackground(new java.awt.Color(0, 0, 0));
        lblUser59.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser59.setForeground(new java.awt.Color(0, 0, 0));
        lblUser59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser59.setText("Rut");
        lblUser59.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejoraRegistro.add(lblUser59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser60.setBackground(new java.awt.Color(0, 0, 0));
        lblUser60.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser60.setForeground(new java.awt.Color(0, 0, 0));
        lblUser60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser60.setText("Nombre");
        lblUser60.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejoraRegistro.add(lblUser60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser61.setBackground(new java.awt.Color(0, 0, 0));
        lblUser61.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser61.setForeground(new java.awt.Color(0, 0, 0));
        lblUser61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser61.setText("Cargo");
        lblUser61.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarMejoraRegistro.add(lblUser61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        txtAgregarMejoraRegistroRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarMejoraRegistro.add(txtAgregarMejoraRegistroRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarMejoraRegistroNombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarMejoraRegistro.add(txtAgregarMejoraRegistroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));

        txtAgregarMejoraRegistroCargo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarMejoraRegistro.add(txtAgregarMejoraRegistroCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 440, 38));

        btnAgregarMejoraRegistroGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarMejoraRegistroGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarMejoraRegistroGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMejoraRegistroGuardar.setText("Guardar");
        btnAgregarMejoraRegistroGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarMejoraRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMejoraRegistroGuardarActionPerformed(evt);
            }
        });
        pnlAgregarMejoraRegistro.add(btnAgregarMejoraRegistroGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 220, 40));

        btnAgregarMejoraRegistroLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarMejoraRegistroLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarMejoraRegistroLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMejoraRegistroLimpiar.setText("Limpiar");
        btnAgregarMejoraRegistroLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarMejoraRegistro.add(btnAgregarMejoraRegistroLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 40));

        chbAgregarMejoraRegistroPresente.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        chbAgregarMejoraRegistroPresente.setText("Presente");
        chbAgregarMejoraRegistroPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAgregarMejoraRegistroPresenteActionPerformed(evt);
            }
        });
        pnlAgregarMejoraRegistro.add(chbAgregarMejoraRegistroPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, 40));

        pnlMejoras.add(pnlAgregarMejoraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlMejoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlMiPerfil.setBackground(new java.awt.Color(255, 255, 255));
        pnlMiPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMiPerfil.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlMiPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeaderEditar1.setBackground(new java.awt.Color(0, 255, 102));
        pnlHeaderEditar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeaderEditar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiPerfilCerrar.setBackground(new java.awt.Color(0, 255, 102));
        btnMiPerfilCerrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnMiPerfilCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMiPerfilCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnMiPerfilCerrar.setBorder(null);
        btnMiPerfilCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMiPerfilCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilCerrarActionPerformed(evt);
            }
        });
        pnlHeaderEditar1.add(btnMiPerfilCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        lblEditarClienteID1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditarClienteID1.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarClienteID1.setText(" ");
        pnlHeaderEditar1.add(lblEditarClienteID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 30));

        lblEditarClienteTitulo1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditarClienteTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblEditarClienteTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarClienteTitulo1.setText("MI PERFIL");
        pnlHeaderEditar1.add(lblEditarClienteTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 30));

        pnlMiPerfil.add(pnlHeaderEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser28.setBackground(new java.awt.Color(0, 0, 0));
        lblUser28.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser28.setForeground(new java.awt.Color(0, 0, 0));
        lblUser28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser28.setText("RUT");
        lblUser28.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 40));

        lblUser29.setBackground(new java.awt.Color(0, 0, 0));
        lblUser29.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser29.setForeground(new java.awt.Color(0, 0, 0));
        lblUser29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser29.setText("Nombres");
        lblUser29.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 40));

        lblUser30.setBackground(new java.awt.Color(0, 0, 0));
        lblUser30.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser30.setForeground(new java.awt.Color(0, 0, 0));
        lblUser30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser30.setText("Apellido Paterno");
        lblUser30.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 40));

        lblUser31.setBackground(new java.awt.Color(0, 0, 0));
        lblUser31.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser31.setForeground(new java.awt.Color(0, 0, 0));
        lblUser31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser31.setText("Apellido Materno");
        lblUser31.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 40));

        lblUser32.setBackground(new java.awt.Color(0, 0, 0));
        lblUser32.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser32.setForeground(new java.awt.Color(0, 0, 0));
        lblUser32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser32.setText("Nueva Contraseña");
        lblUser32.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, 40));

        lblUser33.setBackground(new java.awt.Color(0, 0, 0));
        lblUser33.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser33.setForeground(new java.awt.Color(0, 0, 0));
        lblUser33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser33.setText("Confirmar nueva Contraseña");
        lblUser33.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 210, 40));

        lblUser34.setBackground(new java.awt.Color(0, 0, 0));
        lblUser34.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser34.setForeground(new java.awt.Color(0, 0, 0));
        lblUser34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser34.setText("Ingresar contraseña actual para confirmar cambios");
        lblUser34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlMiPerfil.add(lblUser34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 560, 20));

        txtMiPerfilRUT.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtMiPerfilNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 38));

        txtMiPerfilAPaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtMiPerfilAMaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtMiPerfilNPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilNPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        txtMiPerfilRPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilRPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 38));

        txtMiPerfilPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 360, 38));

        btnMiPerfilActualizar.setBackground(new java.awt.Color(0, 204, 102));
        btnMiPerfilActualizar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnMiPerfilActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMiPerfilActualizar.setText("Actualizar");
        btnMiPerfilActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMiPerfilActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilActualizarActionPerformed(evt);
            }
        });
        pnlMiPerfil.add(btnMiPerfilActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 360, 40));

        txtMiPerfilMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        lblUser35.setBackground(new java.awt.Color(0, 0, 0));
        lblUser35.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser35.setForeground(new java.awt.Color(0, 0, 0));
        lblUser35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser35.setText("Correo electronico");
        lblUser35.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 40));

        jPanel1.add(pnlMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 640, -1));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(1840, 880));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );

        jPanel1.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed

    }//GEN-LAST:event_btnInicioMousePressed

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed

    }//GEN-LAST:event_btnClienteMousePressed

    private void btnProfesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMousePressed

    }//GEN-LAST:event_btnProfesMousePressed

    private void btnNotifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMousePressed

    }//GEN-LAST:event_btnNotifyMousePressed

    private void btnUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMousePressed

    }//GEN-LAST:event_btnUserMousePressed

    private void btnNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMouseClicked
        
    }//GEN-LAST:event_btnNotifyMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked

    }//GEN-LAST:event_btnUserMouseClicked

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        
    }//GEN-LAST:event_btnAdminMousePressed

    private void btnInformesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesMousePressed

    private void LogoSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoSPMouseClicked
        VerPanel(pnlInicio);
    }//GEN-LAST:event_LogoSPMouseClicked

    private void btnCapacitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapacitacionesMouseClicked

    }//GEN-LAST:event_btnCapacitacionesMouseClicked

    private void btnCapacitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapacitacionesActionPerformed
        VerPanel(pnlCapacitaciones);
        this.pnlAgregarCapacitaciones.setVisible(false);
        this.pnlAgregarCapacitacionesRegistro.setVisible(false);
        this.pnlVerCapacitaciones.setVisible(true);
    }//GEN-LAST:event_btnCapacitacionesActionPerformed

    private void btnVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisitasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisitasMouseClicked

    private void btnVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitasActionPerformed
        VerPanel(pnlVisitas);
        this.pnlAgregarVisita.setVisible(false);
        this.pnlAgregarVisitaRegistro.setVisible(false);
        this.pnlVerVisitas.setVisible(true);
    }//GEN-LAST:event_btnVisitasActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        verMenu(menuSesion);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnNotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyActionPerformed

    }//GEN-LAST:event_btnNotifyActionPerformed

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        VerPanel(pnlMiPerfil);
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMiPerfilCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilCerrarActionPerformed
        pnlMiPerfil.setVisible(false);
        pnlInicio.setVisible(true);
    }//GEN-LAST:event_btnMiPerfilCerrarActionPerformed

    private void btnMiPerfilActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiPerfilActualizarActionPerformed

    private void btnAgregarAsesoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsesoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAsesoriaActionPerformed

    private void btnVerAsesoriaRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAsesoriaRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerAsesoriaRegistrosActionPerformed

    private void btnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar2ActionPerformed
        pnlAgregarAsesorias.setVisible(false);
        pnlVerAsesorias.setVisible(true);
    }//GEN-LAST:event_btnCerrar2ActionPerformed

    private void btnAgregarAsesoriaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsesoriaGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAsesoriaGuardarActionPerformed

    private void btnCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar4ActionPerformed
        pnlAgregarAsesoriaRegistro.setVisible(false);
        pnlVerAsesorias.setVisible(true);
    }//GEN-LAST:event_btnCerrar4ActionPerformed

    private void btnAgregarAsesoriaRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsesoriaRegistroGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAsesoriaRegistroGuardarActionPerformed

    private void chbAgregarAsesoriaRegistroPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAgregarAsesoriaRegistroPresenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbAgregarAsesoriaRegistroPresenteActionPerformed

    private void btnAgregarAsesoriaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsesoriaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAsesoriaRegistroActionPerformed

    private void btnAsesoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsesoriasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsesoriasMouseClicked

    private void btnAsesoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesoriasActionPerformed
        VerPanel(pnlAsesorias);
        this.pnlAgregarAsesorias.setVisible(false);
        this.pnlAgregarAsesoriaRegistro.setVisible(false);
        this.pnlVerAsesorias.setVisible(true);
    }//GEN-LAST:event_btnAsesoriasActionPerformed

    private void btnChecklistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChecklistsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChecklistsMouseClicked

    private void btnChecklistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecklistsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChecklistsActionPerformed

    private void btnMejorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMejorasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMejorasMouseClicked

    private void btnMejorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejorasActionPerformed
        VerPanel(pnlMejoras);
        this.pnlAgregarMejora.setVisible(false);
        this.pnlAgregarMejoraRegistro.setVisible(false);
        this.pnlVerMejoras.setVisible(true);
    }//GEN-LAST:event_btnMejorasActionPerformed

    private void btnAgregarCapacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionActionPerformed

    private void btnVerCapacitacionRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCapacitacionRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerCapacitacionRegistrosActionPerformed

    private void btnAgregarCapacitacionRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionRegistroActionPerformed

    private void btnCerrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar5ActionPerformed
        this.pnlAgregarCapacitaciones.setVisible(false);
        this.pnlVerCapacitaciones.setVisible(true);
    }//GEN-LAST:event_btnCerrar5ActionPerformed

    private void btnAgregarCapacitacionGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionGuardarActionPerformed

    private void btnCerrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar6ActionPerformed
        this.pnlAgregarCapacitacionesRegistro.setVisible(false);
        this.pnlVerCapacitaciones.setVisible(true);
    }//GEN-LAST:event_btnCerrar6ActionPerformed

    private void btnAgregarCapacitacionRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionRegistroGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionRegistroGuardarActionPerformed

    private void chbAgregarCapacitacionRegistroPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAgregarCapacitacionRegistroPresenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbAgregarCapacitacionRegistroPresenteActionPerformed

    private void btnAgregarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVisitaActionPerformed

    private void btnVerVisitaRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVisitaRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerVisitaRegistrosActionPerformed

    private void btnAgregarVisitaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVisitaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVisitaRegistroActionPerformed

    private void btnCerrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar7ActionPerformed
        this.pnlAgregarVisita.setVisible(false);
        this.pnlVerVisitas.setVisible(true);
    }//GEN-LAST:event_btnCerrar7ActionPerformed

    private void btnAgregarVisitaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVisitaGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVisitaGuardarActionPerformed

    private void btnCerrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar8ActionPerformed
        this.pnlAgregarVisitaRegistro.setVisible(false);
        this.pnlVerVisitas.setVisible(true);
    }//GEN-LAST:event_btnCerrar8ActionPerformed

    private void btnAgregarVisitaRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVisitaRegistroGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVisitaRegistroGuardarActionPerformed

    private void chbAgregarVisitaRegistroPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAgregarVisitaRegistroPresenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbAgregarVisitaRegistroPresenteActionPerformed

    private void btnAgregarMejoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMejoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMejoraActionPerformed

    private void btnVerMejoraRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMejoraRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMejoraRegistrosActionPerformed

    private void btnAgregarMejoraRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMejoraRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMejoraRegistroActionPerformed

    private void btnCerrar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar11ActionPerformed
        pnlAgregarMejora.setVisible(false);
        pnlVerMejoras.setVisible(true);
    }//GEN-LAST:event_btnCerrar11ActionPerformed

    private void btnAgregarMejoraGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMejoraGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMejoraGuardarActionPerformed

    private void btnCerrar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar12ActionPerformed
        pnlAgregarMejoraRegistro.setVisible(false);
        pnlVerMejoras.setVisible(true);
    }//GEN-LAST:event_btnCerrar12ActionPerformed

    private void btnAgregarMejoraRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMejoraRegistroGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMejoraRegistroGuardarActionPerformed

    private void chbAgregarMejoraRegistroPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAgregarMejoraRegistroPresenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbAgregarMejoraRegistroPresenteActionPerformed

    private void txtAgregarCapacitacionTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarCapacitacionTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarCapacitacionTemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HeaderAgregarAsesoria;
    private javax.swing.JPanel HeaderAgregarCapacitacion;
    private javax.swing.JPanel HeaderAgregarCapacitacionRegistro;
    private javax.swing.JPanel HeaderAgregarCliente2;
    private javax.swing.JPanel HeaderAgregarMejora;
    private javax.swing.JPanel HeaderAgregarMejoraRegistro;
    private javax.swing.JPanel HeaderAgregarVisita;
    private javax.swing.JPanel HeaderAgregarVisitaRegistro;
    private javax.swing.JLabel LogoSP;
    public javax.swing.JButton btnAgregarAsesoria;
    public javax.swing.JButton btnAgregarAsesoriaGuardar;
    public javax.swing.JButton btnAgregarAsesoriaLimpiar;
    public javax.swing.JButton btnAgregarAsesoriaRegistro;
    public javax.swing.JButton btnAgregarAsesoriaRegistroGuardar;
    public javax.swing.JButton btnAgregarAsesoriaRegistroLimpiar;
    public javax.swing.JButton btnAgregarCapacitacion;
    public javax.swing.JButton btnAgregarCapacitacionGuardar;
    public javax.swing.JButton btnAgregarCapacitacionLimpiar;
    public javax.swing.JButton btnAgregarCapacitacionRegistro;
    public javax.swing.JButton btnAgregarCapacitacionRegistroGuardar;
    public javax.swing.JButton btnAgregarCapacitacionRegistroLimpiar;
    public javax.swing.JButton btnAgregarMejora;
    public javax.swing.JButton btnAgregarMejoraGuardar;
    public javax.swing.JButton btnAgregarMejoraLimpiar;
    public javax.swing.JButton btnAgregarMejoraRegistro;
    public javax.swing.JButton btnAgregarMejoraRegistroGuardar;
    public javax.swing.JButton btnAgregarMejoraRegistroLimpiar;
    public javax.swing.JButton btnAgregarVisita;
    public javax.swing.JButton btnAgregarVisitaGuardar;
    public javax.swing.JButton btnAgregarVisitaLimpiar;
    public javax.swing.JButton btnAgregarVisitaRegistro;
    public javax.swing.JButton btnAgregarVisitaRegistroGuardar;
    public javax.swing.JButton btnAgregarVisitaRegistroLimpiar;
    public javax.swing.JButton btnAsesorias;
    public javax.swing.JButton btnCapacitaciones;
    private javax.swing.JButton btnCerrar11;
    private javax.swing.JButton btnCerrar12;
    private javax.swing.JButton btnCerrar2;
    private javax.swing.JButton btnCerrar4;
    private javax.swing.JButton btnCerrar5;
    private javax.swing.JButton btnCerrar6;
    private javax.swing.JButton btnCerrar7;
    private javax.swing.JButton btnCerrar8;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnChecklists;
    public javax.swing.JButton btnMejoras;
    public javax.swing.JButton btnMiPerfil;
    public javax.swing.JButton btnMiPerfilActualizar;
    private javax.swing.JButton btnMiPerfilCerrar;
    private javax.swing.JButton btnNotify;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUser;
    public javax.swing.JButton btnVerAsesoriaRegistros;
    public javax.swing.JButton btnVerCapacitacionRegistros;
    public javax.swing.JButton btnVerMejoraRegistros;
    public javax.swing.JButton btnVerVisitaRegistros;
    public javax.swing.JButton btnVisitas;
    public javax.swing.JComboBox<String> cbxAgregarAsesoriaEmpresa;
    public javax.swing.JComboBox<String> cbxAgregarCapacitacionEmpresa;
    public javax.swing.JComboBox<String> cbxAgregarMejoraEmpresa;
    public javax.swing.JComboBox<String> cbxAgregarVisitaEmpresa;
    public javax.swing.JCheckBox chbAgregarAsesoriaRegistroPresente;
    public javax.swing.JCheckBox chbAgregarCapacitacionRegistroPresente;
    public javax.swing.JCheckBox chbAgregarMejoraRegistroPresente;
    public javax.swing.JCheckBox chbAgregarVisitaRegistroPresente;
    private javax.swing.JPanel container;
    public com.toedter.calendar.JDateChooser dateAgregarAsesoriaDesde;
    public com.toedter.calendar.JDateChooser dateAgregarAsesoriaHasta;
    public com.toedter.calendar.JDateChooser dateAgregarCapacitacionDesde;
    public com.toedter.calendar.JDateChooser dateAgregarCapacitacionHasta;
    public com.toedter.calendar.JDateChooser dateAgregarMejoraDesde;
    public com.toedter.calendar.JDateChooser dateAgregarMejoraHasta;
    public com.toedter.calendar.JDateChooser dateAgregarVisitaDesde;
    public com.toedter.calendar.JDateChooser dateAgregarVisitaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JLabel lblAsesoriaRegistroID;
    public javax.swing.JLabel lblCapacitacionRegistroID;
    public javax.swing.JLabel lblEditarClienteID1;
    private javax.swing.JLabel lblEditarClienteTitulo1;
    public javax.swing.JLabel lblMejoraRegistroID;
    private javax.swing.JLabel lblTituloAsesoriaRegistro;
    private javax.swing.JLabel lblTituloAsesorias;
    private javax.swing.JLabel lblTituloCapacitaciones;
    private javax.swing.JLabel lblTituloCapacitacionesRegistro;
    private javax.swing.JLabel lblTituloMejoras;
    private javax.swing.JLabel lblTituloMejorasRegistro;
    private javax.swing.JLabel lblTituloVisitas;
    private javax.swing.JLabel lblTituloVisitasRegistro;
    private javax.swing.JLabel lblUser13;
    private javax.swing.JLabel lblUser14;
    private javax.swing.JLabel lblUser15;
    private javax.swing.JLabel lblUser16;
    private javax.swing.JLabel lblUser17;
    private javax.swing.JLabel lblUser18;
    private javax.swing.JLabel lblUser19;
    private javax.swing.JLabel lblUser20;
    private javax.swing.JLabel lblUser21;
    private javax.swing.JLabel lblUser22;
    private javax.swing.JLabel lblUser23;
    private javax.swing.JLabel lblUser24;
    private javax.swing.JLabel lblUser25;
    private javax.swing.JLabel lblUser26;
    private javax.swing.JLabel lblUser27;
    private javax.swing.JLabel lblUser28;
    private javax.swing.JLabel lblUser29;
    private javax.swing.JLabel lblUser30;
    private javax.swing.JLabel lblUser31;
    private javax.swing.JLabel lblUser32;
    private javax.swing.JLabel lblUser33;
    private javax.swing.JLabel lblUser34;
    private javax.swing.JLabel lblUser35;
    private javax.swing.JLabel lblUser36;
    private javax.swing.JLabel lblUser37;
    private javax.swing.JLabel lblUser38;
    private javax.swing.JLabel lblUser39;
    private javax.swing.JLabel lblUser40;
    private javax.swing.JLabel lblUser41;
    private javax.swing.JLabel lblUser42;
    private javax.swing.JLabel lblUser43;
    private javax.swing.JLabel lblUser53;
    private javax.swing.JLabel lblUser54;
    private javax.swing.JLabel lblUser55;
    private javax.swing.JLabel lblUser56;
    private javax.swing.JLabel lblUser57;
    private javax.swing.JLabel lblUser58;
    private javax.swing.JLabel lblUser59;
    private javax.swing.JLabel lblUser6;
    private javax.swing.JLabel lblUser60;
    private javax.swing.JLabel lblUser61;
    private javax.swing.JLabel lblUser7;
    private javax.swing.JLabel lblUser8;
    private javax.swing.JLabel lblUser9;
    public javax.swing.JLabel lblVisitaRegistroID;
    private javax.swing.JPanel menuNotificaciones;
    private javax.swing.JPanel menuSesion;
    public javax.swing.JPanel pnlAgregarAsesoriaRegistro;
    public javax.swing.JPanel pnlAgregarAsesorias;
    public javax.swing.JPanel pnlAgregarCapacitaciones;
    public javax.swing.JPanel pnlAgregarCapacitacionesRegistro;
    public javax.swing.JPanel pnlAgregarMejora;
    public javax.swing.JPanel pnlAgregarMejoraRegistro;
    public javax.swing.JPanel pnlAgregarVisita;
    public javax.swing.JPanel pnlAgregarVisitaRegistro;
    public javax.swing.JPanel pnlAsesorias;
    public javax.swing.JPanel pnlCapacitaciones;
    private javax.swing.JPanel pnlHeaderEditar1;
    public javax.swing.JPanel pnlInicio;
    public javax.swing.JPanel pnlMejoras;
    public javax.swing.JPanel pnlMiPerfil;
    public javax.swing.JPanel pnlVerAsesorias;
    public javax.swing.JPanel pnlVerCapacitaciones;
    public javax.swing.JPanel pnlVerMejoras;
    public javax.swing.JPanel pnlVerVisitas;
    public javax.swing.JPanel pnlVisitas;
    public javax.swing.JTable tblAsesoriaRegistros;
    public javax.swing.JTable tblAsesorias;
    public javax.swing.JTable tblCapacitacionRegistros;
    public javax.swing.JTable tblCapacitaciones;
    public javax.swing.JTable tblMejoras;
    public javax.swing.JTable tblMejorasRegistro;
    public javax.swing.JTable tblVisitas;
    public javax.swing.JTable tblVisitasRegistro;
    public javax.swing.JTextArea txtAgregarAsesoriaDescripcion;
    public javax.swing.JTextField txtAgregarAsesoriaDireccion;
    public javax.swing.JTextField txtAgregarAsesoriaRegistroCargo;
    public javax.swing.JTextField txtAgregarAsesoriaRegistroNombre;
    public javax.swing.JTextField txtAgregarAsesoriaRegistroRut;
    public javax.swing.JTextField txtAgregarAsesoriaTema;
    public javax.swing.JTextArea txtAgregarCapacitacionDescripcion;
    public javax.swing.JTextField txtAgregarCapacitacionDireccion;
    public javax.swing.JTextField txtAgregarCapacitacionRegistroCargo;
    public javax.swing.JTextField txtAgregarCapacitacionRegistroNombre;
    public javax.swing.JTextField txtAgregarCapacitacionRegistroRut;
    public javax.swing.JTextField txtAgregarCapacitacionTema;
    public javax.swing.JTextArea txtAgregarMejoraDescripcion;
    public javax.swing.JTextField txtAgregarMejoraDireccion;
    public javax.swing.JTextField txtAgregarMejoraRegistroCargo;
    public javax.swing.JTextField txtAgregarMejoraRegistroNombre;
    public javax.swing.JTextField txtAgregarMejoraRegistroRut;
    public javax.swing.JTextField txtAgregarMejoraTema;
    public javax.swing.JTextArea txtAgregarVisitaDescripcion;
    public javax.swing.JTextField txtAgregarVisitaDireccion;
    public javax.swing.JTextField txtAgregarVisitaRegistroCargo;
    public javax.swing.JTextField txtAgregarVisitaRegistroNombre;
    public javax.swing.JTextField txtAgregarVisitaRegistroRut;
    public javax.swing.JTextField txtAgregarVisitaTema;
    public javax.swing.JTextField txtMiPerfilAMaterno;
    public javax.swing.JTextField txtMiPerfilAPaterno;
    public javax.swing.JTextField txtMiPerfilMail;
    public javax.swing.JTextField txtMiPerfilNPassword;
    public javax.swing.JTextField txtMiPerfilNombres;
    public javax.swing.JTextField txtMiPerfilPassword;
    public javax.swing.JTextField txtMiPerfilRPassword;
    public javax.swing.JTextField txtMiPerfilRUT;
    // End of variables declaration//GEN-END:variables


   
}
