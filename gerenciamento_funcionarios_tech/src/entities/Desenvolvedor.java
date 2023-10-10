package entities;

public class Desenvolvedor extends Funcionario{
	
	private String linguagemProgramacao;
	
	public Desenvolvedor() {
		super();
	}

	public Desenvolvedor(String nome, int id, double salaryBase, String linguagemProgramacao) {
		super(nome, id, salaryBase);
		this.linguagemProgramacao = linguagemProgramacao;
	}

	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}

	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}
	
	@Override
	public String apresentar() {
		return "Sou o desenvolvedor " + getNome() + ", especialista em " 
	+ linguagemProgramacao + ".";
	}

}
