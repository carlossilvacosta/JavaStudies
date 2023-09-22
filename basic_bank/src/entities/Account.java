package entities;

public class Account {

	private int numeroConta;
	private String nome;
	private double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public Account(int numeroConta, String nome, double quantia) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo + quantia;
	}

	public void deposito(double quantia) {
		saldo = saldo + quantia;
	}
	
	public void saque(double quantia) {
		saldo = saldo - quantia - 5.00;
	}
	
	public String toString() {
		return String.format("Conta %d", numeroConta)
			+ String.format(", Titular da conta:  %s", nome)
			+ String.format(", Saldo: $ %.2f%n", saldo);
	}
	
}
