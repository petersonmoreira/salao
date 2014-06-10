/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/*
//import JPA.agendamentoJpaController;
import JPA.exceptions.PreexistingEntityException;
import gui.guiAgendamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterson
 */
//public class agendamentoActionListener implements ActionListener{
/*
    private guiAgendamento agd;
  //  private agendamentoJpaController service;
    private AgendamentoTableModel tableModel;
    
    public void adicionaListener (){
        agd.getBtnagendar().addActionListener(this);
    }
    
    public agendamentoActionListener(guiAgendamento agd) {
        this.agd = agd;
    //    service = new agendamentoJpaController();
        adicionaListener();
        
    }
    
    public void inicializaTabeModel(){
      // List <agendamento> agendamentos = (List <agendamento>) service.getEntityManager();
       tableModel = new AgendamentoTableModel(agendamentos);
       agd.getTbAgenda().setModel(null);
     //   tableModel = new AgendamentoTableModel(service.findagendamentoEntities());
    }
    
    
    private void salvar(){
        try {
            service.create(formToAgendamento());
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(agendamentoActionListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(agendamentoActionListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(agd, "CLIENTE AGENDADO COM SUCESSO!");
    }
    
    private agendamento formToAgendamento(){
        
        agendamento agendamento = new agendamento();
        
        agendamento.setCliente((cliente)agd.getCboCliente().getSelectedItem());
        agendamento.setProfissional((profissional)agd.getCboProfissional().getSelectedItem());
        agendamento.setServicoNovo((servicoNovo)agd.getCboServico().getSelectedItem());
        agendamento.setDataAgenda(agd.getjDateAgenda().getCalendar());
        agendamento.setHoraInicio((String)agd.getCboHoraInicio().getSelectedItem());
        agendamento.setHoraFim((String)agd.getCboHoraFim().getSelectedItem());
           
        return agendamento;
         
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        
        System.out.println(event);
    }
  */  
//}
