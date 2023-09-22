//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
imprimindo o resultado.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, resultado;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if(x > 0) {
			resultado = 2 * x;
		} else {
			resultado = 3 * x;
		}
		System.out.println("Resultado: " + resultado);
		sc.close();

	}

}
