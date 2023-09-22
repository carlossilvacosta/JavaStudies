package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RegistroQuartos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindos à pensão Sonhos!\n");
		
		System.out.print("Quantos quartos irão ser reservados? ");
		int n = sc.nextInt();
		while(n > 10) {
			System.out.print("Temos somente 10 quartos disponíveis. Quantos irão "
					+ "querer reservar? ");
			n = sc.nextInt();
		}

		RegistroQuartos[] registro = new RegistroQuartos[10];
		boolean[] quartosReservados = new boolean[10];

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Reserva #" + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			while(quarto > 9) {
				System.out.println("A númeração dos quartos da nossa pensão vão de 0 a 9. "
						+ "Escolha outro quarto.");
				System.out.print("Quarto: ");
				quarto = sc.nextInt();
			}
			if (quartosReservados[quarto]) {
			    System.out.println("Este quarto já está reservado. Escolha outro quarto.");
			    i--;
			} else {
			    quartosReservados[quarto] = true;
			    registro[quarto] = new RegistroQuartos(nome, email, quarto);
			}
			//registro[quarto] = new RegistroQuartos(nome, email, quarto);
			}

		System.out.println();
		System.out.println("Reservas realizadas: ");
		for(int i=0; i<10; i++) {
			if(registro[i] != null) {
				System.out.println(registro[i].getQuarto() + ": " + registro[i].getNome() + ", " 
			+ registro[i].getEmail());
			}
		}
		
//		System.out.println();
//		System.out.println("Reservas realizadas: ");
//		for (RegistroQuartos registros : registro) {
//			if (registros != null) {
//				System.out.println(registros.getQuarto() + ": " + registros.getNome() + ", " + registros.getEmail());
//			}
//		}
		sc.close();

	}

}
