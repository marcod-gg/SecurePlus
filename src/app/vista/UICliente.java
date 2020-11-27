
package app.vista;

import java.awt.Color;
import java.awt.Font;
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
        btnIni = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnInf = new javax.swing.JButton();
        btnFin = new javax.swing.JButton();
        btnPanico = new javax.swing.JButton();
        btnNotify = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        pnlFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        btnIni.setBackground(colorSecondary);
        btnIni.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnIni.setForeground(new java.awt.Color(255, 255, 255));
        btnIni.setText("INICIO");
        btnIni.setBorder(null);
        btnIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniActionPerformed(evt);
            }
        });
        pnlHeader.add(btnIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 70));

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
        pnlHeader.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 200, 70));

        btnInf.setBackground(colorSecondary);
        btnInf.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnInf.setForeground(new java.awt.Color(255, 255, 255));
        btnInf.setText("INFORMES");
        btnInf.setToolTipText("");
        btnInf.setActionCommand("INFORMES");
        btnInf.setBorder(null);
        btnInf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfMouseClicked(evt);
            }
        });
        btnInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfActionPerformed(evt);
            }
        });
        pnlHeader.add(btnInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 200, 70));

        btnFin.setBackground(colorSecondary);
        btnFin.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnFin.setForeground(new java.awt.Color(255, 255, 255));
        btnFin.setText("FINANZAS");
        btnFin.setBorder(null);
        btnFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinMouseClicked(evt);
            }
        });
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        pnlHeader.add(btnFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 200, 70));

        btnPanico.setBackground(colorSecondary);
        btnPanico.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnPanico.setForeground(new java.awt.Color(255, 255, 255));
        btnPanico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/Alarma.png"))); // NOI18N
        btnPanico.setBorder(null);
        btnPanico.setPreferredSize(new java.awt.Dimension(70, 70));
        btnPanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanicoActionPerformed(evt);
            }
        });
        pnlHeader.add(btnPanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, -1));

        btnNotify.setBackground(colorSecondary);
        btnNotify.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnNotify.setForeground(new java.awt.Color(255, 255, 255));
        btnNotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/Notificacion.png"))); // NOI18N
        btnNotify.setBorder(null);
        btnNotify.setPreferredSize(new java.awt.Dimension(70, 70));
        btnNotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyActionPerformed(evt);
            }
        });
        pnlHeader.add(btnNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 0, -1, -1));

        btnUser.setBackground(colorSecondary);
        btnUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/Avatar_1.png"))); // NOI18N
        btnUser.setText("SesionUsuario");
        btnUser.setBorder(null);
        btnUser.setPreferredSize(new java.awt.Dimension(200, 70));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        pnlHeader.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 0, -1, -1));

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

    private void btnIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniActionPerformed
        VerPanel(pInicio);
    }//GEN-LAST:event_btnIniActionPerformed

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed

    }//GEN-LAST:event_btnClienteMousePressed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed

    }//GEN-LAST:event_btnActActionPerformed

    private void btnProfesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesMousePressed

    }//GEN-LAST:event_btnProfesMousePressed

    private void btnInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfActionPerformed

    }//GEN-LAST:event_btnInfActionPerformed

    private void btnNotifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMousePressed

    }//GEN-LAST:event_btnNotifyMousePressed

    private void btnNotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyActionPerformed

    }//GEN-LAST:event_btnNotifyActionPerformed

    private void btnUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMousePressed

    }//GEN-LAST:event_btnUserMousePressed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        verMenu(pnlSesion);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnInfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfMouseClicked
        
    }//GEN-LAST:event_btnInfMouseClicked

    private void btnActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActMouseClicked
        
    }//GEN-LAST:event_btnActMouseClicked

    private void btnNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotifyMouseClicked
        
    }//GEN-LAST:event_btnNotifyMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked

    }//GEN-LAST:event_btnUserMouseClicked

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        
    }//GEN-LAST:event_btnAdminMousePressed

    private void btnFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinMouseClicked
        
    }//GEN-LAST:event_btnFinMouseClicked

    private void btnInformesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesMousePressed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinActionPerformed

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnFin;
    private javax.swing.JButton btnInf;
    private javax.swing.JButton btnIni;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnNotify;
    private javax.swing.JButton btnPanico;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUser;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlSesion;
    // End of variables declaration//GEN-END:variables

   
}
