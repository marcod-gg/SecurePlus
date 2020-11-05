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
    public GestionMain(){
        login = new UIIniciarSesion();
    }
    
    public static void main(String[] args) {
        
        new GestionMain();
        
    }
    
}
