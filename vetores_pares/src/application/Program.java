//Exercícios de fixação sobre vetores
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, pares;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		pares = 0;
		System.out.println();
		System.out.print("NUMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d" + "  ", vect[i]);
				pares++;
			}
		}
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", pares);
		sc.close();
		
		
	}

}
