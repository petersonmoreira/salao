package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.clientenovo;
import model.profissional;
import model.servicoNovo;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-14T12:53:05")
@StaticMetamodel(agendamento.class)
public class agendamento_ { 

    public static volatile SingularAttribute<agendamento, Long> id;
    public static volatile SingularAttribute<agendamento, servicoNovo> servico;
    public static volatile SingularAttribute<agendamento, profissional> profissional;
    public static volatile SingularAttribute<agendamento, String> horaInicio;
    public static volatile SingularAttribute<agendamento, clientenovo> cliente;
    public static volatile SingularAttribute<agendamento, String> horaFim;
    public static volatile SingularAttribute<agendamento, Calendar> dataAgenda;

}