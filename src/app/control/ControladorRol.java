/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import app.modelo.*;
/**
 *
 * @author Marco
 */
public class ControladorRol {
    
    public Rol buscaRol(BigDecimal ID){
        Rol rol;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        rol=(Rol)session.get(Rol.class, ID);
        tx.commit();
        session.close();
        return rol;
    }
}
