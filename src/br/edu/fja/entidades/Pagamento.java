

package br.edu.fja.entidades;


public class Pagamento extends Motorista{
    private float valorHora;
    private float valorPernoite;
    private float valorDia;
    private float valorMes;
    private float valorTotal;

    public Pagamento() {
    }

    public Pagamento(float valorHora, float valorPernoite, float valorDia, float valorMes, float valorTotal, String nome, String cpf, String sexo, String endereco, String dataNascimento, String telefone) {
        super(nome, cpf, sexo, endereco, dataNascimento, telefone);
        this.valorHora = valorHora;
        this.valorPernoite = valorPernoite;
        this.valorDia = valorDia;
        this.valorMes = valorMes;
        this.valorTotal = valorTotal;
    }

    
    
    
   

}
