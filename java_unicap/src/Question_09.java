//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*9) Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
calcule seu peso ideal, utilizando as seguintes fórmulas:
● para homens: (72.7 * h) – 58;
● para mulheres: (62.1 * h) – 44.7.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura, pesoIdeal;
		char sexo;
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite seu sexo (F/M): ");
		sexo = sc.next().charAt(0);
		
		pesoIdeal = 0;
		
		if(sexo == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo == 'F'){
			pesoIdeal = (62.1 * altura) - 44.7;
		} else {
			System.out.println("Talvez você tem digitado o sexo de forma errada, reinicie o programa e digite novamente.");
		}
		System.out.printf("O seu peso ideal é: %.1f%n", pesoIdeal);
		sc.close();

	}

}
