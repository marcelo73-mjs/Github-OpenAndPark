

package br.edu.fja.entidades;

public class Estacionamento {
    private String nome_estacionamento;
    private String endereco;
    private String telefone;
    private int codigo;
    
    

    public Estacionamento() {
      
    }
     public Estacionamento(int codigo) {
         this.codigo = codigo;
      
    }

    public Estacionamento(String estacionamento, String endereco, String telefone, int codigo) {
        this.nome_estacionamento = estacionamento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codigo = codigo;
      
    }
    
    public String getNome_estacionamento() {
        return nome_estacionamento;
    }

    public void setNome_estacionamento(String nome_estacionamento) {
        this.nome_estacionamento = nome_estacionamento;
    }

    public String getEndereco() {
        return endereco;
        
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    

}
