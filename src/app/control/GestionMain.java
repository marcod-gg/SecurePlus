/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import app.vista.*;
/**
 *
 * @author Marco
 */
public class GestionMain {
    
    UIIniciarSesion login;
    Controlador control;
    
    
    public GestionMain(){
        //iniciar UI de Login
        login = new UIIniciarSesion();
        
        //Se carga controlador principal
        control  = new Controlador(login);
        
        //hacer visible el login
        login.setVisible(true);
        login.setLocationRelativeTo(login);
    }
    
    public static void main(String[] args) {
        
        new GestionMain();
        
    }
    
}
