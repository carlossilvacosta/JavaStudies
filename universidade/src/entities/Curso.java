package entities;

public class Curso {
	
	private String nome;
	private Professor professor;
	
	public Curso() {
	}

	public Curso(String nome) {
		this.nome = nome;
		this.professor = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
