
package app.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;


public final class UIAdmin extends javax.swing.JFrame {
    
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

    public UIAdmin() {
        //Iniciar Componentes
        initComponents();
        VerPanel(pnlInicio);
        
        //Aplicación a pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Asignar fuente a tablas
        tblAdminClientes.getTableHeader().setFont(new Font("Segoe UI Historic", 1, 16));
        tblAdminClientes.getTableHeader().setBackground(colorDark);
        tblAdminClientes.getTableHeader().setForeground(Color.white);
        
        tblAdminProfesional.getTableHeader().setFont(new Font("Segoe UI Historic", 1, 16));
        tblAdminProfesional.getTableHeader().setBackground(colorDark);
        tblAdminProfesional.getTableHeader().setForeground(Color.white);


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
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProfes = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnNotify = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuClientes = new javax.swing.JPanel();
        btnRepAcc = new javax.swing.JButton();
        btnAseEsp = new javax.swing.JButton();
        menuProfesionales = new javax.swing.JPanel();
        btnCapacitaciones = new javax.swing.JButton();
        btnVisitas = new javax.swing.JButton();
        btnCliente2 = new javax.swing.JButton();
        btnAsesorias = new javax.swing.JButton();
        btnChecklist = new javax.swing.JButton();
        btnMejoras = new javax.swing.JButton();
        menuInformes = new javax.swing.JPanel();
        btnPagoClientes = new javax.swing.JButton();
        btnInfoAcc = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnAtrasos = new javax.swing.JButton();
        btnRepCliente = new javax.swing.JButton();
        btnRepGlobal = new javax.swing.JButton();
        menuAdmin = new javax.swing.JPanel();
        btnAdminClientes = new javax.swing.JButton();
        btnAdminProf = new javax.swing.JButton();
        menuNotificaciones = new javax.swing.JPanel();
        menuSesion = new javax.swing.JPanel();
        btnMiPerfil = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlAdminProfesional = new javax.swing.JPanel();
        pnlVerProfesional = new javax.swing.JPanel();
        lblTituloProfesional = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAdminProfesional = new javax.swing.JTable();
        btnAgregarProfesional = new javax.swing.JButton();
        btnEditarProfesional = new javax.swing.JButton();
        btnCambiarEstadoProfesional = new javax.swing.JButton();
        pnlEditarProfesional = new javax.swing.JPanel();
        pnlHeaderProfesional = new javax.swing.JPanel();
        btnEditarProfesionalCerrar = new javax.swing.JButton();
        lblEditarProfesionalID = new javax.swing.JLabel();
        lblEditarProfesionalTitulo = new javax.swing.JLabel();
        lblUser14 = new javax.swing.JLabel();
        lblUser15 = new javax.swing.JLabel();
        lblUser17 = new javax.swing.JLabel();
        lblUser20 = new javax.swing.JLabel();
        lblUser21 = new javax.swing.JLabel();
        lblUser22 = new javax.swing.JLabel();
        lblUser23 = new javax.swing.JLabel();
        txtEditarProfesionalUsername = new javax.swing.JTextField();
        txtEditarProfesionalNombres = new javax.swing.JTextField();
        txtEditarProfesionalAPaterno = new javax.swing.JTextField();
        txtEditarProfesionalAMaterno = new javax.swing.JTextField();
        txtEditarProfesionalRUT = new javax.swing.JTextField();
        txtEditarProfesionalMail = new javax.swing.JTextField();
        cbxEditarProfesionalEmpresa = new javax.swing.JComboBox<>();
        btnEditarProfesionalActualizar = new javax.swing.JButton();
        pnlAgregarProfesional = new javax.swing.JPanel();
        HeaderAgregarProfesional = new javax.swing.JPanel();
        btnCerrar2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblUser4 = new javax.swing.JLabel();
        lblUser5 = new javax.swing.JLabel();
        lblUser7 = new javax.swing.JLabel();
        lblUser24 = new javax.swing.JLabel();
        lblUser25 = new javax.swing.JLabel();
        lblUser26 = new javax.swing.JLabel();
        lblUser27 = new javax.swing.JLabel();
        txtAgregarProfesionalUsername = new javax.swing.JTextField();
        txtAgregarProfesionalNombres = new javax.swing.JTextField();
        txtAgregarProfesionalAPaterno = new javax.swing.JTextField();
        txtAgregarProfesionalAMaterno = new javax.swing.JTextField();
        txtAgregarProfesionalRUT = new javax.swing.JTextField();
        txtAgregarProfesionalMail = new javax.swing.JTextField();
        cbxAgregarProfesionalEmpresa = new javax.swing.JComboBox<>();
        btnAgregarProfesionalGuardar = new javax.swing.JButton();
        btnAgregarProfesionalLimpiar = new javax.swing.JButton();
        pnlAdminClientes = new javax.swing.JPanel();
        pnlVerClientes = new javax.swing.JPanel();
        lblTituloClientes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAdminClientes = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnCambiarEstadoCliente = new javax.swing.JButton();
        pnlEditarCliente = new javax.swing.JPanel();
        pnlHeaderEditar = new javax.swing.JPanel();
        btnEditarClienteCerrar = new javax.swing.JButton();
        lblEditarClienteID = new javax.swing.JLabel();
        lblEditarClienteTitulo = new javax.swing.JLabel();
        lblUser12 = new javax.swing.JLabel();
        lblUser13 = new javax.swing.JLabel();
        lblUser10 = new javax.swing.JLabel();
        lblUser11 = new javax.swing.JLabel();
        lblUser18 = new javax.swing.JLabel();
        lblUser19 = new javax.swing.JLabel();
        lblUser16 = new javax.swing.JLabel();
        txtEditarClienteUsername = new javax.swing.JTextField();
        txtEditarClienteNombres = new javax.swing.JTextField();
        txtEditarClienteAPaterno = new javax.swing.JTextField();
        txtEditarClienteAMaterno = new javax.swing.JTextField();
        txtEditarClienteRUT = new javax.swing.JTextField();
        txtEditarClienteMail = new javax.swing.JTextField();
        cbxEditarClienteEmpresa = new javax.swing.JComboBox<>();
        btnEditarClienteActualizar = new javax.swing.JButton();
        pnlAgregarCliente = new javax.swing.JPanel();
        HeaderAgregarCliente = new javax.swing.JPanel();
        btnCerrar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        lblUser8 = new javax.swing.JLabel();
        lblUser9 = new javax.swing.JLabel();
        lblUser6 = new javax.swing.JLabel();
        txtAgregarClienteUsername = new javax.swing.JTextField();
        txtAgregarClienteNombres = new javax.swing.JTextField();
        txtAgregarClienteAPaterno = new javax.swing.JTextField();
        txtAgregarClienteAMaterno = new javax.swing.JTextField();
        txtAgregarClienteRUT = new javax.swing.JTextField();
        txtAgregarClienteMail = new javax.swing.JTextField();
        cbxAgregarClienteEmpresa = new javax.swing.JComboBox<>();
        btnAgregarClienteGuardar = new javax.swing.JButton();
        btnAgregarClienteLimpiar = new javax.swing.JButton();
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
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(colorSecondary);
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/splogo_1.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 70));
        jLabel2.setRequestFocusEnabled(false);
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        btnInicio.setBackground(colorSecondary);
        btnInicio.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        Header.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 70));

        btnCliente.setBackground(colorSecondary);
        btnCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("CLIENTE");
        btnCliente.setBorder(null);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        Header.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 200, 70));

        btnProfes.setBackground(colorSecondary);
        btnProfes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnProfes.setForeground(new java.awt.Color(255, 255, 255));
        btnProfes.setText("PROFESIONAL");
        btnProfes.setBorder(null);
        btnProfes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfesMouseClicked(evt);
            }
        });
        btnProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesActionPerformed(evt);
            }
        });
        Header.add(btnProfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 70));

        btnInformes.setBackground(colorSecondary);
        btnInformes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnInformes.setForeground(new java.awt.Color(255, 255, 255));
        btnInformes.setText("INFORMES");
        btnInformes.setBorder(null);
        btnInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformesMouseClicked(evt);
            }
        });
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        Header.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 200, 70));

        btnAdmin.setBackground(colorSecondary);
        btnAdmin.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("ADMINISTRADOR");
        btnAdmin.setBorder(null);
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        Header.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 200, 70));

        btnUser.setBackground(colorSecondary);
        btnUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/user_1.png"))); // NOI18N
        btnUser.setText("SesionUsuario");
        btnUser.setBorder(null);
        btnUser.setPreferredSize(new java.awt.Dimension(200, 70));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        Header.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 0, -1, -1));

        btnNotify.setBackground(colorSecondary);
        btnNotify.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnNotify.setForeground(new java.awt.Color(255, 255, 255));
        btnNotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/campana_1.png"))); // NOI18N
        btnNotify.setBorder(null);
        btnNotify.setPreferredSize(new java.awt.Dimension(70, 70));
        btnNotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyActionPerformed(evt);
            }
        });
        Header.add(btnNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 0, -1, -1));

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

        menuClientes.setBackground(colorSecondary);
        menuClientes.setPreferredSize(new java.awt.Dimension(200, 150));
        menuClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRepAcc.setBackground(colorSecondary);
        btnRepAcc.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnRepAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnRepAcc.setText("Reportar \nAccidente");
        btnRepAcc.setBorder(null);
        btnRepAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepAccActionPerformed(evt);
            }
        });
        menuClientes.add(btnRepAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        btnAseEsp.setBackground(colorSecondary);
        btnAseEsp.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnAseEsp.setForeground(new java.awt.Color(255, 255, 255));
        btnAseEsp.setText("Solicitar Asesoría Especial");
        btnAseEsp.setBorder(null);
        btnAseEsp.setPreferredSize(new java.awt.Dimension(180, 30));
        btnAseEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAseEspActionPerformed(evt);
            }
        });
        menuClientes.add(btnAseEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 70));

        jPanel1.add(menuClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -1000, -1, -1));

        menuProfesionales.setBackground(colorSecondary);
        menuProfesionales.setPreferredSize(new java.awt.Dimension(200, 430));
        menuProfesionales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCapacitaciones.setBackground(colorSecondary);
        btnCapacitaciones.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCapacitaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCapacitaciones.setText("Capacitaciones");
        btnCapacitaciones.setBorder(null);
        btnCapacitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapacitacionesActionPerformed(evt);
            }
        });
        menuProfesionales.add(btnCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        btnVisitas.setBackground(colorSecondary);
        btnVisitas.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVisitas.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitas.setText("Visitas");
        btnVisitas.setBorder(null);
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
            }
        });
        menuProfesionales.add(btnVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 70));

        btnCliente2.setBackground(colorSecondary);
        btnCliente2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCliente2.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente2.setText("Clientes");
        btnCliente2.setBorder(null);
        btnCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente2ActionPerformed(evt);
            }
        });
        menuProfesionales.add(btnCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 70));

        btnAsesorias.setBackground(colorSecondary);
        btnAsesorias.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAsesorias.setForeground(new java.awt.Color(255, 255, 255));
        btnAsesorias.setText("Asesorias");
        btnAsesorias.setActionCommand("Capacitaciones");
        btnAsesorias.setBorder(null);
        btnAsesorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsesoriasActionPerformed(evt);
            }
        });
        menuProfesionales.add(btnAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 70));

        btnChecklist.setBackground(colorSecondary);
        btnChecklist.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnChecklist.setForeground(new java.awt.Color(255, 255, 255));
        btnChecklist.setText("Checklist");
        btnChecklist.setBorder(null);
        btnChecklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecklistActionPerformed(evt);
            }
        });
        menuProfesionales.add(btnChecklist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 70));

        btnMejoras.setBackground(colorSecondary);
        btnMejoras.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnMejoras.setForeground(new java.awt.Color(255, 255, 255));
        btnMejoras.setText("Mejoras");
        btnMejoras.setBorder(null);
        btnMejoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejorasActionPerformed(evt);
            }
        });
        menuProfesionales.add(btnMejoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 70));

        jPanel1.add(menuProfesionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -1000, -1, -1));

        menuInformes.setBackground(colorSecondary);
        menuInformes.setMinimumSize(new java.awt.Dimension(200, 490));
        menuInformes.setPreferredSize(new java.awt.Dimension(200, 430));
        menuInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagoClientes.setBackground(colorSecondary);
        btnPagoClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnPagoClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPagoClientes.setText("Pago Clientes");
        btnPagoClientes.setBorder(null);
        btnPagoClientes.setPreferredSize(new java.awt.Dimension(200, 70));
        btnPagoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoClientesActionPerformed(evt);
            }
        });
        menuInformes.add(btnPagoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        btnInfoAcc.setBackground(colorSecondary);
        btnInfoAcc.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnInfoAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoAcc.setText("Informe Accidentabilidad");
        btnInfoAcc.setBorder(null);
        btnInfoAcc.setPreferredSize(new java.awt.Dimension(200, 70));
        btnInfoAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAccActionPerformed(evt);
            }
        });
        menuInformes.add(btnInfoAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        btnActividades.setBackground(colorSecondary);
        btnActividades.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setText("Actividades");
        btnActividades.setBorder(null);
        btnActividades.setPreferredSize(new java.awt.Dimension(200, 70));
        menuInformes.add(btnActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        btnAtrasos.setBackground(colorSecondary);
        btnAtrasos.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAtrasos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasos.setText("Atrasos");
        btnAtrasos.setToolTipText("");
        btnAtrasos.setActionCommand("Capacitaciones");
        btnAtrasos.setBorder(null);
        btnAtrasos.setPreferredSize(new java.awt.Dimension(200, 70));
        btnAtrasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasosActionPerformed(evt);
            }
        });
        menuInformes.add(btnAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        btnRepCliente.setBackground(colorSecondary);
        btnRepCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnRepCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRepCliente.setText("Reporte Cliente");
        btnRepCliente.setBorder(null);
        btnRepCliente.setPreferredSize(new java.awt.Dimension(200, 70));
        btnRepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepClienteActionPerformed(evt);
            }
        });
        menuInformes.add(btnRepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        btnRepGlobal.setBackground(colorSecondary);
        btnRepGlobal.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnRepGlobal.setForeground(new java.awt.Color(255, 255, 255));
        btnRepGlobal.setText("Reporte Global");
        btnRepGlobal.setBorder(null);
        btnRepGlobal.setPreferredSize(new java.awt.Dimension(200, 70));
        btnRepGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepGlobalActionPerformed(evt);
            }
        });
        menuInformes.add(btnRepGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jPanel1.add(menuInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, -1000, -1, -1));

        menuAdmin.setBackground(colorSecondary);
        menuAdmin.setPreferredSize(new java.awt.Dimension(200, 150));
        menuAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdminClientes.setBackground(colorSecondary);
        btnAdminClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAdminClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminClientes.setText("Clientes");
        btnAdminClientes.setBorder(null);
        btnAdminClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminClientesActionPerformed(evt);
            }
        });
        menuAdmin.add(btnAdminClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        btnAdminProf.setBackground(colorSecondary);
        btnAdminProf.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAdminProf.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminProf.setText("Profesionales");
        btnAdminProf.setBorder(null);
        btnAdminProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminProfActionPerformed(evt);
            }
        });
        menuAdmin.add(btnAdminProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 70));

        jPanel1.add(menuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, -1000, -1, -1));

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
        menuSesion.setPreferredSize(new java.awt.Dimension(200, 220));
        menuSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiPerfil.setBackground(colorSecondary);
        btnMiPerfil.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnMiPerfil.setText("Mi perfil");
        btnMiPerfil.setBorder(null);
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

        pnlAdminProfesional.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdminProfesional.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlAdminProfesional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerProfesional.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerProfesional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloProfesional.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloProfesional.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloProfesional.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloProfesional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloProfesional.setText("PROFESIONALES");
        pnlVerProfesional.add(lblTituloProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1280, 50));

        jScrollPane4.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblAdminProfesional.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblAdminProfesional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombres", "Apellido Paterno", "Apellido Materno", "RUT", "Correo", "Estado", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblAdminProfesional);
        if (tblAdminProfesional.getColumnModel().getColumnCount() > 0) {
            tblAdminProfesional.getColumnModel().getColumn(0).setMinWidth(10);
            tblAdminProfesional.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblAdminProfesional.getColumnModel().getColumn(0).setMaxWidth(100);
            tblAdminProfesional.getColumnModel().getColumn(1).setMinWidth(10);
            tblAdminProfesional.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblAdminProfesional.getColumnModel().getColumn(1).setMaxWidth(300);
            tblAdminProfesional.getColumnModel().getColumn(2).setMinWidth(10);
            tblAdminProfesional.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblAdminProfesional.getColumnModel().getColumn(2).setMaxWidth(500);
            tblAdminProfesional.getColumnModel().getColumn(3).setMinWidth(10);
            tblAdminProfesional.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblAdminProfesional.getColumnModel().getColumn(3).setMaxWidth(300);
            tblAdminProfesional.getColumnModel().getColumn(4).setMinWidth(10);
            tblAdminProfesional.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblAdminProfesional.getColumnModel().getColumn(4).setMaxWidth(300);
            tblAdminProfesional.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblAdminProfesional.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        pnlVerProfesional.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 700));

        btnAgregarProfesional.setBackground(colorBtnAgregar);
        btnAgregarProfesional.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProfesional.setText("+ Agregar Nuevo");
        btnAgregarProfesional.setBorder(null);
        btnAgregarProfesional.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfesionalActionPerformed(evt);
            }
        });
        pnlVerProfesional.add(btnAgregarProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

        btnEditarProfesional.setBackground(colorInfo);
        btnEditarProfesional.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProfesional.setText("Editar Usuario");
        btnEditarProfesional.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarProfesional.setPreferredSize(new java.awt.Dimension(200, 60));
        btnEditarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProfesionalActionPerformed(evt);
            }
        });
        pnlVerProfesional.add(btnEditarProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 840, -1, -1));

        btnCambiarEstadoProfesional.setBackground(colorDanger);
        btnCambiarEstadoProfesional.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCambiarEstadoProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarEstadoProfesional.setText("Cambiar Estado");
        btnCambiarEstadoProfesional.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarEstadoProfesional.setPreferredSize(new java.awt.Dimension(100, 60));
        btnCambiarEstadoProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoProfesionalActionPerformed(evt);
            }
        });
        pnlVerProfesional.add(btnCambiarEstadoProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 840, 200, -1));

        pnlAdminProfesional.add(pnlVerProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlEditarProfesional.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarProfesional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlEditarProfesional.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlEditarProfesional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeaderProfesional.setBackground(new java.awt.Color(0, 255, 102));
        pnlHeaderProfesional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeaderProfesional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarProfesionalCerrar.setBackground(new java.awt.Color(0, 255, 102));
        btnEditarProfesionalCerrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnEditarProfesionalCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProfesionalCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnEditarProfesionalCerrar.setBorder(null);
        btnEditarProfesionalCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarProfesionalCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProfesionalCerrarActionPerformed(evt);
            }
        });
        pnlHeaderProfesional.add(btnEditarProfesionalCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        lblEditarProfesionalID.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditarProfesionalID.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarProfesionalID.setText(" ");
        pnlHeaderProfesional.add(lblEditarProfesionalID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, 30));

        lblEditarProfesionalTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditarProfesionalTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblEditarProfesionalTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarProfesionalTitulo.setText("EDITAR PROFESIONAL");
        pnlHeaderProfesional.add(lblEditarProfesionalTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 30));

        pnlEditarProfesional.add(pnlHeaderProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser14.setBackground(new java.awt.Color(0, 0, 0));
        lblUser14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser14.setForeground(new java.awt.Color(0, 0, 0));
        lblUser14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser14.setText("Nombre de Usuario");
        lblUser14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        lblUser15.setBackground(new java.awt.Color(0, 0, 0));
        lblUser15.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser15.setForeground(new java.awt.Color(0, 0, 0));
        lblUser15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser15.setText("Nombres");
        lblUser15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser17.setBackground(new java.awt.Color(0, 0, 0));
        lblUser17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser17.setForeground(new java.awt.Color(0, 0, 0));
        lblUser17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser17.setText("Apellido Paterno");
        lblUser17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser20.setBackground(new java.awt.Color(0, 0, 0));
        lblUser20.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser20.setForeground(new java.awt.Color(0, 0, 0));
        lblUser20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser20.setText("Apellido Materno");
        lblUser20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser21.setBackground(new java.awt.Color(0, 0, 0));
        lblUser21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser21.setForeground(new java.awt.Color(0, 0, 0));
        lblUser21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser21.setText("RUT");
        lblUser21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        lblUser22.setBackground(new java.awt.Color(0, 0, 0));
        lblUser22.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser22.setForeground(new java.awt.Color(0, 0, 0));
        lblUser22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser22.setText("Correo electronico");
        lblUser22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser23.setBackground(new java.awt.Color(0, 0, 0));
        lblUser23.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser23.setForeground(new java.awt.Color(0, 0, 0));
        lblUser23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser23.setText("Empresa");
        lblUser23.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarProfesional.add(lblUser23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        txtEditarProfesionalUsername.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarProfesional.add(txtEditarProfesionalUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtEditarProfesionalNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarProfesional.add(txtEditarProfesionalNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 38));

        txtEditarProfesionalAPaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarProfesional.add(txtEditarProfesionalAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtEditarProfesionalAMaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarProfesional.add(txtEditarProfesionalAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtEditarProfesionalRUT.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarProfesional.add(txtEditarProfesionalRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        txtEditarProfesionalMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarProfesional.add(txtEditarProfesionalMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        cbxEditarProfesionalEmpresa.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxEditarProfesionalEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pnlEditarProfesional.add(cbxEditarProfesionalEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 37));

        btnEditarProfesionalActualizar.setBackground(new java.awt.Color(0, 204, 102));
        btnEditarProfesionalActualizar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarProfesionalActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProfesionalActualizar.setText("Actualizar");
        btnEditarProfesionalActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarProfesionalActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProfesionalActualizarActionPerformed(evt);
            }
        });
        pnlEditarProfesional.add(btnEditarProfesionalActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 300, 40));

        pnlAdminProfesional.add(pnlEditarProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarProfesional.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarProfesional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarProfesional.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarProfesional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderAgregarProfesional.setBackground(new java.awt.Color(0, 255, 102));
        HeaderAgregarProfesional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeaderAgregarProfesional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        HeaderAgregarProfesional.add(btnCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AGREGAR PROFESIONAL");
        HeaderAgregarProfesional.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarProfesional.add(HeaderAgregarProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser4.setBackground(new java.awt.Color(0, 0, 0));
        lblUser4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser4.setForeground(new java.awt.Color(0, 0, 0));
        lblUser4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser4.setText("Nombre de Usuario");
        lblUser4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        lblUser5.setBackground(new java.awt.Color(0, 0, 0));
        lblUser5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser5.setForeground(new java.awt.Color(0, 0, 0));
        lblUser5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser5.setText("Nombres");
        lblUser5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser7.setBackground(new java.awt.Color(0, 0, 0));
        lblUser7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser7.setForeground(new java.awt.Color(0, 0, 0));
        lblUser7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser7.setText("Apellido Paterno");
        lblUser7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser24.setBackground(new java.awt.Color(0, 0, 0));
        lblUser24.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser24.setForeground(new java.awt.Color(0, 0, 0));
        lblUser24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser24.setText("Apellido Materno");
        lblUser24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser25.setBackground(new java.awt.Color(0, 0, 0));
        lblUser25.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser25.setForeground(new java.awt.Color(0, 0, 0));
        lblUser25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser25.setText("RUT");
        lblUser25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        lblUser26.setBackground(new java.awt.Color(0, 0, 0));
        lblUser26.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser26.setForeground(new java.awt.Color(0, 0, 0));
        lblUser26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser26.setText("Correo electronico");
        lblUser26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser27.setBackground(new java.awt.Color(0, 0, 0));
        lblUser27.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser27.setForeground(new java.awt.Color(0, 0, 0));
        lblUser27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser27.setText("Empresa");
        lblUser27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarProfesional.add(lblUser27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        txtAgregarProfesionalUsername.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarProfesional.add(txtAgregarProfesionalUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtAgregarProfesionalNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarProfesional.add(txtAgregarProfesionalNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 38));

        txtAgregarProfesionalAPaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarProfesional.add(txtAgregarProfesionalAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtAgregarProfesionalAMaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarProfesional.add(txtAgregarProfesionalAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtAgregarProfesionalRUT.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarProfesional.add(txtAgregarProfesionalRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        txtAgregarProfesionalMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarProfesional.add(txtAgregarProfesionalMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        cbxAgregarProfesionalEmpresa.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxAgregarProfesionalEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pnlAgregarProfesional.add(cbxAgregarProfesionalEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 37));

        btnAgregarProfesionalGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarProfesionalGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarProfesionalGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProfesionalGuardar.setText("Guardar");
        btnAgregarProfesionalGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarProfesionalGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfesionalGuardarActionPerformed(evt);
            }
        });
        pnlAgregarProfesional.add(btnAgregarProfesionalGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 300, 40));

        btnAgregarProfesionalLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarProfesionalLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarProfesionalLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProfesionalLimpiar.setText("Limpiar");
        btnAgregarProfesionalLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarProfesional.add(btnAgregarProfesionalLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 40));

        pnlAdminProfesional.add(pnlAgregarProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlAdminProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlAdminClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdminClientes.setPreferredSize(new java.awt.Dimension(1840, 880));
        pnlAdminClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVerClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloClientes.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloClientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloClientes.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloClientes.setText("CLIENTES");
        pnlVerClientes.add(lblTituloClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1280, 50));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblAdminClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblAdminClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombres", "Apellido Paterno", "Apellido Materno", "RUT", "Correo", "Estado", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblAdminClientes);
        if (tblAdminClientes.getColumnModel().getColumnCount() > 0) {
            tblAdminClientes.getColumnModel().getColumn(0).setMinWidth(10);
            tblAdminClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblAdminClientes.getColumnModel().getColumn(0).setMaxWidth(100);
            tblAdminClientes.getColumnModel().getColumn(1).setMinWidth(10);
            tblAdminClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblAdminClientes.getColumnModel().getColumn(1).setMaxWidth(300);
            tblAdminClientes.getColumnModel().getColumn(2).setMinWidth(10);
            tblAdminClientes.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblAdminClientes.getColumnModel().getColumn(2).setMaxWidth(500);
            tblAdminClientes.getColumnModel().getColumn(3).setMinWidth(10);
            tblAdminClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblAdminClientes.getColumnModel().getColumn(3).setMaxWidth(300);
            tblAdminClientes.getColumnModel().getColumn(4).setMinWidth(10);
            tblAdminClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblAdminClientes.getColumnModel().getColumn(4).setMaxWidth(300);
            tblAdminClientes.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblAdminClientes.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        pnlVerClientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 700));

        btnAgregarCliente.setBackground(colorBtnAgregar);
        btnAgregarCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("+ Agregar Nuevo");
        btnAgregarCliente.setBorder(null);
        btnAgregarCliente.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        pnlVerClientes.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

        btnEditarCliente.setBackground(colorInfo);
        btnEditarCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setText("Editar Usuario");
        btnEditarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarCliente.setPreferredSize(new java.awt.Dimension(200, 60));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        pnlVerClientes.add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 840, -1, -1));

        btnCambiarEstadoCliente.setBackground(colorDanger);
        btnCambiarEstadoCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCambiarEstadoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarEstadoCliente.setText("Cambiar Estado");
        btnCambiarEstadoCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarEstadoCliente.setPreferredSize(new java.awt.Dimension(100, 60));
        btnCambiarEstadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoClienteActionPerformed(evt);
            }
        });
        pnlVerClientes.add(btnCambiarEstadoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 840, 200, -1));

        pnlAdminClientes.add(pnlVerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 970));

        pnlEditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlEditarCliente.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlEditarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeaderEditar.setBackground(new java.awt.Color(0, 255, 102));
        pnlHeaderEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeaderEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarClienteCerrar.setBackground(new java.awt.Color(0, 255, 102));
        btnEditarClienteCerrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnEditarClienteCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarClienteCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/cruz2.png"))); // NOI18N
        btnEditarClienteCerrar.setBorder(null);
        btnEditarClienteCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarClienteCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteCerrarActionPerformed(evt);
            }
        });
        pnlHeaderEditar.add(btnEditarClienteCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        lblEditarClienteID.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditarClienteID.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarClienteID.setText(" ");
        pnlHeaderEditar.add(lblEditarClienteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 30));

        lblEditarClienteTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditarClienteTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblEditarClienteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditarClienteTitulo.setText("EDITAR CLIENTE");
        pnlHeaderEditar.add(lblEditarClienteTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 30));

        pnlEditarCliente.add(pnlHeaderEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser12.setBackground(new java.awt.Color(0, 0, 0));
        lblUser12.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser12.setForeground(new java.awt.Color(0, 0, 0));
        lblUser12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser12.setText("Nombre de Usuario");
        lblUser12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        lblUser13.setBackground(new java.awt.Color(0, 0, 0));
        lblUser13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser13.setForeground(new java.awt.Color(0, 0, 0));
        lblUser13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser13.setText("Nombres");
        lblUser13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser10.setBackground(new java.awt.Color(0, 0, 0));
        lblUser10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser10.setForeground(new java.awt.Color(0, 0, 0));
        lblUser10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser10.setText("Apellido Paterno");
        lblUser10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser11.setBackground(new java.awt.Color(0, 0, 0));
        lblUser11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser11.setForeground(new java.awt.Color(0, 0, 0));
        lblUser11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser11.setText("Apellido Materno");
        lblUser11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser18.setBackground(new java.awt.Color(0, 0, 0));
        lblUser18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser18.setForeground(new java.awt.Color(0, 0, 0));
        lblUser18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser18.setText("RUT");
        lblUser18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        lblUser19.setBackground(new java.awt.Color(0, 0, 0));
        lblUser19.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser19.setForeground(new java.awt.Color(0, 0, 0));
        lblUser19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser19.setText("Correo electronico");
        lblUser19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser16.setBackground(new java.awt.Color(0, 0, 0));
        lblUser16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser16.setForeground(new java.awt.Color(0, 0, 0));
        lblUser16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser16.setText("Empresa");
        lblUser16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        txtEditarClienteUsername.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarClienteUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtEditarClienteNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarClienteNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 38));

        txtEditarClienteAPaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarClienteAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtEditarClienteAMaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarClienteAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtEditarClienteRUT.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarClienteRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        txtEditarClienteMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarClienteMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        cbxEditarClienteEmpresa.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxEditarClienteEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pnlEditarCliente.add(cbxEditarClienteEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 37));

        btnEditarClienteActualizar.setBackground(new java.awt.Color(0, 204, 102));
        btnEditarClienteActualizar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarClienteActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarClienteActualizar.setText("Actualizar");
        btnEditarClienteActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarClienteActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActualizarActionPerformed(evt);
            }
        });
        pnlEditarCliente.add(btnEditarClienteActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 300, 40));

        pnlAdminClientes.add(pnlEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        pnlAgregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarCliente.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel5.setText("AGREGAR CLIENTE");
        HeaderAgregarCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

        pnlAgregarCliente.add(HeaderAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser2.setBackground(new java.awt.Color(0, 0, 0));
        lblUser2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(0, 0, 0));
        lblUser2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser2.setText("Nombre de Usuario");
        lblUser2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        lblUser3.setBackground(new java.awt.Color(0, 0, 0));
        lblUser3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(0, 0, 0));
        lblUser3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser3.setText("Nombres");
        lblUser3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser.setBackground(new java.awt.Color(0, 0, 0));
        lblUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Apellido Paterno");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser1.setBackground(new java.awt.Color(0, 0, 0));
        lblUser1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(0, 0, 0));
        lblUser1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser1.setText("Apellido Materno");
        lblUser1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser8.setBackground(new java.awt.Color(0, 0, 0));
        lblUser8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser8.setForeground(new java.awt.Color(0, 0, 0));
        lblUser8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser8.setText("RUT");
        lblUser8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        lblUser9.setBackground(new java.awt.Color(0, 0, 0));
        lblUser9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser9.setForeground(new java.awt.Color(0, 0, 0));
        lblUser9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser9.setText("Correo electronico");
        lblUser9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser6.setBackground(new java.awt.Color(0, 0, 0));
        lblUser6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser6.setForeground(new java.awt.Color(0, 0, 0));
        lblUser6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser6.setText("Empresa");
        lblUser6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        txtAgregarClienteUsername.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtAgregarClienteUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtAgregarClienteNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtAgregarClienteNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 38));

        txtAgregarClienteAPaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtAgregarClienteAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtAgregarClienteAMaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtAgregarClienteAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtAgregarClienteRUT.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtAgregarClienteRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        txtAgregarClienteMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtAgregarClienteMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        cbxAgregarClienteEmpresa.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxAgregarClienteEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pnlAgregarCliente.add(cbxAgregarClienteEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 37));

        btnAgregarClienteGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregarClienteGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarClienteGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarClienteGuardar.setText("Guardar");
        btnAgregarClienteGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarClienteGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteGuardarActionPerformed(evt);
            }
        });
        pnlAgregarCliente.add(btnAgregarClienteGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 300, 40));

        btnAgregarClienteLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarClienteLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarClienteLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarClienteLimpiar.setText("Limpiar");
        btnAgregarClienteLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarCliente.add(btnAgregarClienteLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 40));

        pnlAdminClientes.add(pnlAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 640, -1));

        jPanel1.add(pnlAdminClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

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
        pnlMiPerfil.add(lblUser32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 40));

        lblUser33.setBackground(new java.awt.Color(0, 0, 0));
        lblUser33.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser33.setForeground(new java.awt.Color(0, 0, 0));
        lblUser33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser33.setText("Confirmar nueva Contraseña");
        lblUser33.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlMiPerfil.add(lblUser33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, 40));

        lblUser34.setBackground(new java.awt.Color(0, 0, 0));
        lblUser34.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser34.setForeground(new java.awt.Color(0, 0, 0));
        lblUser34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser34.setText("Ingresar contraseña actual para confirmar cambios");
        lblUser34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlMiPerfil.add(lblUser34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 560, 20));

        txtMiPerfilRUT.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtMiPerfilNombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 38));

        txtMiPerfilAPaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtMiPerfilAMaterno.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtMiPerfilNPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilNPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        txtMiPerfilRPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilRPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        txtMiPerfilPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlMiPerfil.add(txtMiPerfilPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 360, 38));

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
        pnlMiPerfil.add(btnMiPerfilActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 360, 40));

        jPanel1.add(pnlMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 640, -1));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(1840, 880));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1840, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        VerPanel(pnlInicio);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed

    }//GEN-LAST:event_btnClienteMousePressed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed

    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProfesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMousePressed

    }//GEN-LAST:event_btnProfesMousePressed

    private void btnProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesActionPerformed

    }//GEN-LAST:event_btnProfesActionPerformed

    private void btnNotifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMousePressed

    }//GEN-LAST:event_btnNotifyMousePressed

    private void btnNotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyActionPerformed

    }//GEN-LAST:event_btnNotifyActionPerformed

    private void btnUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMousePressed

    }//GEN-LAST:event_btnUserMousePressed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        verMenu(menuSesion);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnProfesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMouseClicked
        verMenu(menuProfesionales);
    }//GEN-LAST:event_btnProfesMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        verMenu(menuClientes);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMouseClicked
        verMenu(menuNotificaciones);
    }//GEN-LAST:event_btnNotifyMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        verMenu(menuSesion);
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnChecklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecklistActionPerformed
       
    }//GEN-LAST:event_btnChecklistActionPerformed

    private void btnAsesoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsesoriasActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        verMenu(menuAdmin);
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        
    }//GEN-LAST:event_btnAdminMousePressed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
      
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMouseClicked
        verMenu(menuInformes);
    }//GEN-LAST:event_btnInformesMouseClicked

    private void btnInformesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesMousePressed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnRepAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRepAccActionPerformed

    private void btnAseEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAseEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAseEspActionPerformed

    private void btnCapacitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapacitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapacitacionesActionPerformed

    private void btnVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisitasActionPerformed

    private void btnPagoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagoClientesActionPerformed

    private void btnInfoAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoAccActionPerformed

    private void btnAtrasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasosActionPerformed

    private void btnRepClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRepClienteActionPerformed

    private void btnAdminClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminClientesActionPerformed
        VerPanel(pnlAdminClientes);
        pnlVerClientes.setVisible(true);
        pnlAgregarCliente.setVisible(false);
        pnlEditarCliente.setVisible(false);
    }//GEN-LAST:event_btnAdminClientesActionPerformed

    private void btnAdminProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminProfActionPerformed
        VerPanel(pnlAdminProfesional);
        pnlVerProfesional.setVisible(true);
        pnlAgregarProfesional.setVisible(false);
        pnlEditarProfesional.setVisible(false);
    }//GEN-LAST:event_btnAdminProfActionPerformed

    private void btnMejorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMejorasActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        pnlAgregarCliente.setVisible(false);
        pnlVerClientes.setVisible(true);
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnAgregarClienteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteGuardarActionPerformed
        
    }//GEN-LAST:event_btnAgregarClienteGuardarActionPerformed

    private void btnEditarClienteCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteCerrarActionPerformed
        pnlEditarCliente.setVisible(false);
        pnlVerClientes.setVisible(true);
    }//GEN-LAST:event_btnEditarClienteCerrarActionPerformed

    private void btnEditarClienteActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarClienteActualizarActionPerformed

    private void btnRepGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepGlobalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRepGlobalActionPerformed

    private void btnCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCliente2ActionPerformed

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        VerPanel(pnlMiPerfil);
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnCambiarEstadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarEstadoClienteActionPerformed

    private void btnAgregarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfesionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProfesionalActionPerformed

    private void btnEditarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProfesionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProfesionalActionPerformed

    private void btnCambiarEstadoProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoProfesionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarEstadoProfesionalActionPerformed

    private void btnEditarProfesionalCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProfesionalCerrarActionPerformed
        pnlEditarProfesional.setVisible(false);
        pnlVerProfesional.setVisible(true);
    }//GEN-LAST:event_btnEditarProfesionalCerrarActionPerformed

    private void btnEditarProfesionalActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProfesionalActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProfesionalActualizarActionPerformed

    private void btnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar2ActionPerformed
        pnlAgregarProfesional.setVisible(false);
        pnlVerProfesional.setVisible(true);
    }//GEN-LAST:event_btnCerrar2ActionPerformed

    private void btnAgregarProfesionalGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfesionalGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProfesionalGuardarActionPerformed

    private void btnMiPerfilCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilCerrarActionPerformed
        pnlMiPerfil.setVisible(false);
        pnlInicio.setVisible(true);
    }//GEN-LAST:event_btnMiPerfilCerrarActionPerformed

    private void btnMiPerfilActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiPerfilActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HeaderAgregarCliente;
    private javax.swing.JPanel HeaderAgregarProfesional;
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnAdmin;
    public javax.swing.JButton btnAdminClientes;
    public javax.swing.JButton btnAdminProf;
    public javax.swing.JButton btnAgregarCliente;
    public javax.swing.JButton btnAgregarClienteGuardar;
    public javax.swing.JButton btnAgregarClienteLimpiar;
    public javax.swing.JButton btnAgregarProfesional;
    public javax.swing.JButton btnAgregarProfesionalGuardar;
    public javax.swing.JButton btnAgregarProfesionalLimpiar;
    private javax.swing.JButton btnAseEsp;
    private javax.swing.JButton btnAsesorias;
    private javax.swing.JButton btnAtrasos;
    public javax.swing.JButton btnCambiarEstadoCliente;
    public javax.swing.JButton btnCambiarEstadoProfesional;
    private javax.swing.JButton btnCapacitaciones;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnCerrar2;
    public javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnChecklist;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente2;
    public javax.swing.JButton btnEditarCliente;
    public javax.swing.JButton btnEditarClienteActualizar;
    private javax.swing.JButton btnEditarClienteCerrar;
    public javax.swing.JButton btnEditarProfesional;
    public javax.swing.JButton btnEditarProfesionalActualizar;
    private javax.swing.JButton btnEditarProfesionalCerrar;
    private javax.swing.JButton btnInfoAcc;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMejoras;
    public javax.swing.JButton btnMiPerfil;
    public javax.swing.JButton btnMiPerfilActualizar;
    private javax.swing.JButton btnMiPerfilCerrar;
    private javax.swing.JButton btnNotify;
    private javax.swing.JButton btnPagoClientes;
    private javax.swing.JButton btnProfes;
    private javax.swing.JButton btnRepAcc;
    private javax.swing.JButton btnRepCliente;
    private javax.swing.JButton btnRepGlobal;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUser;
    private javax.swing.JButton btnVisitas;
    public javax.swing.JComboBox<String> cbxAgregarClienteEmpresa;
    public javax.swing.JComboBox<String> cbxAgregarProfesionalEmpresa;
    public javax.swing.JComboBox<String> cbxEditarClienteEmpresa;
    public javax.swing.JComboBox<String> cbxEditarProfesionalEmpresa;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblEditarClienteID;
    public javax.swing.JLabel lblEditarClienteID1;
    private javax.swing.JLabel lblEditarClienteTitulo;
    private javax.swing.JLabel lblEditarClienteTitulo1;
    public javax.swing.JLabel lblEditarProfesionalID;
    private javax.swing.JLabel lblEditarProfesionalTitulo;
    private javax.swing.JLabel lblTituloClientes;
    private javax.swing.JLabel lblTituloProfesional;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser10;
    private javax.swing.JLabel lblUser11;
    private javax.swing.JLabel lblUser12;
    private javax.swing.JLabel lblUser13;
    private javax.swing.JLabel lblUser14;
    private javax.swing.JLabel lblUser15;
    private javax.swing.JLabel lblUser16;
    private javax.swing.JLabel lblUser17;
    private javax.swing.JLabel lblUser18;
    private javax.swing.JLabel lblUser19;
    private javax.swing.JLabel lblUser2;
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
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser30;
    private javax.swing.JLabel lblUser31;
    private javax.swing.JLabel lblUser32;
    private javax.swing.JLabel lblUser33;
    private javax.swing.JLabel lblUser34;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JLabel lblUser5;
    private javax.swing.JLabel lblUser6;
    private javax.swing.JLabel lblUser7;
    private javax.swing.JLabel lblUser8;
    private javax.swing.JLabel lblUser9;
    private javax.swing.JPanel menuAdmin;
    private javax.swing.JPanel menuClientes;
    private javax.swing.JPanel menuInformes;
    private javax.swing.JPanel menuNotificaciones;
    private javax.swing.JPanel menuProfesionales;
    private javax.swing.JPanel menuSesion;
    public javax.swing.JPanel pnlAdminClientes;
    public javax.swing.JPanel pnlAdminProfesional;
    public javax.swing.JPanel pnlAgregarCliente;
    public javax.swing.JPanel pnlAgregarProfesional;
    public javax.swing.JPanel pnlEditarCliente;
    public javax.swing.JPanel pnlEditarProfesional;
    private javax.swing.JPanel pnlHeaderEditar;
    private javax.swing.JPanel pnlHeaderEditar1;
    private javax.swing.JPanel pnlHeaderProfesional;
    private javax.swing.JPanel pnlInicio;
    public javax.swing.JPanel pnlMiPerfil;
    public javax.swing.JPanel pnlVerClientes;
    public javax.swing.JPanel pnlVerProfesional;
    public javax.swing.JTable tblAdminClientes;
    public javax.swing.JTable tblAdminProfesional;
    public javax.swing.JTextField txtAgregarClienteAMaterno;
    public javax.swing.JTextField txtAgregarClienteAPaterno;
    public javax.swing.JTextField txtAgregarClienteMail;
    public javax.swing.JTextField txtAgregarClienteNombres;
    public javax.swing.JTextField txtAgregarClienteRUT;
    public javax.swing.JTextField txtAgregarClienteUsername;
    public javax.swing.JTextField txtAgregarProfesionalAMaterno;
    public javax.swing.JTextField txtAgregarProfesionalAPaterno;
    public javax.swing.JTextField txtAgregarProfesionalMail;
    public javax.swing.JTextField txtAgregarProfesionalNombres;
    public javax.swing.JTextField txtAgregarProfesionalRUT;
    public javax.swing.JTextField txtAgregarProfesionalUsername;
    public javax.swing.JTextField txtEditarClienteAMaterno;
    public javax.swing.JTextField txtEditarClienteAPaterno;
    public javax.swing.JTextField txtEditarClienteMail;
    public javax.swing.JTextField txtEditarClienteNombres;
    public javax.swing.JTextField txtEditarClienteRUT;
    public javax.swing.JTextField txtEditarClienteUsername;
    public javax.swing.JTextField txtEditarProfesionalAMaterno;
    public javax.swing.JTextField txtEditarProfesionalAPaterno;
    public javax.swing.JTextField txtEditarProfesionalMail;
    public javax.swing.JTextField txtEditarProfesionalNombres;
    public javax.swing.JTextField txtEditarProfesionalRUT;
    public javax.swing.JTextField txtEditarProfesionalUsername;
    public javax.swing.JTextField txtMiPerfilAMaterno;
    public javax.swing.JTextField txtMiPerfilAPaterno;
    public javax.swing.JTextField txtMiPerfilNPassword;
    public javax.swing.JTextField txtMiPerfilNombres;
    public javax.swing.JTextField txtMiPerfilPassword;
    public javax.swing.JTextField txtMiPerfilRPassword;
    public javax.swing.JTextField txtMiPerfilRUT;
    // End of variables declaration//GEN-END:variables

    //FUNCIONES PARA MANEJAR PANELES
    
    //PERMITE QUITAR VISIBILIDAD DE TODOS LOS PANELES CREADOS 
    //PANEL NUEVO = AGREGAR PANEL A LA VISTA
    
    private void VerPanel(JPanel panel){
        pnlAdminClientes.setVisible(false);
        pnlAdminProfesional.setVisible(false);
        pnlMiPerfil.setVisible(false);
        pnlInicio.setVisible(false);
        container.setVisible(false);
        panel.setVisible(true);
    }

   
}
