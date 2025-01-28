package org.example.DB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity

public class Equipo {
    public Equipo() {
    }

    public Equipo(String nomeq, String director, Set<Ciclista> ciclistas) {
        this.nomeq = nomeq;
        this.director = director;
        this.ciclistas = ciclistas;
    }

    @Id
    @Column(name = "nomeq", nullable = false, length = 20)
    private String nomeq;

    @Column(name = "director", length = 50)
    private String director;

    @OneToMany(mappedBy = "nomeq")
    private Set<Ciclista> ciclistas = new LinkedHashSet<>();

    public Set<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(Set<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public String getNomeq() {
        return nomeq;
    }

    public void setNomeq(String nomeq) {
        this.nomeq = nomeq;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " nomeq='" + nomeq + '\'' +
                ", director='" + director + '\'' +
                ", ciclistas=" + ciclistas +
                '}';
    }
}