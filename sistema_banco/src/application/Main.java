package application;

import entities.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Carlos", 23);
		cliente.abrirConta("27121999");
		cliente.getConta().depositar(1000);
		cliente.getConta().exibirInformacoes();
		cliente.getConta().sacar(300);
		cliente.getConta().exibirInformacoes();
		cliente.getConta().sacar(800);
		cliente.getConta().exibirExtrato();

	}

}
