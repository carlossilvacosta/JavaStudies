package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		List<Contribuintes> taxasPagas = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String nome =sc.nextLine();
				System.out.print("Anual income: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				
				PessoaFisica fisica = new PessoaFisica(nome, rendaAnual, gastoSaude);
				taxasPagas.add(fisica);
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String nome =sc.nextLine();
				System.out.print("Anual income: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				
				PessoaJuridica juridica = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				taxasPagas.add(juridica);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Contribuintes contribuintes : taxasPagas) {
			StringBuilder sb = new StringBuilder();
			sb.append(contribuintes.getNome() + 
					": $ ").append(String.format("%.2f", contribuintes.taxa()));
			System.out.println(sb);
		}
		
		double soma = 0.0;
		for(Contribuintes contribuintes : taxasPagas) {
			soma += contribuintes.taxa();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", soma);
		
		sc.close();
	}
}
