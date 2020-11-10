/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.vista;

import java.awt.Color;



/**
 *
 * @author Marco
 */
public class UIIniciarSesion extends javax.swing.JFrame {

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
    
    public UIIniciarSesion() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(colorPrimary);
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.setPreferredSize(new java.awt.Dimension(300, 40));
        txtUser.setRequestFocusEnabled(false);
        txtUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUserCaretUpdate(evt);
            }
        });
        pnlLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Usuario:");
        jLabel4.setPreferredSize(new java.awt.Dimension(300, 20));
        pnlLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 140, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña:");
        jLabel5.setPreferredSize(new java.awt.Dimension(300, 20));
        pnlLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(null);
        txtPass.setPreferredSize(new java.awt.Dimension(300, 40));
        txtPass.setRequestFocusEnabled(false);
        txtPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPassCaretUpdate(evt);
            }
        });
        pnlLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        btnIniciarSesion.setBackground(colorInfo);
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        btnIniciarSesion.setForeground(colorLight);
        btnIniciarSesion.setText("Ingresar");
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(300, 50));
        btnIniciarSesion.setRequestFocusEnabled(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pnlLogin.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel2.setBackground(colorDark);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(colorDark);
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesión");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, -1));

        pnlLogin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vista/img/splogo_1.png"))); // NOI18N
        pnlLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 360, -1));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtUserCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUserCaretUpdate
        
    }//GEN-LAST:event_txtUserCaretUpdate

    private void txtPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPassCaretUpdate
        
    }//GEN-LAST:event_txtPassCaretUpdate



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlLogin;
    public javax.swing.JTextField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
