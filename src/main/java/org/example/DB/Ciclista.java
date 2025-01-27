package org.example.DB;


import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity

public class Ciclista {

    public Ciclista() {
    }

    public Ciclista(Integer id, Integer edad, String nombre, Equipo nomeq, Set<Etapa> etapas, Set<Lleva> llevas, Set<Puerto> puertos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.nomeq = nomeq;
        this.etapas = etapas;
        this.llevas = llevas;
        this.puertos = puertos;
    }

    @Id
    @Column(name = "dorsal", nullable = false)
    private Integer id;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nomeq")
    private org.example.DB.Equipo nomeq;

    @OneToMany(mappedBy = "dorsal")
    private Set<Etapa> etapas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "dorsal")
    private Set<Lleva> llevas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "dorsal")
    private Set<Puerto> puertos = new LinkedHashSet<>();

    public Set<Puerto> getPuertos() {
        return puertos;
    }

    public void setPuertos(Set<Puerto> puertos) {
        this.puertos = puertos;
    }

    public Set<Lleva> getLlevas() {
        return llevas;
    }

    public void setLlevas(Set<Lleva> llevas) {
        this.llevas = llevas;
    }

    public Set<Etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(Set<Etapa> etapas) {
        this.etapas = etapas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public org.example.DB.Equipo getNomeq() {
        return nomeq;
    }

    public void setNomeq(org.example.DB.Equipo nomeq) {
        this.nomeq = nomeq;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", nomeq=" + nomeq +
                ", etapas=" + etapas +
                ", llevas=" + llevas +
                ", puertos=" + puertos +
                '}';
    }
}