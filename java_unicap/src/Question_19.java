//LISTA DE EXERCÍCIOS DE ALGORITMOS ESTRUTURAS DE REPETIÇÃO
/*7) Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.*/
import java.util.Locale;
import java.util.Scanner;

public class Question_19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("De qual número você deseja ver a tabuada? ");
		int n = sc.nextInt();
		System.out.printf("Tabuada do número %d:\n", n);
		
		for (int i=0; i<=10; i++) {
			System.out.println(i + " x " + n + " = " + i*n);
		}
		sc.close();

	}

}
