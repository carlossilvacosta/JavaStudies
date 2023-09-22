//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*7) Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
imprimir o resultado desta operação.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, resultado;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			resultado = x + 5;
		} else {
			resultado = x + 8;
		}
		System.out.println("Resultado: " + resultado);
		sc.close();

	}

}
