/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.control;

/**
 *
 * @author Marco
 */
public class GestionMain {
    
    private VUsuarioController vUC;
    
    public GestionMain(){
        vUC = new VUsuarioController();
    }
    
    public static void main(String[] args) {
        
        new GestionMain();
        
    }
    
}
