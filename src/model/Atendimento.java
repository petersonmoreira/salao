/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Peterson
 */

@Entity
public class Atendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToOne
    private clientenovo clientenovo;
    @OneToOne
    private profissional profissional;
    @ManyToOne
    private servicoNovo servicoNovo;
    @OneToOne
    private promocaonovo promocaonovo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAtendimento;
    private Double subtotal;
    private Double desconto;
    private Double total;

    public clientenovo getClientenovo() {
        return clientenovo;
    }

    public void setClientenovo(clientenovo clientenovo) {
        this.clientenovo = clientenovo;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(profissional profissional) {
        this.profissional = profissional;
    }

    public servicoNovo getServicoNovo() {
        return servicoNovo;
    }

    public void setServicoNovo(servicoNovo servicoNovo) {
        this.servicoNovo = servicoNovo;
    }

    public promocaonovo getPromocaonovo() {
        return promocaonovo;
    }

    public void setPromocaonovo(promocaonovo promocaonovo) {
        this.promocaonovo = promocaonovo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.servicoNovo.getDescricao();
    }
    
}
