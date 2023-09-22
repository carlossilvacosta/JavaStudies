//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*4) Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		
		if (a == b) {
			c = a + b;
		} else {
			c = a * b;
		}
		
		System.out.println("Resultado: " + c);
		sc.close();

	}

}
