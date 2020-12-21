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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import app.vista.*;
import app.modelo.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marco
 */
public class ControladorUICliente implements ActionListener{
    
    //Definir variables a utilizar
    Usuario sign, usuario;
    Instancia instancia;
    Empresa empresa;
    Estado estado;
    Rol rol;
    Estadoinstancia estadoinstancia;
    Tipoinstancia tipoinstancia;
    Registro registro;
    BigDecimal bigdecimal;
    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm"); 
    
    //Definir Variables de Interfaz Menu
    UICliente menu;
    
    //Definir e iniciar variable de tabla
    DefaultTableModel dtm1 = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    DefaultTableModel dtm3 = new DefaultTableModel();
    DefaultTableModel dtm4 = new DefaultTableModel();
    
    //Definir e iniciar controladores de conexión a tablas
    ControladorTablas control = new ControladorTablas();
    
    //Inicia constructor de clase
    public ControladorUICliente(Usuario u, UICliente m){
        this.sign = u;
        this.menu = m; 
        
        // Escuchar acciones de Botones del Menu "Accidentes"
        this.menu.btnAgregarAccidente.addActionListener(this);
        this.menu.btnAgregarAccidenteGuardar.addActionListener(this);
        this.menu.btnAgregarAccidenteLimpiar.addActionListener(this);
        this.menu.btnVerAccidenteRegistros.addActionListener(this);
        this.menu.btnAgregarAccidenteRegistro.addActionListener(this);
        this.menu.btnAgregarAccidenteRegistroGuardar.addActionListener(this);
        this.menu.btnAgregarAccidenteRegistroLimpiar.addActionListener(this);
        
        // Escuchar acciones de Botones del Menu "Asesorias"
        this.menu.btnAgregarAsesoria.addActionListener(this);
        this.menu.btnAgregarAsesoriaGuardar.addActionListener(this);
        this.menu.btnAgregarAsesoriaLimpiar.addActionListener(this);
        this.menu.btnVerAsesoriaRegistros.addActionListener(this);
        this.menu.btnAgregarAsesoriaRegistro.addActionListener(this);
        this.menu.btnAgregarAsesoriaRegistroGuardar.addActionListener(this);
        this.menu.btnAgregarAsesoriaRegistroLimpiar.addActionListener(this);
        
        
        
        // Escuchar acciones del Menu "Mi Perfil"
        this.menu.btnMiPerfilActualizar.addActionListener(this);
        
        // Escuchar acciones de Botones del Menu "Perfil"
        this.menu.btnMiPerfil.addActionListener(this);
        this.menu.btnCerrarSesion.addActionListener(this);
        this.menu.btnSalir.addActionListener(this);
        
        // Escuchar acciones de los menus
        this.menu.btnAccidentes.addActionListener(this);
        this.menu.btnAsesorias.addActionListener(this);
        
        menu.btnUser.setText(sign.getNombres());
        cargarcbxProfesional();
        menu.setLocationRelativeTo(menu);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        // Accionar boton "Accidentes"
        if (ae.getSource()==menu.btnAccidentes) {
            listarAccidentes(menu.tblAccidentes);
            menu.lblAccidenteRegistroID.setText("-1");
        }
        
        // Accionar boton "Asesorias"
        if (ae.getSource()==menu.btnAsesorias) {
            listarAsesorias(menu.tblAsesorias);
            menu.lblAsesoriaRegistroID.setText("-1");
        }
        
        // ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE
        // ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE
        // ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE - ACCIDENTE

        // Accionar boton "Reportar Nuevo Accidente"
        if (ae.getSource()==menu.btnAgregarAccidente) {
            limpiaPanelAgregarAccidente();
            menu.pnlVerAccidentes.setVisible(false);
            menu.pnlAgregarAccidente.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar cliente"
        if(ae.getSource()==menu.btnAgregarAccidenteGuardar){
            agregarAccidente();
            listarAccidentes(menu.tblAccidentes);
            limpiaPanelAgregarAccidente();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarAccidenteLimpiar) {
            limpiaPanelAgregarAccidente();
        }
        
        // Accionar boton "Ver registros" del menu "Ver Accidentes"
        if (ae.getSource()==menu.btnVerAccidenteRegistros) {
            int fila = menu.tblAccidentes.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblAccidentes.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                listarAccidenteRegistros(menu.tblAccidentesRegistro, bigdecimal);
                
                //Se identifica un auxiliar para guardar id
                menu.lblAccidenteRegistroID.setText("" + bigdecimal);
                
            }
        }
        
        // Accionar boton "Guardar" del menú "Agregar registro de accidente"
        if(ae.getSource()==menu.btnAgregarAccidenteRegistroGuardar){
            agregarAccidenteRegistro();
            limpiaPanelAgregarAccidenteRegistro();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar registro de accidente"
        if (ae.getSource()==menu.btnAgregarAccidenteRegistroLimpiar) {
            limpiaPanelAgregarAccidenteRegistro();
        }
        
        // Accionar boton "Agregar registro" del menu "Accidentes"
        if (ae.getSource()==menu.btnAgregarAccidenteRegistro) {
            int fila = menu.tblAccidentes.getSelectedRow();
            int aux = Integer.parseInt(menu.lblAccidenteRegistroID.getText());
            if(fila==-1){
                if (aux==-1) {
                    JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila o cargar un registro");
                }else{
                    
                    limpiaPanelAgregarAccidenteRegistro();
                    menu.pnlVerAccidentes.setVisible(false);
                    menu.pnlAgregarAccidenteRegistro.setVisible(true);
                }
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblAccidentes.getValueAt(fila, 0));
                menu.lblAccidenteRegistroID.setText(""+bigdecimal);
                
                menu.pnlVerAccidentes.setVisible(false);
                menu.pnlAgregarAccidenteRegistro.setVisible(true);
                
            }
        }
        
        // ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL
        // ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL
        // ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL
        
        /// Accionar boton "Reportar Nuevo Asesoria"
        if (ae.getSource()==menu.btnAgregarAsesoria) {
            limpiaPanelAgregarAsesoria();
            menu.pnlVerAsesorias.setVisible(false);
            menu.pnlAgregarAsesorias.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar cliente"
        if(ae.getSource()==menu.btnAgregarAsesoriaGuardar){
            agregarAsesoria();
            listarAsesorias(menu.tblAsesorias);
            limpiaPanelAgregarAsesoria();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarAsesoriaLimpiar) {
            limpiaPanelAgregarAsesoria();
        }
        
        // Accionar boton "Ver registros" del menu "Ver Asesorias"
        if (ae.getSource()==menu.btnVerAsesoriaRegistros) {
            int fila = menu.tblAsesorias.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblAsesorias.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                listarAsesoriaRegistros(menu.tblAsesoriaRegistros, bigdecimal);
                
                //Se identifica un auxiliar para guardar id
                menu.lblAsesoriaRegistroID.setText("" + bigdecimal);
                
            }
        }
        
        // Accionar boton "Guardar" del menú "Agregar registro de asesoria"
        if(ae.getSource()==menu.btnAgregarAsesoriaRegistroGuardar){
            agregarAsesoriaRegistro();
            limpiaPanelAgregarAsesoriaRegistro();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar registro de asesoria"
        if (ae.getSource()==menu.btnAgregarAsesoriaRegistroLimpiar) {
            limpiaPanelAgregarAsesoriaRegistro();
        }
        
        // Accionar boton "Agregar registro" del menu "Asesorias"
        if (ae.getSource()==menu.btnAgregarAsesoriaRegistro) {
            int fila = menu.tblAsesorias.getSelectedRow();
            int aux = Integer.parseInt(menu.lblAsesoriaRegistroID.getText());
            if(fila==-1){
                if (aux==-1) {
                    JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila o cargar un registro");
                }else{
                    
                    limpiaPanelAgregarAsesoriaRegistro();
                    menu.pnlVerAsesorias.setVisible(false);
                    menu.pnlAgregarAsesoriaRegistro.setVisible(true);
                }
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblAsesorias.getValueAt(fila, 0));
                menu.lblAsesoriaRegistroID.setText(""+bigdecimal);
                
                menu.pnlVerAsesorias.setVisible(false);
                menu.pnlAgregarAsesoriaRegistro.setVisible(true);
                
            }
        }

        
        
        // MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL
        // MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL
        // MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL - MENU PERFIL
        
        
        //Accionar boton "Mi perfil"
        if(ae.getSource()==menu.btnMiPerfil){
            cargarPerfil();
        }
        
        // Accionar boton ACTUALIZAR de MI PERFIL
        if (ae.getSource()==menu.btnMiPerfilActualizar) {
            actualizarMiPerfil();
        }
        
        //Accionar boton "Cerrar Sesion "
        if(ae.getSource()==menu.btnCerrarSesion){
            int opcion = JOptionPane.showConfirmDialog(this.menu, "¿Desea cerrar sesión?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION){
                menu.setVisible(false);
                menu = new UICliente();
                //iniciar UI de Login
                UIIniciarSesion login = new UIIniciarSesion();

                //Se carga controlador principal
                ControladorLogin clogin  = new ControladorLogin(login);

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
    
    

    // ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES
    // ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES
    // ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES - ACCIDENTES
    
    private void listarAccidentes(JTable t) {
        
        limpiarTablaAccidentes();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Instancia> iter = control.readAllInstancia();
        
        //Se asigna modelo a DTM
        dtm1=(DefaultTableModel)t.getModel();
        
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            instancia = (Instancia) iter.next();
            int idtipo = (instancia.getTipoinstancia().getId().intValue());
            int idempresausuario = (sign.getEmpresa().getId().intValue());
            int idempresainstancia = (instancia.getEmpresa().getId().intValue());
            
            if (idtipo == 3 && idempresausuario==idempresainstancia) {
                object[0]=instancia.getId().intValue();
                object[1]=instancia.getTema();
                object[2]=instancia.getFechadesde();
                object[3]=instancia.getFechahasta();
                object[4]=instancia.getDireccion();
                estadoinstancia = control.readEstadoInstancia(instancia.getEstadoinstancia().getId());
                object[5]= (estadoinstancia.getNombre());
                usuario = control.readUsuario(instancia.getUsuario().getId());
                object[6]= (usuario.getNombres());
                
                dtm1.addRow(object);
            }            
        }
        
        // Se asignan los valores rescatados a la tabla en vista.
        menu.tblAccidentes.setModel(dtm1);
        
    }

    private void listarAccidenteRegistros(JTable t, BigDecimal bdaux) {
        limpiarTablaRegistroAccidentes();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Registro> iter = control.readAllRegistro();
        
        //Se asigna modelo a DTM
        dtm2=(DefaultTableModel)t.getModel();
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[6];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            registro = (Registro) iter.next();
            int idinstancia = (registro.getInstancia().getId().intValue());
            
            if (idinstancia == bdaux.intValue()) {
                
                object[0]=registro.getId().intValue();
                object[1]=registro.getRut();
                object[2]=registro.getNombre();
                object[3]=registro.getCargo();
                if (registro.getPresente().intValue()==0) {
                    object[4]="NO";
                }else{
                    object[4]="SI";
                }
                dtm2.addRow(object);
            }            
        }
        menu.tblAccidentesRegistro.setModel(dtm2);
    }

    private void limpiarTablaAccidentes() {
        menu.lblAccidenteRegistroID.setText("-1");
        for (int i = 0; i < menu.tblAccidentes.getRowCount(); i++) {
            dtm1.removeRow(i);
            i=i-1;
        }
    }

    // AGREGAR ACCIDENTE
    private void agregarAccidente() {
        
        //Se rescatan valores de vista
        String tema = menu.txtAgregarAccidenteTema.getText();
        String direccion = menu.txtAgregarAccidenteDireccion.getText();
        String desde = dateFormat.format(menu.dateAgregarAccidenteDesde.getDate());
        String hasta = dateFormat.format(menu.dateAgregarAccidenteHasta.getDate());
        String descripcion = menu.txtAgregarAccidenteDescripcion.getText();
        
        String item = menu.cbxAgregarAccidenteProfesional.getSelectedItem().toString();
        int aux = item.indexOf(" - ");
        int idaux = Integer.parseInt(item.substring(0, aux));
        
        BigDecimal idemp = sign.getEmpresa().getId();
        BigDecimal idestadoinstancia = BigDecimal.valueOf(1);
        BigDecimal idtipoinstancia = BigDecimal.valueOf(3);
        BigDecimal idprof = BigDecimal.valueOf(idaux);
        
        empresa = control.readEmpresa(idemp);
        estadoinstancia = control.readEstadoInstancia(idestadoinstancia);
        tipoinstancia = control.readTipoinstancia(idtipoinstancia);
        usuario = control.readUsuario(idprof);
        
        BigDecimal id = new BigDecimal("1");
        
        Instancia nInstancia = new Instancia(id, empresa, estadoinstancia, tipoinstancia, usuario, desde, hasta, tema, descripcion, direccion);
        control.createInstancia(nInstancia);
    }
    
    // LIMPIAR PANEL AGREGAR ACCIDENTE
    private void limpiaPanelAgregarAccidente() {

    Date now = new Date();
    menu.txtAgregarAccidenteTema.setText("");
    menu.txtAgregarAccidenteDireccion.setText("");
    menu.dateAgregarAccidenteDesde.setDate(now);
    menu.dateAgregarAccidenteHasta.setDate(now);
    menu.txtAgregarAccidenteDescripcion.setText("");
    cargarcbxProfesional();
    }
    
    // PANEL AGREGAR ACCIDENTE
    private void agregarAccidenteRegistro() {
        bigdecimal = new BigDecimal(menu.lblAccidenteRegistroID.getText());
        instancia = control.readInstancia(bigdecimal);
        String rut = menu.txtAgregarAccidenteRegistroRut.getText();
        String nombre = menu.txtAgregarAccidenteRegistroNombre.getText();
        String cargo = menu.txtAgregarAccidenteRegistroCargo.getText();
        BigDecimal presente = new BigDecimal("0");
        if (menu.chbAgregarAccidenteRegistroPresente.isSelected()) {
            presente = new BigDecimal("1");
        }
        registro = new Registro(bigdecimal, instancia, rut, nombre, cargo, presente);
        
        control.createRegistro(registro);
    }
    
    private void limpiaPanelAgregarAccidenteRegistro(){
        menu.txtAgregarAccidenteRegistroRut.setText("");
        menu.txtAgregarAccidenteRegistroNombre.setText("");
        menu.txtAgregarAccidenteRegistroCargo.setText("");
        menu.chbAgregarAccidenteRegistroPresente.setSelected(true);
    }
    
    private void limpiarTablaRegistroAccidentes() {
        for (int i = 0; i < menu.tblAccidentesRegistro.getRowCount(); i++) {
            dtm2.removeRow(i);
            i=i-1;
        }
    }



    
    // ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL
    // ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL
    // ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL - ASESORIA ESPECIAL

        
    private void listarAsesorias(JTable t) {
        
        limpiarTablaAsesorias();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Instancia> iter = control.readAllInstancia();
        
        //Se asigna modelo a DTM
        dtm3=(DefaultTableModel)t.getModel();
        
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            instancia = (Instancia) iter.next();
            int idtipo = (instancia.getTipoinstancia().getId().intValue());
            int idempresausuario = (sign.getEmpresa().getId().intValue());
            int idempresainstancia = (instancia.getEmpresa().getId().intValue());
            
            if (idtipo == 6 && idempresausuario==idempresainstancia) {
                object[0]=instancia.getId().intValue();
                object[1]=instancia.getTema();
                object[2]=instancia.getFechadesde();
                object[3]=instancia.getFechahasta();
                object[4]=instancia.getDireccion();
                estadoinstancia = control.readEstadoInstancia(instancia.getEstadoinstancia().getId());
                object[5]= (estadoinstancia.getNombre());
                usuario = control.readUsuario(instancia.getUsuario().getId());
                object[6]= (usuario.getNombres());
                
                dtm3.addRow(object);
            }            
        }
        
        // Se asignan los valores rescatados a la tabla en vista.
        menu.tblAsesorias.setModel(dtm3);
        
    }

    private void listarAsesoriaRegistros(JTable t, BigDecimal bdaux) {
        limpiarTablaRegistroAsesorias();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Registro> iter = control.readAllRegistro();
        
        //Se asigna modelo a DTM
        dtm4=(DefaultTableModel)t.getModel();
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[6];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            registro = (Registro) iter.next();
            int idinstancia = (registro.getInstancia().getId().intValue());
            
            if (idinstancia == bdaux.intValue()) {
                
                object[0]=registro.getId().intValue();
                object[1]=registro.getRut();
                object[2]=registro.getNombre();
                object[3]=registro.getCargo();
                if (registro.getPresente().intValue()==0) {
                    object[4]="NO";
                }else{
                    object[4]="SI";
                }
                dtm4.addRow(object);
            }            
        }
        menu.tblAsesoriaRegistros.setModel(dtm4);
    }

    private void limpiarTablaAsesorias() {
        menu.lblAsesoriaRegistroID.setText("-1");
        for (int i = 0; i < menu.tblAsesorias.getRowCount(); i++) {
            dtm3.removeRow(i);
            i=i-1;
        }
    }

    // AGREGAR ASESORIA
    private void agregarAsesoria() {
        
        //Se rescatan valores de vista
        String tema = menu.txtAgregarAsesoriaTema.getText();
        String direccion = menu.txtAgregarAsesoriaDireccion.getText();
        String desde = dateFormat.format(menu.dateAgregarAsesoriaDesde.getDate());
        String hasta = dateFormat.format(menu.dateAgregarAsesoriaHasta.getDate());
        String descripcion = menu.txtAgregarAsesoriaDescripcion.getText();
        
        String item = menu.cbxAgregarAsesoriaProfesional.getSelectedItem().toString();
        int aux = item.indexOf(" - ");
        int idaux = Integer.parseInt(item.substring(0, aux));
        
        BigDecimal idemp = sign.getEmpresa().getId();
        BigDecimal idestadoinstancia = BigDecimal.valueOf(1);
        BigDecimal idtipoinstancia = BigDecimal.valueOf(6);
        BigDecimal idprof = BigDecimal.valueOf(idaux);
        
        empresa = control.readEmpresa(idemp);
        estadoinstancia = control.readEstadoInstancia(idestadoinstancia);
        tipoinstancia = control.readTipoinstancia(idtipoinstancia);
        usuario = control.readUsuario(idprof);
        
        BigDecimal id = new BigDecimal("1");
        
        Instancia nInstancia = new Instancia(id, empresa, estadoinstancia, tipoinstancia, usuario, desde, hasta, tema, descripcion, direccion);
        control.createInstancia(nInstancia);
    }
    
    // LIMPIAR PANEL AGREGAR ASESORIA
    private void limpiaPanelAgregarAsesoria() {

    Date now = new Date();
    menu.txtAgregarAsesoriaTema.setText("");
    menu.txtAgregarAsesoriaDireccion.setText("");
    menu.dateAgregarAsesoriaDesde.setDate(now);
    menu.dateAgregarAsesoriaHasta.setDate(now);
    menu.txtAgregarAsesoriaDescripcion.setText("");
    cargarcbxProfesional();
    }
    
    // PANEL AGREGAR ASESORIA
    private void agregarAsesoriaRegistro() {
        bigdecimal = new BigDecimal(menu.lblAsesoriaRegistroID.getText());
        instancia = control.readInstancia(bigdecimal);
        String rut = menu.txtAgregarAsesoriaRegistroRut.getText();
        String nombre = menu.txtAgregarAsesoriaRegistroNombre.getText();
        String cargo = menu.txtAgregarAsesoriaRegistroCargo.getText();
        BigDecimal presente = new BigDecimal("0");
        if (menu.chbAgregarAsesoriaRegistroPresente.isSelected()) {
            presente = new BigDecimal("1");
        }
        registro = new Registro(bigdecimal, instancia, rut, nombre, cargo, presente);
        
        control.createRegistro(registro);
    }
    
    private void limpiaPanelAgregarAsesoriaRegistro(){
        menu.txtAgregarAsesoriaRegistroRut.setText("");
        menu.txtAgregarAsesoriaRegistroNombre.setText("");
        menu.txtAgregarAsesoriaRegistroCargo.setText("");
        menu.chbAgregarAsesoriaRegistroPresente.setSelected(true);
    }
    
    private void limpiarTablaRegistroAsesorias() {
        for (int i = 0; i < menu.tblAsesoriaRegistros.getRowCount(); i++) {
            dtm4.removeRow(i);
            i=i-1;
        }
    }

    
    
    // Permite cargar MI PERFIL
    private void cargarPerfil() {
        menu.txtMiPerfilNombres.setText(sign.getNombres());
        menu.txtMiPerfilAPaterno.setText(sign.getApaterno());
        menu.txtMiPerfilAMaterno.setText(sign.getAmaterno());
        menu.txtMiPerfilMail.setText(sign.getCorreo());
        menu.txtMiPerfilRUT.setEditable(false);
        menu.txtMiPerfilRUT.setText(sign.getRut());
        menu.txtMiPerfilNPassword.setText("");
        menu.txtMiPerfilRPassword.setText("");
        menu.txtMiPerfilPassword.setText("");
    }

    private void actualizarMiPerfil() {
        // Validación para comprobar que la contraseña coincide
        if (passToSHA256(menu.txtMiPerfilPassword.getText()).equals(sign.getPassword())) {
            if (menu.txtMiPerfilNPassword.getText().isEmpty()) {
                if (menu.txtMiPerfilRPassword.getText().isEmpty()){
                    bigdecimal = sign.getId();
                    empresa = control.readEmpresa(sign.getEmpresa().getId());
                    estado = control.readEstado(sign.getEstado().getId());
                    rol = control.readRol(sign.getRol().getId());
                    String username = sign.getUsername();
                    String password = sign.getPassword();
                    String nombres = menu.txtMiPerfilNombres.getText();
                    String apaterno = menu.txtMiPerfilAPaterno.getText();
                    String amaterno = menu.txtMiPerfilAMaterno.getText();
                    String rut = sign.getRut();
                    String correo = menu.txtMiPerfilRUT.getText();
                    Usuario aux = new Usuario(bigdecimal, empresa, estado, rol, username, password, nombres, apaterno, amaterno, rut, correo);
                    
                    control.updateUsuario(aux);
                    cargarPerfil();
                    sign = aux;
                    menu.btnUser.setText(sign.getNombres());
                    menu.pnlMiPerfil.setVisible(false);
                    menu.pnlInicio.setVisible(true);
                    
                }else{
                    JOptionPane.showMessageDialog(menu, "Contraseña nueva no coincide");
                }
            }else{
                if (menu.txtMiPerfilRPassword.getText().isEmpty()){
                    JOptionPane.showMessageDialog(menu, "Contraseña nueva no coincide");
                }else{
                    if (menu.txtMiPerfilNPassword.getText().equals(menu.txtMiPerfilRPassword.getText())) {
                        bigdecimal = sign.getId();
                    empresa = control.readEmpresa(sign.getEmpresa().getId());
                    estado = control.readEstado(sign.getEstado().getId());
                    rol = control.readRol(sign.getRol().getId());
                    String username = sign.getUsername();
                    String password = passToSHA256(menu.txtMiPerfilNPassword.getText());
                    String nombres = menu.txtMiPerfilNombres.getText();
                    String apaterno = menu.txtMiPerfilAPaterno.getText();
                    String amaterno = menu.txtMiPerfilAMaterno.getText();
                    String rut = sign.getRut();
                    String correo = menu.txtMiPerfilMail.getText();
                    Usuario aux = new Usuario(bigdecimal, empresa, estado, rol, username, password, nombres, apaterno, amaterno, rut, correo);
                    
                    control.updateUsuario(aux);
                    cargarPerfil();
                    sign = aux;
                    menu.btnUser.setText(sign.getNombres());
                    menu.pnlMiPerfil.setVisible(false);
                    menu.pnlInicio.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(menu, "Contraseña nueva no coincide");
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(menu, "Contraseña incorrecta");
        }
    }
    
    // ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION
    // ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION
    // ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION - ENCRIPTACION
    
    // Función utilizada para encriptación de contraseña.
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

    // Listar los profesionales en los combobox
    private void cargarcbxProfesional() {
        
        
        
        menu.cbxAgregarAccidenteProfesional.removeAllItems();
        menu.cbxAgregarAsesoriaProfesional.removeAllItems();
        
        DefaultComboBoxModel dcbm1 = new DefaultComboBoxModel();
        

        //Se consultan datos y se reservan en una lista.
        Iterator<Usuario> iter = control.readAllUsuario();
        
        
        
        
        while (iter.hasNext()) {
            usuario = (Usuario) iter.next();
            int idrol = (usuario.getRol().getId().intValue());
            if (idrol == 2) {
                int idaux = usuario.getId().intValue();
                String nomaux = usuario.getNombres();
                
                menu.cbxAgregarAccidenteProfesional.addItem(idaux + " - " + nomaux);
                menu.cbxAgregarAsesoriaProfesional.addItem(idaux + " - " + nomaux);
                
            }
        }
        
        
        
    }





}
