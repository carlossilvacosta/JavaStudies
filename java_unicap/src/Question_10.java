//LISTA DE EXERCÍCIOS DE ALGORITMOS CONDICIONAIS
/*10) O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
umaindicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso*/

import java.util.Locale;
import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.println("Digite sua altura (m): ");
		altura = sc.nextDouble();
		System.out.println("Digite seu peso (Kg): ");
		peso = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		} else if (imc >= 18.5 && imc < 25.0) {
			System.out.println("Você está no peso normal!");
		} else if (imc >= 25.0 && imc < 30.0) {
			System.out.println("Você está acima do peso!");
		} else {
			System.out.println("Você está obeso!");
		}
		sc.close();

	}

}
