//Exercícios de fixação sobre vetores
/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		while(n > 10 || n < 0) {
			System.out.print("Digite um número na faixa de 0 até 10: ");
			n = sc.nextInt();
		}

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS NEGATIVOS DIGITADOS: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d%n", vect[i]);
			}
		}
		sc.close();

	}

}
