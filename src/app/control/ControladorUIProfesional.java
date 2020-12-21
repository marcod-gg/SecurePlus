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
public class ControladorUIProfesional implements ActionListener{

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
    
    //Definir variable de Interfaz Menu
    UIProfesional menu;
    
    //Definir e iniciar variable de tabla
    DefaultTableModel dtm1 = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    DefaultTableModel dtm3 = new DefaultTableModel();
    DefaultTableModel dtm4 = new DefaultTableModel();
    DefaultTableModel dtm5 = new DefaultTableModel();
    DefaultTableModel dtm6 = new DefaultTableModel();
    DefaultTableModel dtm7 = new DefaultTableModel();
    DefaultTableModel dtm8 = new DefaultTableModel();
    DefaultTableModel dtm9 = new DefaultTableModel();
    DefaultTableModel dtm10 = new DefaultTableModel();
    DefaultTableModel dtm11 = new DefaultTableModel();
    DefaultTableModel dtm12 = new DefaultTableModel();
    
    //Definir e iniciar controladores
    ControladorTablas control = new ControladorTablas();
    
    
    //Constructor de controlador
    public ControladorUIProfesional(Usuario u, UIProfesional m) {
        this.sign = u;
        this.menu = m;  
        

        // Escuchar acciones de Botones del Menu "Asesorias"
        this.menu.btnAgregarAsesoria.addActionListener(this);
        this.menu.btnAgregarAsesoriaGuardar.addActionListener(this);
        this.menu.btnAgregarAsesoriaLimpiar.addActionListener(this);
        this.menu.btnVerAsesoriaRegistros.addActionListener(this);
        this.menu.btnAgregarAsesoriaRegistro.addActionListener(this);
        this.menu.btnAgregarAsesoriaRegistroGuardar.addActionListener(this);
        this.menu.btnAgregarAsesoriaRegistroLimpiar.addActionListener(this);
        
        // Escuchar acciones de Botones del Menu "Visitas"
        this.menu.btnAgregarVisita.addActionListener(this);
        this.menu.btnAgregarVisitaGuardar.addActionListener(this);
        this.menu.btnAgregarVisitaLimpiar.addActionListener(this);
        this.menu.btnVerVisitaRegistros.addActionListener(this);
        this.menu.btnAgregarVisitaRegistro.addActionListener(this);
        this.menu.btnAgregarVisitaRegistroGuardar.addActionListener(this);
        this.menu.btnAgregarVisitaRegistroLimpiar.addActionListener(this);
        
        // Escuchar acciones de Botones del Menu "Capacitaciones"
        this.menu.btnAgregarCapacitacion.addActionListener(this);
        this.menu.btnAgregarCapacitacionGuardar.addActionListener(this);
        this.menu.btnAgregarCapacitacionLimpiar.addActionListener(this);
        this.menu.btnVerCapacitacionRegistros.addActionListener(this);
        this.menu.btnAgregarCapacitacionRegistro.addActionListener(this);
        this.menu.btnAgregarCapacitacionRegistroGuardar.addActionListener(this);
        this.menu.btnAgregarCapacitacionRegistroLimpiar.addActionListener(this);

        // Escuchar acciones de Botones del Menu "Mejoras"
        this.menu.btnAgregarMejora.addActionListener(this);
        this.menu.btnAgregarMejoraGuardar.addActionListener(this);
        this.menu.btnAgregarMejoraLimpiar.addActionListener(this);
        this.menu.btnVerMejoraRegistros.addActionListener(this);
        this.menu.btnAgregarMejoraRegistro.addActionListener(this);
        this.menu.btnAgregarMejoraRegistroGuardar.addActionListener(this);
        this.menu.btnAgregarMejoraRegistroLimpiar.addActionListener(this);

//        // Escuchar acciones de Botones del Menu "Checklists"
//        this.menu.btnAgregarChecklist.addActionListener(this);
//        this.menu.btnAgregarChecklistGuardar.addActionListener(this);
//        this.menu.btnAgregarChecklistLimpiar.addActionListener(this);
//        this.menu.btnVerChecklistRegistros.addActionListener(this);
//        this.menu.btnAgregarChecklistRegistro.addActionListener(this);
//        this.menu.btnAgregarChecklistRegistroGuardar.addActionListener(this);
//        this.menu.btnAgregarChecklistRegistroLimpiar.addActionListener(this);

        
                
        // Escuchar acciones del Menu "Mi Perfil"
        this.menu.btnMiPerfilActualizar.addActionListener(this);
        
        // Escuchar acciones de Botones del Menu "Perfil"
        this.menu.btnMiPerfil.addActionListener(this);
        this.menu.btnCerrarSesion.addActionListener(this);
        this.menu.btnSalir.addActionListener(this);
        
        // Escuchar acciones de los menus
        this.menu.btnCapacitaciones.addActionListener(this);
        this.menu.btnVisitas.addActionListener(this);
        
        menu.btnUser.setText(sign.getNombres());
        cargarcbxEmpresa();
        menu.setLocationRelativeTo(menu);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        // Accionar boton "Capacitaciones"
        if (ae.getSource()==menu.btnCapacitaciones) {
            listarCapacitaciones(menu.tblCapacitaciones);
            menu.lblCapacitacionRegistroID.setText("-1");
        }
        
        // Accionar boton "Visitas"
        if (ae.getSource()==menu.btnVisitas) {
            listarVisitas(menu.tblVisitas);
            menu.lblVisitaRegistroID.setText("-1");
        }
        
        // Accionar boton "Asesorias"
        if (ae.getSource()==menu.btnAsesorias) {
            listarAsesorias(menu.tblAsesorias);
            menu.lblAsesoriaRegistroID.setText("-1");
        }
        
        // Accionar boton "Mejoras"
        if (ae.getSource()==menu.btnMejoras) {
            listarMejoras(menu.tblMejoras);
            menu.lblMejoraRegistroID.setText("-1");
        }
        
//        // Accionar boton "Checklists"
//        if (ae.getSource()==menu.btnChecklists) {
//            listarChecklists(menu.tblChecklists);
//            menu.lblChecklistRegistroID.setText("-1");
//        }

        // ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA
        // ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA
        // ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA
        
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

        // CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION
        // CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION
        // CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION
        
        /// Accionar boton "Reportar Nuevo Capacitacion"
        if (ae.getSource()==menu.btnAgregarCapacitacion) {
            limpiaPanelAgregarCapacitacion();
            menu.pnlVerCapacitaciones.setVisible(false);
            menu.pnlAgregarCapacitaciones.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar cliente"
        if(ae.getSource()==menu.btnAgregarCapacitacionGuardar){
            agregarCapacitacion();
            listarCapacitaciones(menu.tblCapacitaciones);
            limpiaPanelAgregarCapacitacion();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarCapacitacionLimpiar) {
            limpiaPanelAgregarCapacitacion();
        }
        
        // Accionar boton "Ver registros" del menu "Ver Capacitacions"
        if (ae.getSource()==menu.btnVerCapacitacionRegistros) {
            int fila = menu.tblCapacitaciones.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblCapacitaciones.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                listarCapacitacionRegistros(menu.tblCapacitacionRegistros, bigdecimal);
                
                //Se identifica un auxiliar para guardar id
                menu.lblCapacitacionRegistroID.setText("" + bigdecimal);
                
            }
        }
        
        // Accionar boton "Guardar" del menú "Agregar registro de capacitacion"
        if(ae.getSource()==menu.btnAgregarCapacitacionRegistroGuardar){
            agregarCapacitacionRegistro();
            limpiaPanelAgregarCapacitacionRegistro();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar registro de capacitacion"
        if (ae.getSource()==menu.btnAgregarCapacitacionRegistroLimpiar) {
            limpiaPanelAgregarCapacitacionRegistro();
        }
        
        // Accionar boton "Agregar registro" del menu "Capacitacions"
        if (ae.getSource()==menu.btnAgregarCapacitacionRegistro) {
            int fila = menu.tblCapacitaciones.getSelectedRow();
            int aux = Integer.parseInt(menu.lblCapacitacionRegistroID.getText());
            if(fila==-1){
                if (aux==-1) {
                    JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila o cargar un registro");
                }else{
                    
                    limpiaPanelAgregarCapacitacionRegistro();
                    menu.pnlVerCapacitaciones.setVisible(false);
                    menu.pnlAgregarCapacitacionesRegistro.setVisible(true);
                }
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblCapacitaciones.getValueAt(fila, 0));
                menu.lblCapacitacionRegistroID.setText(""+bigdecimal);
                
                menu.pnlVerCapacitaciones.setVisible(false);
                menu.pnlAgregarCapacitacionesRegistro.setVisible(true);
                
            }
        }

        // VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA
        // VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA
        // VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA
        
        /// Accionar boton "Reportar Nuevo Visita"
        if (ae.getSource()==menu.btnAgregarVisita) {
            limpiaPanelAgregarVisita();
            menu.pnlVerVisitas.setVisible(false);
            menu.pnlAgregarVisita.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar cliente"
        if(ae.getSource()==menu.btnAgregarVisitaGuardar){
            agregarVisita();
            listarVisitas(menu.tblVisitas);
            limpiaPanelAgregarVisita();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarVisitaLimpiar) {
            limpiaPanelAgregarVisita();
        }
        
        // Accionar boton "Ver registros" del menu "Ver Visitas"
        if (ae.getSource()==menu.btnVerVisitaRegistros) {
            int fila = menu.tblVisitas.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblVisitas.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                listarVisitaRegistros(menu.tblVisitasRegistro, bigdecimal);
                
                //Se identifica un auxiliar para guardar id
                menu.lblVisitaRegistroID.setText("" + bigdecimal);
                
            }
        }
        
        // Accionar boton "Guardar" del menú "Agregar registro de visita"
        if(ae.getSource()==menu.btnAgregarVisitaRegistroGuardar){
            agregarVisitaRegistro();
            limpiaPanelAgregarVisitaRegistro();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar registro de visita"
        if (ae.getSource()==menu.btnAgregarVisitaRegistroLimpiar) {
            limpiaPanelAgregarVisitaRegistro();
        }
        
        // Accionar boton "Agregar registro" del menu "Visitas"
        if (ae.getSource()==menu.btnAgregarVisitaRegistro) {
            int fila = menu.tblVisitas.getSelectedRow();
            int aux = Integer.parseInt(menu.lblVisitaRegistroID.getText());
            if(fila==-1){
                if (aux==-1) {
                    JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila o cargar un registro");
                }else{
                    
                    limpiaPanelAgregarVisitaRegistro();
                    menu.pnlVerVisitas.setVisible(false);
                    menu.pnlAgregarVisitaRegistro.setVisible(true);
                }
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblVisitas.getValueAt(fila, 0));
                menu.lblVisitaRegistroID.setText(""+bigdecimal);
                
                menu.pnlVerVisitas.setVisible(false);
                menu.pnlAgregarVisitaRegistro.setVisible(true);
                
            }
        }

        // MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA
        // MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA
        // MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA
        
        /// Accionar boton "Reportar Nuevo Mejora"
        if (ae.getSource()==menu.btnAgregarMejora) {
            limpiaPanelAgregarMejora();
            menu.pnlVerMejoras.setVisible(false);
            menu.pnlAgregarMejora.setVisible(true);
        }
        
        // Accionar boton "Guardar" del menú "Agregar cliente"
        if(ae.getSource()==menu.btnAgregarMejoraGuardar){
            agregarMejora();
            listarMejoras(menu.tblMejoras);
            limpiaPanelAgregarMejora();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar cliente"
        if (ae.getSource()==menu.btnAgregarMejoraLimpiar) {
            limpiaPanelAgregarMejora();
        }
        
        // Accionar boton "Ver registros" del menu "Ver Mejoras"
        if (ae.getSource()==menu.btnVerMejoraRegistros) {
            int fila = menu.tblMejoras.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblMejoras.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                listarMejoraRegistros(menu.tblMejorasRegistro, bigdecimal);
                
                //Se identifica un auxiliar para guardar id
                menu.lblMejoraRegistroID.setText("" + bigdecimal);
                
            }
        }
        
        // Accionar boton "Guardar" del menú "Agregar registro de mejora"
        if(ae.getSource()==menu.btnAgregarMejoraRegistroGuardar){
            agregarMejoraRegistro();
            limpiaPanelAgregarMejoraRegistro();
        }
        
        // Accionar boton "Limpiar" del menú "Agregar registro de mejora"
        if (ae.getSource()==menu.btnAgregarMejoraRegistroLimpiar) {
            limpiaPanelAgregarMejoraRegistro();
        }
        
        // Accionar boton "Agregar registro" del menu "Mejoras"
        if (ae.getSource()==menu.btnAgregarMejoraRegistro) {
            int fila = menu.tblMejoras.getSelectedRow();
            int aux = Integer.parseInt(menu.lblMejoraRegistroID.getText());
            if(fila==-1){
                if (aux==-1) {
                    JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila o cargar un registro");
                }else{
                    
                    limpiaPanelAgregarMejoraRegistro();
                    menu.pnlVerMejoras.setVisible(false);
                    menu.pnlAgregarMejoraRegistro.setVisible(true);
                }
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblMejoras.getValueAt(fila, 0));
                menu.lblMejoraRegistroID.setText(""+bigdecimal);
                
                menu.pnlVerMejoras.setVisible(false);
                menu.pnlAgregarMejoraRegistro.setVisible(true);
                
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
                menu = new UIProfesional();
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
    
    // ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA
    // ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA
    // ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA - ASESORIA
        
    private void listarAsesorias(JTable t) {
        
        limpiarTablaAsesorias();
        
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
            int idprofesionalusuario = (sign.getId().intValue());
            int idprofesionalinstancia = (instancia.getUsuario().getId().intValue());
            
            if (idtipo == 1 && idprofesionalusuario==idprofesionalinstancia) {
                object[0]=instancia.getId().intValue();
                object[1]=instancia.getTema();
                object[2]=instancia.getFechadesde();
                object[3]=instancia.getFechahasta();
                object[4]=instancia.getDireccion();
                estadoinstancia = control.readEstadoInstancia(instancia.getEstadoinstancia().getId());
                object[5]= (estadoinstancia.getNombre());
                empresa = control.readEmpresa(instancia.getEmpresa().getId());
                object[6]= (empresa.getRazonsocial());
                
                dtm1.addRow(object);
            }            
        }
        // Se asignan los valores rescatados a la tabla en vista.
        menu.tblAsesorias.setModel(dtm1);
    }

    private void listarAsesoriaRegistros(JTable t, BigDecimal bdaux) {
        limpiarTablaRegistroAsesorias();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Registro> iter = control.readAllRegistro();
        
        //Se asigna modelo a DTM
        dtm7=(DefaultTableModel)t.getModel();
        
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
                dtm7.addRow(object);
            }            
        }
        menu.tblAsesoriaRegistros.setModel(dtm7);
    }

    private void limpiarTablaAsesorias() {
        menu.lblAsesoriaRegistroID.setText("-1");
        for (int i = 0; i < menu.tblAsesorias.getRowCount(); i++) {
            dtm1.removeRow(i);
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
        
        String item = menu.cbxAgregarAsesoriaEmpresa.getSelectedItem().toString();
        int aux = item.indexOf(" - ");
        int idaux = Integer.parseInt(item.substring(0, aux));
        
        BigDecimal idemp = BigDecimal.valueOf(idaux);
        BigDecimal idestadoinstancia = BigDecimal.valueOf(1);
        BigDecimal idtipoinstancia = BigDecimal.valueOf(1);
        BigDecimal idprof = new BigDecimal(sign.getId().intValue());
        
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
    cargarcbxEmpresa();
    }
    
    // PANEL AGREGAR ASESORIA REGISTRO
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
            dtm7.removeRow(i);
            i=i-1;
        }
    }

    
    
    // CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION
    // CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION
    // CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION - CAPACITACION
        
    private void listarCapacitaciones(JTable t) {
        
        limpiarTablaCapacitaciones();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Instancia> iter = control.readAllInstancia();
        
        //Se asigna modelo a DTM
        dtm2=(DefaultTableModel)t.getModel();
        
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            instancia = (Instancia) iter.next();
            int idtipo = (instancia.getTipoinstancia().getId().intValue());
            int idprofesionalusuario = (sign.getId().intValue());
            int idprofesionalinstancia = (instancia.getUsuario().getId().intValue());
            
            if (idtipo == 2 && idprofesionalusuario==idprofesionalinstancia) {
                object[0]=instancia.getId().intValue();
                object[1]=instancia.getTema();
                object[2]=instancia.getFechadesde();
                object[3]=instancia.getFechahasta();
                object[4]=instancia.getDireccion();
                estadoinstancia = control.readEstadoInstancia(instancia.getEstadoinstancia().getId());
                object[5]= (estadoinstancia.getNombre());
                empresa = control.readEmpresa(instancia.getEmpresa().getId());
                object[6]= (empresa.getRazonsocial());
                
                dtm2.addRow(object);
            }            
        }
        // Se asignan los valores rescatados a la tabla en vista.
        menu.tblCapacitaciones.setModel(dtm2);
    }

    private void listarCapacitacionRegistros(JTable t, BigDecimal bdaux) {
        limpiarTablaRegistroCapacitaciones();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Registro> iter = control.readAllRegistro();
        
        //Se asigna modelo a DTM
        dtm8=(DefaultTableModel)t.getModel();
        
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
                dtm8.addRow(object);
            }            
        }
        menu.tblCapacitacionRegistros.setModel(dtm8);
    }

    private void limpiarTablaCapacitaciones() {
        menu.lblCapacitacionRegistroID.setText("-1");
        for (int i = 0; i < menu.tblCapacitaciones.getRowCount(); i++) {
            dtm2.removeRow(i);
            i=i-1;
        }
    }

    // AGREGAR CAPACITACION
    private void agregarCapacitacion() {
        
        //Se rescatan valores de vista
        String tema = menu.txtAgregarCapacitacionTema.getText();
        String direccion = menu.txtAgregarCapacitacionDireccion.getText();
        String desde = dateFormat.format(menu.dateAgregarCapacitacionDesde.getDate());
        String hasta = dateFormat.format(menu.dateAgregarCapacitacionHasta.getDate());
        String descripcion = menu.txtAgregarCapacitacionDescripcion.getText();
        
        String item = menu.cbxAgregarCapacitacionEmpresa.getSelectedItem().toString();
        int aux = item.indexOf(" - ");
        int idaux = Integer.parseInt(item.substring(0, aux));
        
        BigDecimal idemp = BigDecimal.valueOf(idaux);
        BigDecimal idestadoinstancia = BigDecimal.valueOf(1);
        BigDecimal idtipoinstancia = BigDecimal.valueOf(2);
        BigDecimal idprof = new BigDecimal(sign.getId().intValue());
        
        empresa = control.readEmpresa(idemp);
        estadoinstancia = control.readEstadoInstancia(idestadoinstancia);
        tipoinstancia = control.readTipoinstancia(idtipoinstancia);
        usuario = control.readUsuario(idprof);
        
        BigDecimal id = new BigDecimal("1");
        
        Instancia nInstancia = new Instancia(id, empresa, estadoinstancia, tipoinstancia, usuario, desde, hasta, tema, descripcion, direccion);
        control.createInstancia(nInstancia);
    }
    
    // LIMPIAR PANEL AGREGAR CAPACITACION
    private void limpiaPanelAgregarCapacitacion() {

    Date now = new Date();
    menu.txtAgregarCapacitacionTema.setText("");
    menu.txtAgregarCapacitacionDireccion.setText("");
    menu.dateAgregarCapacitacionDesde.setDate(now);
    menu.dateAgregarCapacitacionHasta.setDate(now);
    menu.txtAgregarCapacitacionDescripcion.setText("");
    cargarcbxEmpresa();
    }
    
    // PANEL AGREGAR CAPACITACION REGISTRO
    private void agregarCapacitacionRegistro() {
        bigdecimal = new BigDecimal(menu.lblCapacitacionRegistroID.getText());
        instancia = control.readInstancia(bigdecimal);
        String rut = menu.txtAgregarCapacitacionRegistroRut.getText();
        String nombre = menu.txtAgregarCapacitacionRegistroNombre.getText();
        String cargo = menu.txtAgregarCapacitacionRegistroCargo.getText();
        BigDecimal presente = new BigDecimal("0");
        if (menu.chbAgregarCapacitacionRegistroPresente.isSelected()) {
            presente = new BigDecimal("1");
        }
        registro = new Registro(bigdecimal, instancia, rut, nombre, cargo, presente);
        
        control.createRegistro(registro);
    }
    
    private void limpiaPanelAgregarCapacitacionRegistro(){
        menu.txtAgregarCapacitacionRegistroRut.setText("");
        menu.txtAgregarCapacitacionRegistroNombre.setText("");
        menu.txtAgregarCapacitacionRegistroCargo.setText("");
        menu.chbAgregarCapacitacionRegistroPresente.setSelected(true);
    }
    
    private void limpiarTablaRegistroCapacitaciones() {
        for (int i = 0; i < menu.tblCapacitacionRegistros.getRowCount(); i++) {
            dtm8.removeRow(i);
            i=i-1;
        }
    }

    
    // VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA
    // VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA
    // VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA - VISITA
    
    private void listarVisitas(JTable t) {
        
        limpiarTablaVisitas();
        
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
            int idprofesionalusuario = (sign.getId().intValue());
            int idprofesionalinstancia = (instancia.getUsuario().getId().intValue());
            
            if (idtipo == 4 && idprofesionalusuario==idprofesionalinstancia) {
                object[0]=instancia.getId().intValue();
                object[1]=instancia.getTema();
                object[2]=instancia.getFechadesde();
                object[3]=instancia.getFechahasta();
                object[4]=instancia.getDireccion();
                estadoinstancia = control.readEstadoInstancia(instancia.getEstadoinstancia().getId());
                object[5]= (estadoinstancia.getNombre());
                empresa = control.readEmpresa(instancia.getEmpresa().getId());
                object[6]= (empresa.getRazonsocial());
                
                dtm3.addRow(object);
            }            
        }
        // Se asignan los valores rescatados a la tabla en vista.
        menu.tblVisitas.setModel(dtm3);
    }

    private void listarVisitaRegistros(JTable t, BigDecimal bdaux) {
        limpiarTablaRegistroVisitas();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Registro> iter = control.readAllRegistro();
        
        //Se asigna modelo a DTM
        dtm9=(DefaultTableModel)t.getModel();
        
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
                dtm9.addRow(object);
            }            
        }
        menu.tblVisitasRegistro.setModel(dtm9);
    }

    private void limpiarTablaVisitas() {
        menu.lblVisitaRegistroID.setText("-1");
        for (int i = 0; i < menu.tblVisitas.getRowCount(); i++) {
            dtm3.removeRow(i);
            i=i-1;
        }
    }

    // AGREGAR VISITA
    private void agregarVisita() {
        
        //Se rescatan valores de vista
        String tema = menu.txtAgregarVisitaTema.getText();
        String direccion = menu.txtAgregarVisitaDireccion.getText();
        String desde = dateFormat.format(menu.dateAgregarVisitaDesde.getDate());
        String hasta = dateFormat.format(menu.dateAgregarVisitaHasta.getDate());
        String descripcion = menu.txtAgregarVisitaDescripcion.getText();
        
        String item = menu.cbxAgregarVisitaEmpresa.getSelectedItem().toString();
        int aux = item.indexOf(" - ");
        int idaux = Integer.parseInt(item.substring(0, aux));
        
        BigDecimal idemp = BigDecimal.valueOf(idaux);
        BigDecimal idestadoinstancia = BigDecimal.valueOf(1);
        BigDecimal idtipoinstancia = BigDecimal.valueOf(4);
        BigDecimal idprof = new BigDecimal(sign.getId().intValue());
        
        empresa = control.readEmpresa(idemp);
        estadoinstancia = control.readEstadoInstancia(idestadoinstancia);
        tipoinstancia = control.readTipoinstancia(idtipoinstancia);
        usuario = control.readUsuario(idprof);
        
        BigDecimal id = new BigDecimal("1");
        
        Instancia nInstancia = new Instancia(id, empresa, estadoinstancia, tipoinstancia, usuario, desde, hasta, tema, descripcion, direccion);
        control.createInstancia(nInstancia);
    }
    
    // LIMPIAR PANEL AGREGAR VISITA
    private void limpiaPanelAgregarVisita() {

    Date now = new Date();
    menu.txtAgregarVisitaTema.setText("");
    menu.txtAgregarVisitaDireccion.setText("");
    menu.dateAgregarVisitaDesde.setDate(now);
    menu.dateAgregarVisitaHasta.setDate(now);
    menu.txtAgregarVisitaDescripcion.setText("");
    cargarcbxEmpresa();
    }
    
    // PANEL AGREGAR VISITA REGISTRO
    private void agregarVisitaRegistro() {
        bigdecimal = new BigDecimal(menu.lblVisitaRegistroID.getText());
        instancia = control.readInstancia(bigdecimal);
        String rut = menu.txtAgregarVisitaRegistroRut.getText();
        String nombre = menu.txtAgregarVisitaRegistroNombre.getText();
        String cargo = menu.txtAgregarVisitaRegistroCargo.getText();
        BigDecimal presente = new BigDecimal("0");
        if (menu.chbAgregarVisitaRegistroPresente.isSelected()) {
            presente = new BigDecimal("1");
        }
        registro = new Registro(bigdecimal, instancia, rut, nombre, cargo, presente);
        
        control.createRegistro(registro);
    }
    
    private void limpiaPanelAgregarVisitaRegistro(){
        menu.txtAgregarVisitaRegistroRut.setText("");
        menu.txtAgregarVisitaRegistroNombre.setText("");
        menu.txtAgregarVisitaRegistroCargo.setText("");
        menu.chbAgregarVisitaRegistroPresente.setSelected(true);
    }
    
    private void limpiarTablaRegistroVisitas() {
        for (int i = 0; i < menu.tblVisitasRegistro.getRowCount(); i++) {
            dtm9.removeRow(i);
            i=i-1;
        }
    }

    
    // MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA
    // MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA
    // MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA - MEJORA
    
    private void listarMejoras(JTable t) {
        
        limpiarTablaMejoras();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Instancia> iter = control.readAllInstancia();
        
        //Se asigna modelo a DTM
        dtm4=(DefaultTableModel)t.getModel();
        
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        // Se realiza filtro para cargar solo clientes
        while(iter.hasNext()){
            instancia = (Instancia) iter.next();
            int idtipo = (instancia.getTipoinstancia().getId().intValue());
            int idprofesionalusuario = (sign.getId().intValue());
            int idprofesionalinstancia = (instancia.getUsuario().getId().intValue());
            
            if (idtipo == 5 && idprofesionalusuario==idprofesionalinstancia) {
                object[0]=instancia.getId().intValue();
                object[1]=instancia.getTema();
                object[2]=instancia.getFechadesde();
                object[3]=instancia.getFechahasta();
                object[4]=instancia.getDireccion();
                estadoinstancia = control.readEstadoInstancia(instancia.getEstadoinstancia().getId());
                object[5]= (estadoinstancia.getNombre());
                empresa = control.readEmpresa(instancia.getEmpresa().getId());
                object[6]= (empresa.getRazonsocial());
                
                dtm4.addRow(object);
            }            
        }
        // Se asignan los valores rescatados a la tabla en vista.
        menu.tblMejoras.setModel(dtm4);
    }

    private void listarMejoraRegistros(JTable t, BigDecimal bdaux) {
        limpiarTablaRegistroMejoras();
        
        //Se consultan datos y se reservan en una lista.
        Iterator<Registro> iter = control.readAllRegistro();
        
        //Se asigna modelo a DTM
        dtm10=(DefaultTableModel)t.getModel();
        
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
                dtm10.addRow(object);
            }            
        }
        menu.tblMejorasRegistro.setModel(dtm10);
    }

    private void limpiarTablaMejoras() {
        menu.lblMejoraRegistroID.setText("-1");
        for (int i = 0; i < menu.tblMejoras.getRowCount(); i++) {
            dtm4.removeRow(i);
            i=i-1;
        }
    }

    // AGREGAR MEJORA
    private void agregarMejora() {
        
        //Se rescatan valores de vista
        String tema = menu.txtAgregarMejoraTema.getText();
        String direccion = menu.txtAgregarMejoraDireccion.getText();
        String desde = dateFormat.format(menu.dateAgregarMejoraDesde.getDate());
        String hasta = dateFormat.format(menu.dateAgregarMejoraHasta.getDate());
        String descripcion = menu.txtAgregarMejoraDescripcion.getText();
        
        String item = menu.cbxAgregarMejoraEmpresa.getSelectedItem().toString();
        int aux = item.indexOf(" - ");
        int idaux = Integer.parseInt(item.substring(0, aux));
        
        BigDecimal idemp = BigDecimal.valueOf(idaux);
        BigDecimal idestadoinstancia = BigDecimal.valueOf(1);
        BigDecimal idtipoinstancia = BigDecimal.valueOf(5);
        BigDecimal idprof = new BigDecimal(sign.getId().intValue());
        
        empresa = control.readEmpresa(idemp);
        estadoinstancia = control.readEstadoInstancia(idestadoinstancia);
        tipoinstancia = control.readTipoinstancia(idtipoinstancia);
        usuario = control.readUsuario(idprof);
        
        BigDecimal id = new BigDecimal("1");
        
        Instancia nInstancia = new Instancia(id, empresa, estadoinstancia, tipoinstancia, usuario, desde, hasta, tema, descripcion, direccion);
        control.createInstancia(nInstancia);
    }
    
    // LIMPIAR PANEL AGREGAR MEJORA
    private void limpiaPanelAgregarMejora() {

    Date now = new Date();
    menu.txtAgregarMejoraTema.setText("");
    menu.txtAgregarMejoraDireccion.setText("");
    menu.dateAgregarMejoraDesde.setDate(now);
    menu.dateAgregarMejoraHasta.setDate(now);
    menu.txtAgregarMejoraDescripcion.setText("");
    cargarcbxEmpresa();
    }
    
    // PANEL AGREGAR MEJORA REGISTRO
    private void agregarMejoraRegistro() {
        bigdecimal = new BigDecimal(menu.lblMejoraRegistroID.getText());
        instancia = control.readInstancia(bigdecimal);
        String rut = menu.txtAgregarMejoraRegistroRut.getText();
        String nombre = menu.txtAgregarMejoraRegistroNombre.getText();
        String cargo = menu.txtAgregarMejoraRegistroCargo.getText();
        BigDecimal presente = new BigDecimal("0");
        if (menu.chbAgregarMejoraRegistroPresente.isSelected()) {
            presente = new BigDecimal("1");
        }
        registro = new Registro(bigdecimal, instancia, rut, nombre, cargo, presente);
        
        control.createRegistro(registro);
    }
    
    private void limpiaPanelAgregarMejoraRegistro(){
        menu.txtAgregarMejoraRegistroRut.setText("");
        menu.txtAgregarMejoraRegistroNombre.setText("");
        menu.txtAgregarMejoraRegistroCargo.setText("");
        menu.chbAgregarMejoraRegistroPresente.setSelected(true);
    }
    
    private void limpiarTablaRegistroMejoras() {
        for (int i = 0; i < menu.tblMejorasRegistro.getRowCount(); i++) {
            dtm10.removeRow(i);
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
    private void cargarcbxEmpresa() {
        
        menu.cbxAgregarAsesoriaEmpresa.removeAllItems();
        menu.cbxAgregarCapacitacionEmpresa.removeAllItems();
        menu.cbxAgregarMejoraEmpresa.removeAllItems();
        menu.cbxAgregarVisitaEmpresa.removeAllItems();
        
        DefaultComboBoxModel dcbm1 = new DefaultComboBoxModel();
        

        //Se consultan datos y se reservan en una lista.
        Iterator<Empresa> iter = control.readAllEmpresa();
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[4];
        
        
        
        while (iter.hasNext()) {
            empresa = (Empresa) iter.next();
            
            object[0] = empresa.getId().intValue();
            int idaux = empresa.getId().intValue();
            object[1] = empresa.getRazonsocial();


            String aux = (object[1] + "");

            menu.cbxAgregarAsesoriaEmpresa.addItem(idaux + " - " + aux);
            menu.cbxAgregarCapacitacionEmpresa.addItem(idaux + " - " + aux);
            menu.cbxAgregarMejoraEmpresa.addItem(idaux + " - " + aux);
            menu.cbxAgregarVisitaEmpresa.addItem(idaux + " - " + aux);


        }   
    }
}
