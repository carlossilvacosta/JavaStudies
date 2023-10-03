package entities;

public class Cliente {

	private String nome;
	private int idade;
	private Conta conta;
	
	public Cliente() {
	}

	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.conta = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Conta abrirConta(String numero) {
		if(conta == null) {
			conta = new Conta(numero, this);
			return conta;
		} else {
			System.out.println("O cliente já possui uma conta");
			return null;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println();
		System.out.println("Cliente: " + nome);
		System.out.println("Idade: " + idade);
		if(conta != null) {
			conta.exibirInformacoes();
		} else {
			System.out.println("O cliente ainda não possui uma conta.");
		}
	}
	
}
