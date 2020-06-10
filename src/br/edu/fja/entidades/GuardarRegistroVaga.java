

package br.edu.fja.entidades;

import java.util.Date;


public class GuardarRegistroVaga extends Vaga {
    private String motorista;
    private String Placa;
    private Date dataEntrada;
    private Date dataSaida;
    private String horaEntrada;
    private Date horaSaida;

    public GuardarRegistroVaga(String motorista, String Placa, Date dataEntrada, Date dataSaida, String horaEntrada, Date horaSaida, String setor, int numero) {
        super(setor, numero);
        this.motorista = motorista;
        this.Placa = Placa;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getMotorista() {
        return motorista;
    }
    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    public Date getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public Date getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
    public String getHoraEntrada() {
        return horaEntrada;
    }
     public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public Date getHoraSaida() {
        return horaSaida;
    }
     public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

   
    
    

}
