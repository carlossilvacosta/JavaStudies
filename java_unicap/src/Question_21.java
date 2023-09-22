//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*9) Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
P.G. contendo 10 valores.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, R;
		
		System.out.println("Digite o valor inicial(A): ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor da razão(R): ");
		R = sc.nextInt();
		
		System.out.println("\nA sequencia em P.G. é: ");
		for(int i=0; i<10; i++) {
			double resultado = A * Math.pow(R, i);
			System.out.print(resultado + " ");
		}
		sc.close();

	}

}
