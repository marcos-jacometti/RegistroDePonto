package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import model.controller.Funcionario;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }
    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }
    public Funcionario getFunc() {
        return func;
    }
    public void setFunc(Funcionario func) {
        this.func = func;
    }
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    //Método especifico
    public void apresentarRegistroPonto(){
        System.out.println("==============");
        System.out.println("Funcionario: " + this.func.getNome());
        System.out.println("Data de Registro: " + this.getDataRegistro());
        System.out.println("Horario de Entrada: " + this.getHoraEntrada());
        System.out.println("Horario de Saida: " + this.getHoraSaida());
        System.out.println("==============");
        System.out.println();
    }
}
