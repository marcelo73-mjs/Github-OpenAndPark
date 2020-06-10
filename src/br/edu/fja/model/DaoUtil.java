
 
package br.edu.fja.model;
import br.edu.fja.entidades.Estacionamento;
import java.sql.* ; //conjunto de bibliotecas do java

public abstract class DaoUtil {//Abstrata porque ninguem pode instanciar, apenas herdar
 //Criar um metodo responsavel por estabelecer a conexao com o Banco
    public static Connection conector(){

 //Connection é um Fremework  conjunto de funcionalidades que vem do pacote sql e conector o metodo
 //Sempre que cria um metodo sem o VOID precisa de um retorno
         java.sql.Connection conexao = null; //Nulo porque ainda nao exixte conexao
         
// A linha abaixo chama o drive que eu importei para a biblioteca
         String driver = "com.mysql.jdbc.Driver";
         
//Criar mais 3 variaveis para Aramazenar informações do Banco
         String url = "jdbc:mysql://127.0.0.1:3306/cadastroEstacionamentos?";
         String user = "root";//Administrador(usuário)
         String password = "Adeni2308";
         
//Estabelecendo a conexao do Banco com o Java
          try{
              Class.forName(driver); //Executa o arquivo do driver(Obtenha a conexao)
              conexao = DriverManager.getConnection(url, user, password);
              return conexao;
          }catch(Exception e){
               System.out.println("O erro foi : " + e);//Essa linha não precisa, somente internamente pra mostrar o erro!
              return null;
             
            
              
          
          
          
          }
         
           
    }

    PreparedStatement getPreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
