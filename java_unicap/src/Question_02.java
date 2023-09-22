//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*2) Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
estado civil seja “CASADA”, solicitar o tempo de casada (anos).*/

import java.util.Locale;
import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, estadoCivil;
		char sexo;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite seu sexo (F/M): ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Digite seu Estado Civil (SOLTEIRO/CASADO): ");
		estadoCivil = sc.next();
		
		if (sexo == 'F' && estadoCivil.equalsIgnoreCase("CASADA")) {
			System.out.println("Digite o tempo de casamento (anos)? ");
			int casamento = sc.nextInt();
			
			System.out.println("\n\n");
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estado Civil: " + estadoCivil);
			System.out.println("Tempo de casa: " + casamento + " anos.");
			
		} else {
			System.out.println("\n\n");
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estado Civil: " + estadoCivil);
		}
		
		sc.close();
		

	}

}
