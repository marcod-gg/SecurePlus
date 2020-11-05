package app.modelo;
// Generated 04-11-2020 20:26:53 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Modulo generated by hbm2java
 */
public class Modulo  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private Set operacions = new HashSet(0);

    public Modulo() {
    }

	
    public Modulo(BigDecimal id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Modulo(BigDecimal id, String nombre, Set operacions) {
       this.id = id;
       this.nombre = nombre;
       this.operacions = operacions;
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
    public Set getOperacions() {
        return this.operacions;
    }
    
    public void setOperacions(Set operacions) {
        this.operacions = operacions;
    }




}


