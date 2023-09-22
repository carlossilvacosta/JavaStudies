//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*5) Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
números lidos. O número que encerrará a leitura será zero.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contadorPar = 0;
		int contadorImpar = 0;
		int contadorGeral = 0;
		int somaPar = 0;
		int somaImpar = 0;
		int somaGeral = 0;
		double mediaPar = 0;
		double mediaImpar = 0;
		double mediaGeral = 0;
		
		while(true) {
			System.out.println("Digite um valor qualquer: ");
			int valor = sc.nextInt();
			
			if(valor == 0) {
				break;
			}
			
			if(valor>0) {
			contadorGeral++;
			somaGeral = somaGeral + valor;
			mediaGeral = (double)somaGeral/contadorGeral;
			}
			
			if(valor % 2 == 0 && valor > 0) {
				contadorPar++;
				somaPar = somaPar + valor;
				mediaPar = (double)somaPar/contadorPar;
				
			} else if (valor % 2 != 0 && valor > 0) {
				contadorImpar++;
				somaImpar = somaImpar + valor;
				mediaImpar = (double)somaImpar/contadorImpar;
			} else if (valor < 0) {
				System.out.println("Só são aceitos números positivos, digite novamente! ");
			}
			
		}
		System.out.println("\nApresentação dos resultados: ");
		System.out.println("Quantidade números pares: " + contadorPar);
		System.out.println("Quantidade números impares: " + contadorImpar);
		System.out.println("Quantidade total de números: " + contadorGeral);
		System.out.printf("Média de valores pares: %.1f%n", mediaPar);
		System.out.printf("Média de valores impares: %.1f%n", mediaImpar);
		System.out.printf("Média geral de valores: %.1f%n", mediaGeral);
		
		sc.close();
	}

}
