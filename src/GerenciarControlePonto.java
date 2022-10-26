import java.time.LocalDate;
import java.time.LocalDateTime;

import model.RegistroPonto;
import model.controller.Funcionario;
import model.controller.Gerente;
import model.controller.Operador;
import model.controller.Secretaria;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {        
        //Funcionario 
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFunc(1);
        funcionario.setNome("Marcos");
        funcionario.setEmail("marcosjacometti10@gmail.com");
        funcionario.setDocumento("1217");

        //Gerente
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("Gerente: Cristiano Ronaldo");
        gerente.setEmail("cr7cristiano@gmail.com");
        gerente.setDocumento("777");
        gerente.setLogin("cr7boladao");
        gerente.setSenha("cr7milgrau");

        //Secretaria
        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Secretario: Neymar Junior");
        secretaria.setEmail("meninoney24@gmail.com");
        secretaria.setDocumento("2");
        secretaria.setTelefone("999999");
        secretaria.setRamal("2424");

        //Operador
        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Operador: Rodinei");
        operador.setEmail("rodinho@gmail.com");
        operador.setDocumento("3");
        operador.setValorHora(1);

        RegistroPonto rg1 = new RegistroPonto();
        RegistroPonto rg2 = new RegistroPonto();
        RegistroPonto rg3 = new RegistroPonto();

        Espera();
        rg1.setFunc(gerente);
        rg1.setDataRegistro(LocalDate.now());
        rg1.setHoraEntrada(LocalDateTime.now());
        rg1.apresentarRegistroPonto();

        rg2.setFunc(secretaria);
        rg2.setDataRegistro(LocalDate.now());
        rg2.setHoraEntrada(LocalDateTime.now());
        rg2.apresentarRegistroPonto();

        rg3.setFunc(operador);
        rg3.setDataRegistro(LocalDate.now());
        rg3.setHoraEntrada(LocalDateTime.now());
        rg3.apresentarRegistroPonto();

        rg1.setHoraSaida(LocalDateTime.now());
        rg1.apresentarRegistroPonto();

        rg2.setHoraSaida(LocalDateTime.now());
        rg2.apresentarRegistroPonto();

        rg3.setHoraSaida(LocalDateTime.now());
        rg3.apresentarRegistroPonto();

    }

    public static void Espera(){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}