package org.example.DB;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Etapa {
    public Etapa() {
    }

    public Etapa(Integer id, Integer km, String llegada, String salida, Ciclista dorsal, Set<Lleva> llevas, Set<Puerto> puertos) {
        this.id = id;
        this.km = km;
        this.llegada = llegada;
        this.salida = salida;
        this.dorsal = dorsal;
        this.llevas = llevas;
        this.puertos = puertos;
    }

    @Id
    @Column(name = "netapa", nullable = false)
    private Integer id;

    @Column(name = "km")
    private Integer km;

    @Column(name = "llegada", length = 50)
    private String llegada;

    @Column(name = "salida", length = 50)
    private String salida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dorsal")
    private Ciclista dorsal;

    @OneToMany(mappedBy = "netapa")
    private Set<Lleva> llevas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "netapa")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Ciclista getDorsal() {
        return dorsal;
    }

    public void setDorsal(Ciclista dorsal) {
        this.dorsal = dorsal;
    }

}