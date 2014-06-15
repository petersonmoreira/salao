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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Peterson
 */
@Entity
public class clienteXpromocao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private clientenovo cliente;
    @OneToOne
    private promocaonovo promocao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data01;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data02;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data03;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data04;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data05;

    public clientenovo getCliente() {
        return cliente;
    }

    public void setCliente(clientenovo cliente) {
        this.cliente = cliente;
    }

    public promocaonovo getPromocao() {
        return promocao;
    }

    public void setPromocao(promocaonovo promocao) {
        this.promocao = promocao;
    }

    public Date getData01() {
        return data01;
    }

    public void setData01(Date data01) {
        this.data01 = data01;
    }

    public Date getData02() {
        return data02;
    }

    public void setData02(Date data02) {
        this.data02 = data02;
    }

    public Date getData03() {
        return data03;
    }

    public void setData03(Date data03) {
        this.data03 = data03;
    }

    public Date getData04() {
        return data04;
    }

    public void setData04(Date data04) {
        this.data04 = data04;
    }

    public Date getData05() {
        return data05;
    }

    public void setData05(Date data05) {
        this.data05 = data05;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof clienteXpromocao)) {
            return false;
        }
        clienteXpromocao other = (clienteXpromocao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public promocaonovo promocao(){
        return this.promocao;
        
    }
    
}
