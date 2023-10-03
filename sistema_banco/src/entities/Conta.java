package entities;

import java.util.ArrayList;

public class Conta {
	
	private String numero;
	private float saldo;
	private Cliente cliente;
	private ArrayList<String> extrato;
	
	public Conta() {
	}

	public Conta(String numero, Cliente cliente) {
		this.numero = numero;
		this.saldo = 0;
		this.cliente = cliente;
		this.extrato = new ArrayList<>();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void depositar(double valor) {
		if(valor > 0.0) {
			saldo += valor;
			extrato.add("Depósito realizado no valor de " + String.format("%.2f", valor) + " reais."
					+ " Saldo após o depósito: R$ " + String.format("%.2f", saldo) + ".");
		} else {
			System.out.println("Por favor, digite um valor válido.");
		}
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
		saldo -= valor;
		extrato.add("Saque realizado no valor de " + String.format("%.2f", valor) + " reais."
				+ " Saldo após o depósito: R$ " + String.format("%.2f", saldo) + ".");
		} else {
            System.out.println("Saldo insuficiente para saque.");
        }
	}

	public void exibirInformacoes() {
		System.out.println();
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: R$" + String.format("%.2f", saldo));
	}
	
	public void exibirExtrato() {
		System.out.println();
		System.out.println("Extrato da Conta: ");
		for(String movimentacao : extrato) {
			System.out.println(movimentacao);
		}
	}
}
