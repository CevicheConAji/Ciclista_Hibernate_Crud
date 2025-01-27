package org.example.Interface;

import org.example.DB.Ciclista;
import org.hibernate.Session;

public interface RiderInterface {
    void deleteRiderByDorsal(Session session,int dorsal);
    void updateRiderByDorsalAndAge(Session session, int dorsal, int age);
    Ciclista getRiderByDorsal(Session session, int dorsal);
}
