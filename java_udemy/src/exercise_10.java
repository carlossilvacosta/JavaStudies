//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Locale;
import java.util.Scanner;

public class exercise_10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaInicial >= horaFinal) {
			int duracao = (24 - horaInicial) + horaFinal;
			System.out.println("O JOGO DUROU " + (duracao) + " HORA (S)");
		} else {
			int duracao = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + (duracao) + " HORA (S)");
		}

		sc.close();

	}

}
