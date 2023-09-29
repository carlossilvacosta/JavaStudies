package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAlturas = 0;
		int numeroMenores = 0;
		StringBuilder pessoasMenores = new StringBuilder();
		
		for(Pessoa pessoa : pessoas) {
			somaAlturas += pessoa.getAltura();
			
			if(pessoa.getIdade() < 16) {
				numeroMenores++;
				pessoasMenores.append(pessoa.getNome()).append("\n");

			}
		}
		
		double mediaAlturas = somaAlturas / n;
		double porcentagemMenores = ((double) numeroMenores / n) * 100;
		
		System.out.println();
		System.out.printf("Altura Média: %.2f%n", mediaAlturas);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenores);
		System.out.printf("%s%n", pessoasMenores);
		
		sc.close();
		
	}

}
