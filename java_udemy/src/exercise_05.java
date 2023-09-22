//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class exercise_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		double valorPeca1, valorPeca2, total;
		
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = (quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2);
		
		System.out.printf("TOTAL A PAGAR = R$ %.2f", total);
		
		sc.close();

	}

}
