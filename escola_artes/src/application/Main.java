package application;

import entities.AlunoDeMusica;
import entities.AlunoDePintura;

public class Main {
    public static void main(String[] args) {
        AlunoDeMusica alunoMusica = new AlunoDeMusica("João", 20, "12345", "Violino");
        AlunoDePintura alunoPintura = new AlunoDePintura("Maria", 22, "54321", "Abstrato");

        System.out.println("Aluno de Música: " + alunoMusica.getNome());
        System.out.println("Instrumento: " + alunoMusica.getInstrumento());
        alunoMusica.estudar();
        alunoMusica.praticar();

        System.out.println("\nAluno de Pintura: " + alunoPintura.getNome());
        System.out.println("Estilo de Pintura: " + alunoPintura.getEstiloPintura());
        alunoPintura.estudar();
        alunoPintura.pintarQuadro();
    }
}
