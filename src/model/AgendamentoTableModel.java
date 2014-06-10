/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Peterson
 */
public class AgendamentoTableModel extends AbstractTableModel{

    private List <agendamento> agendamentos;
    private List <String> colunas;
    
    
    public AgendamentoTableModel (List<agendamento> agendamentos){
        this.agendamentos = agendamentos;
        colunas = Arrays.asList("Cliente","Profissional","Serviço","Data","Hora");
    }
    
 
    @Override
    public String getColumnName(int column){
        return colunas.get(column);
    }
    
    @Override
    public int getRowCount() {
        return agendamentos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

    agendamento agendamento = agendamentos.get(rowIndex);
    switch(columnIndex){
        //case 0: return agendamento.getClientenovo();
        case 1: return agendamento.getProfissional();
        case 2: return agendamento.getServico();
        case 3: return agendamento.getDataAgenda();
        case 4: return agendamento.getHoraInicio();
        
    }
    return null;
    
    }

    public List<String> getColunas() {
        return colunas;
    }

    public void setColunas(List<String> colunas) {
        this.colunas = colunas;
    }
    
    
    
}
