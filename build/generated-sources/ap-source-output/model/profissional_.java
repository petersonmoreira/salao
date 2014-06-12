package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.funcao;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-12T10:03:10")
@StaticMetamodel(profissional.class)
public class profissional_ { 

    public static volatile SingularAttribute<profissional, Long> id;
    public static volatile SingularAttribute<profissional, funcao> funcao;
    public static volatile SingularAttribute<profissional, String> sexo;
    public static volatile SingularAttribute<profissional, String> nome;
    public static volatile SingularAttribute<profissional, String> endereco;
    public static volatile SingularAttribute<profissional, String> Data_Nasc;

}