//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*3) Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, soma, positivos, negativos;
		double resultado = 0;
		double porcenPositivos = 0;
		double porcenNegativos = 0;
		
		soma = 0;
		positivos = 0;
		negativos = 0;
		
		System.out.println("Digite a quantidade de valores que vão ser lidos: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Digite o número " + i + ": ");
			int numero = sc.nextInt();
			soma = soma + numero;
			resultado = (double)soma/n;
			
			if(numero > 0) {
				positivos = positivos + 1;
				porcenPositivos = (double)(positivos * 100)/n;
			} else {
				negativos = negativos + 1;
				porcenNegativos = (double)(negativos * 100)/n;
			}
			
		}
		System.out.println("\n");
		System.out.printf("A média aritimética dos valore é: %.2f%n", resultado);
		System.out.println("A quantidade de valores positivos é: " + positivos);
		System.out.println("A quantidade de valores negativos é: " + negativos);
		System.out.printf("O percentural de valores positivos é: %.1f%s%n", porcenPositivos, "%");
		System.out.printf("O percentural de valores negativos é: %.1f%s%n", porcenNegativos, "%");
		sc.close();
	}

}
