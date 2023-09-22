//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*2) Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
mostrar :
a. A menor altura do grupo;
b. A maior altura do grupo;*/

import java.util.Locale;
import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura;
		
		double menorAltura = 1000;
		double maiorAltura= 0;
		
		for (int i=1; i<=15; i++ ) {
			System.out.println("Informe a altura de todo o seu grupo (Total: 15 pessoas), \n"
					+ "Digite a altura da pessoa " + i + ": ");
			altura = sc.nextDouble();
			
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}
			
		}
		
		System.out.println("A menor altura do grupo é: " + menorAltura);
		System.out.println("A maior altura do grupo é: " + maiorAltura);
		
		sc.close();

	}

}