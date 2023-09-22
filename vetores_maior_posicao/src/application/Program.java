//Exercícios de fixação sobre vetores
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maiorPosicao;
		double maiorValor;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maiorValor = vect[0];
		maiorPosicao = 0;
		
		for(int i=0; i<n; i++) {
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				maiorPosicao = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", maiorPosicao);
		sc.close();

	}

}
