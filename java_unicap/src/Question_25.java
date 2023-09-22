//LISTA DE EXERCÍCIOS - FUNÇÕES
/*Informar um saldo e imprimir o saldo com reajuste de 1%.*/

import java.util.Locale;
import java.util.Scanner;

public class Question_25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Digite o seu saldo e descubra o valor com o reajuste: ");
		saldo = sc.nextDouble();
		
		double reajuste = calcularReajuste(saldo);
		System.out.printf("O seu saldo com o reajuste é: %.2f%n", reajuste);
		
		sc.close();

	}
	
	public static double calcularReajuste(double s) {
		double resultado = s + (s * 0.01);
		return resultado;
	}

}
