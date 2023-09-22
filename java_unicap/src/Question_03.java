//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*3) Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número é impar!");
		}
		sc.close();
	}

}
