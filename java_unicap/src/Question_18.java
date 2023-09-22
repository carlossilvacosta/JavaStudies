//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*6) Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.*/

import java.util.Locale;
//import java.util.Scanner;

public class Question_18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		
		for(int i=100; i<=200; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
