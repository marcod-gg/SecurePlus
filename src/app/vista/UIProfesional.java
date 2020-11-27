
package app.vista;

import java.awt.Color;
import java.awt.Font;
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
        
        
        VerPanel(pInicio);
        

    }
    
    public void VerPanel(JPanel panel){
        container.setVisible(false);
        pInicio.setVisible(false);
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
        pnlHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCli = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnNotify = new javax.swing.JButton();
        pnlFooter = new javax.swing.JPanel();
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

        pnlHeader.setBackground(colorSecondary);
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/splogo_1.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 70));
        jLabel2.setRequestFocusEnabled(false);
        pnlHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

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
        pnlHeader.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 70));

        btnCli.setBackground(colorSecondary);
        btnCli.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCli.setForeground(new java.awt.Color(255, 255, 255));
        btnCli.setText("CLIENTES");
        btnCli.setBorder(null);
        btnCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCliMouseClicked(evt);
            }
        });
        btnCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliActionPerformed(evt);
            }
        });
        pnlHeader.add(btnCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 200, 70));

        btnAct.setBackground(colorSecondary);
        btnAct.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAct.setForeground(new java.awt.Color(255, 255, 255));
        btnAct.setText("ACTIVIDADES");
        btnAct.setBorder(null);
        btnAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActMouseClicked(evt);
            }
        });
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        pnlHeader.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 70));

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
        pnlHeader.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 200, 70));

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
        pnlHeader.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 200, 70));

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
        pnlHeader.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 0, -1, -1));

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
        pnlHeader.add(btnNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 0, -1, -1));

        jPanel1.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 70));

        pnlFooter.setBackground(colorFooter);
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(colorFooter);
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © Secure Plus 2020");
        pnlFooter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1900, 30));

        jPanel1.add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1040, 1920, 40));

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

    private void btnCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliActionPerformed

    }//GEN-LAST:event_btnCliActionPerformed

    private void btnProfesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMousePressed

    }//GEN-LAST:event_btnProfesMousePressed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed

    }//GEN-LAST:event_btnActActionPerformed

    private void btnNotifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMousePressed

    }//GEN-LAST:event_btnNotifyMousePressed

    private void btnNotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyActionPerformed

    }//GEN-LAST:event_btnNotifyActionPerformed

    private void btnUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMousePressed

    }//GEN-LAST:event_btnUserMousePressed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        verMenu(pnlSesion);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActMouseClicked
        verMenu(pnlProfes);
    }//GEN-LAST:event_btnActMouseClicked

    private void btnCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCliMouseClicked
        verMenu(pnlCliente);
    }//GEN-LAST:event_btnCliMouseClicked

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
        
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente3ActionPerformed
        
    }//GEN-LAST:event_btnCliente3ActionPerformed

    private void btnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfActionPerformed
            
    }//GEN-LAST:event_btnProfActionPerformed

    private void btnMejorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMejorasActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAseEsp;
    private javax.swing.JButton btnAsesorias;
    private javax.swing.JButton btnAtrasos;
    private javax.swing.JButton btnCapacitaciones;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnChecklist;
    private javax.swing.JButton btnCli;
    private javax.swing.JButton btnCliente2;
    private javax.swing.JButton btnCliente3;
    private javax.swing.JButton btnInfoAcc;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMejoras;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnNotify;
    private javax.swing.JButton btnPagoClientes;
    private javax.swing.JButton btnProf;
    private javax.swing.JButton btnRepAcc;
    private javax.swing.JButton btnRepCliente;
    private javax.swing.JButton btnRepGlobal;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUser;
    public javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVisitas;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInformes;
    private javax.swing.JPanel pnlNotify;
    private javax.swing.JPanel pnlProfes;
    private javax.swing.JPanel pnlSesion;
    // End of variables declaration//GEN-END:variables

   
}
