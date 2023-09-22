//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
que C.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a + b < c) {
			int soma = a + b;
			System.out.println("O valor da soma de a + b é menor que o valor de c");
			System.out.printf("Valor da soma: %d%n", soma);
			System.out.printf("Valor de c: %d%n", c);
		} else {
			int soma = a + b;
			System.out.println("O valor da soma de a + b não é menor que o valor de c");
			System.out.printf("Valor da soma: %d%n", soma);
			System.out.printf("Valor de c: %d%n", c);
		}
		
		sc.close();
	}

}
