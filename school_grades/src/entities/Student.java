package entities;

public class Student {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double calculoReprovado() {
		return 60 - notaFinal();
	}
	
	public String situacao() {
		String situacaoFinal;
		if (notaFinal() > 60) {
			situacaoFinal = "APROVADO!";
		} else {
			situacaoFinal = "REPROVADO!" + "\nFALTANDO " + String.format("%.2f", calculoReprovado()) + " PONTOS";
			
		}
		return situacaoFinal;
	}
}
