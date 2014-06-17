/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
//import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
//import javax.persistence.Temporal;

/**
 *
 * @author Peterson
 */
@Entity
public class clientenovo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;//CPF DO CLIENTE

    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private String endereco;
   // @Temporal(javax.persistence.TemporalType.DATE)
    private int dia;
    private int mes;
    private int ano;
    @ManyToOne
    promocaonovo promocao;
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

    // private Calendar data_nasc;
    public promocaonovo getPromocao() {
        return promocao;
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

    public void setPromocao(promocaonovo promocao) {
        this.promocao = promocao;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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
        if (!(object instanceof clientenovo)) {
            return false;
        }
        clientenovo other = (clientenovo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
