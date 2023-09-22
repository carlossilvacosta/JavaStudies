package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Nome: ");
		student.nome = sc.nextLine();
		
		System.out.println("Nota 1 (30 pontos): ");
		student.nota1 = sc.nextDouble();
		System.out.println("Nota 2 (35 pontos): ");
		student.nota2 = sc.nextDouble();
		System.out.println("Nota 3 (35 pontos): ");
		student.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("NOTA FINAL = %.2f%n", student.notaFinal());
		System.out.printf(student.situacao());
		
		sc.close();

	}

}
