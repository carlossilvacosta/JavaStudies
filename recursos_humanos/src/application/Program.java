package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Quantos funcionários irão ser registrados? ");
			int n = sc.nextInt();

			List<Funcionarios> funcionariosList = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				System.out.println();
				System.out.println("Funcionário #" + (i + 1) + ":");
				System.out.print("ID: ");
				int id = sc.nextInt();
				for (Funcionarios funcionario : funcionariosList) {
					if (funcionario.getId() == id) {
						System.out.println("Este ID já foi cadastrado, tente novamente!");
						return;
					}
				}
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Salário: ");
				double salario = sc.nextDouble();
				Funcionarios funcionarios = new Funcionarios(id, nome, salario);
				funcionariosList.add(funcionarios);
			}

			System.out.println();
			System.out.print("Digite o ID do funcionário que irá ter um aumento de salário: ");
			int idAumento = sc.nextInt();

			boolean idEncontrado = false;

			for (Funcionarios funcionario : funcionariosList) {
				if (funcionario.getId() == idAumento) {
					System.out.print("Digite o percentual de aumento: ");
					double percentagem = sc.nextDouble();
					funcionario.aumentoSalario(percentagem);
					idEncontrado = true;
					break;
				}
			}

			if (!idEncontrado) {
				System.out.println("Este ID não exite!");
			}

			System.out.println();
			System.out.println("Lista de Funcionários: ");
			for (Funcionarios obj : funcionariosList) {
				System.out.println(obj.getId() + ", " + obj.getNome() + ", " + String.format("%.2f%n", obj.getSalario()));
			}

			sc.close();
		}
	}

}
