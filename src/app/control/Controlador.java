/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import app.modelo.Usuario;
import app.vista.UIAdmin;
import app.vista.UIIniciarSesion;
import app.vista.UIMenu1;
import app.vista.UIProfesional;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
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
public class Controlador  implements ActionListener{
    Usuario usuario;
    String user;
    String pass;
    
    
    UIIniciarSesion login;
    
    public Controlador(UIIniciarSesion log) {
        
        //Rescatar UI de Login
        this.login=log;
        this.login.btnIniciarSesion.addActionListener(this);
    }

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
    
    
    //LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN
    
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
        
        if (usuario!=null) {
            if (usuario.getPassword().equals(password)) {
                
                
                int i = usuario.getRol().getId().intValue();
                System.out.println(i);
                
                UIMenu1 menu = new UIMenu1();
                
                
//              En este punto se obtiene el tipo de rol, y se inicia el menú correspondiente.
                switch (i) {
                case 1:
                    UIAdmin uiadmin = new UIAdmin();
                    ControladorAdmin cadmin = new ControladorAdmin(usuario, uiadmin);
                    uiadmin.setVisible(true);
                    uiadmin.setLocationRelativeTo(uiadmin);
                    System.out.println("admin");
                    break;
                case 2:
                    UIProfesional uiprof = new UIProfesional();
                    ControladorProfesional cusuario = new ControladorProfesional(usuario, uiprof);
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(menu);
                    System.out.println("prof");
                    break;
                case 3:
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(menu);
                    System.out.println("cliente");
                    break;
                }
                return true;
                
            }else{
                JOptionPane.showMessageDialog(login, "Usuario/contraseña incorrecta");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(login, "Usuario/contraseña incorrecta");
            return false;
        }
    }
    
    //LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN
    
    
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
}
