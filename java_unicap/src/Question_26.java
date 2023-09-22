//LISTA DE EXERCÍCIOS - FUNÇÕES
/*4. Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1, 
 * valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
 * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/
import java.util.Locale;
import java.util.Scanner;

public class Question_26 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
		double porcentagemIpi, valorPeca1, valorPeca2;
		
		System.out.println("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
		porcentagemIpi = sc.nextDouble();
		
		System.out.println("Digite o codigo da peça 1: ");
		codigoPeca1 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da peça 1: ");
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite a quantidade de peças 1: ");
		quantidadePeca1 = sc.nextInt();
		
		System.out.println("Digite o codigo da peça 2: ");
		codigoPeca2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da peça 2: ");
		valorPeca2 = sc.nextDouble();
		
		System.out.println("Digite a quantidade de peças 2: ");
		quantidadePeca2 = sc.nextInt();
		
		double valorTotal = calculoValorTotal(valorPeca1, quantidadePeca1, valorPeca2, quantidadePeca2, porcentagemIpi);
		System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}
	
	public static double calculoValorTotal(double valorPeca1, int quantidadePeca1, double valorPeca2, int quantidadePeca2, double porcentagemIpi) {
		double resultado = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (porcentagemIpi/100 + 1);
		return resultado;
	}

}
