/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Marco
 */
public class Conexion {
    
    String user;
    String pass;
    String url;
    
    Connection conn;
    Statement stm;
    
    public Conexion(){
        user="SecurePlus";
        pass="123";
        url="jdbc:oracle:thin:@localhost:1521:orcl";
        conn = null;
        stm = null;
    }
    
    public void Conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión realizada");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Conexión no realizada");
        }
    }
    

    
    
}
