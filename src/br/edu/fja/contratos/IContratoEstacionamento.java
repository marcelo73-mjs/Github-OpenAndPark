
package br.edu.fja.contratos;

import br.edu.fja.entidades.Estacionamento;
import java.util.ArrayList;


public interface IContratoEstacionamento {

    boolean Adicionar(Estacionamento  estacionamento);
    boolean Editar(Estacionamento estacionamento);
    boolean Excluir(Estacionamento estacionamento);
    ArrayList ListaTodos();
    ArrayList ListaTodosFiltrado(Estacionamento estacionamento);
    Estacionamento ObtemEstacionamentoPorCodigo(int codigo);
}

    

