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
import java.util.List;
/**
 *
 * @author Marco
 */
public class ControladorEmpresa {
    
    DefaultListModel dlm;
    Empresa emp;
    
    public Empresa buscaEmpresa(BigDecimal ID){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        emp =(Empresa)session.get(Empresa.class, ID);
        tx.commit();
        session.close();
        return emp;
    } 
}
