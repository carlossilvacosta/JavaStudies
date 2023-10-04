package application;

import java.util.List;

import entities.Curso;
import entities.Professor;

public class Main {

	public static void main(String[] args) {

		// Criando professores e cursos;
		Professor professor1 = new Professor("Professor A");
		Professor professor2 = new Professor("Professor B");

		Curso curso1 = new Curso("Curso de Matemática");
		Curso curso2 = new Curso("Curso de História");
		Curso curso3 = new Curso("Curso de Ciência da Computação");

		// Associando cursos aos professores;
		professor1.addCurso(curso1);
		professor1.addCurso(curso2);
		professor2.addCurso(curso3);

		// Acessando a lista de cursos de um professor;
		List<Curso> cursosProfessor1 = professor1.getCursos();
		List<Curso> cursosProfessor2 = professor2.getCursos();

		System.out.println("Cursos do Professor 1:");
		for (Curso curso : cursosProfessor1) {
			System.out.println(curso.getNome());
		}

		System.out.println("Cursos do Professor 2:");
		for (Curso curso : cursosProfessor2) {
			System.out.println(curso.getNome());
		}

	}

}
