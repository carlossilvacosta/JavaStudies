//Exercícios de fixação sobre vetores
/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaNotas;

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] vetorNome = new String[n];
		double[] vetorNota1 = new double[n];
		double[] vetorNota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
			System.out.print("Nome: ");
			sc.nextLine();
			vetorNome[i] = sc.nextLine();
			System.out.print("Nota 1: ");
			vetorNota1[i] = sc.nextDouble();
			System.out.print("Nota 2: ");
			vetorNota2[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			mediaNotas = (vetorNota1[i] + vetorNota2[i]) / 2;
			if(mediaNotas >= 6.0) {
				System.out.printf("%s%n", vetorNome[i]);
			}
		}
		sc.close();

	}

}
