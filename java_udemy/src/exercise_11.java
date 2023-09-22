//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Locale;
import java.util.Scanner;

public class exercise_11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem, quantidadeItem;
		
		codigoItem = sc.nextInt();
		quantidadeItem = sc.nextInt();
		
		if (codigoItem == 1) {
			double preco = (quantidadeItem * 4);
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigoItem == 2) {
			double preco = quantidadeItem * 4.50;
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigoItem == 3) {
			double preco = (quantidadeItem * 5.00);
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigoItem == 4) {
			double preco = (quantidadeItem * 2.00);
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigoItem == 5){
			double preco = (quantidadeItem * 1.50);
			System.out.printf("Total: R$ %.2f", preco); 
		} else {
			System.out.printf("Item não encontrado, tente novamente!");
		}
		
		sc.close();
		
	}
}