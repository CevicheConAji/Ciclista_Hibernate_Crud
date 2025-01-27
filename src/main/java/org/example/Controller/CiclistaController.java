package org.example.Controller;

import org.example.DB.Ciclista;
import org.example.Exception.CiclistaExceptionNotFound;
import org.example.Interface.RiderInterface;
import org.hibernate.Session;

public class CiclistaController implements RiderInterface {


    @Override
    public void deleteRiderByDorsal(Session session, int dorsal) throws CiclistaExceptionNotFound {

            session.beginTransaction();
            Ciclista ciclista = (Ciclista) session.get(Ciclista.class, dorsal);
            if (ciclista == null) {
                throw new CiclistaExceptionNotFound(dorsal);
            }else{
                session.delete(ciclista);
                session.getTransaction().commit();
                System.out.println("Rider eliminado "+dorsal);
            }
    }

    @Override
    public void updateRiderByDorsalAndAge(Session session, int dorsal, int age) {
        Ciclista ciclista = session.get(Ciclista.class, dorsal);
        session.beginTransaction();
        ciclista.setEdad(age);
        session.update(ciclista);
        session.getTransaction().commit();

        System.out.println("Rider age update n dorsal: "+dorsal);

    }

    @Override
    public Ciclista getRiderByDorsal(Session session, int dorsal) {
        Ciclista ciclista = session.get(Ciclista.class, dorsal);
        if (ciclista == null) {
            throw new CiclistaExceptionNotFound(dorsal);
        }else{
            return ciclista;
        }

    }
    public void createRider(Session session, Ciclista ciclista)  {
        session.beginTransaction();
        session.save(ciclista);
        session.getTransaction().commit();
        System.out.println("Rider creado "+ciclista);
    }

}
