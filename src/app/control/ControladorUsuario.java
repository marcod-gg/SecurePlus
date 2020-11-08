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
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Marco
 */
public class ControladorUsuario implements ActionListener{

    Usuario sign;
    Usuario usuario;
    Empresa empresa;
    Rol rol;
    Estado estado;
    
    BigDecimal bigdecimal;
    
    UIMenu1 menu = new UIMenu1();
    
    
    DefaultTableModel dtm = new DefaultTableModel();
    
    ControladorEmpresa cemp = new ControladorEmpresa();
    ControladorRol crol = new ControladorRol();
    ControladorEstado cest = new ControladorEstado();
    
    public ControladorUsuario(Usuario u, UIMenu1 m) {
        this.sign = u;
        this.menu = m;
        this.menu.btnListarUsuarios.addActionListener(this);
        this.menu.btnGuardarUsuario.addActionListener(this);
        this.menu.btnEditarUsuario.addActionListener(this);
        this.menu.btnUserActualizar.addActionListener(this);
        this.menu.btnEliminarUsuario.addActionListener(this);
                
        menu.btnUser.setText(sign.getNombres());
        
        menu.setLocationRelativeTo(menu);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //Accionar boton "Listar"
        if(ae.getSource()==menu.btnListarUsuarios){
            limpiarTabla();
            listarUsuarios(menu.tblUsuario);
        }
        
        //Accionar boton "Guardar" dentro del menú Agregar        
        if(ae.getSource()==menu.btnGuardarUsuario){
            agregarUsuario();
            limpiarTabla();
            listarUsuarios(menu.tblUsuario);
            menu.pAgregarUsuario.setVisible(false);
            menu.pAdminUsers.setVisible(true);
        }
        
        //Accionar boton "Editar"
        if(ae.getSource()==menu.btnEditarUsuario){
            int fila = menu.tblUsuario.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(menu, "Debe seleccionar una fila");
                
            }else{
                //Rescatar ID desde fila seleccionada en tabla, además de "parsearla" en BigDecimal
                bigdecimal = new BigDecimal(""+menu.tblUsuario.getValueAt(fila, 0));
                
                //Se entrega BigDecimal a funcion de cargaDatos
                cargaDatosComboBox(bigdecimal);
                
                //Se cambian paneles de edición
                menu.pEditarUsuario.setVisible(true);
                menu.pAdminUsers.setVisible(false);
                
            }
        }
        
        //Accionar boton "Actualizar" en menú editar
        if(ae.getSource()==menu.btnUserActualizar){
            actualizarUsuario();
            limpiarTabla();
            listarUsuarios(menu.tblUsuario);
            menu.pEditarUsuario.setVisible(false);
            menu.pAdminUsers.setVisible(true);
        }
        
    }
    
    
    //CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD
    //CREATE
    public void agregarUsuario(){
        
        //Se rescatan valores de vista
        String user = menu.txtUserUser.getText();
        String name = menu.txtUserName.getText();
        String apat = menu.txtUserAPat.getText();
        String amat = menu.txtUserAMat.getText();
        String rut = menu.txtUserRut.getText();
        String mail = menu.txtUserMail.getText();
        BigDecimal idrol = BigDecimal.valueOf(menu.cbxUserRol.getSelectedIndex());
        BigDecimal idest = BigDecimal.valueOf(menu.cbxUserEstado.getSelectedIndex());
        BigDecimal idemp = BigDecimal.valueOf(menu.cbxUserEmpresa.getSelectedIndex());
        
        //Se utilizan controladores para rescatar valores
        empresa = cemp.buscaEmpresa(idemp);
        estado = cest.buscaEstado(idest);
        rol = crol.buscaRol(idrol);
        
        //Se utilizan condiciones previas para crear usuario
        //Por ahora se usará el RUT como contraseña.
        String pass = passToSHA256(rut);
        BigDecimal id = new BigDecimal("1");
        
        //Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, pass, name, apat, amat, rut, mail);
        
        //Se utiliza Hibernate para agregar usuario
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(usuario);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
    }
    
    //READ
    public Usuario buscarUsuario(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        usuario =(Usuario)session.get(Usuario.class, ID);
        tx.commit();
        session.close();
        return usuario;
    }
    
    //READ ALL
    public void listarUsuarios(JTable t){
        
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
        dtm=(DefaultTableModel)t.getModel();
        
        //Se crea conjunto de objetos que recibirá los valores
        Object[]object = new Object[10];
        
        //Se consultan valores y se asignan al DTM
        while(iter.hasNext()){
            usuario = (Usuario) iter.next();
            object[0]=usuario.getId();
            object[1]=usuario.getUsername();
            object[2]=usuario.getNombres();
            object[3]=usuario.getApaterno();
            object[4]=usuario.getAmaterno();
            object[5]=usuario.getRut();
            object[6]=usuario.getCorreo();
            rol = crol.buscaRol(usuario.getRol().getId());            
            object[7]= rol.getNombre();
            estado = cest.buscaEstado(usuario.getEstado().getId());            
            object[8]= estado.getNombre();
            empresa = cemp.buscaEmpresa(usuario.getEmpresa().getId());            
            object[9]= empresa.getRazonsocial();
            dtm.addRow(object);
        }
        
        //Se asignan los valores rescatados a la tabla en vista.
        menu.tblUsuario.setModel(dtm);
    }
    
    //UPDATE
    private void actualizarUsuario() {
        
        bigdecimal = new BigDecimal(menu.lblEditID.getText());
        BigDecimal id = bigdecimal;
        String user = menu.txtUserUser1.getText();
        String password = menu.txtUserPass1.getText();
        String name = menu.txtUserName1.getText();
        String apat = menu.txtUserAPat1.getText();
        String amat = menu.txtUserAMat1.getText();
        String rut = menu.txtUserRut1.getText();
        String mail = menu.txtUserMail1.getText();
        bigdecimal = new BigDecimal(""+menu.cbxUserRol1.getSelectedIndex());
        BigDecimal idrol = bigdecimal;
        bigdecimal = new BigDecimal(""+menu.cbxUserEstado1.getSelectedIndex());
        BigDecimal idest = bigdecimal;
        bigdecimal = new BigDecimal(""+menu.cbxUserEmpresa1.getSelectedIndex());
        BigDecimal idemp = bigdecimal;
        
        //Se utilizan controladores para rescatar valores
        empresa = cemp.buscaEmpresa(idemp);
        estado = cest.buscaEstado(idest);
        rol = crol.buscaRol(idrol);
        
        String pass;
        
        //Filtro contraseña vacia
        if(password.isEmpty()){
            usuario = buscarUsuario(id);
            pass = passToSHA256(usuario.getPassword());
        }else{
            pass = passToSHA256(password);
        }
        
        //Se utiliza constructor de Usuario sin ID, ya que es autoincremental
        usuario = new Usuario(id ,empresa, estado, rol, user, pass, name, apat, amat, rut, mail);
        
        //HIBERNATE - Actualizar
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(usuario);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
    }
    
    //CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD - CRUD
    
    //Limpiar tabla con lista de usuarios.
    public void limpiarTabla(){
        for (int i = 0; i < menu.tblUsuario.getRowCount(); i++) {
            dtm.removeRow(i);
            i=i-1;
            
        }
    }
    
    //Función utilizada para encriptación de contraseña.
    public String passToSHA256(String password) {
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

    //Funcion que permite llenar el combobox de "editar"
    private void cargaDatosComboBox(BigDecimal id) {

        //Se usa función buscarUsuario() para obtener datos a editar
        usuario = buscarUsuario(id);
        
        //Llenar formulario de edición
        menu.lblEditID.setText(""+id);
        menu.txtUserUser1.setText(usuario.getUsername());
        menu.txtUserName1.setText(usuario.getNombres());
        menu.txtUserPass1.setText("");
        menu.txtUserAPat1.setText(usuario.getApaterno());
        menu.txtUserAMat1.setText(usuario.getAmaterno());
        menu.txtUserRut1.setText(usuario.getRut());
        menu.txtUserMail1.setText(usuario.getCorreo());
        menu.cbxUserRol1.setSelectedIndex(usuario.getRol().getId().intValueExact());
        menu.cbxUserEstado1.setSelectedIndex(usuario.getEstado().getId().intValueExact());
        menu.cbxUserEmpresa1.setSelectedIndex(usuario.getEmpresa().getId().intValueExact());
    }
}
