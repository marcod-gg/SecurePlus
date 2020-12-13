/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.control;

import app.modelo.*;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Marco
 */
public class ControladorTablas {
    
    // Metodo DELETE no se implementa POR INTEGRIDAD RELACIONAL.

    // USUARIO
    // USUARIO-CREATE
    public void createUsuario(Usuario usuario){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(usuario);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Usuario insertado correctamente");
        
    }

    // USUARIO-READ por ID
    public Usuario readUsuario(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Usuario usuario =(Usuario)session.get(Usuario.class, ID);
        tx.commit();
        session.close();
        
        return usuario;
    }
    
    
    // USUARIO-READ_ALL
    public Iterator<Usuario> readAllUsuario(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Usuario");
        List<Usuario>lista = (List<Usuario>) query.list();
        Iterator<Usuario> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // USUARIO-UPDATE
    public void updateUsuario(Usuario usuario) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(usuario);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
    }
    
    
    
    // ESTADO
    // ESTADO-CREATE
    public void createEstado(Estado estado){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(estado);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Estado insertado correctamente");
        
    }
    
    // ESTADO-READ
    public Estado readEstado(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Estado estado =(Estado)session.get(Estado.class, ID);
        tx.commit();
        session.close();
        
        return estado;
    }
    
    // ESTADO-READ_ALL
    public Iterator<Estado> readAllEstado(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Estado");
        List<Estado>lista = (List<Estado>) query.list();
        Iterator<Estado> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // ESTADO-UPDATE
    public void updateEstado(Estado estado) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(estado);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Estado actualizado correctamente");
    }
    
    
    
    // CHECKLIST
    // CHECKLIST-CREATE
    public void createChecklist(Checklist checklist){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(checklist);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Checklist insertado correctamente");
        
    }
    
    // CHECKLIST-READ
    public Checklist readChecklist(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Checklist checklist =(Checklist)session.get(Checklist.class, ID);
        tx.commit();
        session.close();
        
        return checklist;
    }
    
    // CHECKLIST-READ_ALL
    public Iterator<Checklist> readAllChecklist(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Checklist");
        List<Checklist>lista = (List<Checklist>) query.list();
        Iterator<Checklist> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // CHECKLIST-UPDATE
    public void updateChecklist(Checklist checklist) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(checklist);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Checklist actualizado correctamente");
    }
    
    
    
    // CUESTIONARIO
    // CUESTIONARIO-CREATE
    public void createCuestionario(Cuestionario cuestionario){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cuestionario);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Cuestionario insertado correctamente");
        
    }
    
    // CUESTIONARIO-READ
    public Cuestionario readCuestionario(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Cuestionario cuestionario =(Cuestionario)session.get(Cuestionario.class, ID);
        tx.commit();
        session.close();
        
        return cuestionario;
    }
    
    // CUESTIONARIO-READ_ALL
    public Iterator<Cuestionario> readAllCuestionario(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Cuestionario");
        List<Cuestionario>lista = (List<Cuestionario>) query.list();
        Iterator<Cuestionario> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // CUESTIONARIO-UPDATE
    public void updateCuestionario(Cuestionario cuestionario) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(cuestionario);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Cuestionario actualizado correctamente");
    }
    

    
    // EMPRESA
    // EMPRESA-CREATE
    public void createEmpresa(Empresa empresa){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(empresa);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Empresa insertado correctamente");
        
    }
    
    // EMPRESA-READ
    public Empresa readEmpresa(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empresa empresa =(Empresa)session.get(Empresa.class, ID);
        tx.commit();
        session.close();
        
        return empresa;
    }
    
    // EMPRESA-READ_ALL
    public Iterator<Empresa> readAllEmpresa(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Empresa");
        List<Empresa>lista = (List<Empresa>) query.list();
        Iterator<Empresa> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // EMPRESA-UPDATE
    public void updateEmpresa(Empresa empresa) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(empresa);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Empresa actualizado correctamente");
    }
    
    

    // ESTADOINSTANCIA
    // ESTADOINSTANCIA-CREATE
    public void createEstadoInstancia(Estadoinstancia estadoInstancia){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(estadoInstancia);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "EstadoInstancia insertado correctamente");
        
    }
    
    // ESTADOINSTANCIA-READ
    public Estadoinstancia readEstadoInstancia(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Estadoinstancia estadoInstancia =(Estadoinstancia)session.get(Estadoinstancia.class, ID);
        tx.commit();
        session.close();
        
        return estadoInstancia;
    }
    
    // ESTADOINSTANCIA-READ_ALL
    public Iterator<Estadoinstancia> readAllEstadoInstancia(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from EstadoInstancia");
        List<Estadoinstancia>lista = (List<Estadoinstancia>) query.list();
        Iterator<Estadoinstancia> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // ESTADOINSTANCIA-UPDATE
    public void updateEstadoInstancia(Estadoinstancia estadoInstancia) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(estadoInstancia);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "EstadoInstancia actualizado correctamente");
    }
    

    
    // ESTADOPAGO
    // ESTADOPAGO-CREATE
    public void createEstadopago(Estadopago estadopago){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(estadopago);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Estadopago insertado correctamente");
        
    }
    
    // ESTADOPAGO-READ
    public Estadopago readEstadopago(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Estadopago estadopago =(Estadopago)session.get(Estadopago.class, ID);
        tx.commit();
        session.close();
        
        return estadopago;
    }
    
    // ESTADOPAGO-READ_ALL
    public Iterator<Estadopago> readAllEstadopago(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Estadopago");
        List<Estadopago>lista = (List<Estadopago>) query.list();
        Iterator<Estadopago> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // ESTADOPAGO-UPDATE
    public void updateEstadopago(Estadopago estadopago) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(estadopago);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Estadopago actualizado correctamente");
    }

    
    
    // INSTANCIA
    // INSTANCIA-CREATE
    public void createInstancia(Instancia instancia){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(instancia);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Instancia insertado correctamente");
        
    }
    
    // INSTANCIA-READ
    public Instancia readInstancia(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Instancia instancia =(Instancia)session.get(Instancia.class, ID);
        tx.commit();
        session.close();
        
        return instancia;
    }
    
    // INSTANCIA-READ_ALL
    public Iterator<Instancia> readAllInstancia(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Instancia");
        List<Instancia>lista = (List<Instancia>) query.list();
        Iterator<Instancia> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // INSTANCIA-UPDATE
    public void updateInstancia(Instancia instancia) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(instancia);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Instancia actualizado correctamente");
    }

    
    
    // LISTAPREGUNTA
    // LISTAPREGUNTA-CREATE
    public void createListapregunta(Listapregunta listapregunta){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(listapregunta);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Listapregunta insertado correctamente");
        
    }
    
    // LISTAPREGUNTA-READ
    public Listapregunta readListapregunta(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Listapregunta listapregunta =(Listapregunta)session.get(Listapregunta.class, ID);
        tx.commit();
        session.close();
        
        return listapregunta;
    }
    
    // LISTAPREGUNTA-READ_ALL
    public Iterator<Listapregunta> readAllListapregunta(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Listapregunta");
        List<Listapregunta>lista = (List<Listapregunta>) query.list();
        Iterator<Listapregunta> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // LISTAPREGUNTA-UPDATE
    public void updateListapregunta(Listapregunta listapregunta) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(listapregunta);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Listapregunta actualizado correctamente");
    }
    
    

    // MODULO
    // MODULO-CREATE
    public void createModulo(Modulo modulo){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(modulo);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Modulo insertado correctamente");
        
    }
    
    // MODULO-READ
    public Modulo readModulo(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Modulo modulo =(Modulo)session.get(Modulo.class, ID);
        tx.commit();
        session.close();
        
        return modulo;
    }
    
    // MODULO-READ_ALL
    public Iterator<Modulo> readAllModulo(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Modulo");
        List<Modulo>lista = (List<Modulo>) query.list();
        Iterator<Modulo> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // MODULO-UPDATE
    public void updateModulo(Modulo modulo) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(modulo);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Modulo actualizado correctamente");
    }
    
    

    // OPCION
    // OPCION-CREATE
    public void createOpcion(Opcion opcion){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(opcion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Opcion insertado correctamente");
        
    }
    
    // OPCION-READ
    public Opcion readOpcion(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Opcion opcion =(Opcion)session.get(Opcion.class, ID);
        tx.commit();
        session.close();
        
        return opcion;
    }
    
    // OPCION-READ_ALL
    public Iterator<Opcion> readAllOpcion(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Opcion");
        List<Opcion>lista = (List<Opcion>) query.list();
        Iterator<Opcion> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // OPCION-UPDATE
    public void updateOpcion(Opcion opcion) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(opcion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Opcion actualizado correctamente");
    }
    

    
    // OPERACION
    // OPERACION-CREATE
    public void createOperacion(Operacion operacion){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(operacion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Operacion insertado correctamente");
        
    }
    
    // OPERACION-READ
    public Operacion readOperacion(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Operacion operacion =(Operacion)session.get(Operacion.class, ID);
        tx.commit();
        session.close();
        
        return operacion;
    }
    
    // OPERACION-READ_ALL
    public Iterator<Operacion> readAllOperacion(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Operacion");
        List<Operacion>lista = (List<Operacion>) query.list();
        Iterator<Operacion> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // OPERACION-UPDATE
    public void updateOperacion(Operacion operacion) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(operacion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Operacion actualizado correctamente");
    }
    

    
    //PAGO
    // PAGO-CREATE
    public void createPago(Pago pago){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(pago);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Pago insertado correctamente");
        
    }
    
    // PAGO-READ
    public Pago readPago(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Pago pago =(Pago)session.get(Pago.class, ID);
        tx.commit();
        session.close();
        
        return pago;
    }
    
    // PAGO-READ_ALL
    public Iterator<Pago> readAllPago(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Pago");
        List<Pago>lista = (List<Pago>) query.list();
        Iterator<Pago> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // PAGO-UPDATE
    public void updatePago(Pago pago) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(pago);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Pago actualizado correctamente");
    }

    
    
    // PREGUNTA
    // PREGUNTA-CREATE
    public void createPregunta(Pregunta pregunta){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(pregunta);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Pregunta insertado correctamente");
        
    }
    
    // PREGUNTA-READ
    public Pregunta readPregunta(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Pregunta pregunta =(Pregunta)session.get(Pregunta.class, ID);
        tx.commit();
        session.close();
        
        return pregunta;
    }
    
    // PREGUNTA-READ_ALL
    public Iterator<Pregunta> readAllPregunta(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Pregunta");
        List<Pregunta>lista = (List<Pregunta>) query.list();
        Iterator<Pregunta> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // PREGUNTA-UPDATE
    public void updatePregunta(Pregunta pregunta) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(pregunta);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Pregunta actualizado correctamente");
    }

    
    
    // REGISTRO
    // REGISTRO-CREATE
    public void createRegistro(Registro registro){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(registro);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
        
    }
    
    // REGISTRO-READ
    public Registro readRegistro(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Registro registro =(Registro)session.get(Registro.class, ID);
        tx.commit();
        session.close();
        
        return registro;
    }
    
    // REGISTRO-READ_ALL
    public Iterator<Registro> readAllRegistro(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Registro");
        List<Registro>lista = (List<Registro>) query.list();
        Iterator<Registro> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // REGISTRO-UPDATE
    public void updateRegistro(Registro registro) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(registro);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
    }

    
    
    // RESPUESTA
    // RESPUESTA-CREATE
    public void createRespuesta(Respuesta respuesta){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(respuesta);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Respuesta insertado correctamente");
        
    }
    
    // RESPUESTA-READ
    public Respuesta readRespuesta(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Respuesta respuesta =(Respuesta)session.get(Respuesta.class, ID);
        tx.commit();
        session.close();
        
        return respuesta;
    }
    
    // RESPUESTA-READ_ALL
    public Iterator<Respuesta> readAllRespuesta(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Respuesta");
        List<Respuesta>lista = (List<Respuesta>) query.list();
        Iterator<Respuesta> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // RESPUESTA-UPDATE
    public void updateRespuesta(Respuesta respuesta) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(respuesta);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Respuesta actualizado correctamente");
    }

    
    
    //ROL
    // ROL-CREATE
    public void createRol(Rol rol){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(rol);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Rol insertado correctamente");
        
    }
    
    // ROL-READ
    public Rol readRol(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Rol rol =(Rol)session.get(Rol.class, ID);
        tx.commit();
        session.close();
        
        return rol;
    }
    
    // ROL-READ_ALL
    public Iterator<Rol> readAllRol(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Rol");
        List<Rol>lista = (List<Rol>) query.list();
        Iterator<Rol> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // ROL-UPDATE
    public void updateRol(Rol rol) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(rol);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Rol actualizado correctamente");
    }
    

    
    // ROL_OPERACION
    // ROL_OPERACION-CREATE
    public void createRolOperacion(RolOperacion rolOperacion){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(rolOperacion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "RolOperacion insertado correctamente");
        
    }
    
    // ROL_OPERACION-READ
    public RolOperacion readRolOperacion(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        RolOperacion rolOperacion =(RolOperacion)session.get(RolOperacion.class, ID);
        tx.commit();
        session.close();
        
        return rolOperacion;
    }
    
    // ROL_OPERACION-READ_ALL
    public Iterator<RolOperacion> readAllRolOperacion(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from RolOperacion");
        List<RolOperacion>lista = (List<RolOperacion>) query.list();
        Iterator<RolOperacion> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // ROL_OPERACION-UPDATE
    public void updateRolOperacion(RolOperacion rolOperacion) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(rolOperacion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "RolOperacion actualizado correctamente");
    }
    

    
    // TIPOINSTANCIA
    // TIPOINSTANCIA-CREATE
    public void createTipoinstancia(Tipoinstancia tipoinstancia){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(tipoinstancia);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Tipoinstancia insertado correctamente");
        
    }
    
    // TIPOINSTANCIA-READ
    public Tipoinstancia readTipoinstancia(BigDecimal ID){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Tipoinstancia tipoinstancia =(Tipoinstancia)session.get(Tipoinstancia.class, ID);
        tx.commit();
        session.close();
        
        return tipoinstancia;
    }
    
    // TIPOINSTANCIA-READ_ALL
    public Iterator<Tipoinstancia> readAllTipoinstancia(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Tipoinstancia");
        List<Tipoinstancia>lista = (List<Tipoinstancia>) query.list();
        Iterator<Tipoinstancia> iter = lista.iterator();
        tx.commit();
        session.close();
        
        return iter;
    }
       
    // TIPOINSTANCIA-UPDATE
    public void updateTipoinstancia(Tipoinstancia tipoinstancia) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(tipoinstancia);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Tipoinstancia actualizado correctamente");
    }
    
}
