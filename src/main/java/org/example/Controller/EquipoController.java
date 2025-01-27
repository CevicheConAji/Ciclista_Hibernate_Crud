package org.example.Controller;

import org.example.DB.Equipo;
import org.hibernate.Session;

public class EquipoController {
    public EquipoController() {

    }
    public boolean getEquipoByTeamName(Session session, String teamName) {
        Equipo equipo = session.get(Equipo.class, teamName);
        if (equipo == null) {
            return false;
        }else {
            return true;
        }
    }
}
