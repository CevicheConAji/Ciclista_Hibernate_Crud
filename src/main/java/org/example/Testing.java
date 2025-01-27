package org.example;

import org.example.Controller.CiclistaController;
import org.example.Controller.EquipoController;
import org.example.DB.Ciclista;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Testing {

    public Testing() {
    }
    public void executeTesting(){
        Session session = connect();

        testingRider(session);

        //testingTeam(session);

        closeSession(session);

    }
    public Session connect(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        if(session != null){
            System.out.println("Session opened!");
        }else {
            System.out.println("Session could not be opened!");
        }
        return session;
    }
    public void closeSession(Session session){
        session.close();
        System.out.printf("Session closed\n");
    }
    public void testingRider(Session session){
        CiclistaController ciclistaController = new CiclistaController();
        //ciclistaController.deleteRiderByDorsal(session,87);
        //ciclistaController.updateRiderByDorsalAndAge(session,32,20);
        //Ciclista c1 = ciclistaController.getRiderByDorsal(session,32);
        //System.out.println(c1);
        Ciclista c2 = new Ciclista();
        c2.setId(101);
        c2.setEdad(30);
        c2.setNombre("Marco");
        ciclistaController.createRider(session, c2);
    }
    public void testingTeam(Session session){
        EquipoController equipoController = new EquipoController();
        boolean existeTeam ;
        existeTeam = equipoController.getEquipoByTeamName(session,"Gatorade");
        System.out.println(existeTeam);

    }
}
