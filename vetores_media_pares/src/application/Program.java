//Exercícios de fixação sobre vetores
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaPares;
		int somaPares, numerosPares;
		somaPares = 0;
		numerosPares = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				somaPares += vect[i];
				numerosPares++;
			} 
		}
		mediaPares = (double) somaPares / numerosPares;
		
		if(somaPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.printf("MEDIA DOS PARES: %.1f%n", mediaPares);
		}
		sc.close();
	}

}
