/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import app.vista.*;
import app.modelo.*;
import java.math.BigDecimal;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Marco
 */
public class ControladorUIAdmin implements ActionListener{

    //Definir variables a utilizar
    Usuario sign, usuario;
    Empresa empresa;
    Rol rol;
    Estado estado;
    BigDecimal bigdecimal;
    
    //Definir variable de Interfaz Menu
    UIAdmin menu;
    
    //Definir e iniciar variable de tabla
    DefaultTableModel dtm1 = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    
    //Definir e iniciar controladores de conexión a tablas
    ControladorTablas control = new ControladorTablas();
    
    
    //Constructor de controlador
    public ControladorUIAdmin(Usuario u, UIAdmin m) {
        this.sign = u;
        this.menu = m;  
        
        this.menu.btnEditarCliente.addActionListener(this);
        this.menu.btnEditarClienteActualizar.addActionListener(this);
        this.menu.btnCambiarEstadoCliente.addActionListener(this);
        this.menu.btnAgregarCliente.addActionListener(this);
        this.menu.btnAgregarClienteGuardar.addActionListener(this);
        this.menu.btnAgregarClienteLimpiar.addActionListener(this);
        
        this.menu.btnEditarProfesional.addActionListener(this);
        this.menu.btnEditarProfesionalActualizar.addActionListener(this);
        this.menu.btnCambiarEstadoProfesional.addActionListener(this);
        this.menu.btnAgregarProfesional.addActionListener(this);
        this.menu.btnAgregarProfesionalGuardar.addActionListener(this);
        this.menu.btnAgregarProfesionalLimpiar.addActionListener(this);
        
        this.menu.btnMiPerfil.addActionListener(this);
        this.menu.btnCerrarSesion.addActionListener(this);
        this.menu.btnSalir.addActionListener(this);
        
        this.menu.btnAdminClientes.addActionListener(this);
        this.menu.btnAdminProf.addActionListener(this);
                
        menu.btnUser.setText(sign.getNombres());
        menu.setLocationRelativeTo(menu);

    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        // Accionar boton "Administrar clientes"
        if (ae.getSource()==menu.btnAdminClientes) {
            listarAdminClientes(menu.tblAdminClientes);
        }
        
        // Accionar boton "Administrar profesionales"
        if (ae.getSource()==menu.btnAdminProf) {
            listarAdminProfesional(menu.tblAdminProfesional);
        }
        
        // ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE
        // ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE
        // ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE - ADMINISTRAR CLIENTE
        
        // Accionar boton "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarCliente) {
            limpiaPanelAgregarCliente();
            menu.pnlVerClientes.setVisible(false);
            menu.pnlAgregarCliente.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar cliente"
        if(ae.getSource()==menu.btnAgregarClienteGuardar){
            agregarCliente();
            listarAdminClientes(menu.tblAdminClientes);
            
        }
        
        // Accionar boton "Limpiar" del menú "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarClienteLimpiar) {
            limpiaPanelAgregarCliente();
        }
        
        // Accionar boton "Editar cliente"
        if (ae.getSource()==menu.btnEditarCliente) {
            limpiaPanelEditarCliente();
            
            int fila = menu.tblAdminClientes.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblAdminClientes.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                cargaPanelEditarCliente(bigdecimal);
                
                //Se cambian ventanas
                menu.pnlVerClientes.setVisible(false);
                menu.pnlEditarCliente.setVisible(true);
                
            }
        }

        //Accionar boton "Actualizar" en menú "Editar cliente"
        if(ae.getSource()==menu.btnEditarClienteActualizar){
            actualizarCliente();
            listarAdminClientes(menu.tblAdminClientes);
            menu.pnlEditarCliente.setVisible(false);
            menu.pnlVerClientes.setVisible(true);
        }

        
        //Accionar boton "Cambiar estado" en menú "Administrar cliente"
        if(ae.getSource()==menu.btnCambiarEstadoCliente){
            int fila = menu.tblAdminClientes.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
            }else{
                bigdecimal = new BigDecimal(""+menu.tblAdminClientes.getValueAt(fila, 0));
                modificarEstadoCliente(bigdecimal);
                listarAdminClientes(menu.tblAdminClientes);
            }
        }
        
        // ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL
        // ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL
        // ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL - ADMINISTRAR PROFESIONAL

        // Accionar boton "Agregar Profesional"
        if (ae.getSource()==menu.btnAgregarProfesional) {
            limpiaPanelAgregarProfesional();
            menu.pnlVerProfesional.setVisible(false);
            menu.pnlAgregarProfesional.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar Profesional"
        if(ae.getSource()==menu.btnAgregarProfesionalGuardar){
            agregarProfesional();
            listarAdminProfesional(menu.tblAdminProfesional);
        }
        
        // Accionar boton "Limpiar" del menú "Agregar Profesional"
        if (ae.getSource()==menu.btnAgregarProfesionalLimpiar) {
            limpiaPanelAgregarProfesional();
        }
        
        // Accionar boton "Editar Profesional"
        if (ae.getSource()==menu.btnEditarProfesional) {
            limpiaPanelEditarProfesional();
            
            int fila = menu.tblAdminProfesional.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblAdminProfesional.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                cargaPanelEditarProfesional(bigdecimal);
                
                //Se cambian ventanas
                menu.pnlVerProfesional.setVisible(false);
                menu.pnlEditarProfesional.setVisible(true);
                
            }
        }

        //Accionar boton "Actualizar" en menú "Editar Profesional"
        if(ae.getSource()==menu.btnEditarProfesionalActualizar){
            actualizarProfesional();
            listarAdminProfesional(menu.tblAdminProfesional);
            menu.pnlEditarProfesional.setVisible(false);
            menu.pnlVerProfesional.setVisible(true);
        }

        
        //Accionar boton "Cambiar estado" en menú "Administrar Profesional"
        if(ae.getSource()==menu.btnCambiarEstadoProfesional){
            int fila = menu.tblAdminProfesional.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
            }else{
                bigdecimal = new BigDecimal(""+menu.tblAdminProfesional.getValueAt(fila, 0));
                modificarEstadoProfesional(bigdecimal);
                listarAdminProfesional(menu.tblAdminProfesional);
            }
        }
        
        
        // MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL
        // MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL
        // MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL
        
        
        //Accionar boton "Mi perfil"
        if(ae.getSource()==menu.btnSalir){
            cargarPerfil();
        }
        
        //Accionar boton "Cerrar Sesion "
        if(ae.getSource()==menu.btnCerrarSesion){
            int opcion = JOptionPane.showConfirmDialog(this.menu, "¿Desea cerrar sesión?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION){
                menu.setVisible(false);
                menu = new UIAdmin();
                //iniciar UI de Login
                UIIniciarSesion login = new UIIniciarSesion();

                //Se carga controlador principal
                ControladorLogin control  = new ControladorLogin(login);

                //hacer visible el login
                login.setVisible(true);
                login.setLocationRelativeTo(login);
            }
        }
        
        //Accionar boton "Salir"
        if(ae.getSource()==menu.btnSalir){
            int opcion = JOptionPane.showConfirmDialog(this.menu, "¿Realmente desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }
    
    
    // FUNCIONES
    // ADMIN CLIENTE
    
    // AGREGAR CLIENTE
    private void agregarCliente(){
        
        //Se rescatan valores de vista
        String user = menu.txtAgregarClienteUsername.getText();
        String name = menu.txtAgregarClienteNombres.getText();
        String apat = menu.txtAgregarClienteAPaterno.getText();
        String amat = menu.txtAgregarClienteAMaterno.getText();
        String rut = menu.txtAgregarClienteRUT.getText();
        String mail = menu.txtAgregarClienteMail.getText();
        
        // Se define valores de otras tablas
        BigDecimal idest = BigDecimal.valueOf(1);
        BigDecimal idrol = BigDecimal.valueOf(3);
        BigDecimal idemp = BigDecimal.valueOf(menu.cbxAgregarClienteEmpresa.getSelectedIndex());
        
        //Se utiliza controlador para rescatar objetos
        empresa = control.readEmpresa(idemp);
        estado = control.readEstado(idest);
        rol = control.readRol(idrol);
        
        //Se utilizan condiciones previas para crear usuario
        //Por ahora se usará el RUT como contraseña.
        String pass = passToSHA256(rut);
        BigDecimal id = new BigDecimal("1");
        
        //Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, pass, name, apat, amat, rut, mail);
        
        //Se utiliza controlador para agregar usuario
        control.createUsuario(usuario);
        
        //Se cambian ventanas
        menu.pnlVerClientes.setVisible(true);
        menu.pnlAgregarCliente.setVisible(false);
    }
    
    // CARGAR DATOS EN TABLA DE ADMIN CLIENTES
    private void listarAdminClientes(JTable t){
        
        limpiarTablaAdminClientes();
        
        //Se consultan datos y se reservan en una lista.
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Usuario");
        List<Usuario>lista = (List<Usuario>) query.list();
        Iterator<Usuario> iter = lista.iterator();
        tx.commit();
        session.close();
        
        //Se define el DTM en base a la tabla ingresada
        dtm1=(DefaultTableModel)t.getModel();
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            usuario = (Usuario) iter.next();
            int idrol = (usuario.getRol().getId().intValue());
            if (idrol == 3) {
                object[0]=usuario.getId();
                object[1]=usuario.getUsername();
                object[2]=usuario.getNombres();
                object[3]=usuario.getApaterno();
                object[4]=usuario.getAmaterno();
                object[5]=usuario.getRut();
                object[6]=usuario.getCorreo();
                estado = control.readEstado(usuario.getEstado().getId());            
                object[7]= estado.getNombre();
                empresa = control.readEmpresa(usuario.getEmpresa().getId());            
                object[8]= empresa.getRazonsocial();
                dtm1.addRow(object);
            }

            
        }
        
        //Se asignan los valores rescatados a la tabla en vista.
        menu.tblAdminClientes.setModel(dtm1);
    }
    
    // RESCATA EL USUARIO Y LO CARGA EN BASE DE DATOS
    private void actualizarCliente() {
        
        // Se rescatan valores del panel
        BigDecimal id = new BigDecimal(menu.lblEditarClienteID.getText());
        String user = menu.txtEditarClienteUsername.getText();
        
        String name = menu.txtEditarClienteNombres.getText();
        String apat = menu.txtEditarClienteAPaterno.getText();
        String amat = menu.txtEditarClienteAMaterno.getText();
        String rut = menu.txtEditarClienteRUT.getText();
        String mail = menu.txtEditarClienteMail.getText();
        BigDecimal idemp = new BigDecimal(""+menu.cbxEditarClienteEmpresa.getSelectedIndex());

        // Se utiliza controlador para buscar usuario
        usuario = control.readUsuario(id);
        
        // Buscar estado y rol
        BigDecimal idest = usuario.getEstado().getId();
        BigDecimal idrol = usuario.getRol().getId();
        
        // Se utiliza controlador para rescatar objetos
        String pass = usuario.getPassword();
        empresa = control.readEmpresa(idemp);
        estado = control.readEstado(idest);
        rol = control.readRol(idrol);
                
        // Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, pass, name, apat, amat, rut, mail);
        
        // Se utiliza controlador para actualizar
        control.updateUsuario(usuario);
    }
    
    //Limpiar tabla con lista de usuarios.
    private void limpiarTablaAdminClientes(){
        for (int i = 0; i < menu.tblAdminClientes.getRowCount(); i++) {
            dtm1.removeRow(i);
            i=i-1;
            
        }
    }
    
    
    //Funcion que permite llenar el combobox de "editar"
    private void cargaPanelEditarCliente(BigDecimal id) {

        //Se usa función buscarUsuario() para obtener datos a editar
        usuario = control.readUsuario(id);
        
        //Llenar formulario de edición
        menu.lblEditarClienteID.setText(""+id);
        menu.txtEditarClienteUsername.setText(usuario.getUsername());
        menu.txtEditarClienteNombres.setText(usuario.getNombres());
        menu.txtEditarClienteAPaterno.setText(usuario.getApaterno());
        menu.txtEditarClienteAMaterno.setText(usuario.getAmaterno());
        menu.txtEditarClienteRUT.setText(usuario.getRut());
        menu.txtEditarClienteMail.setText(usuario.getCorreo());
        int idemp = parcheEmpresa(usuario.getEmpresa().getId().intValue());
        menu.cbxEditarClienteEmpresa.setSelectedIndex(idemp);
    }
    
    // Funcion que permite limpiar combobox de EDITAR CLIENTE
    private void limpiaPanelEditarCliente() {
        menu.txtEditarClienteUsername.setText("");
        menu.txtEditarClienteNombres.setText("");
        menu.txtEditarClienteAPaterno.setText("");
        menu.txtEditarClienteAMaterno.setText("");
        menu.txtEditarClienteRUT.setText("");
        menu.txtEditarClienteMail.setText("");
        menu.cbxEditarClienteEmpresa.setSelectedIndex(0);
    }
    
    // Funcion que permite limpiar combobox de AGREGAR CLIENTE
    private void limpiaPanelAgregarCliente() {
        menu.txtAgregarClienteUsername.setText("");
        menu.txtAgregarClienteNombres.setText("");
        menu.txtAgregarClienteAPaterno.setText("");
        menu.txtAgregarClienteAMaterno.setText("");
        menu.txtAgregarClienteRUT.setText("");
        menu.txtAgregarClienteMail.setText("");
        menu.cbxAgregarClienteEmpresa.setSelectedIndex(0);
    }

    private void modificarEstadoCliente(BigDecimal bigdecimal) {
        
        // Se busca usuario a través del controlador
        usuario = control.readUsuario(bigdecimal);
        
        // Se verifica el estado para cada función
        
        int i = usuario.getEstado().getId().intValue();
        
        if (i == 1) {
            estado = control.readEstado(new BigDecimal(2));
        }else if (i == 2){
            estado = control.readEstado(new BigDecimal(1));
        }
        
        // Se cargan datos
        BigDecimal id = bigdecimal;
        String user = usuario.getUsername();
        String password = usuario.getPassword();
        String name = usuario.getNombres();
        String apat = usuario.getApaterno();
        String amat = usuario.getAmaterno();
        String rut = usuario.getRut();
        String mail = usuario.getCorreo();
        empresa = usuario.getEmpresa();
        rol = usuario.getRol();
        
        // Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, password, name, apat, amat, rut, mail);
        
        // Se utiliza controlador para actualizar
        control.updateUsuario(usuario);
    }
    
    
    // ADMIN PROFESIONAL
    // AGREGAR PROFESIONAL
    private void agregarProfesional(){
        
        //Se rescatan valores de vista
        String user = menu.txtAgregarProfesionalUsername.getText();
        String name = menu.txtAgregarProfesionalNombres.getText();
        String apat = menu.txtAgregarProfesionalAPaterno.getText();
        String amat = menu.txtAgregarProfesionalAMaterno.getText();
        String rut = menu.txtAgregarProfesionalRUT.getText();
        String mail = menu.txtAgregarProfesionalMail.getText();
        
        // Se define valores de otras tablas
        BigDecimal idest = BigDecimal.valueOf(1);
        BigDecimal idrol = BigDecimal.valueOf(2);
        BigDecimal idemp = BigDecimal.valueOf(menu.cbxAgregarProfesionalEmpresa.getSelectedIndex());
        
        //Se utiliza controlador para rescatar objetos
        empresa = control.readEmpresa(idemp);
        estado = control.readEstado(idest);
        rol = control.readRol(idrol);
        
        //Se utilizan condiciones previas para crear usuario
        //Por ahora se usará el RUT como contraseña.
        String pass = passToSHA256(rut);
        BigDecimal id = new BigDecimal("1");
        
        //Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, pass, name, apat, amat, rut, mail);
        
        //Se utiliza controlador para agregar usuario
        control.createUsuario(usuario);
        
        //Se cambian ventanas
        menu.pnlVerProfesional.setVisible(true);
        menu.pnlAgregarProfesional.setVisible(false);
    }
    
    // CARGAR DATOS EN TABLA DE ADMIN PROFESIONAL
    private void listarAdminProfesional(JTable t){
        
        limpiarTablaAdminProfesional();
        
        //Se consultan datos y se reservan en una lista.
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Usuario");
        List<Usuario>lista = (List<Usuario>) query.list();
        Iterator<Usuario> iter = lista.iterator();
        tx.commit();
        session.close();
        
        //Se define el DTM en base a la tabla ingresada
        dtm2=(DefaultTableModel)t.getModel();
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo profesionales
        while(iter.hasNext()){
            usuario = (Usuario) iter.next();
            int idrol = (usuario.getRol().getId().intValue());
            if (idrol == 2) {
                object[0]=usuario.getId();
                object[1]=usuario.getUsername();
                object[2]=usuario.getNombres();
                object[3]=usuario.getApaterno();
                object[4]=usuario.getAmaterno();
                object[5]=usuario.getRut();
                object[6]=usuario.getCorreo();
                estado = control.readEstado(usuario.getEstado().getId());            
                object[7]= estado.getNombre();
                empresa = control.readEmpresa(usuario.getEmpresa().getId());            
                object[8]= empresa.getRazonsocial();
                dtm2.addRow(object);
            }

            
        }
        
        //Se asignan los valores rescatados a la tabla en vista.
        menu.tblAdminProfesional.setModel(dtm2);
    }
    
    // RESCATA EL USUARIO Y LO CARGA EN BASE DE DATOS
    private void actualizarProfesional() {
        
        // Se rescatan valores del panel
        BigDecimal id = new BigDecimal(menu.lblEditarProfesionalID.getText());
        String user = menu.txtEditarProfesionalUsername.getText();
        
        String name = menu.txtEditarProfesionalNombres.getText();
        String apat = menu.txtEditarProfesionalAPaterno.getText();
        String amat = menu.txtEditarProfesionalAMaterno.getText();
        String rut = menu.txtEditarProfesionalRUT.getText();
        String mail = menu.txtEditarProfesionalMail.getText();
        BigDecimal idemp = new BigDecimal(""+menu.cbxEditarProfesionalEmpresa.getSelectedIndex());

        // Se utiliza controlador para buscar usuario
        usuario = control.readUsuario(id);
        
        // Buscar estado y rol
        BigDecimal idest = usuario.getEstado().getId();
        BigDecimal idrol = usuario.getRol().getId();
        
        // Se utiliza controlador para rescatar objetos
        String pass = usuario.getPassword();
        empresa = control.readEmpresa(idemp);
        estado = control.readEstado(idest);
        rol = control.readRol(idrol);
                
        // Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, pass, name, apat, amat, rut, mail);
        
        // Se utiliza controlador para actualizar
        control.updateUsuario(usuario);
    }
    
    //Limpiar tabla con lista de usuarios.
    private void limpiarTablaAdminProfesional(){
        for (int i = 0; i < menu.tblAdminProfesional.getRowCount(); i++) {
            dtm2.removeRow(i);
            i=i-1;
        }
    }

    //Funcion que permite llenar el combobox de "editar Profesional"
    private void cargaPanelEditarProfesional(BigDecimal id) {

        //Se usa función buscarUsuario() para obtener datos a editar
        usuario = control.readUsuario(id);
        
        //Llenar formulario de edición
        menu.lblEditarProfesionalID.setText(""+id);
        menu.txtEditarProfesionalUsername.setText(usuario.getUsername());
        menu.txtEditarProfesionalNombres.setText(usuario.getNombres());
        menu.txtEditarProfesionalAPaterno.setText(usuario.getApaterno());
        menu.txtEditarProfesionalAMaterno.setText(usuario.getAmaterno());
        menu.txtEditarProfesionalRUT.setText(usuario.getRut());
        menu.txtEditarProfesionalMail.setText(usuario.getCorreo());
        
        int idemp = parcheEmpresa(usuario.getEmpresa().getId().intValueExact());
        menu.cbxEditarProfesionalEmpresa.setSelectedIndex(idemp);
    }
    
    // Funcion que permite limpiar combobox de EDITAR PROFESIONAL
    private void limpiaPanelEditarProfesional() {
        menu.txtEditarProfesionalUsername.setText("");
        menu.txtEditarProfesionalNombres.setText("");
        menu.txtEditarProfesionalAPaterno.setText("");
        menu.txtEditarProfesionalAMaterno.setText("");
        menu.txtEditarProfesionalRUT.setText("");
        menu.txtEditarProfesionalMail.setText("");
        menu.cbxEditarProfesionalEmpresa.setSelectedIndex(0);
    }
    
    // Funcion que permite limpiar combobox de AGREGAR PROFESIONAL
    private void limpiaPanelAgregarProfesional() {
        menu.txtAgregarProfesionalUsername.setText("");
        menu.txtAgregarProfesionalNombres.setText("");
        menu.txtAgregarProfesionalAPaterno.setText("");
        menu.txtAgregarProfesionalAMaterno.setText("");
        menu.txtAgregarProfesionalRUT.setText("");
        menu.txtAgregarProfesionalMail.setText("");
        menu.cbxAgregarProfesionalEmpresa.setSelectedIndex(0);
    }

    // Funcion que cambia estado de Activo a suspendido y viceversa
    private void modificarEstadoProfesional(BigDecimal bigdecimal) {
        
        // Se busca usuario a través del controlador
        usuario = control.readUsuario(bigdecimal);
        
        // Se verifica el estado para cada función
        
        int i = usuario.getEstado().getId().intValue();
        
        if (i == 1) {
            estado = control.readEstado(new BigDecimal(2));
        }else if (i == 2){
            estado = control.readEstado(new BigDecimal(1));
        }
        
        // Se cargan datos
        BigDecimal id = bigdecimal;
        String user = usuario.getUsername();
        String password = usuario.getPassword();
        String name = usuario.getNombres();
        String apat = usuario.getApaterno();
        String amat = usuario.getAmaterno();
        String rut = usuario.getRut();
        String mail = usuario.getCorreo();
        empresa = usuario.getEmpresa();
        rol = usuario.getRol();
        
        // Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, password, name, apat, amat, rut, mail);
        
        // Se utiliza controlador para actualizar
        control.updateUsuario(usuario);
    }
    
    // ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION
    //Función utilizada para encriptación de contraseña.
    private String passToSHA256(String password) {
	MessageDigest md = null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	} 
	catch (NoSuchAlgorithmException e) {		
		e.printStackTrace();
		return null;
	}
	    
	byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
	StringBuffer sb = new StringBuffer();
	    
	for(byte b : hash) {        
		sb.append(String.format("%02x", b));
	}
	    
	return sb.toString();
    }

    //debido a unos problemas con BD, se parchea temporalmente
    private int parcheEmpresa(int intValueExact) {
        switch (intValueExact) {
            case 21:
                return 2;
            case 23:
                return 3;
            default:
                return intValueExact;
        }
    }

    //
    private void cargarPerfil() {
        
    }

}
