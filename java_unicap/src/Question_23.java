//LISTA DE EXERCÍCIOS - FUNÇÕES
/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. 
 * Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
import java.util.Locale;
import java.util.Scanner;

public class Question_23 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite a quantidade de anos: ");
		anos = sc.nextInt();
		
		System.out.println("Digite a quantidade de meses: ");
		meses = sc.nextInt();
		
		System.out.println("Digite a quantidade de dias: ");
		dias = sc.nextInt();
		
		int idade = calculoIdadeEmDias(anos, meses, dias);
		System.out.println("A sua idade em dias é: " + idade);
		sc.close();
	}
	
	public static int calculoIdadeEmDias(int anos, int meses, int dias) {
		int resultado = (anos * 365) + (meses * 30) + dias;
		return resultado;
	}

}
