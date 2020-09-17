
package login.control;

import javax.swing.JOptionPane;
import login.modelo.Usuario;
import login.vista.UIIniciarSesion;

/**
 *
 * @author Marco
 */
public class VUsuarioController implements InterfaceValidacion {
    
    private UIIniciarSesion uiIniciarSesion;
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;
    
    public VUsuarioController (){
        
        usuarioDAO = new UsuarioDAO();
        usuario = new Usuario();
        uiIniciarSesion = new UIIniciarSesion(this);
        
    }
    
    @Override
    public void recibeUsuario(String texto){
        if (texto.length() > 1) {
            usuario.setUsername(texto);
        }
    }
    
    @Override
    public void recibeContrasena(String texto){
        if (texto.length() >1) {
            usuario.setPassword(texto);
        }
    }
    
    @Override
    public void accionEntrar(){
        if (usuarioDAO.getUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecto");
        }
    }
    
}
