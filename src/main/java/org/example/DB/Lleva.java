package org.example.DB;


import javax.persistence.*;

@Entity
public class Lleva {
    public Lleva() {
    }

    public Lleva(LlevaId id, Maillot codigo, Etapa netapa, Ciclista dorsal) {
        this.id = id;
        this.codigo = codigo;
        this.netapa = netapa;
        this.dorsal = dorsal;
    }

    @EmbeddedId
    private LlevaId id;

    @MapsId("codigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo", nullable = false)
    private org.example.DB.Maillot codigo;

    @MapsId("netapa")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "netapa", nullable = false)
    private Etapa netapa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dorsal")
    private Ciclista dorsal;

    public LlevaId getId() {
        return id;
    }

    public void setId(LlevaId id) {
        this.id = id;
    }

    public org.example.DB.Maillot getCodigo() {
        return codigo;
    }

    public void setCodigo(org.example.DB.Maillot codigo) {
        this.codigo = codigo;
    }

    public Etapa getNetapa() {
        return netapa;
    }

    public void setNetapa(Etapa netapa) {
        this.netapa = netapa;
    }

    public Ciclista getDorsal() {
        return dorsal;
    }

    public void setDorsal(Ciclista dorsal) {
        this.dorsal = dorsal;
    }

}