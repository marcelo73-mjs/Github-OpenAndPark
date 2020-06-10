

package br.edu.fja.entidades;


public class GpsEstacionamento {
    private String nomeEstacionamento;
  
    


 
public GpsEstacionamento(){
}
public GpsEstacionamento(String nomeEstacionamento){
      this.nomeEstacionamento = nomeEstacionamento;
}
 
Estacionamento codigo = new Estacionamento();
   
public String getNomeEstacionamento() {
        return nomeEstacionamento;
    }

 public void setNomeEstacionamento(String nomeEstacionamento) {
        this.nomeEstacionamento = nomeEstacionamento;
    }



} 