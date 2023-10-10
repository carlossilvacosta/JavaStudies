package application;

import java.util.ArrayList;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		Funcionario f1 = new Desenvolvedor("Carlos", 2728, 1500.00, "Java");
		Funcionario f2 = new Gerente("Lucas", 0710, 2000.00, "Inovação");
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		
		listarFuncionarios(funcionarios);
		
		
	}
	
	public static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
		for(Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.apresentar());
			System.out.println("-----------------------");
		}
	}

}
