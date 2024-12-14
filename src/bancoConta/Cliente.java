package bancoConta;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private List <String> listaCliente = new ArrayList();
    private String nome;
    private String cpf;
    private double saldo = 45.00;
    private double deposito;


    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo <= this.saldo){
            this.saldo -= saldo;
        }else{
            System.out.println("Você não tem saldo  suficiente!");
        }
    }


    public void adicionarCliente(String nome, String cpf){
        listaCliente.add(nome);
        listaCliente.add(cpf);
    }

    public void exibirCliente(){
        for (Object conta : listaCliente){
            System.out.println(conta);
        }
    }

    public void plano01(){
        System.out.println("------------------------");
        System.out.println("PLANO 1");
        System.out.println("30R$/Mês");
        System.out.println("Cartão físico");
        System.out.println("Seguro cartão");
        System.out.println("Sorteios todos mêses!");
        System.out.println("------------------------");
    }

    public void plano02(){

        System.out.println("PLANO 2");
        System.out.println("15R$/Mês");
        System.out.println("Seguro cartão");
        System.out.println("Sorteios de 6 em 6 mêses");
        System.out.println("------------------------");
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
        listaCliente.add(nome);
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
        listaCliente.add(cpf);
    }

    public void horario(){
        LocalTime horas = LocalTime.now();
        int horasAgora = horas.getHour();

        if(horasAgora >=6 && horasAgora < 12){
            System.out.println("Tenha um Bom dia!");
        }else if (horasAgora < 18){
            System.out.println("Tenha uma Boa tarde!");
        }else if (horasAgora < 23){
            System.out.println("Tenha uma Boa noite!");
        }else {
            System.out.println("Tenha uma Boa madrugada!");
        }
    }
}
