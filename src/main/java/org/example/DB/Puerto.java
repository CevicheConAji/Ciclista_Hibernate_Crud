package org.example.DB;


import javax.persistence.*;

@Entity

public class Puerto {
    public Puerto() {
    }

    public Puerto(String nompuerto, Integer altura, String categoria, Integer pendiente, Etapa netapa, Ciclista dorsal) {
        this.nompuerto = nompuerto;
        this.altura = altura;
        this.categoria = categoria;
        this.pendiente = pendiente;
        this.netapa = netapa;
        this.dorsal = dorsal;
    }

    @Id
    @Column(name = "nompuerto", nullable = false, length = 30)
    private String nompuerto;

    @Column(name = "altura")
    private Integer altura;

    @Column(name = "categoria", length = 1)
    private String categoria;

    @Column(name = "pendiente")
    private Integer pendiente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "netapa")
    private Etapa netapa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dorsal")
    private Ciclista dorsal;

    public String getNompuerto() {
        return nompuerto;
    }

    public void setNompuerto(String nompuerto) {
        this.nompuerto = nompuerto;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getPendiente() {
        return pendiente;
    }

    public void setPendiente(Integer pendiente) {
        this.pendiente = pendiente;
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