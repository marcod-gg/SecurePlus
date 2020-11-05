package app.modelo;
// Generated 04-11-2020 20:26:53 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Estadoinstancia generated by hbm2java
 */
public class Estadoinstancia  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private Set instancias = new HashSet(0);

    public Estadoinstancia() {
    }

	
    public Estadoinstancia(BigDecimal id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Estadoinstancia(BigDecimal id, String nombre, Set instancias) {
       this.id = id;
       this.nombre = nombre;
       this.instancias = instancias;
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
    public Set getInstancias() {
        return this.instancias;
    }
    
    public void setInstancias(Set instancias) {
        this.instancias = instancias;
    }




}


