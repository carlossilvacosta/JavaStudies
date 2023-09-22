import java.util.Locale;
import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroIdentificacao;
		double nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;
		char conceito;
		String resultado;
		
		System.out.println("Informe o número de identificação do aluno?");
		numeroIdentificacao = sc.nextInt();
		
		System.out.println("Digite as notas das verificações do aluno (Notas 1, 2 e 3)): ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		System.out.println("Digite a média das notas dos exercícios: ");
		mediaExercicios = sc.nextDouble();
		
		mediaAproveitamento = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3) + mediaExercicios)/7;
		
		conceito = 0;
		resultado = "Aprovado";
		
		if(mediaAproveitamento >= 9.0) {
			conceito = 'A';
			resultado = "Aprovado";
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			conceito = 'B';
			resultado = "Aprovado";
		} else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
			conceito = 'C';
			resultado = "Aprovado";
		} else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
			conceito = 'D';
			resultado = "Reprovado";
		} else if (mediaAproveitamento < 4.0) {
			conceito = 'E';
			resultado = "Reprovado";
		}
		
		System.out.println("\n");
		System.out.println("Número de Identificação: " + numeroIdentificacao);
		System.out.printf("Notas das verificações: 1ª %.1f / 2ª %.1f / 3ª %.1f \n", nota1, nota2, nota3);
		System.out.println("Média dos exercícios: " + mediaExercicios);
		System.out.printf("Média de aproveitamento: %.1f%n", mediaAproveitamento);
		System.out.println("Conceito dos resultados: " + conceito);
		System.out.println("Situação do aluno: " + resultado);
		
		sc.close();
	}

}
