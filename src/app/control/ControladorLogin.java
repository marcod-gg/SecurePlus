/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import app.modelo.Usuario;
import app.vista.UIAdmin;
import app.vista.UICliente;
import app.vista.UIIniciarSesion;
import app.vista.UIProfesional;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Marco
 */
public class ControladorLogin  implements ActionListener{
    Usuario usuario;
    String user;
    String pass;
    ControladorTablas control;
    
    
    UIIniciarSesion login;
    
    public ControladorLogin(UIIniciarSesion log) {
        
        //Rescatar UI de Login
        this.login=log;
        this.login.btnIniciarSesion.addActionListener(this);
    }

    // Se obtiene la acción a través del boton IniciarSesion
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==login.btnIniciarSesion){
            user = login.txtUser.getText();
            pass = passToSHA256(login.txtPass.getText());
            if (iniciarSesion(user, pass)) {
                login.setVisible(false);
            }
        }
    }
    
    // Función para iniciar sesión
    public boolean iniciarSesion (String username, String password){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria cr =  session.createCriteria(Usuario.class);
        cr.add(Restrictions.eq("username", username));
        usuario = (Usuario) cr.uniqueResult();
        tx.commit();
        session.close();
        
        
        // Validación para comprobar que el usuario existe
        if (usuario!=null) {
            
            // Validación para comprobar que la contraseña coincide
            if (usuario.getPassword().equals(password)) {

                // En este punto se obtiene el tipo de rol, y se inicia el menú correspondiente.
                int i = usuario.getRol().getId().intValue();
                switch (i) {
                case 1:
                    UIAdmin uiadmin = new UIAdmin();
                    ControladorUIAdmin cadmin = new ControladorUIAdmin(usuario, uiadmin);
                    uiadmin.setVisible(true);
                    uiadmin.setLocationRelativeTo(uiadmin);
                    break;
                case 2:
                    UIProfesional uiprof = new UIProfesional();
                    ControladorUIProfesional cusuario = new ControladorUIProfesional(usuario, uiprof);
                    uiprof.setVisible(true);
                    uiprof.setLocationRelativeTo(uiprof);
                    break;
                case 3:
                    UICliente uicliente = new UICliente();
                    ControladorUICliente ccliente = new ControladorUICliente();
                    uicliente.setVisible(true);
                    uicliente.setLocationRelativeTo(uicliente);
                    break;
                }
                return true;
            }else{
                JOptionPane.showMessageDialog(login, "Usuario/contraseña incorrecta 2");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(login, "Usuario/contraseña incorrecta 1");
            return false;
        }
    }
    
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
}
