

package br.edu.fja.entidades;


public class Vaga {
    private String setor;
    private int numero;

    public Vaga() {
    }

    public Vaga(String setor, int numero) {
        this.setor = setor;
        this.numero = numero;
     
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    

}
