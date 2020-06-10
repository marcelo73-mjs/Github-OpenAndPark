package br.edu.fja.model;

/*
package br.edu.fja.dao;


import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModuloConexao2 {
    public Statement st;
    public ResultSet rs;
    public String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1";
    private String usuario = "root";
    private String senha = "Adeni 2308";  
    public Connection con;
    
    public void conexao() throws SQLException{//Método resp por realizar a conexao com a base de dados
        try {
            System.setProperty("jdbc.Driveres", driver);//Responsavel por setar a propriedade do Driver de conexao
            con = DriverManager.getConnection(url, usuario, senha );
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso");
        
     } catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao se Conectar ao BD\n"+ e.getMessage());
    
     }
     
 
    public void desconecta() throws SQLException {
         try {
              
              con.close();
              JOptionPane.showMessageDialog(null, "Conexão Desconectada com sucesso");
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao Fechar conexão com o BD\n" + e.getMessage());
              
          }
         
      
    }
}
 
    
  */  

