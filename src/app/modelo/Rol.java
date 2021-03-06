package app.modelo;
// Generated 12-12-2020 19:24:53 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private Set usuarios = new HashSet(0);
     private Set rolOperacions = new HashSet(0);

    public Rol() {
    }

	
    public Rol(BigDecimal id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Rol(BigDecimal id, String nombre, Set usuarios, Set rolOperacions) {
       this.id = id;
       this.nombre = nombre;
       this.usuarios = usuarios;
       this.rolOperacions = rolOperacions;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Set getRolOperacions() {
        return this.rolOperacions;
    }
    
    public void setRolOperacions(Set rolOperacions) {
        this.rolOperacions = rolOperacions;
    }




}


