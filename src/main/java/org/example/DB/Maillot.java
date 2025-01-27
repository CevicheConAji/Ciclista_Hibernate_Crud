package org.example.DB;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Maillot {
    public Maillot() {
    }

    public Maillot(String codigo, String color, Integer premio, String tipo, Set<Lleva> llevas) {
        this.codigo = codigo;
        this.color = color;
        this.premio = premio;
        this.tipo = tipo;
        this.llevas = llevas;
    }

    @Id
    @Column(name = "codigo", nullable = false, length = 3)
    private String codigo;

    @Column(name = "color", length = 20)
    private String color;

    @Column(name = "premio")
    private Integer premio;

    @Column(name = "tipo", length = 20)
    private String tipo;

    @OneToMany(mappedBy = "codigo")
    private Set<Lleva> llevas = new LinkedHashSet<>();

    public Set<Lleva> getLlevas() {
        return llevas;
    }

    public void setLlevas(Set<Lleva> llevas) {
        this.llevas = llevas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPremio() {
        return premio;
    }

    public void setPremio(Integer premio) {
        this.premio = premio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}