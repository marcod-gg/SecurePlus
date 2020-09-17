/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.control;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import login.modelo.Usuario;

/**
 *
 * @author Marco
 */
public class UsuarioDAO {
    
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    String user;
    String pass;
    String url;
    
    public UsuarioDAO(){
        
        user="SecurePlus";
        pass="123";
        url="jdbc:oracle:thin:@localhost:1521:orcl";
        
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Conectando con la base de datos...");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexión lista");
        } catch (Exception error) {
            error.printStackTrace();
        }
        
    }
    
    public boolean getUsuario(Usuario usuario){
        
        String aux = convertirSHA256(usuario.getPassword());
        
        String sql = "SELECT * FROM USUARIO WHERE USERNAME ='" + usuario.getUsername() + 
                "' AND PASSWORD ='" + aux + "'";
        System.out.println(sql);
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            return rs.next();
        } catch(Exception error){
            error.printStackTrace();
        }
        
        return false;
    }
    
    public String convertirSHA256(String password) {
	MessageDigest md = null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	} 
	catch (NoSuchAlgorithmException e) {		
		e.printStackTrace();
		return null;
	}
	    
	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();
	    
	for(byte b : hash) {        
		sb.append(String.format("%02x", b));
	}
	    
	return sb.toString();
}
    
}
