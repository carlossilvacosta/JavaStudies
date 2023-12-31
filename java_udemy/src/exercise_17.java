//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

import java.util.Locale;
import java.util.Scanner;

public class exercise_17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int menu, alcool, gasolina, diesel;
		
		menu = sc.nextInt();
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		while (menu != 4) {
			if (menu == 1) {
				alcool++;
			} else if (menu == 2) {
				gasolina++;
			} else if (menu == 3) {
				diesel++;
			} else {
				System.out.println("Tente novamente! Aceitos códigos somente de 1 à 4.");
			}
			menu = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
