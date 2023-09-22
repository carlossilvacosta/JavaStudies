import java.util.Locale;
import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco, resultado, parcelas;
		int tipoPagamento;

		System.out.print("Digite o preço do produto escolhido: \nR$ ");
		preco = sc.nextDouble();

		System.out.println("Qual o tipo de pagamento?");
		System.out.println("1 - À vista em dinheiro ou cheque, recebe 10% de desconto.");
		System.out.println("2 - À vista no cartão de crédito, recebe 15% de desconto.");
		System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros.");
		System.out.println("4 - Em duas vezes, preço normal de etiqueta mais juros de 10%.");
		tipoPagamento = sc.nextInt();
		
		resultado = 0;

		if (tipoPagamento == 1) {
			resultado = preco - (preco * 10 / 100);
			System.out.printf("Resultado: R$ %.2f%n", resultado);
		} else if (tipoPagamento == 2) {
			resultado = preco - (preco * 15 / 100);
			System.out.printf("Resultado: R$ %.2f%n", resultado);
		} else if (tipoPagamento == 3) {
			resultado = preco;
			parcelas = preco / 2;
			System.out.printf("Resultado: R$ %.2f%n", resultado);
			System.out.printf("Parcelas (2x): RS %.2f%n", parcelas);
		} else if (tipoPagamento == 4) {
			resultado = preco + (preco * 10 / 100);
			parcelas = preco / 2 + (preco * 10 / 100);
			System.out.printf("Resultado: R$ %.2f%n", resultado);
			System.out.printf("Parcelas (2x): RS %.2f%n", parcelas);
		} else {
			System.out.println("Reinicie o programa e digite novamente o tipo de pagamento entre de 1 a 4.");
		}
		sc.close();
		
	}

}
