package org.example.Interface;

import org.example.DB.Ciclista;
import org.example.Exception.CiclistaExceptionNotFound;
import org.hibernate.Session;

public interface RiderInterface {
    /**
     *
     * @param session
     * @param dorsal
     */
    void deleteRiderByDorsal(Session session,int dorsal)throws CiclistaExceptionNotFound;
    void updateRiderByDorsalAndAge(Session session, int dorsal, int age)throws CiclistaExceptionNotFound;
    Ciclista getRiderByDorsal(Session session, int dorsal)throws CiclistaExceptionNotFound;
}
