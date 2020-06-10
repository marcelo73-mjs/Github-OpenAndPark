
package br.edu.fja.model;


import br.edu.fja.contratos.IContratoEstacionamento;
import br.edu.fja.entidades.Estacionamento;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author evawellesrodrigues
 */
public class EstacionamentoModel extends DaoUtil implements IContratoEstacionamento {

    public EstacionamentoModel(){
         //super();

    }
    
    
      private String MontaSql(Estacionamento est){
        String sql = "SELECT codigo, nome_estacionamento, endereco, telefone FROM estacionamento ";
        sql += " WHERE 1=1 ";
        
        if(est.getCodigo() > 0){
            sql += " AND codigo = " + est.getCodigo();
        }
        if(est.getNome_estacionamento() != null){
            sql += " AND nome_estacionamento like '%" + est.getNome_estacionamento() + "%' ";
        }
        if(est.getEndereco()!=null ){
            sql += " AND endereco = " + est.getEndereco();
        }
        if(est.getTelefone() != null){
            sql += " AND telefone like '%" + est.getTelefone() + "%' ";
        }
        
        sql += " order by name";
        return sql;
    }
   

      
    @Override
    public boolean Adicionar(Estacionamento estacionamento)  {
        String sql = "INSERT INTO estacionamento ";
        sql += "(nome_estacionamento,endereco, telefone)";
        sql += " VALUES ";
        sql += "(?, ?, ?)";
        int ret = 0;
           
      
     try (PreparedStatement ps = getPreparedStatement(sql)) {
            ps.setString(1, estacionamento.getNome_estacionamento() );
            ps.setString(2, estacionamento.getEndereco() );
            //ps.setDate(3, new java.sql.Date( produto.getValidade().getTime() ) );
            ps.setString(3, estacionamento.getTelefone());
            ret = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados"+ ex);
            Logger.getLogger(EstacionamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret > 0;
    }

 
    @Override
    public boolean Editar(Estacionamento estacionamento) {
        String sql = "UPDATE estacionamento SET ";
        sql += "nome_estacionamento=?, endereco=?, telefone=? ";
        sql += " WHERE codigo=?";

        int ret = 0;
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ps.setString(1, estacionamento.getNome_estacionamento() );
            ps.setString(2, estacionamento.getEndereco() );
            //ps.setDate(3, new java.sql.Date( produto.getValidade().getTime() ) );
            ps.setString(3, estacionamento.getTelefone());
            ret = ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret > 0;
    }

    @Override
    public boolean Excluir(Estacionamento estacionamento) {
        String sql = "DELETE FROM produto ";
        sql += " WHERE codigo=?";

        int ret = 0;
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ps.setInt(1, estacionamento.getCodigo());
            ret = ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret > 0;
    }

    private ArrayList ListaEstacionamentos(Estacionamento estacionamento){
        ArrayList lstRet = new ArrayList();
        String sql = this.MontaSql(estacionamento );
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {                
                lstRet.add(
                        new Object[]{
                            rs.getInt("codigo"),
                            rs.getString("nome_estacionamento"),
                            rs.getFloat("endereco"),
                            rs.getDate("telefone"),
                           
                        }
                );
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return lstRet;
    }
    
    @Override
    public ArrayList ListaTodos() {
        return this.ListaEstacionamentos( new Estacionamento() );
    }

    public ArrayList ListaTodosFiltrado(Estacionamento estacionamento) {
        return this.ListaEstacionamentos(estacionamento);
    }

    public Estacionamento ObtemEstacionamentoPorCodigo(int codigo) {
       Estacionamento estRet = new Estacionamento();
        String sql = this.MontaSql( new Estacionamento(codigo) );
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {                
                estRet.setCodigo(rs.getInt("codigo"));
                estRet.setNome_estacionamento(rs.getString("nome_estacionamento"));
                estRet.setEndereco( rs.getString("endereco"));
                estRet.setTelefone(rs.getString("telefone"));
              
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return estRet;
    }

    @Override
    public Estacionamento  ObtemEstacionamentoPorCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}


     