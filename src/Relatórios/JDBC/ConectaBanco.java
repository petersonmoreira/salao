/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Relatórios.JDBC;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Peterson
 */
public class ConectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5433/salao.beleza";
    private String usuario = "postgres";
    private String senha = "petecO12";
    public Connection conn;
    
    public void conexao(){
        try{
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro de conexão!");
           }
    }
    
    public void executaSQL (String sql) {
        try{
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            
        }
      }
    
    public void desconecta() {
        try {
            conn.close();
        } catch (SQLException ex){
            
        }
    }
}
