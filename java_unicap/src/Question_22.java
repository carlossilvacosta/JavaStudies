//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*10) Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120*/

import java.util.Locale;
import java.util.Scanner;

public class Question_22 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a;
		
		System.out.print("Digite um valor inteiro para calcular o fatorial: ");
		a = sc.nextInt();

		int resultado = calcularFatorial(a);

		System.out.print(a + "! = ");
		for (int i = a; i >= 1; i--) {
			System.out.print(i);
			if (i > 1) {
				System.out.print(" X ");
			}
		}
		System.out.println(" = " + resultado);

		sc.close();
	}

	public static int calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calcularFatorial(n - 1);
		}
	}

}
