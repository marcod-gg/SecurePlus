
package app.vista;

import app.control.ControladorUsuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import app.vista.*;


public final class UIMenu1 extends javax.swing.JFrame {


    public UIMenu1() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        VerPanel(pInicio);
        

    }
    
    public void VerPanel(JPanel panel){
        container.setVisible(false);
        pInicio.setVisible(false);
        pAdminUsers.setVisible(false);
        pAgregarUsuario.setVisible(false);
        pEditarUsuario.setVisible(false);
        panel.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProfes = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnNotify = new javax.swing.JButton();
        pnlCliente = new javax.swing.JPanel();
        btnRepAcc = new javax.swing.JButton();
        btnAseEsp = new javax.swing.JButton();
        pnlMantenedores = new javax.swing.JPanel();
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
        pAgregarUsuario = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        txtUserUser = new javax.swing.JTextField();
        txtUserPass = new javax.swing.JTextField();
        txtUserAPat = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtUserAMat = new javax.swing.JTextField();
        cbxUserRol = new javax.swing.JComboBox<>();
        cbxUserEstado = new javax.swing.JComboBox<>();
        cbxUserEmpresa = new javax.swing.JComboBox<>();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblUser4 = new javax.swing.JLabel();
        lblUser5 = new javax.swing.JLabel();
        lblUser6 = new javax.swing.JLabel();
        lblUser7 = new javax.swing.JLabel();
        btnGuardarUsuario = new javax.swing.JButton();
        btnLimpiarUsuario = new javax.swing.JButton();
        txtUserMail = new javax.swing.JTextField();
        txtUserRut = new javax.swing.JTextField();
        lblUser8 = new javax.swing.JLabel();
        lblUser9 = new javax.swing.JLabel();
        pEditarUsuario = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCerrar2 = new javax.swing.JButton();
        lblEditID = new javax.swing.JLabel();
        lblUser10 = new javax.swing.JLabel();
        lblUser11 = new javax.swing.JLabel();
        txtUserUser1 = new javax.swing.JTextField();
        txtUserPass1 = new javax.swing.JTextField();
        txtUserAPat1 = new javax.swing.JTextField();
        txtUserName1 = new javax.swing.JTextField();
        txtUserAMat1 = new javax.swing.JTextField();
        cbxUserRol1 = new javax.swing.JComboBox<>();
        cbxUserEstado1 = new javax.swing.JComboBox<>();
        cbxUserEmpresa1 = new javax.swing.JComboBox<>();
        lblUser12 = new javax.swing.JLabel();
        lblUser13 = new javax.swing.JLabel();
        lblUser14 = new javax.swing.JLabel();
        lblUser15 = new javax.swing.JLabel();
        lblUser16 = new javax.swing.JLabel();
        lblUser17 = new javax.swing.JLabel();
        btnUserActualizar = new javax.swing.JButton();
        txtUserMail1 = new javax.swing.JTextField();
        txtUserRut1 = new javax.swing.JTextField();
        lblUser18 = new javax.swing.JLabel();
        lblUser19 = new javax.swing.JLabel();
        pAdminUsers = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnListarUsuarios = new javax.swing.JButton();
        btnAgregarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        pInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(37, 35, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/splogo_1.png"))); // NOI18N

        btnInicio.setText("jButton1");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCliente.setText("jButton2");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProfes.setText("jButton3");
        btnProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesActionPerformed(evt);
            }
        });

        btnInformes.setText("jButton4");
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });

        btnAdmin.setText("jButton5");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnUser.setText("jButton6");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnNotify.setText("jButton7");
        btnNotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnInicio)
                .addGap(91, 91, 91)
                .addComponent(btnCliente)
                .addGap(89, 89, 89)
                .addComponent(btnProfes)
                .addGap(104, 104, 104)
                .addComponent(btnInformes)
                .addGap(92, 92, 92)
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
                .addComponent(btnNotify)
                .addGap(56, 56, 56)
                .addComponent(btnUser)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnCliente)
                    .addComponent(btnProfes)
                    .addComponent(btnInformes)
                    .addComponent(btnAdmin)
                    .addComponent(btnUser)
                    .addComponent(btnNotify))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 70));

        pnlCliente.setBackground(new java.awt.Color(37, 35, 35));
        pnlCliente.setPreferredSize(new java.awt.Dimension(200, 230));

        btnRepAcc.setBackground(new java.awt.Color(37, 35, 35));
        btnRepAcc.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnRepAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnRepAcc.setText("Reportar \nAccidente");
        btnRepAcc.setBorder(null);
        btnRepAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepAccActionPerformed(evt);
            }
        });

        btnAseEsp.setBackground(new java.awt.Color(37, 35, 35));
        btnAseEsp.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnAseEsp.setForeground(new java.awt.Color(255, 255, 255));
        btnAseEsp.setText("Solicitar Asesoría Especial");
        btnAseEsp.setBorder(null);
        btnAseEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAseEspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnRepAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAseEsp, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
            .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlClienteLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(btnRepAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnAseEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, -250, -1, -1));

        pnlMantenedores.setBackground(new java.awt.Color(37, 35, 35));
        pnlMantenedores.setPreferredSize(new java.awt.Dimension(200, 530));

        btnCapacitaciones.setBackground(new java.awt.Color(37, 35, 35));
        btnCapacitaciones.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCapacitaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCapacitaciones.setText("Capacitaciones");
        btnCapacitaciones.setBorder(null);
        btnCapacitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapacitacionesActionPerformed(evt);
            }
        });

        btnVisitas.setBackground(new java.awt.Color(37, 35, 35));
        btnVisitas.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVisitas.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitas.setText("Visitas");
        btnVisitas.setBorder(null);
        btnVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitasActionPerformed(evt);
            }
        });

        btnCliente2.setBackground(new java.awt.Color(37, 35, 35));
        btnCliente2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCliente2.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente2.setText("Clientes");
        btnCliente2.setBorder(null);

        btnAsesorias.setBackground(new java.awt.Color(37, 35, 35));
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

        btnChecklist.setBackground(new java.awt.Color(37, 35, 35));
        btnChecklist.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnChecklist.setForeground(new java.awt.Color(255, 255, 255));
        btnChecklist.setText("Checklist");
        btnChecklist.setBorder(null);
        btnChecklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecklistActionPerformed(evt);
            }
        });

        btnMejoras.setBackground(new java.awt.Color(37, 35, 35));
        btnMejoras.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnMejoras.setForeground(new java.awt.Color(255, 255, 255));
        btnMejoras.setText("Mejoras");
        btnMejoras.setBorder(null);
        btnMejoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMantenedoresLayout = new javax.swing.GroupLayout(pnlMantenedores);
        pnlMantenedores.setLayout(pnlMantenedoresLayout);
        pnlMantenedoresLayout.setHorizontalGroup(
            pnlMantenedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMejoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAsesorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVisitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCapacitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlMantenedoresLayout.setVerticalGroup(
            pnlMantenedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantenedoresLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnCapacitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAsesorias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMejoras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlMantenedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, -530, 200, 530));

        pnlInformes.setBackground(new java.awt.Color(37, 35, 35));
        pnlInformes.setPreferredSize(new java.awt.Dimension(200, 530));

        btnPagoClientes.setBackground(new java.awt.Color(37, 35, 35));
        btnPagoClientes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnPagoClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPagoClientes.setText("Pago Clientes");
        btnPagoClientes.setBorder(null);
        btnPagoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoClientesActionPerformed(evt);
            }
        });

        btnInfoAcc.setBackground(new java.awt.Color(37, 35, 35));
        btnInfoAcc.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnInfoAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoAcc.setText("Informe Accidentabilidad");
        btnInfoAcc.setBorder(null);
        btnInfoAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAccActionPerformed(evt);
            }
        });

        btnActividades.setBackground(new java.awt.Color(37, 35, 35));
        btnActividades.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setText("Actividades");
        btnActividades.setBorder(null);

        btnAtrasos.setBackground(new java.awt.Color(37, 35, 35));
        btnAtrasos.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAtrasos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasos.setText("Atrasos");
        btnAtrasos.setToolTipText("");
        btnAtrasos.setActionCommand("Capacitaciones");
        btnAtrasos.setBorder(null);
        btnAtrasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasosActionPerformed(evt);
            }
        });

        btnRepCliente.setBackground(new java.awt.Color(37, 35, 35));
        btnRepCliente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnRepCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRepCliente.setText("Reporte Cliente");
        btnRepCliente.setBorder(null);
        btnRepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepClienteActionPerformed(evt);
            }
        });

        btnRepGlobal.setBackground(new java.awt.Color(37, 35, 35));
        btnRepGlobal.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnRepGlobal.setForeground(new java.awt.Color(255, 255, 255));
        btnRepGlobal.setText("Reporte Global");
        btnRepGlobal.setBorder(null);

        javax.swing.GroupLayout pnlInformesLayout = new javax.swing.GroupLayout(pnlInformes);
        pnlInformes.setLayout(pnlInformesLayout);
        pnlInformesLayout.setHorizontalGroup(
            pnlInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRepCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRepGlobal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAtrasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInfoAcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnPagoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlInformesLayout.setVerticalGroup(
            pnlInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformesLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnPagoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInfoAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtrasos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRepGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, -530, 200, 530));

        pnlAdmin.setBackground(new java.awt.Color(37, 35, 35));
        pnlAdmin.setPreferredSize(new java.awt.Dimension(200, 300));

        btnUsuarios.setBackground(new java.awt.Color(37, 35, 35));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCliente3.setBackground(new java.awt.Color(37, 35, 35));
        btnCliente3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnCliente3.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente3.setText("Clientes");
        btnCliente3.setBorder(null);
        btnCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente3ActionPerformed(evt);
            }
        });

        btnProf.setBackground(new java.awt.Color(37, 35, 35));
        btnProf.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnProf.setForeground(new java.awt.Color(255, 255, 255));
        btnProf.setText("Profesionales");
        btnProf.setBorder(null);
        btnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, -300, -1, -1));

        pnlNotify.setBackground(new java.awt.Color(37, 35, 35));

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

        pnlSesion.setBackground(new java.awt.Color(37, 35, 35));
        pnlSesion.setPreferredSize(new java.awt.Dimension(150, 300));

        javax.swing.GroupLayout pnlSesionLayout = new javax.swing.GroupLayout(pnlSesion);
        pnlSesion.setLayout(pnlSesionLayout);
        pnlSesionLayout.setHorizontalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnlSesionLayout.setVerticalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1662, -300, 200, 300));

        pAgregarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pAgregarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pAgregarUsuario.setPreferredSize(new java.awt.Dimension(840, 680));
        pAgregarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pAgregarUsuario.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser.setBackground(new java.awt.Color(0, 0, 0));
        lblUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Apellido Paterno");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser1.setBackground(new java.awt.Color(0, 0, 0));
        lblUser1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(0, 0, 0));
        lblUser1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser1.setText("Apellido Materno");
        lblUser1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        txtUserUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtUserPass.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 40));

        txtUserAPat.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserAPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtUserName.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtUserAMat.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserAMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        cbxUserRol.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Cliente", "Profesional", "Administrador" }));
        cbxUserRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUserRolActionPerformed(evt);
            }
        });
        pAgregarUsuario.add(cbxUserRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 300, 37));

        cbxUserEstado.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Activo", "Suspendido" }));
        pAgregarUsuario.add(cbxUserEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 37));

        cbxUserEmpresa.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pAgregarUsuario.add(cbxUserEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 300, 37));

        lblUser2.setBackground(new java.awt.Color(0, 0, 0));
        lblUser2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(0, 0, 0));
        lblUser2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser2.setText("Nombre de Usuario");
        lblUser2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        lblUser3.setBackground(new java.awt.Color(0, 0, 0));
        lblUser3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(0, 0, 0));
        lblUser3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser3.setText("Nombres");
        lblUser3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser4.setBackground(new java.awt.Color(0, 0, 0));
        lblUser4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser4.setForeground(new java.awt.Color(0, 0, 0));
        lblUser4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser4.setText("Contraseña");
        lblUser4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser5.setBackground(new java.awt.Color(0, 0, 0));
        lblUser5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser5.setForeground(new java.awt.Color(0, 0, 0));
        lblUser5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser5.setText("Rol");
        lblUser5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 40));

        lblUser6.setBackground(new java.awt.Color(0, 0, 0));
        lblUser6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser6.setForeground(new java.awt.Color(0, 0, 0));
        lblUser6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser6.setText("Empresa");
        lblUser6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 200, 40));

        lblUser7.setBackground(new java.awt.Color(0, 0, 0));
        lblUser7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser7.setForeground(new java.awt.Color(0, 0, 0));
        lblUser7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser7.setText("Estado");
        lblUser7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, 40));

        btnGuardarUsuario.setBackground(new java.awt.Color(0, 204, 102));
        btnGuardarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarUsuario.setText("Guardar");
        btnGuardarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });
        pAgregarUsuario.add(btnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 160, 40));

        btnLimpiarUsuario.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnLimpiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarUsuario.setText("Limpiar");
        btnLimpiarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pAgregarUsuario.add(btnLimpiarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 130, 40));

        txtUserMail.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 38));

        txtUserRut.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pAgregarUsuario.add(txtUserRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        lblUser8.setBackground(new java.awt.Color(0, 0, 0));
        lblUser8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser8.setForeground(new java.awt.Color(0, 0, 0));
        lblUser8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser8.setText("RUT");
        lblUser8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser9.setBackground(new java.awt.Color(0, 0, 0));
        lblUser9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser9.setForeground(new java.awt.Color(0, 0, 0));
        lblUser9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser9.setText("Correo electronico");
        lblUser9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pAgregarUsuario.add(lblUser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        jPanel1.add(pAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 640, -1));

        pEditarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pEditarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pEditarUsuario.setPreferredSize(new java.awt.Dimension(840, 680));
        pEditarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 255, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar usuario:     ");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, -1));

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
        jPanel7.add(btnCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        lblEditID.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblEditID.setForeground(new java.awt.Color(255, 255, 255));
        lblEditID.setText(" ");
        jPanel7.add(lblEditID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        pEditarUsuario.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lblUser10.setBackground(new java.awt.Color(0, 0, 0));
        lblUser10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser10.setForeground(new java.awt.Color(0, 0, 0));
        lblUser10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser10.setText("Apellido Paterno");
        lblUser10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        lblUser11.setBackground(new java.awt.Color(0, 0, 0));
        lblUser11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser11.setForeground(new java.awt.Color(0, 0, 0));
        lblUser11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser11.setText("Apellido Materno");
        lblUser11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        txtUserUser1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        txtUserPass1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 40));

        txtUserAPat1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserAPat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, 38));

        txtUserName1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 300, 38));

        txtUserAMat1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserAMat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 38));

        cbxUserRol1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserRol1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Cliente", "Profesional", "Administrador" }));
        cbxUserRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUserRol1ActionPerformed(evt);
            }
        });
        pEditarUsuario.add(cbxUserRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 300, 37));

        cbxUserEstado1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Activo", "Suspendido" }));
        pEditarUsuario.add(cbxUserEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 37));

        cbxUserEmpresa1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cbxUserEmpresa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "SecurePlus", "Duoc", "Correos de Chile" }));
        pEditarUsuario.add(cbxUserEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 300, 37));

        lblUser12.setBackground(new java.awt.Color(0, 0, 0));
        lblUser12.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser12.setForeground(new java.awt.Color(0, 0, 0));
        lblUser12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser12.setText("Nombre de Usuario");
        lblUser12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        lblUser13.setBackground(new java.awt.Color(0, 0, 0));
        lblUser13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser13.setForeground(new java.awt.Color(0, 0, 0));
        lblUser13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser13.setText("Nombres");
        lblUser13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        lblUser14.setBackground(new java.awt.Color(0, 0, 0));
        lblUser14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser14.setForeground(new java.awt.Color(0, 0, 0));
        lblUser14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser14.setText("Contraseña");
        lblUser14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        lblUser15.setBackground(new java.awt.Color(0, 0, 0));
        lblUser15.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser15.setForeground(new java.awt.Color(0, 0, 0));
        lblUser15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser15.setText("Rol");
        lblUser15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 40));

        lblUser16.setBackground(new java.awt.Color(0, 0, 0));
        lblUser16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser16.setForeground(new java.awt.Color(0, 0, 0));
        lblUser16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser16.setText("Empresa");
        lblUser16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 200, 40));

        lblUser17.setBackground(new java.awt.Color(0, 0, 0));
        lblUser17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser17.setForeground(new java.awt.Color(0, 0, 0));
        lblUser17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser17.setText("Estado");
        lblUser17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, 40));

        btnUserActualizar.setBackground(new java.awt.Color(0, 204, 102));
        btnUserActualizar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUserActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnUserActualizar.setText("Actualizar");
        btnUserActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUserActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActualizarActionPerformed(evt);
            }
        });
        pEditarUsuario.add(btnUserActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 300, 40));

        txtUserMail1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserMail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 38));

        txtUserRut1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        pEditarUsuario.add(txtUserRut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 300, 38));

        lblUser18.setBackground(new java.awt.Color(0, 0, 0));
        lblUser18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser18.setForeground(new java.awt.Color(0, 0, 0));
        lblUser18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser18.setText("RUT");
        lblUser18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        lblUser19.setBackground(new java.awt.Color(0, 0, 0));
        lblUser19.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblUser19.setForeground(new java.awt.Color(0, 0, 0));
        lblUser19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser19.setText("Correo electronico");
        lblUser19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pEditarUsuario.add(lblUser19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        jPanel1.add(pEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 640, -1));

        pAdminUsers.setBackground(new java.awt.Color(255, 255, 255));
        pAdminUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 121, 140)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(112, 121, 140));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 121, 140)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(112, 121, 140));
        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMINISTRADOR DE USUARIOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1786, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1820, 50));

        btnListarUsuarios.setBackground(new java.awt.Color(92, 184, 92));
        btnListarUsuarios.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnListarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUsuarios.setText("Listar Usuarios");
        btnListarUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });
        jPanel4.add(btnListarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 220, 50));

        btnAgregarUsuario.setBackground(new java.awt.Color(92, 184, 92));
        btnAgregarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUsuario.setText("+ Agregar Nuevo");
        btnAgregarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 220, 50));

        tblUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombres", "Apellido Paterno", "Apellido Materno", "RUT", "Correo", "Rol", "Estado", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUsuario);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1760, 620));

        btnEditarUsuario.setBackground(new java.awt.Color(0, 204, 204));
        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 780, 130, 50));

        btnEliminarUsuario.setBackground(new java.awt.Color(204, 51, 0));
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 780, 80, 50));

        pAdminUsers.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1820, 860));

        jPanel1.add(pAdminUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pInicio.setBackground(new java.awt.Color(255, 255, 255));
        pInicio.setPreferredSize(new java.awt.Dimension(1860, 910));
        pInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/SP-portada_1.png"))); // NOI18N
        pInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1870, 920));

        jPanel1.add(pInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1860, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );

        jPanel1.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1860, 910));

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

    }//GEN-LAST:event_btnUserActionPerformed

    private void btnProfesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMouseClicked
        int pos = this.pnlMantenedores.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-530, 0, 1, 2, pnlMantenedores);
        }
        
    }//GEN-LAST:event_btnProfesMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        int pos = this.pnlCliente.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-300, 0, 1, 2, pnlCliente);
        }
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMouseClicked
        int pos = this.pnlNotify.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-300, 0, 1, 2, pnlNotify);
        }
    }//GEN-LAST:event_btnNotifyMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        int pos = this.pnlSesion.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-300, 0, 1, 2, pnlSesion);
        }
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnChecklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecklistActionPerformed
       
    }//GEN-LAST:event_btnChecklistActionPerformed

    private void btnAsesoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsesoriasActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        
    }//GEN-LAST:event_btnAdminMousePressed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        int pos = this.pnlAdmin.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-300, 0, 1, 2, pnlAdmin);
        }
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMouseClicked
        int pos = this.pnlInformes.getY();
        if (pos < 0) {
            Animacion.Animacion.bajar(-530, 0, 1, 2, pnlInformes);
        }
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

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnMejorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMejorasActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        pAgregarUsuario.setVisible(true);
        pAdminUsers.setVisible(false);
        txtUserPass.setEnabled(false);
        cbxUserEstado.setSelectedIndex(1);
        cbxUserEstado.setEnabled(false);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        pAgregarUsuario.setVisible(false);
        pAdminUsers.setVisible(true);
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void cbxUserRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUserRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUserRolActionPerformed

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar2ActionPerformed
        pEditarUsuario.setVisible(false);
        pAdminUsers.setVisible(true);
    }//GEN-LAST:event_btnCerrar2ActionPerformed

    private void cbxUserRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUserRol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUserRol1ActionPerformed

    private void btnUserActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserActualizarActionPerformed

    
    public static void main(String args[]) {
        UIMenu1 menu = new UIMenu1();
        ControladorUsuario cusuario = new ControladorUsuario(menu);
        menu.setVisible(true);
        menu.setLocationRelativeTo(menu);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnAdmin;
    public javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnAseEsp;
    private javax.swing.JButton btnAsesorias;
    private javax.swing.JButton btnAtrasos;
    private javax.swing.JButton btnCapacitaciones;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnCerrar2;
    private javax.swing.JButton btnChecklist;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente2;
    private javax.swing.JButton btnCliente3;
    public javax.swing.JButton btnEditarUsuario;
    public javax.swing.JButton btnEliminarUsuario;
    public javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnInfoAcc;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnInicio;
    public javax.swing.JButton btnLimpiarUsuario;
    public javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnMejoras;
    private javax.swing.JButton btnNotify;
    private javax.swing.JButton btnPagoClientes;
    private javax.swing.JButton btnProf;
    private javax.swing.JButton btnProfes;
    private javax.swing.JButton btnRepAcc;
    private javax.swing.JButton btnRepCliente;
    private javax.swing.JButton btnRepGlobal;
    private javax.swing.JButton btnUser;
    public javax.swing.JButton btnUserActualizar;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVisitas;
    public javax.swing.JComboBox<String> cbxUserEmpresa;
    public javax.swing.JComboBox<String> cbxUserEmpresa1;
    public javax.swing.JComboBox<String> cbxUserEstado;
    public javax.swing.JComboBox<String> cbxUserEstado1;
    public javax.swing.JComboBox<String> cbxUserRol;
    public javax.swing.JComboBox<String> cbxUserRol1;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblEditID;
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
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JLabel lblUser5;
    private javax.swing.JLabel lblUser6;
    private javax.swing.JLabel lblUser7;
    private javax.swing.JLabel lblUser8;
    private javax.swing.JLabel lblUser9;
    public javax.swing.JPanel pAdminUsers;
    public javax.swing.JPanel pAgregarUsuario;
    public javax.swing.JPanel pEditarUsuario;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlInformes;
    private javax.swing.JPanel pnlMantenedores;
    private javax.swing.JPanel pnlNotify;
    private javax.swing.JPanel pnlSesion;
    public javax.swing.JTable tblUsuario;
    public javax.swing.JTextField txtUserAMat;
    public javax.swing.JTextField txtUserAMat1;
    public javax.swing.JTextField txtUserAPat;
    public javax.swing.JTextField txtUserAPat1;
    public javax.swing.JTextField txtUserMail;
    public javax.swing.JTextField txtUserMail1;
    public javax.swing.JTextField txtUserName;
    public javax.swing.JTextField txtUserName1;
    public javax.swing.JTextField txtUserPass;
    public javax.swing.JTextField txtUserPass1;
    public javax.swing.JTextField txtUserRut;
    public javax.swing.JTextField txtUserRut1;
    public javax.swing.JTextField txtUserUser;
    public javax.swing.JTextField txtUserUser1;
    // End of variables declaration//GEN-END:variables
}
