//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

// Renda de R$ 0.00 a R$ 2000.00 -> Isento Imposto de Renda
// Renda de R$ 2000.01 a R$ 3000.00 -> 8% Imposto de Renda
// Renda de R$ 3000.01 a R$ 4500.00 -> 18% Imposto de Renda
// Renda acima de R$ 4500.00 -> 28% Imposto de Renda

//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class exercise_14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double renda;

		renda = sc.nextDouble();

		if (renda > 0 && renda <= 2000.00) {
			System.out.println("Isento");
		} else if (renda > 2000.00 && renda <= 3000.00) {
			double total;
			total = 0.08 * (renda - 2000.00);
			System.out.printf("R$ %.2f", total);
		} else if (renda > 3000.00 && renda <= 4500.00) {
			double total;
			total = 0.08 * 1000.00 + 0.18 * (renda - 3000.00);
			System.out.printf("R$ %.2f", total);
		} else if (renda > 4500.00) {
			double total;
			total = 0.08 * 1000.00 + 0.18 * 1500.00 + 0.28 * (renda - 4500.00);
			System.out.printf("R$ %.2f", total);
		}
		sc.close();
	}

}
