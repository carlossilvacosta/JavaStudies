package app;

import entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Clara", 19);
        cliente1.abrirConta("099873");

        cliente1.getConta().depositar(2000);
        cliente1.exibirInformacoes();

        System.out.println("---------------------------");
        cliente1.getConta().sacar(1500);
        cliente1.exibirInformacoes();

        System.out.println("---------------------------");
        cliente1.getConta().sacar(15000);
        cliente1.exibirInformacoes();

        System.out.println("---------------------------");
        cliente1.abrirConta("02938923823");
    }
}