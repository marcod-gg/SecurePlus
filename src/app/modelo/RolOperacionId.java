package app.modelo;
// Generated 12-12-2020 19:24:53 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * RolOperacionId generated by hbm2java
 */
public class RolOperacionId  implements java.io.Serializable {


     private BigDecimal id;
     private BigDecimal idRol;

    public RolOperacionId() {
    }

    public RolOperacionId(BigDecimal id, BigDecimal idRol) {
       this.id = id;
       this.idRol = idRol;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public BigDecimal getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(BigDecimal idRol) {
        this.idRol = idRol;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RolOperacionId) ) return false;
		 RolOperacionId castOther = ( RolOperacionId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getIdRol()==castOther.getIdRol()) || ( this.getIdRol()!=null && castOther.getIdRol()!=null && this.getIdRol().equals(castOther.getIdRol()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getIdRol() == null ? 0 : this.getIdRol().hashCode() );
         return result;
   }   


}


