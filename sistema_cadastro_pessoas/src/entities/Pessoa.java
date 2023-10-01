package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private boolean casado;
	
	public Pessoa() {
	}

	public Pessoa(String nome, int idade, double altura, boolean casado) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.casado = casado;
	}

	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.casado = false;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Altura: " + altura + " m");
		System.out.println("Casado: " + (casado ? "Sim" : "Não"));
	}
}
