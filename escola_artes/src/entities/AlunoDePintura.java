package entities;

public class AlunoDePintura extends Aluno{
	
	private String estiloPintura;
	
	public AlunoDePintura() {
		super();
	}

	public AlunoDePintura(String nome, int idade, String matricula, String estiloPintura) {
		super(nome, idade, matricula);
		this.estiloPintura = estiloPintura;
	}

	public String getEstiloPintura() {
		return estiloPintura;
	}

	public void setEstiloPintura(String estiloPintura) {
		this.estiloPintura = estiloPintura;
	}
	
	public void pintarQuadro() {
		System.out.println("O aluno está pintando um quadro no estilo " + estiloPintura + ".");
	}

}
