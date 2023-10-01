package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import util.CadastroPessoas;

public class Program {

	public static void main(String[] args) {

		CadastroPessoas cadastro = new CadastroPessoas();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {
		System.out.println();
		System.out.println("SISTEMA DE CADASTRO DE PESSOAS");
		System.out.println("Menu:");
		System.out.println("1 - Adicionar pessoa.");
		System.out.println("2 - Listar pessoas.");
		System.out.println("3 - Pesquisar pessoas.");
		System.out.println("4 - Deletar pessoas.");
		System.out.println("5 - Sair do sistema.");
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		System.out.println();

			if (opcao == 1) {
				System.out.print("Digite o nome da pessoa que irá ser cadastrada: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite a idade da pessoa: ");
				int idade = sc.nextInt();
				System.out.print("Digite a altura da pessoa: ");
				double altura = sc.nextDouble();
				System.out.print("A pessoa é casada? ");
				sc.nextLine();
				String casado = sc.nextLine();
				if (casado.equals("sim") || casado.equals("Sim")) {
					Pessoa pessoa = new Pessoa(nome, idade, altura, true);
					cadastro.addPessoa(pessoa);
				} else if (casado.equals("não") || casado.equals("Não")) {
					Pessoa pessoa = new Pessoa(nome, idade, altura);
					cadastro.addPessoa(pessoa);
				}

			} else if (opcao == 2) {
				cadastro.listarPessoas();
			} else if (opcao == 3) {
				System.out.print("Digite o nome da pessoa que deseja pesquisar: ");
				sc.nextLine();
				String pessoaPesquisada = sc.nextLine();
				Pessoa pessoaEncontrada = cadastro.buscarPessoa(pessoaPesquisada);
				if (pessoaEncontrada != null) {
					System.out.println();
					pessoaEncontrada.mostrarDetalhes();
				} else {
					System.out.println("Desculpe, não encontramos a pessoa que está procurando.");
				}
			} else if (opcao == 4) {
				System.out.print("Digite o nome da pessoa que deseja deletar: ");
				sc.nextLine();
				String pessoaDeletar = sc.nextLine();
				cadastro.deletarPessoa(pessoaDeletar);
			} else if (opcao == 5) {
				System.out.println("Sistema encerrado, obrigado!");
				break;
			} else {
				System.out.println("Opção inválida, tente novamente!");
			}
		}

		sc.close();
	}

}
