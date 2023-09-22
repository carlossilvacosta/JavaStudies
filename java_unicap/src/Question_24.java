//LISTA DE EXERCÍCIOS - FUNÇÕES
/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. 
 * A soma das duas médias. A média das médias.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5, n6;
		
		System.out.println("Digite três numeros quaisquer: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		double media = calculoMedia(n1, n2, n3);
		System.out.println("A média artimetica desses números é: " + media);
		
		System.out.println("Digite mais três numeros quaisquer: ");
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		
		double media2 = calculoMedia(n4, n5, n6);
		System.out.println("A média artimetica desses números é: " + media2);
		
		double soma = somaMedias(media, media2);
		System.out.println("A soma das médias é: " + soma);
		
		double mediasResultado = mediaDasMedia(media, media2);
		System.out.println("A médias das médias é: " + mediasResultado);
		
		sc.close();

	}
	
	public static double calculoMedia(int x1, int x2, int x3) {
		int resultado = (x1 + x2 + x3) / 3;
		return resultado;
	}
	
	public static double somaMedias(double x, double y) {
		double somaResultado = x + y;
		return somaResultado;
	}
	
	public static double mediaDasMedia(double x, double y) {
		double mediasResultado = (x + y) / 2;
		return mediasResultado;
	}

}
