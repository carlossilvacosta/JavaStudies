package entities;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String nome;
	private List<Curso> cursos;
	
	public Professor() {
	}


	public Professor(String nome) {
		this.nome = nome;
		this.cursos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void addCurso(Curso curso) {
		if(curso.getProfessor() != null) {
			System.out.println("Este curso já está associado a outro professor!");
		} else {
			cursos.add(curso);
			curso.setProfessor(this);
		}
	}
	
	
	
}
