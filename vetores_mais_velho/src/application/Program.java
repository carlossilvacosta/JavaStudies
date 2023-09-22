//Exercícios de fixação sobre vetores
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idadeMaior;
		String nomeMaisVelho;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vetorNome = new String[n];
		int[] vetorIdade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			vetorNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}
		
		idadeMaior = 0;
		nomeMaisVelho = null;
		for(int i = 0; i < n; i++) {
			if(vetorIdade[i] > idadeMaior) {
				idadeMaior = vetorIdade[i];
				nomeMaisVelho = vetorNome[i];
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s", nomeMaisVelho);
		sc.close();

	}

}
