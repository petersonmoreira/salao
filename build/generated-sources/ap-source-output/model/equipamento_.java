package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-12T10:03:10")
@StaticMetamodel(equipamento.class)
public class equipamento_ { 

    public static volatile SingularAttribute<equipamento, Long> id;
    public static volatile SingularAttribute<equipamento, String> nome;
    public static volatile SingularAttribute<equipamento, Calendar> data_utilizacao;
    public static volatile SingularAttribute<equipamento, String> descricao;

}