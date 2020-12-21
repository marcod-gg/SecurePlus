
package app.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;


public final class UICliente extends javax.swing.JFrame {
    
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

    public UICliente() {
        //Iniciar Componentes
        initComponents();
        
        //Aplicación a pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Solo panel de inicio
        VerPanel(pnlInicio);
        
        this.lblAccidenteRegistroID.setVisible(false);
        this.lblAsesoriaRegistroID.setVisible(false);


    }
    
    public void VerPanel(JPanel panel){
        pnlMiPerfil.setVisible(false);
        pnlAccidentes.setVisible(false);
        pnlAsesorias.setVisible(false);
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
        btnAccidentes = new javax.swing.JButton();
        btnAsesorias = new javax.swing.JButton();
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
        pnlAccidentes = new javax.swing.JPanel();
        pnlVerAccidentes = new javax.swing.JPanel();
        btnAgregarAccidente = new javax.swing.JButton();
        lblTituloAccidentes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAccidentes = new javax.swing.JTable();
        btnVerAccidenteRegistros = new javax.swing.JButton();
        lblTituloAccidentesRegistro = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAccidentesRegistro = new javax.swing.JTable();
        btnAgregarAccidenteRegistro = new javax.swing.JButton();
        lblAccidenteRegistroID = new javax.swing.JLabel();
        pnlAgregarAccidente = new javax.swing.JPanel();
        HeaderAgregarCliente = new javax.swing.JPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        lblUser4 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblUser5 = new javax.swing.JLabel();
        txtAgregarAccidenteTema = new javax.swing.JTextField();
        txtAgregarAccidenteDireccion = new javax.swing.JTextField();
        dateAgregarAccidenteDesde = new com.toedter.calendar.JDateChooser();
        dateAgregarAccidenteHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAgregarAccidenteDescripcion = new javax.swing.JTextArea();
        cbxAgregarAccidenteProfesional = new javax.swing.JComboBox<>();
        btnAgregarAccidenteGuardar = new javax.swing.JButton();
        btnAgregarAccidenteLimpiar = new javax.swing.JButton();
        pnlAgregarAccidenteRegistro = new javax.swing.JPanel();
        HeaderAgregarCliente1 = new javax.swing.JPanel();
        btnCerrar3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblUser10 = new javax.swing.JLabel();
        lblUser11 = new javax.swing.JLabel();
        lblUser12 = new javax.swing.JLabel();
        txtAgregarAccidenteRegistroRut = new javax.swing.JTextField();
        txtAgregarAccidenteRegistroNombre = new javax.swing.JTextField();
        txtAgregarAccidenteRegistroCargo = new javax.swing.JTextField();
        btnAgregarAccidenteRegistroGuardar = new javax.swing.JButton();
        btnAgregarAccidenteRegistroLimpiar = new javax.swing.JButton();
        chbAgregarAccidenteRegistroPresente = new javax.swing.JCheckBox();
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
        cbxAgregarAsesoriaProfesional = new javax.swing.JComboBox<>();
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

        btnAccidentes.setBackground(colorSecondary);
        btnAccidentes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAccidentes.setForeground(new java.awt.Color(255, 255, 255));
        btnAccidentes.setText("ACCIDENTES");
        btnAccidentes.setBorder(null);
        btnAccidentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccidentesMouseClicked(evt);
            }
        });
        btnAccidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccidentesActionPerformed(evt);
            }
        });
        Header.add(btnAccidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 200, 70));

        btnAsesorias.setBackground(colorSecondary);
        btnAsesorias.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAsesorias.setForeground(new java.awt.Color(255, 255, 255));
        btnAsesorias.setText("ASESORIA ESPECIAL");
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
        Header.add(btnAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 200, 70));

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

        pnlAccidentes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAccidentes.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlAccidentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerAccidentes.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerAccidentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarAccidente.setBackground(colorBtnAgregar);
        btnAgregarAccidente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAccidente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAccidente.setText("Nuevo accidente");
        btnAgregarAccidente.setBorder(null);
        btnAgregarAccidente.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarAccidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAccidenteActionPerformed(evt);
            }
        });
        pnlVerAccidentes.add(btnAgregarAccidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 50, 160, -1));

        lblTituloAccidentes.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloAccidentes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloAccidentes.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloAccidentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAccidentes.setText("ACCIDENTES");
        pnlVerAccidentes.add(lblTituloAccidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 1280, 50));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblAccidentes.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblAccidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblAccidentes);

        pnlVerAccidentes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 310));

        btnVerAccidenteRegistros.setBackground(colorBtnAgregar);
        btnVerAccidenteRegistros.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVerAccidenteRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAccidenteRegistros.setText("Ver Registros");
        btnVerAccidenteRegistros.setBorder(null);
        btnVerAccidenteRegistros.setPreferredSize(new java.awt.Dimension(200, 60));
        btnVerAccidenteRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAccidenteRegistrosActionPerformed(evt);
            }
        });
        pnlVerAccidentes.add(btnVerAccidenteRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 160, -1));

        lblTituloAccidentesRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloAccidentesRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloAccidentesRegistro.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloAccidentesRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAccidentesRegistro.setText("Registros");
        pnlVerAccidentes.add(lblTituloAccidentesRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 1280, 50));

        jScrollPane4.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblAccidentesRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblAccidentesRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblAccidentesRegistro);

        pnlVerAccidentes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 320));

        btnAgregarAccidenteRegistro.setBackground(colorBtnAgregar);
        btnAgregarAccidenteRegistro.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAccidenteRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAccidenteRegistro.setText("Agregar registro");
        btnAgregarAccidenteRegistro.setBorder(null);
        btnAgregarAccidenteRegistro.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarAccidenteRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAccidenteRegistroActionPerformed(evt);
            }
        });
        pnlVerAccidentes.add(btnAgregarAccidenteRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 470, 160, -1));
        pnlVerAccidentes.add(lblAccidenteRegistroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 880, -1, -1));

        pnlAccidentes.add(pnlVerAccidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlAgregarAccidente.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarAccidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarAccidente.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarAccidente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarCliente.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar1.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar1.setBorder(null);
        btnCerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        HeaderAgregarCliente.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REPORTAR NUEVO ACCIDENTE");
        HeaderAgregarCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarAccidente.add(HeaderAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser2.setBackground(new java.awt.Color(0, 0, 0));
        lblUser2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(0, 0, 0));
        lblUser2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser2.setText("Tema");
        lblUser2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidente.add(lblUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser.setBackground(new java.awt.Color(0, 0, 0));
        lblUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Dirección");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidente.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser1.setBackground(new java.awt.Color(0, 0, 0));
        lblUser1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(0, 0, 0));
        lblUser1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser1.setText("Desde");
        lblUser1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidente.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        lblUser4.setBackground(new java.awt.Color(0, 0, 0));
        lblUser4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser4.setForeground(new java.awt.Color(0, 0, 0));
        lblUser4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser4.setText("Hasta");
        lblUser4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidente.add(lblUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 40));

        lblUser3.setBackground(new java.awt.Color(0, 0, 0));
        lblUser3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(0, 0, 0));
        lblUser3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser3.setText("Descripción");
        lblUser3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidente.add(lblUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lblUser5.setBackground(new java.awt.Color(0, 0, 0));
        lblUser5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser5.setForeground(new java.awt.Color(0, 0, 0));
        lblUser5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser5.setText("Profesional");
        lblUser5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidente.add(lblUser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 40));

        txtAgregarAccidenteTema.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAccidente.add(txtAgregarAccidenteTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarAccidenteDireccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAccidente.add(txtAgregarAccidenteDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));
        pnlAgregarAccidente.add(dateAgregarAccidenteDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));
        pnlAgregarAccidente.add(dateAgregarAccidenteHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 40));

        txtAgregarAccidenteDescripcion.setColumns(20);
        txtAgregarAccidenteDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAgregarAccidenteDescripcion);

        pnlAgregarAccidente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 440, 180));
        pnlAgregarAccidente.add(cbxAgregarAccidenteProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

        btnAgregarAccidenteGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarAccidenteGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAccidenteGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAccidenteGuardar.setText("Guardar");
        btnAgregarAccidenteGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarAccidenteGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAccidenteGuardarActionPerformed(evt);
            }
        });
        pnlAgregarAccidente.add(btnAgregarAccidenteGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 300, 40));

        btnAgregarAccidenteLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarAccidenteLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAccidenteLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAccidenteLimpiar.setText("Limpiar");
        btnAgregarAccidenteLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarAccidente.add(btnAgregarAccidenteLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 300, 40));

        pnlAccidentes.add(pnlAgregarAccidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarAccidenteRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarAccidenteRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarAccidenteRegistro.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarAccidenteRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarCliente1.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarCliente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarCliente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar3.setBackground(new java.awt.Color(0, 255, 102));
        btnCerrar3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnCerrar3.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnCerrar3.setBorder(null);
        btnCerrar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar3ActionPerformed(evt);
            }
        });
        HeaderAgregarCliente1.add(btnCerrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NUEVO REGISTRO DE ACCIDENTE");
        HeaderAgregarCliente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarAccidenteRegistro.add(HeaderAgregarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser10.setBackground(new java.awt.Color(0, 0, 0));
        lblUser10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser10.setForeground(new java.awt.Color(0, 0, 0));
        lblUser10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser10.setText("Rut");
        lblUser10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidenteRegistro.add(lblUser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 40));

        lblUser11.setBackground(new java.awt.Color(0, 0, 0));
        lblUser11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser11.setForeground(new java.awt.Color(0, 0, 0));
        lblUser11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser11.setText("Nombre");
        lblUser11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidenteRegistro.add(lblUser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        lblUser12.setBackground(new java.awt.Color(0, 0, 0));
        lblUser12.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser12.setForeground(new java.awt.Color(0, 0, 0));
        lblUser12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser12.setText("Cargo");
        lblUser12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarAccidenteRegistro.add(lblUser12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 40));

        txtAgregarAccidenteRegistroRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAccidenteRegistro.add(txtAgregarAccidenteRegistroRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 440, 40));

        txtAgregarAccidenteRegistroNombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAccidenteRegistro.add(txtAgregarAccidenteRegistroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 440, 38));

        txtAgregarAccidenteRegistroCargo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarAccidenteRegistro.add(txtAgregarAccidenteRegistroCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 440, 38));

        btnAgregarAccidenteRegistroGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarAccidenteRegistroGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAccidenteRegistroGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAccidenteRegistroGuardar.setText("Guardar");
        btnAgregarAccidenteRegistroGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarAccidenteRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAccidenteRegistroGuardarActionPerformed(evt);
            }
        });
        pnlAgregarAccidenteRegistro.add(btnAgregarAccidenteRegistroGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 220, 40));

        btnAgregarAccidenteRegistroLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarAccidenteRegistroLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarAccidenteRegistroLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAccidenteRegistroLimpiar.setText("Limpiar");
        btnAgregarAccidenteRegistroLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarAccidenteRegistro.add(btnAgregarAccidenteRegistroLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 40));

        chbAgregarAccidenteRegistroPresente.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        chbAgregarAccidenteRegistroPresente.setText("Presente");
        chbAgregarAccidenteRegistroPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAgregarAccidenteRegistroPresenteActionPerformed(evt);
            }
        });
        pnlAgregarAccidenteRegistro.add(chbAgregarAccidenteRegistroPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, 40));

        pnlAccidentes.add(pnlAgregarAccidenteRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlAccidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

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
        lblUser18.setText("Profesional");
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
        pnlAgregarAsesorias.add(cbxAgregarAsesoriaProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

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

    private void btnAccidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccidentesMouseClicked

    }//GEN-LAST:event_btnAccidentesMouseClicked

    private void btnAccidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccidentesActionPerformed
        VerPanel(pnlAccidentes);
        pnlAgregarAccidente.setVisible(false);
        pnlAgregarAccidenteRegistro.setVisible(false);
        pnlVerAccidentes.setVisible(true);
    }//GEN-LAST:event_btnAccidentesActionPerformed

    private void btnAsesoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsesoriasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsesoriasMouseClicked

    private void btnAsesoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesoriasActionPerformed
        VerPanel(pnlAsesorias);
        pnlAgregarAsesorias.setVisible(false);
        pnlAgregarAsesoriaRegistro.setVisible(false);
        pnlVerAsesorias.setVisible(true);
    }//GEN-LAST:event_btnAsesoriasActionPerformed

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

    private void btnAgregarAccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAccidenteActionPerformed
        pnlVerAccidentes.setVisible(false);
        pnlAgregarAccidente.setVisible(true);
    }//GEN-LAST:event_btnAgregarAccidenteActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        pnlAgregarAccidente.setVisible(false);
        pnlVerAccidentes.setVisible(true);
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnAgregarAccidenteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAccidenteGuardarActionPerformed

    }//GEN-LAST:event_btnAgregarAccidenteGuardarActionPerformed

    private void btnVerAccidenteRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAccidenteRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerAccidenteRegistrosActionPerformed

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

    private void btnAgregarAccidenteRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAccidenteRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAccidenteRegistroActionPerformed

    private void btnCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar3ActionPerformed
        pnlAgregarAccidenteRegistro.setVisible(false);
        pnlVerAccidentes.setVisible(true);
    }//GEN-LAST:event_btnCerrar3ActionPerformed

    private void btnAgregarAccidenteRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAccidenteRegistroGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAccidenteRegistroGuardarActionPerformed

    private void chbAgregarAccidenteRegistroPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAgregarAccidenteRegistroPresenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbAgregarAccidenteRegistroPresenteActionPerformed

    private void btnCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar4ActionPerformed
        this.pnlAgregarAsesoriaRegistro.setVisible(false);
        this.pnlVerAsesorias.setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HeaderAgregarAsesoria;
    private javax.swing.JPanel HeaderAgregarCliente;
    private javax.swing.JPanel HeaderAgregarCliente1;
    private javax.swing.JPanel HeaderAgregarCliente2;
    private javax.swing.JLabel LogoSP;
    public javax.swing.JButton btnAccidentes;
    public javax.swing.JButton btnAgregarAccidente;
    public javax.swing.JButton btnAgregarAccidenteGuardar;
    public javax.swing.JButton btnAgregarAccidenteLimpiar;
    public javax.swing.JButton btnAgregarAccidenteRegistro;
    public javax.swing.JButton btnAgregarAccidenteRegistroGuardar;
    public javax.swing.JButton btnAgregarAccidenteRegistroLimpiar;
    public javax.swing.JButton btnAgregarAsesoria;
    public javax.swing.JButton btnAgregarAsesoriaGuardar;
    public javax.swing.JButton btnAgregarAsesoriaLimpiar;
    public javax.swing.JButton btnAgregarAsesoriaRegistro;
    public javax.swing.JButton btnAgregarAsesoriaRegistroGuardar;
    public javax.swing.JButton btnAgregarAsesoriaRegistroLimpiar;
    public javax.swing.JButton btnAsesorias;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnCerrar2;
    private javax.swing.JButton btnCerrar3;
    private javax.swing.JButton btnCerrar4;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnMiPerfil;
    public javax.swing.JButton btnMiPerfilActualizar;
    private javax.swing.JButton btnMiPerfilCerrar;
    private javax.swing.JButton btnNotify;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUser;
    public javax.swing.JButton btnVerAccidenteRegistros;
    public javax.swing.JButton btnVerAsesoriaRegistros;
    public javax.swing.JComboBox<String> cbxAgregarAccidenteProfesional;
    public javax.swing.JComboBox<String> cbxAgregarAsesoriaProfesional;
    public javax.swing.JCheckBox chbAgregarAccidenteRegistroPresente;
    public javax.swing.JCheckBox chbAgregarAsesoriaRegistroPresente;
    private javax.swing.JPanel container;
    public com.toedter.calendar.JDateChooser dateAgregarAccidenteDesde;
    public com.toedter.calendar.JDateChooser dateAgregarAccidenteHasta;
    public com.toedter.calendar.JDateChooser dateAgregarAsesoriaDesde;
    public com.toedter.calendar.JDateChooser dateAgregarAsesoriaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JLabel lblAccidenteRegistroID;
    public javax.swing.JLabel lblAsesoriaRegistroID;
    public javax.swing.JLabel lblEditarClienteID1;
    private javax.swing.JLabel lblEditarClienteTitulo1;
    private javax.swing.JLabel lblTituloAccidentes;
    private javax.swing.JLabel lblTituloAccidentesRegistro;
    private javax.swing.JLabel lblTituloAsesoriaRegistro;
    private javax.swing.JLabel lblTituloAsesorias;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser10;
    private javax.swing.JLabel lblUser11;
    private javax.swing.JLabel lblUser12;
    private javax.swing.JLabel lblUser13;
    private javax.swing.JLabel lblUser14;
    private javax.swing.JLabel lblUser15;
    private javax.swing.JLabel lblUser17;
    private javax.swing.JLabel lblUser18;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser28;
    private javax.swing.JLabel lblUser29;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser30;
    private javax.swing.JLabel lblUser31;
    private javax.swing.JLabel lblUser32;
    private javax.swing.JLabel lblUser33;
    private javax.swing.JLabel lblUser34;
    private javax.swing.JLabel lblUser35;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JLabel lblUser5;
    private javax.swing.JLabel lblUser6;
    private javax.swing.JLabel lblUser7;
    private javax.swing.JLabel lblUser8;
    private javax.swing.JLabel lblUser9;
    private javax.swing.JPanel menuNotificaciones;
    private javax.swing.JPanel menuSesion;
    public javax.swing.JPanel pnlAccidentes;
    public javax.swing.JPanel pnlAgregarAccidente;
    public javax.swing.JPanel pnlAgregarAccidenteRegistro;
    public javax.swing.JPanel pnlAgregarAsesoriaRegistro;
    public javax.swing.JPanel pnlAgregarAsesorias;
    public javax.swing.JPanel pnlAsesorias;
    private javax.swing.JPanel pnlHeaderEditar1;
    public javax.swing.JPanel pnlInicio;
    public javax.swing.JPanel pnlMiPerfil;
    public javax.swing.JPanel pnlVerAccidentes;
    public javax.swing.JPanel pnlVerAsesorias;
    public javax.swing.JTable tblAccidentes;
    public javax.swing.JTable tblAccidentesRegistro;
    public javax.swing.JTable tblAsesoriaRegistros;
    public javax.swing.JTable tblAsesorias;
    public javax.swing.JTextArea txtAgregarAccidenteDescripcion;
    public javax.swing.JTextField txtAgregarAccidenteDireccion;
    public javax.swing.JTextField txtAgregarAccidenteRegistroCargo;
    public javax.swing.JTextField txtAgregarAccidenteRegistroNombre;
    public javax.swing.JTextField txtAgregarAccidenteRegistroRut;
    public javax.swing.JTextField txtAgregarAccidenteTema;
    public javax.swing.JTextArea txtAgregarAsesoriaDescripcion;
    public javax.swing.JTextField txtAgregarAsesoriaDireccion;
    public javax.swing.JTextField txtAgregarAsesoriaRegistroCargo;
    public javax.swing.JTextField txtAgregarAsesoriaRegistroNombre;
    public javax.swing.JTextField txtAgregarAsesoriaRegistroRut;
    public javax.swing.JTextField txtAgregarAsesoriaTema;
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
