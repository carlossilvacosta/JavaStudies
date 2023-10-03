package entities;

public class Conta {
	
	private String numero;
	private float saldo;
	private Cliente cliente;
	
	public Conta() {
	}

	public Conta(String numero, Cliente cliente) {
		this.numero = numero;
		this.saldo = 0;
		this.cliente = cliente;
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
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
		saldo -= valor;
		} else {
            System.out.println("Saldo insuficiente para saque.");
        }
	}

	public void exibirInformacoes() {
		System.out.println();
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: R$" + String.format("%.2f", saldo));
	}
}
