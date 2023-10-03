package entidades;

import java.util.ArrayList;

public class Conta {

    private String numero;
    private double saldo;
    private Cliente cliente;
    private ArrayList<String> extrato;


    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0;
        this.cliente = cliente;
        extrato = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo = this.saldo + valor;
            System.out.println("Depositou " + valor + " reais!!");
        } else {
            System.out.println("Por favor, digite um valor válido > 0.");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Sacou " + valor + " reais!!");
        } else {
            System.out.println("Saldo insuficiente para saque com valor solicitado.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}
