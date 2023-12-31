package entities;

public class PessoaJuridica extends Contribuintes {
	
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double taxa() {
		if(numeroFuncionarios > 10) {
			return 0.14 * getRendaAnual();
		} else {
			return 0.16 * getRendaAnual();	
		}
	}
}
