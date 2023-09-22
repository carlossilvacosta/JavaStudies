//Exercícios de fixação sobre vetores
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double somaAlturas, mediaAlturas, porcenMenores, somaMenores;
		somaAlturas=0;
		mediaAlturas=0;
		somaMenores = 0;
		porcenMenores=0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];
		double[] vectAltura = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			vectNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectAltura[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			somaAlturas += vectAltura[i];
			if(vectIdade[i] < 16) {
				somaMenores++;
				porcenMenores = (double) (somaMenores / n) * 100;
			}
		}
		
		mediaAlturas = somaAlturas / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcenMenores);
		
		for(int i=0; i<n; i++) {
			if(vectIdade[i] < 16) {
				System.out.printf("%s\n", vectNome[i]);
			}
		}
		
		sc.close();

	}

}
