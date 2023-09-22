//Exercícios de fixação sobre vetores
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double soma, media;
		soma=0;
		media=0;
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES: ");
		for(int i=0; i < vect.length; i++) {
			System.out.printf("%.1f" + "  ", vect[i]);
			soma += vect[i];
			media = soma/vect.length;
			
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);
		
		sc.close();
		}

}
