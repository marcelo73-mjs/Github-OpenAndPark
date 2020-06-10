/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fja.controller;

import br.edu.fja.contratos.IContratoEstacionamento;
import br.edu.fja.entidades.Estacionamento;
import br.edu.fja.model.EstacionamentoModel;
import java.util.ArrayList;


public class EstacionamentoController {
   
    private IContratoEstacionamento estServico;

    public EstacionamentoController() {
        this.estServico = new EstacionamentoModel();
    }
    
    public boolean SalvarEstacionamento(Estacionamento estacionamento){
        return this.estServico.Adicionar(estacionamento);
    }
    
    public boolean EditarEstacionamento(Estacionamento estacionamento){
        return this.estServico.Editar(estacionamento);
    }
   
    public boolean ExcluirEstacionamento(Estacionamento estacionamento){
        return this.estServico.Excluir(estacionamento);
    }
    
    public ArrayList ConsutaTodosOsEstacionamento(){
        return this.estServico.ListaTodos();
    }
    public ArrayList ListarTodosOsEstacionamentoPorFiltro(Estacionamento estacionamento){
        return this.estServico.ListaTodosFiltrado(estacionamento);
    }
    
    public Estacionamento ConsultaProdutoPorId(int codigo){
        return this.estServico.ObtemEstacionamentoPorCodigo(codigo);
    }
    
  
    
}

    

