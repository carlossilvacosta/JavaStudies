//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*4) Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
terminar quando for lido um número negativo.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int intervalo1 = 0;
		int intervalo2 = 0;
		int intervalo3 = 0;
		int intervalo4 = 0;
		
		while(true) {
			System.out.println("Digite um valor qualquer: ");
			int valor = sc.nextInt();
			
			if(valor < 0) {
				break;
			}
			
			if(valor >= 0 && valor <= 25) {
				intervalo1 = intervalo1 + 1;
			} else if (valor >= 26 && valor <= 50) {
				intervalo2 = intervalo2 + 1;
			} else if (valor >= 51 && valor <= 75) {
				intervalo3 = intervalo3 + 1;
			} else if (valor >= 76 && valor <= 100) {
				intervalo4 = intervalo4 + 1;
			} else {
				System.out.println("Algo deu errado!");
			}
			
			
		}
		System.out.println("\nResultado dos contadores: ");
		System.out.println("Contador intervalo 1 [0-25]: " + intervalo1);
		System.out.println("Contador intervalo 2 [26-50]: " + intervalo2);
		System.out.println("Contador intervalo 3 [51-75]: " + intervalo3);
		System.out.println("Contador intervalo 4 [76-100]: " + intervalo4);
		
		sc.close();

	}

}
