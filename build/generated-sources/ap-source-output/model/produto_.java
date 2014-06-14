package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-14T12:53:05")
@StaticMetamodel(produto.class)
public class produto_ { 

    public static volatile SingularAttribute<produto, String> codigo;
    public static volatile SingularAttribute<produto, Calendar> data_validade;
    public static volatile SingularAttribute<produto, String> nome;
    public static volatile SingularAttribute<produto, String> descrição;
    public static volatile SingularAttribute<produto, Integer> qtd;

}