package model.controller;

public class Secretaria extends Funcionario{
    private String telefone;
    private String ramal;

    public Secretaria(){
        this.telefone = "";
        this.ramal = "";
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRamal() {
        return ramal;
    }
    public void setRamal(String ramal) {
        this.ramal = ramal;
    } 
}