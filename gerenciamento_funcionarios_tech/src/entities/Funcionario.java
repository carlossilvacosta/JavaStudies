package entities;

public class Funcionario {

	private String nome;
	private int id;
	private double salaryBase;
	
	public Funcionario() {
	}

	public Funcionario(String nome, int id, double salaryBase) {
		this.nome = nome;
		this.id = id;
		this.salaryBase = salaryBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalaryBase() {
		return salaryBase;
	}

	public void setSalaryBase(double salaryBase) {
		this.salaryBase = salaryBase;
	}
	
	public String apresentar() {
		return "";
	}
}
