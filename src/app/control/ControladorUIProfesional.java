/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

import app.vista.*;
import app.modelo.*;
import java.math.BigDecimal;

/**
 *
 * @author Marco
 */
public class ControladorUIProfesional implements ActionListener{

    //Definir variables a utilizar
    Usuario sign, usuario;
    Empresa empresa;
    Rol rol;
    Estado estado;
    BigDecimal bigdecimal;
    
    //Definir variable de Interfaz Menu
    UIProfesional menu;
    
    //Definir e iniciar variable de tabla
    DefaultTableModel dtm = new DefaultTableModel();
    
    //Definir e iniciar controladores
    ControladorTablas control = new ControladorTablas();
    
    
    //Constructor de controlador
    public ControladorUIProfesional(Usuario u, UIProfesional m) {
        this.sign = u;
        this.menu = m;  

        this.menu.btnSalir.addActionListener(this);
        this.menu.btnUsuarios.addActionListener(this);
                
        menu.btnUser.setText(sign.getNombres());
        menu.setLocationRelativeTo(menu);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
