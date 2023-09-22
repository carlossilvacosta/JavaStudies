/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Locale;
import java.util.Scanner;

public class exercise_21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double x, y; 
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if(y == 0) {
				System.out.println("Divisão Impossível");
			} else {
				double resultado = x/y;
				System.out.printf("%.1f%n", resultado);
			}
		}
		sc.close();
	}

}
