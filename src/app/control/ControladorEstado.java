/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import java.math.BigDecimal;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import app.vista.*;
import app.modelo.*;
/**
 *
 * @author Marco
 */
public class ControladorEstado {
    
    public Estado buscaEstado(BigDecimal ID){
        Estado est;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        est=(Estado)session.get(Estado.class, ID);
        tx.commit();
        session.close();
        return est;
    }
}
