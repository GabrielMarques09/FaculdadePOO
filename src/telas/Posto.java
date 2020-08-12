/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "posto", catalog = "posto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Posto.findAll", query = "SELECT p FROM Posto p")
    , @NamedQuery(name = "Posto.findById", query = "SELECT p FROM Posto p WHERE p.id = :id")
    , @NamedQuery(name = "Posto.findByCombustivel", query = "SELECT p FROM Posto p WHERE p.combustivel = :combustivel")
    , @NamedQuery(name = "Posto.findByLitros", query = "SELECT p FROM Posto p WHERE p.litros = :litros")
    , @NamedQuery(name = "Posto.findByLanche", query = "SELECT p FROM Posto p WHERE p.lanche = :lanche")
    , @NamedQuery(name = "Posto.findByBebidas", query = "SELECT p FROM Posto p WHERE p.bebidas = :bebidas")
    , @NamedQuery(name = "Posto.findByOutros", query = "SELECT p FROM Posto p WHERE p.outros = :outros")
    , @NamedQuery(name = "Posto.findByTotal", query = "SELECT p FROM Posto p WHERE p.total = :total")
    , @NamedQuery(name = "Posto.findByAcessorio", query = "SELECT p FROM Posto p WHERE p.acessorio = :acessorio")})
public class Posto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "combustivel")
    private Double combustivel;
    @Column(name = "litros")
    private Double litros;
    @Column(name = "lanche")
    private Double lanche;
    @Column(name = "bebidas")
    private Double bebidas;
    @Column(name = "outros")
    private Double outros;
    @Column(name = "total")
    private Double total;
    @Column(name = "acessorio")
    private Double acessorio;

    public Posto() {
    }

    public Posto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Double combustivel) {
        Double oldCombustivel = this.combustivel;
        this.combustivel = combustivel;
        changeSupport.firePropertyChange("combustivel", oldCombustivel, combustivel);
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        Double oldLitros = this.litros;
        this.litros = litros;
        changeSupport.firePropertyChange("litros", oldLitros, litros);
    }

    public Double getLanche() {
        return lanche;
    }

    public void setLanche(Double lanche) {
        Double oldLanche = this.lanche;
        this.lanche = lanche;
        changeSupport.firePropertyChange("lanche", oldLanche, lanche);
    }

    public Double getBebidas() {
        return bebidas;
    }

    public void setBebidas(Double bebidas) {
        Double oldBebidas = this.bebidas;
        this.bebidas = bebidas;
        changeSupport.firePropertyChange("bebidas", oldBebidas, bebidas);
    }

    public Double getOutros() {
        return outros;
    }

    public void setOutros(Double outros) {
        Double oldOutros = this.outros;
        this.outros = outros;
        changeSupport.firePropertyChange("outros", oldOutros, outros);
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        Double oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Double getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Double acessorio) {
        Double oldAcessorio = this.acessorio;
        this.acessorio = acessorio;
        changeSupport.firePropertyChange("acessorio", oldAcessorio, acessorio);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posto)) {
            return false;
        }
        Posto other = (Posto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Posto[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
