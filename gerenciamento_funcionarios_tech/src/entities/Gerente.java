package entities;

public class Gerente extends Funcionario{
	
	private String departamentoGerencia;
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, int id, double salaryBase, String departamentoGerencia) {
		super(nome, id, salaryBase);
		this.departamentoGerencia = departamentoGerencia;
	}

	public String getDepartamentoGerencia() {
		return departamentoGerencia;
	}

	public void setDepartamentoGerencia(String departamentoGerencia) {
		this.departamentoGerencia = departamentoGerencia;
	}
	
	@Override
	public String apresentar() {
		return "Sou o gerente " + getNome() + ", responsável pelo departamento de " 
	+ departamentoGerencia + ".";
	}

}
