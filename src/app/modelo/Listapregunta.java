package app.modelo;
// Generated 12-12-2020 19:24:53 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Listapregunta generated by hbm2java
 */
public class Listapregunta  implements java.io.Serializable {


     private BigDecimal id;
     private Checklist checklist;
     private Pregunta pregunta;

    public Listapregunta() {
    }

    public Listapregunta(BigDecimal id, Checklist checklist, Pregunta pregunta) {
       this.id = id;
       this.checklist = checklist;
       this.pregunta = pregunta;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Checklist getChecklist() {
        return this.checklist;
    }
    
    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }
    public Pregunta getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }




}


