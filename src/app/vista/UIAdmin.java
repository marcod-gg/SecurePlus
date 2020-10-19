/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.vista;



import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;

/**
 *
 * @author Marco
 */
public class UIAdmin extends javax.swing.JFrame{

    
    
    public UIAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.btnInicio.setSelected(true);
        
        pnlInicio pinicio = new pnlInicio();
        pinicio.setSize(830, 650);
        
        
        contenedor.removeAll();
        contenedor.add(pinicio);
        contenedor.revalidate();
        contenedor.repaint();
        
        //public static javax.swing.JPanel contenedor;

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnProf = new rsbuttom.RSButtonMetro();
        btnClientes = new rsbuttom.RSButtonMetro();
        btnAdmin = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnInicio = new rsbuttom.RSButtonMetro();
        btnConfig = new rsbuttom.RSButtonMetro();
        btnLogout = new rsbuttom.RSButtonMetro();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Bienvenido, Administrador");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 290, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 75));

        pnlMenu.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PERFILES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        btnProf.setBackground(new java.awt.Color(204, 204, 204));
        btnProf.setForeground(new java.awt.Color(51, 51, 51));
        btnProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/profesional.png"))); // NOI18N
        btnProf.setText("Profesionales");
        btnProf.setColorHover(new java.awt.Color(0, 255, 102));
        btnProf.setColorNormal(new java.awt.Color(204, 204, 204));
        btnProf.setColorPressed(new java.awt.Color(0, 255, 102));
        btnProf.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnProf.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnProf.setColorTextPressed(new java.awt.Color(51, 51, 51));
        btnProf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProf.setIconTextGap(10);
        btnProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProfMousePressed(evt);
            }
        });
        btnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfActionPerformed(evt);
            }
        });

        btnClientes.setForeground(new java.awt.Color(51, 51, 51));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/cliente.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setColorHover(new java.awt.Color(0, 255, 102));
        btnClientes.setColorNormal(new java.awt.Color(204, 204, 204));
        btnClientes.setColorPressed(new java.awt.Color(0, 255, 102));
        btnClientes.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnClientes.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnClientes.setColorTextPressed(new java.awt.Color(51, 51, 51));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setIconTextGap(10);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btnAdmin.setForeground(new java.awt.Color(51, 51, 51));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/ojo-admin.png"))); // NOI18N
        btnAdmin.setText("Administradores");
        btnAdmin.setColorHover(new java.awt.Color(0, 255, 102));
        btnAdmin.setColorNormal(new java.awt.Color(204, 204, 204));
        btnAdmin.setColorPressed(new java.awt.Color(0, 255, 102));
        btnAdmin.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAdmin.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnAdmin.setColorTextPressed(new java.awt.Color(51, 51, 51));
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdmin.setIconTextGap(10);
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdminMousePressed(evt);
            }
        });
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("OPCIONES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/Home_1.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setColorHover(new java.awt.Color(234, 234, 234));
        btnInicio.setColorNormal(new java.awt.Color(234, 234, 234));
        btnInicio.setColorPressed(new java.awt.Color(234, 234, 234));
        btnInicio.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnInicio.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnInicio.setColorTextPressed(new java.awt.Color(51, 51, 51));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(10);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnConfig.setBackground(new java.awt.Color(204, 204, 204));
        btnConfig.setForeground(new java.awt.Color(51, 51, 51));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/config.png"))); // NOI18N
        btnConfig.setText("Configuraciones");
        btnConfig.setColorHover(new java.awt.Color(0, 255, 102));
        btnConfig.setColorNormal(new java.awt.Color(204, 204, 204));
        btnConfig.setColorPressed(new java.awt.Color(0, 255, 102));
        btnConfig.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnConfig.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnConfig.setColorTextPressed(new java.awt.Color(51, 51, 51));
        btnConfig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfig.setIconTextGap(10);
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfigMousePressed(evt);
            }
        });
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setForeground(new java.awt.Color(51, 51, 51));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/cerrar-sesion.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesión");
        btnLogout.setColorHover(new java.awt.Color(0, 255, 102));
        btnLogout.setColorNormal(new java.awt.Color(204, 204, 204));
        btnLogout.setColorPressed(new java.awt.Color(0, 255, 102));
        btnLogout.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnLogout.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnLogout.setColorTextPressed(new java.awt.Color(51, 51, 51));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setIconTextGap(10);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnProf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel1.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 670));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 830, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if(this.btnInicio.isSelected()){
            this.btnInicio.setColorHover(new Color(234,234,234));
            this.btnInicio.setColorNormal(new Color(234,234,234));
            this.btnInicio.setColorPressed(new Color(234,234,234));
            
            this.btnConfig.setColorHover(new Color(204,204,204));
            this.btnConfig.setColorNormal(new Color(204,204,204));
            this.btnConfig.setColorPressed(new Color(204,204,204));
            
            this.btnAdmin.setColorHover(new Color(204,204,204));
            this.btnAdmin.setColorNormal(new Color(204,204,204));
            this.btnAdmin.setColorPressed(new Color(204,204,204));
            
            this.btnClientes.setColorHover(new Color(204,204,204));
            this.btnClientes.setColorNormal(new Color(204,204,204));
            this.btnClientes.setColorPressed(new Color(204,204,204));
            
            this.btnLogout.setColorHover(new Color(204,204,204));
            this.btnLogout.setColorNormal(new Color(204,204,204));
            this.btnLogout.setColorPressed(new Color(204,204,204));
            
            this.btnProf.setColorHover(new Color(204,204,204));
            this.btnProf.setColorNormal(new Color(204,204,204));
            this.btnProf.setColorPressed(new Color(204,204,204));
            
            pnlInicio pinicio = new pnlInicio();
            pinicio.setSize(830, 650);


            contenedor.removeAll();
            contenedor.add(pinicio);
            contenedor.revalidate();
            contenedor.repaint();
            
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        if(this.btnAdmin.isSelected()){
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorNormal(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(204,204,204));
            
            this.btnConfig.setColorHover(new Color(204,204,204));
            this.btnConfig.setColorNormal(new Color(204,204,204));
            this.btnConfig.setColorPressed(new Color(204,204,204));
            
            this.btnAdmin.setColorHover(new Color(234,234,234));
            this.btnAdmin.setColorNormal(new Color(234,234,234));
            this.btnAdmin.setColorPressed(new Color(234,234,234));
            
            this.btnClientes.setColorHover(new Color(204,204,204));
            this.btnClientes.setColorNormal(new Color(204,204,204));
            this.btnClientes.setColorPressed(new Color(204,204,204));
            
            this.btnLogout.setColorHover(new Color(204,204,204));
            this.btnLogout.setColorNormal(new Color(204,204,204));
            this.btnLogout.setColorPressed(new Color(204,204,204));
            
            this.btnProf.setColorHover(new Color(204,204,204));
            this.btnProf.setColorNormal(new Color(204,204,204));
            this.btnProf.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        if(this.btnClientes.isSelected()){
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorNormal(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(204,204,204));
            
            this.btnConfig.setColorHover(new Color(204,204,204));
            this.btnConfig.setColorNormal(new Color(204,204,204));
            this.btnConfig.setColorPressed(new Color(204,204,204));
            
            this.btnAdmin.setColorHover(new Color(204,204,204));
            this.btnAdmin.setColorNormal(new Color(204,204,204));
            this.btnAdmin.setColorPressed(new Color(204,204,204));
            
            this.btnClientes.setColorHover(new Color(234,234,234));
            this.btnClientes.setColorNormal(new Color(234,234,234));
            this.btnClientes.setColorPressed(new Color(234,234,234));
            
            this.btnLogout.setColorHover(new Color(204,204,204));
            this.btnLogout.setColorNormal(new Color(204,204,204));
            this.btnLogout.setColorPressed(new Color(204,204,204));
            
            this.btnProf.setColorHover(new Color(204,204,204));
            this.btnProf.setColorNormal(new Color(204,204,204));
            this.btnProf.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfActionPerformed
        if(this.btnProf.isSelected()){
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorNormal(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(204,204,204));
            
            this.btnConfig.setColorHover(new Color(204,204,204));
            this.btnConfig.setColorNormal(new Color(204,204,204));
            this.btnConfig.setColorPressed(new Color(204,204,204));
            
            this.btnAdmin.setColorHover(new Color(204,204,204));
            this.btnAdmin.setColorNormal(new Color(204,204,204));
            this.btnAdmin.setColorPressed(new Color(204,204,204));
            
            this.btnClientes.setColorHover(new Color(204,204,204));
            this.btnClientes.setColorNormal(new Color(204,204,204));
            this.btnClientes.setColorPressed(new Color(204,204,204));
            
            this.btnLogout.setColorHover(new Color(204,204,204));
            this.btnLogout.setColorNormal(new Color(204,204,204));
            this.btnLogout.setColorPressed(new Color(204,204,204));
            
            this.btnProf.setColorHover(new Color(234,234,234));
            this.btnProf.setColorNormal(new Color(234,234,234));
            this.btnProf.setColorPressed(new Color(234,234,234));
            
            pnlProf pprof = new pnlProf();
            pprof.setSize(830, 650);


            contenedor.removeAll();
            contenedor.add(pprof);
            contenedor.revalidate();
            contenedor.repaint();
            
        }
    }//GEN-LAST:event_btnProfActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        if(this.btnConfig.isSelected()){
            
            this.btnConfig.setColorHover(new Color(234,234,234));
            this.btnConfig.setColorNormal(new Color(234,234,234));
            this.btnConfig.setColorPressed(new Color(234,234,234));
            
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorNormal(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(204,204,204));
            
            this.btnAdmin.setColorHover(new Color(204,204,204));
            this.btnAdmin.setColorNormal(new Color(204,204,204));
            this.btnAdmin.setColorPressed(new Color(204,204,204));
            
            this.btnClientes.setColorHover(new Color(204,204,204));
            this.btnClientes.setColorNormal(new Color(204,204,204));
            this.btnClientes.setColorPressed(new Color(204,204,204));
            
            this.btnLogout.setColorHover(new Color(204,204,204));
            this.btnLogout.setColorNormal(new Color(204,204,204));
            this.btnLogout.setColorPressed(new Color(204,204,204));
            
            this.btnProf.setColorHover(new Color(204,204,204));
            this.btnProf.setColorNormal(new Color(204,204,204));
            this.btnProf.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnConfigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = this.pnlMenu.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -250, 2, 2, pnlMenu);
        }
        else{
            Animacion.Animacion.mover_derecha(-250, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        this.btnInicio.setSelected(true);
        this.btnAdmin.setSelected(false);
        this.btnClientes.setSelected(false);
        this.btnConfig.setSelected(false);
        this.btnProf.setSelected(false);
        this.btnLogout.setSelected(false);
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnConfigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMousePressed
        this.btnInicio.setSelected(false);
        this.btnAdmin.setSelected(false);
        this.btnClientes.setSelected(false);
        this.btnConfig.setSelected(true);
        this.btnProf.setSelected(false);
        this.btnLogout.setSelected(false);
    }//GEN-LAST:event_btnConfigMousePressed

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
        this.btnInicio.setSelected(false);
        this.btnAdmin.setSelected(true);
        this.btnClientes.setSelected(false);
        this.btnConfig.setSelected(false);
        this.btnProf.setSelected(false);
        this.btnLogout.setSelected(false);
    }//GEN-LAST:event_btnAdminMousePressed

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        this.btnInicio.setSelected(false);
        this.btnAdmin.setSelected(false);
        this.btnClientes.setSelected(true);
        this.btnConfig.setSelected(false);
        this.btnProf.setSelected(false);
        this.btnLogout.setSelected(false);
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnProfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfMousePressed
        this.btnInicio.setSelected(false);
        this.btnAdmin.setSelected(false);
        this.btnClientes.setSelected(false);
        this.btnConfig.setSelected(false);
        this.btnProf.setSelected(true);
        this.btnLogout.setSelected(false);
    }//GEN-LAST:event_btnProfMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnAdmin;
    private rsbuttom.RSButtonMetro btnClientes;
    private rsbuttom.RSButtonMetro btnConfig;
    private rsbuttom.RSButtonMetro btnInicio;
    private rsbuttom.RSButtonMetro btnLogout;
    private rsbuttom.RSButtonMetro btnProf;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}