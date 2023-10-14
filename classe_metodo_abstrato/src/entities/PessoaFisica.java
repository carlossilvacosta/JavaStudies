package entities;

public class PessoaFisica extends Contribuintes {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double taxa() {
		if(getRendaAnual() < 20000.00) {
			return 0.15 * getRendaAnual();
		} else if(getRendaAnual() > 20000.00 && gastosSaude > 0.0) {
			return (0.25 * getRendaAnual()) - (gastosSaude * 0.50);
		} else {
			return 0.25 * getRendaAnual();
		}
	}
}
