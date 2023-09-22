//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*1) Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
três e que se encontram no conjunto dos números de 1 até 500.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		for(int i=1; i<=500; i++) {
			if(i % 2 !=0 && i % 3 == 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);
		
		sc.close();
		

	}

}
