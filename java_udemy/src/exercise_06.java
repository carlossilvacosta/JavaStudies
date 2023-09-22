//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class exercise_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double A, B, C, pi, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		pi = 3.14159;
		
		areaTriangulo = A * C;
		areaCirculo = pi * Math.pow(C, 2.0);
		areaTrapezio = ((A + B) * C)/2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO = %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO = %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO = %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO = %.3f%n", areaRetangulo);
		
		sc.close();
		
	}

}
