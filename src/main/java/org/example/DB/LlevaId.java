package org.example.DB;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable

public class LlevaId implements java.io.Serializable {
    public LlevaId() {
    }

    public LlevaId(String codigo, Integer netapa) {
        this.codigo = codigo;
        this.netapa = netapa;
    }

    private static final long serialVersionUID = 3503492321489085120L;
    @Column(name = "codigo", nullable = false, length = 3)
    private String codigo;

    @Column(name = "netapa", nullable = false)
    private Integer netapa;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNetapa() {
        return netapa;
    }

    public void setNetapa(Integer netapa) {
        this.netapa = netapa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LlevaId entity = (LlevaId) o;
        return Objects.equals(this.codigo, entity.codigo) &&
                Objects.equals(this.netapa, entity.netapa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, netapa);
    }

}