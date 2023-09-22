//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*8) Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem
decrescente.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite três valores diferentes abaixo. \n");
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = sc.nextInt();
		
		if(a > b && b > c) {
			System.out.println(a + " " + b + " " + c);
		} else if (a > c && c > b) {
			System.out.println(a + " " + c + " " + b);
		} else if (b > a && a > c) {
			System.out.println(b + " " + a + " " + c);
		} else if (b > c && c > a) {
			System.out.println(b + " " + c + " " + a);
		} else if (c > a && a > b) {
			System.out.println(c + " " + a + " " + b);
		} else if (c > b && b > a) {
			System.out.println(c + " " + b + " " + a);
		} else {
			System.out.println("Reinicie o programa e digite três valores diferentes!");
		}
		
		sc.close();

	}

}
