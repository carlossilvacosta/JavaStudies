/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

import java.util.Locale;
import java.util.Scanner;

public class exercise_24 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int num1 = i;
			int num2 = i * i;
			int num3 = i * i * i;

			System.out.println(num1 + " " + num2 + " " + num3);
		}
		sc.close();

	}

}
