package entities;

public class ContaBancaria {

	private String titular;
	private double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void exibirDados() {
		System.out.println("Conta Bancária de " + titular + " - Saldo: R$ " + saldo);
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

}
