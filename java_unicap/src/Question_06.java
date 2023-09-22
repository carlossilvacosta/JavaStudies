//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*6) Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são
VERDADEIROS ou FALSOS.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean a, b;
		
		System.out.println("Digite o primeiro valor lógico (true/false): ");
		a = sc.nextBoolean();
		System.out.println("Digite o segundo valor lógico (true/false): ");
		b = sc.nextBoolean();
		
		if (a == true && b == true) {
			System.out.println("Ambos valores são verdadeiros!");
		} else if (a == false && b == false) {
			System.out.println("Ambos valores são falsos!");
		} else {
			System.out.println("Os valores são diferentes!!");
		}
		sc.close();

	}

}
