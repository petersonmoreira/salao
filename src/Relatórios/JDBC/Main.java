package Relatórios.JDBC;
 
import Relatórios.Util.ReportUtils;
import Relatórios.jdbc.ConnectionFactory;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Peterson
 */
public class Main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().abrirRelatorioClientes();
    }
 
    public void abrirRelatorioClientes() {
         /*
         * Obtendo o arquivo do relatório.
         * Note que estamos utilizando um InputStream para obter o arquivo que
         * está dentro do nosso projeto. Fazendo isso, não teremos problema
         * quando nosso projeto for empacotado em um .jar.
         *
         * Note que o caminho do .jasper inicia com /, ou seja, a raiz da
         * localização das classes compiladas do nosso projeto
         * (o pacote default).
         *
         * Utilize a aba Files (canto superior esquerdo) e veja que os arquivos
         * .jasper e .jrxml são copiados para o diretório /build/classes
         * e por consequencia para o .jar que for criado.
         *
         * Se não os estiver vendo, mande dar um Clean and Build no projeto
         * (botão direito no nó raiz do projeto, Clean and Build (Limpar e Construir)
         *
         */
        InputStream inputStream = getClass().getResourceAsStream( "C:\\Users\\Peterson\\Dropbox\\Faculdade\\2014 - 01\\Desenvolvimento II\\Sistema Salão de Beleza\\salao.beleza-05-05-14\\salao.beleza\\src\\Relatórios/RelatorioClientes.jasper" );
 
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
        try {
           
            // abre o relatório
            ReportUtils.openReport( "Clientes", inputStream, parametros,
                    ConnectionFactory.getSalaoBelezaConnection() );
 
        } catch ( SQLException | JRException exc ) {
        }
 
    }
    
}
