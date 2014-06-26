/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Peterson
 */
@Entity
public class agendamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Id
    @ManyToOne
    private clientenovo cliente;
    
    @Id
    @ManyToOne
    private servicoNovo servico;
    
    @Id
    @ManyToOne
    private profissional profissional;

    private String horaInicio;
    
    private String horaFim;
    
     @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataAgenda;

    public servicoNovo getServico() {
        return servico;
    }

    public void setServicoNovo(servicoNovo servico) {
        this.servico = servico;
    }

    public Calendar getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Calendar dataAgenda) {
        this.dataAgenda = dataAgenda;
    }
     
     
    public model.clientenovo getCliente() {
        return cliente;
    }

    public void setCliente(model.clientenovo cliente) {
        this.cliente = cliente;
    }

    public model.profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(model.profissional profissional) {
        this.profissional = profissional;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
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
        if (!(object instanceof agendamento)) {
            return false;
        }
        agendamento other = (agendamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CLIENTE: "+this.cliente +" - PROFISSIONAL: "+ this.profissional +" - SERVIÇO: "+ this.servico +" - HORA: "+ this.horaInicio;
    }
    
}
