//Exercícios de fixação sobre vetores
/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 
*/package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String generoInput;
		double menorAltura, maiorAltura, somaAlturas, mediaAlturas;
		int numeroHomens, numeroMulheres;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] vetorAltura = new double[n];
		char[] vetorGenero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			vetorAltura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			generoInput = sc.next().toUpperCase();
			vetorGenero[i] = generoInput.charAt(0);
		}
		menorAltura = 1000;
		maiorAltura = 0;
		somaAlturas = 0;
		numeroHomens = 0;
		numeroMulheres = 0;
		mediaAlturas = 0;

		for (int i = 0; i < n; i++) {
			if (vetorAltura[i] > maiorAltura) {
				maiorAltura = vetorAltura[i];
			}
			if (vetorAltura[i] < menorAltura) {
				menorAltura = vetorAltura[i];
			}
			if (vetorGenero[i] == 'M') {
				numeroHomens++;
			} else {
				numeroMulheres++;
				somaAlturas += vetorAltura[i];
			}
		}
		mediaAlturas = somaAlturas / numeroMulheres;

		System.out.println();
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturas);
		System.out.printf("Numero de homens = %d%n", numeroHomens);
		sc.close();
	}

}
