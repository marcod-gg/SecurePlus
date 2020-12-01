
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
        
        //Aplicación a pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Asignar fuente a tablas
        tblUsuario.getTableHeader().setFont(new Font("Segoe UI Historic", 1, 16));
        tblUsuario.getTableHeader().setBackground(colorDark);
        tblUsuario.getTableHeader().setForeground(Color.white);
        
        VerPanel(pInicio);
        

    }
    
    public void VerPanel(JPanel panel){
        container.setVisible(false);
        pInicio.setVisible(false);
        pAdminUsers.setVisible(false);
        pnlAgregarCliente.setVisible(false);
        pnlEditarCliente.setVisible(false);
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
        pnlCliente = new javax.swing.JPanel();
        btnRepAcc = new javax.swing.JButton();
        btnAseEsp = new javax.swing.JButton();
        pnlProfes = new javax.swing.JPanel();
        btnCapacitaciones = new javax.swing.JButton();
        btnVisitas = new javax.swing.JButton();
        btnCliente2 = new javax.swing.JButton();
        btnAsesorias = new javax.swing.JButton();
        btnChecklist = new javax.swing.JButton();
        btnMejoras = new javax.swing.JButton();
        pnlInformes = new javax.swing.JPanel();
        btnPagoClientes = new javax.swing.JButton();
        btnInfoAcc = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnAtrasos = new javax.swing.JButton();
        btnRepCliente = new javax.swing.JButton();
        btnRepGlobal = new javax.swing.JButton();
        pnlAdmin = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnCliente3 = new javax.swing.JButton();
        btnProf = new javax.swing.JButton();
        pnlNotify = new javax.swing.JPanel();
        pnlSesion = new javax.swing.JPanel();
        btnMiPerfil = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlAdminClientes = new javax.swing.JPanel();
        lblTituloClientes = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAdminClientes = new javax.swing.JTable();
        pnlEditarCliente = new javax.swing.JPanel();
        pnlHeaderEditar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnEditarClienteCerrar = new javax.swing.JButton();
        lblEditarClienteID = new javax.swing.JLabel();
        lblUser10 = new javax.swing.JLabel();
        lblUser11 = new javax.swing.JLabel();
        lblUser12 = new javax.swing.JLabel();
        lblUser13 = new javax.swing.JLabel();
        lblUser14 = new javax.swing.JLabel();
        lblUser16 = new javax.swing.JLabel();
        lblUser17 = new javax.swing.JLabel();
        lblUser18 = new javax.swing.JLabel();
        lblUser19 = new javax.swing.JLabel();
        txtEditarUsuarioUsername = new javax.swing.JTextField();
        txtEditarUsuarioPassword = new javax.swing.JTextField();
        txtUserAPat1 = new javax.swing.JTextField();
        txtUserName1 = new javax.swing.JTextField();
        txtUserAMat1 = new javax.swing.JTextField();
        cbxUserEstado1 = new javax.swing.JComboBox<>();
        cbxUserEmpresa1 = new javax.swing.JComboBox<>();
        btnEditarClienteActualizar = new javax.swing.JButton();
        txtUserMail1 = new javax.swing.JTextField();
        txtUserRut1 = new javax.swing.JTextField();
        pnlAgregarCliente = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblUser4 = new javax.swing.JLabel();
        lblUser6 = new javax.swing.JLabel();
        lblUser7 = new javax.swing.JLabel();
        lblUser8 = new javax.swing.JLabel();
        lblUser9 = new javax.swing.JLabel();
        txtUserUser = new javax.swing.JTextField();
        txtUserPass = new javax.swing.JTextField();
        txtUserAPat = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtUserAMat = new javax.swing.JTextField();
        cbxUserEstado = new javax.swing.JComboBox<>();
        cbxUserEmpresa = new javax.swing.JComboBox<>();
        btnAgregarClienteGuardar = new javax.swing.JButton();
        btnAgregarClienteLimpiar = new javax.swing.JButton();
        txtUserMail = new javax.swing.JTextField();
        txtUserRut = new javax.swing.JTextField();
        pnlAdminProfesionales = new javax.swing.JPanel();
        btnAgregarUsuario1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario1 = new javax.swing.JTable();
        btnEditarUsuario1 = new javax.swing.JButton();
        btnEliminarUsuario1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pAdminUsers = new javax.swing.JPanel();
        btnAgregarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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

        pnlCliente.setBackground(colorSecondary);
        pnlCliente.setPreferredSize(new java.awt.Dimension(200, 150));
        pnlCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlCliente.add(btnRepAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

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
        pnlCliente.add(btnAseEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 70));

        jPanel1.add(pnlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -1000, -1, -1));

        pnlProfes.setBackground(colorSecondary);
        pnlProfes.setPreferredSize(new java.awt.Dimension(200, 430));
        pnlProfes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlProfes.add(btnCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

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
        pnlProfes.add(btnVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 70));

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
        pnlProfes.add(btnCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 70));

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
        pnlProfes.add(btnAsesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 70));

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
        pnlProfes.add(btnChecklist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 70));

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
        pnlProfes.add(btnMejoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 70));

        jPanel1.add(pnlProfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -1000, -1, -1));

        pnlInformes.setBackground(colorSecondary);
        pnlInformes.setMinimumSize(new java.awt.Dimension(200, 490));
        pnlInformes.setPreferredSize(new java.awt.Dimension(200, 430));
        pnlInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlInformes.add(btnPagoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

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
        pnlInformes.add(btnInfoAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        btnActividades.setBackground(colorSecondary);
        btnActividades.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setText("Actividades");
        btnActividades.setBorder(null);
        btnActividades.setPreferredSize(new java.awt.Dimension(200, 70));
        pnlInformes.add(btnActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

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
        pnlInformes.add(btnAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

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
        pnlInformes.add(btnRepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

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
        pnlInformes.add(btnRepGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jPanel1.add(pnlInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, -1000, -1, -1));

        pnlAdmin.setBackground(colorSecondary);
        pnlAdmin.setPreferredSize(new java.awt.Dimension(200, 220));
        pnlAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setBackground(colorSecondary);
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        pnlAdmin.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        btnCliente3.setBackground(colorSecondary);
        btnCliente3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCliente3.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente3.setText("Clientes");
        btnCliente3.setBorder(null);
        btnCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente3ActionPerformed(evt);
            }
        });
        pnlAdmin.add(btnCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 70));

        btnProf.setBackground(colorSecondary);
        btnProf.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnProf.setForeground(new java.awt.Color(255, 255, 255));
        btnProf.setText("Profesionales");
        btnProf.setBorder(null);
        btnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfActionPerformed(evt);
            }
        });
        pnlAdmin.add(btnProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 70));

        jPanel1.add(pnlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, -1000, -1, -1));

        pnlNotify.setBackground(colorSecondary);

        javax.swing.GroupLayout pnlNotifyLayout = new javax.swing.GroupLayout(pnlNotify);
        pnlNotify.setLayout(pnlNotifyLayout);
        pnlNotifyLayout.setHorizontalGroup(
            pnlNotifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnlNotifyLayout.setVerticalGroup(
            pnlNotifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(pnlNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, -300, 200, 300));

        pnlSesion.setBackground(colorSecondary);
        pnlSesion.setPreferredSize(new java.awt.Dimension(200, 220));
        pnlSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlSesion.add(btnMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

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
        pnlSesion.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

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
        pnlSesion.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jPanel1.add(pnlSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, -1000, -1, -1));

        pnlAdminClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdminClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloClientes.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloClientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblTituloClientes.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloClientes.setText("CLIENTES");
        pnlAdminClientes.add(lblTituloClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1280, 50));

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
        pnlAdminClientes.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

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
        pnlAdminClientes.add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 840, -1, -1));

        btnEliminarCliente.setBackground(colorDanger);
        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCliente.setPreferredSize(new java.awt.Dimension(100, 60));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        pnlAdminClientes.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 840, -1, -1));

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

        pnlAdminClientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 700));

        pnlEditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarCliente.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlEditarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeaderEditar.setBackground(new java.awt.Color(0, 255, 102));
        pnlHeaderEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDITAR CLIENTE:     ");
        pnlHeaderEditar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 30));

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

        pnlEditarCliente.add(pnlHeaderEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser10.setBackground(new java.awt.Color(0, 0, 0));
        lblUser10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser10.setForeground(new java.awt.Color(0, 0, 0));
        lblUser10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser10.setText("Apellido Paterno");
        lblUser10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser11.setBackground(new java.awt.Color(0, 0, 0));
        lblUser11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser11.setForeground(new java.awt.Color(0, 0, 0));
        lblUser11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser11.setText("Apellido Materno");
        lblUser11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

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
        pnlEditarCliente.add(lblUser13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser14.setBackground(new java.awt.Color(0, 0, 0));
        lblUser14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser14.setForeground(new java.awt.Color(0, 0, 0));
        lblUser14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser14.setText("Contraseña");
        lblUser14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser16.setBackground(new java.awt.Color(0, 0, 0));
        lblUser16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser16.setForeground(new java.awt.Color(0, 0, 0));
        lblUser16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser16.setText("Empresa");
        lblUser16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, 40));

        lblUser17.setBackground(new java.awt.Color(0, 0, 0));
        lblUser17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser17.setForeground(new java.awt.Color(0, 0, 0));
        lblUser17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser17.setText("Estado");
        lblUser17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 40));

        lblUser18.setBackground(new java.awt.Color(0, 0, 0));
        lblUser18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser18.setForeground(new java.awt.Color(0, 0, 0));
        lblUser18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser18.setText("RUT");
        lblUser18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser19.setBackground(new java.awt.Color(0, 0, 0));
        lblUser19.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser19.setForeground(new java.awt.Color(0, 0, 0));
        lblUser19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser19.setText("Correo electronico");
        lblUser19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlEditarCliente.add(lblUser19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        txtEditarUsuarioUsername.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarUsuarioUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtEditarUsuarioPassword.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtEditarUsuarioPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 40));

        txtUserAPat1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtUserAPat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtUserName1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtUserAMat1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtUserAMat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        cbxUserEstado1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Activo", "Suspendido" }));
        pnlEditarCliente.add(cbxUserEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 300, 37));

        cbxUserEmpresa1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEmpresa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pnlEditarCliente.add(cbxUserEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 37));

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
        pnlEditarCliente.add(btnEditarClienteActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 300, 40));

        txtUserMail1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtUserMail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 38));

        txtUserRut1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlEditarCliente.add(txtUserRut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        pnlAdminClientes.add(pnlEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 640, -1));

        pnlAgregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAgregarCliente.setPreferredSize(new java.awt.Dimension(840, 680));
        pnlAgregarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 255, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregar Usuario");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

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
        jPanel6.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        pnlAgregarCliente.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser.setBackground(new java.awt.Color(0, 0, 0));
        lblUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Apellido Paterno");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser1.setBackground(new java.awt.Color(0, 0, 0));
        lblUser1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(0, 0, 0));
        lblUser1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser1.setText("Apellido Materno");
        lblUser1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

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
        pnlAgregarCliente.add(lblUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser4.setBackground(new java.awt.Color(0, 0, 0));
        lblUser4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser4.setForeground(new java.awt.Color(0, 0, 0));
        lblUser4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser4.setText("Contraseña");
        lblUser4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser6.setBackground(new java.awt.Color(0, 0, 0));
        lblUser6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser6.setForeground(new java.awt.Color(0, 0, 0));
        lblUser6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser6.setText("Empresa");
        lblUser6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, 40));

        lblUser7.setBackground(new java.awt.Color(0, 0, 0));
        lblUser7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser7.setForeground(new java.awt.Color(0, 0, 0));
        lblUser7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser7.setText("Estado");
        lblUser7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 40));

        lblUser8.setBackground(new java.awt.Color(0, 0, 0));
        lblUser8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser8.setForeground(new java.awt.Color(0, 0, 0));
        lblUser8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser8.setText("RUT");
        lblUser8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser9.setBackground(new java.awt.Color(0, 0, 0));
        lblUser9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser9.setForeground(new java.awt.Color(0, 0, 0));
        lblUser9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser9.setText("Correo electronico");
        lblUser9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlAgregarCliente.add(lblUser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        txtUserUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtUserPass.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 40));

        txtUserAPat.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserAPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtUserName.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtUserAMat.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserAMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        cbxUserEstado.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Activo", "Suspendido" }));
        pnlAgregarCliente.add(cbxUserEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 300, 37));

        cbxUserEmpresa.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pnlAgregarCliente.add(cbxUserEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 37));

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
        pnlAgregarCliente.add(btnAgregarClienteGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 300, 40));

        btnAgregarClienteLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarClienteLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarClienteLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarClienteLimpiar.setText("Limpiar");
        btnAgregarClienteLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAgregarCliente.add(btnAgregarClienteLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 300, 40));

        txtUserMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 38));

        txtUserRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pnlAgregarCliente.add(txtUserRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        pnlAdminClientes.add(pnlAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 640, -1));

        jPanel1.add(pnlAdminClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pnlAdminProfesionales.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdminProfesionales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarUsuario1.setBackground(colorBtnAgregar);
        btnAgregarUsuario1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUsuario1.setText("+ Agregar Nuevo");
        btnAgregarUsuario1.setBorder(null);
        btnAgregarUsuario1.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuario1ActionPerformed(evt);
            }
        });
        pnlAdminProfesionales.add(btnAgregarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblUsuario1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblUsuario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombres", "Apellido Paterno", "Apellido Materno", "RUT", "Correo", "Rol", "Estado", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblUsuario1);
        if (tblUsuario1.getColumnModel().getColumnCount() > 0) {
            tblUsuario1.getColumnModel().getColumn(0).setMinWidth(10);
            tblUsuario1.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblUsuario1.getColumnModel().getColumn(0).setMaxWidth(100);
            tblUsuario1.getColumnModel().getColumn(1).setMinWidth(10);
            tblUsuario1.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblUsuario1.getColumnModel().getColumn(1).setMaxWidth(300);
            tblUsuario1.getColumnModel().getColumn(2).setMinWidth(10);
            tblUsuario1.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblUsuario1.getColumnModel().getColumn(2).setMaxWidth(500);
            tblUsuario1.getColumnModel().getColumn(3).setMinWidth(10);
            tblUsuario1.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblUsuario1.getColumnModel().getColumn(3).setMaxWidth(300);
            tblUsuario1.getColumnModel().getColumn(4).setMinWidth(10);
            tblUsuario1.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblUsuario1.getColumnModel().getColumn(4).setMaxWidth(300);
            tblUsuario1.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblUsuario1.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        pnlAdminProfesionales.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 700));

        btnEditarUsuario1.setBackground(colorInfo);
        btnEditarUsuario1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario1.setText("Editar Usuario");
        btnEditarUsuario1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarUsuario1.setPreferredSize(new java.awt.Dimension(200, 60));
        btnEditarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuario1ActionPerformed(evt);
            }
        });
        pnlAdminProfesionales.add(btnEditarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 840, -1, -1));

        btnEliminarUsuario1.setBackground(colorDanger);
        btnEliminarUsuario1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEliminarUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario1.setText("Eliminar");
        btnEliminarUsuario1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarUsuario1.setPreferredSize(new java.awt.Dimension(100, 60));
        btnEliminarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuario1ActionPerformed(evt);
            }
        });
        pnlAdminProfesionales.add(btnEliminarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 840, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("USUARIOS");
        pnlAdminProfesionales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1280, 50));

        jPanel1.add(pnlAdminProfesionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pAdminUsers.setBackground(new java.awt.Color(255, 255, 255));
        pAdminUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarUsuario.setBackground(colorBtnAgregar);
        btnAgregarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUsuario.setText("+ Agregar Nuevo");
        btnAgregarUsuario.setBorder(null);
        btnAgregarUsuario.setPreferredSize(new java.awt.Dimension(200, 60));
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        pAdminUsers.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 700));

        tblUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombres", "Apellido Paterno", "Apellido Materno", "RUT", "Correo", "Rol", "Estado", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuario);
        if (tblUsuario.getColumnModel().getColumnCount() > 0) {
            tblUsuario.getColumnModel().getColumn(0).setMinWidth(10);
            tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblUsuario.getColumnModel().getColumn(0).setMaxWidth(100);
            tblUsuario.getColumnModel().getColumn(1).setMinWidth(10);
            tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblUsuario.getColumnModel().getColumn(1).setMaxWidth(300);
            tblUsuario.getColumnModel().getColumn(2).setMinWidth(10);
            tblUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblUsuario.getColumnModel().getColumn(2).setMaxWidth(500);
            tblUsuario.getColumnModel().getColumn(3).setMinWidth(10);
            tblUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblUsuario.getColumnModel().getColumn(3).setMaxWidth(300);
            tblUsuario.getColumnModel().getColumn(4).setMinWidth(10);
            tblUsuario.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblUsuario.getColumnModel().getColumn(4).setMaxWidth(300);
            tblUsuario.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblUsuario.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        pAdminUsers.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 700));

        btnEditarUsuario.setBackground(colorInfo);
        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarUsuario.setPreferredSize(new java.awt.Dimension(200, 60));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        pAdminUsers.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 840, -1, -1));

        btnEliminarUsuario.setBackground(colorDanger);
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarUsuario.setPreferredSize(new java.awt.Dimension(100, 60));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        pAdminUsers.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 840, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIOS");
        pAdminUsers.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1280, 50));

        jPanel1.add(pAdminUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

        pInicio.setBackground(new java.awt.Color(255, 255, 255));
        pInicio.setPreferredSize(new java.awt.Dimension(1840, 880));
        pInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/SP-portada_1.png"))); // NOI18N
        pInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1930, 980));

        jPanel1.add(pInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 970));

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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        VerPanel(pInicio);
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
        verMenu(pnlSesion);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnProfesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMouseClicked
        verMenu(pnlProfes);
    }//GEN-LAST:event_btnProfesMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        verMenu(pnlCliente);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMouseClicked
        verMenu(pnlNotify);
    }//GEN-LAST:event_btnNotifyMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        verMenu(pnlSesion);
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnChecklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecklistActionPerformed
       
    }//GEN-LAST:event_btnChecklistActionPerformed

    private void btnAsesoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsesoriasActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        verMenu(pnlAdmin);
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        
    }//GEN-LAST:event_btnAdminMousePressed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
      
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMouseClicked
        verMenu(pnlInformes);
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

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        VerPanel(pAdminUsers);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente3ActionPerformed
        
    }//GEN-LAST:event_btnCliente3ActionPerformed

    private void btnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfActionPerformed
            
    }//GEN-LAST:event_btnProfActionPerformed

    private void btnMejorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMejorasActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        pnlAgregarCliente.setVisible(false);
        pAdminUsers.setVisible(true);
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnAgregarClienteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteGuardarActionPerformed
        
    }//GEN-LAST:event_btnAgregarClienteGuardarActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnEditarClienteCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteCerrarActionPerformed
        pnlEditarCliente.setVisible(false);
        pAdminUsers.setVisible(true);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarUsuario1ActionPerformed

    private void btnEditarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarUsuario1ActionPerformed

    private void btnEliminarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarUsuario1ActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnAdmin;
    public javax.swing.JButton btnAgregarCliente;
    public javax.swing.JButton btnAgregarClienteGuardar;
    public javax.swing.JButton btnAgregarClienteLimpiar;
    public javax.swing.JButton btnAgregarUsuario;
    public javax.swing.JButton btnAgregarUsuario1;
    private javax.swing.JButton btnAseEsp;
    private javax.swing.JButton btnAsesorias;
    private javax.swing.JButton btnAtrasos;
    private javax.swing.JButton btnCapacitaciones;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnChecklist;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente2;
    private javax.swing.JButton btnCliente3;
    public javax.swing.JButton btnEditarCliente;
    public javax.swing.JButton btnEditarClienteActualizar;
    private javax.swing.JButton btnEditarClienteCerrar;
    public javax.swing.JButton btnEditarUsuario;
    public javax.swing.JButton btnEditarUsuario1;
    public javax.swing.JButton btnEliminarCliente;
    public javax.swing.JButton btnEliminarUsuario;
    public javax.swing.JButton btnEliminarUsuario1;
    private javax.swing.JButton btnInfoAcc;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMejoras;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnNotify;
    private javax.swing.JButton btnPagoClientes;
    private javax.swing.JButton btnProf;
    private javax.swing.JButton btnProfes;
    private javax.swing.JButton btnRepAcc;
    private javax.swing.JButton btnRepCliente;
    private javax.swing.JButton btnRepGlobal;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUser;
    public javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVisitas;
    public javax.swing.JComboBox<String> cbxUserEmpresa;
    public javax.swing.JComboBox<String> cbxUserEmpresa1;
    public javax.swing.JComboBox<String> cbxUserEstado;
    public javax.swing.JComboBox<String> cbxUserEstado1;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lblEditarClienteID;
    private javax.swing.JLabel lblTituloClientes;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser10;
    private javax.swing.JLabel lblUser11;
    private javax.swing.JLabel lblUser12;
    private javax.swing.JLabel lblUser13;
    private javax.swing.JLabel lblUser14;
    private javax.swing.JLabel lblUser16;
    private javax.swing.JLabel lblUser17;
    private javax.swing.JLabel lblUser18;
    private javax.swing.JLabel lblUser19;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JLabel lblUser6;
    private javax.swing.JLabel lblUser7;
    private javax.swing.JLabel lblUser8;
    private javax.swing.JLabel lblUser9;
    public javax.swing.JPanel pAdminUsers;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pnlAdmin;
    public javax.swing.JPanel pnlAdminClientes;
    public javax.swing.JPanel pnlAdminProfesionales;
    public javax.swing.JPanel pnlAgregarCliente;
    private javax.swing.JPanel pnlCliente;
    public javax.swing.JPanel pnlEditarCliente;
    private javax.swing.JPanel pnlHeaderEditar;
    private javax.swing.JPanel pnlInformes;
    private javax.swing.JPanel pnlNotify;
    private javax.swing.JPanel pnlProfes;
    private javax.swing.JPanel pnlSesion;
    public javax.swing.JTable tblAdminClientes;
    public javax.swing.JTable tblUsuario;
    public javax.swing.JTable tblUsuario1;
    public javax.swing.JTextField txtEditarUsuarioPassword;
    public javax.swing.JTextField txtEditarUsuarioUsername;
    public javax.swing.JTextField txtUserAMat;
    public javax.swing.JTextField txtUserAMat1;
    public javax.swing.JTextField txtUserAPat;
    public javax.swing.JTextField txtUserAPat1;
    public javax.swing.JTextField txtUserMail;
    public javax.swing.JTextField txtUserMail1;
    public javax.swing.JTextField txtUserName;
    public javax.swing.JTextField txtUserName1;
    public javax.swing.JTextField txtUserPass;
    public javax.swing.JTextField txtUserRut;
    public javax.swing.JTextField txtUserRut1;
    public javax.swing.JTextField txtUserUser;
    // End of variables declaration//GEN-END:variables

   
}
