package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char depositoIncial = sc.next().charAt(0);
		double quantia = 0;
		if (depositoIncial == 'y') {
			System.out.println("Enter initial deposit value: ");
			quantia = sc.nextDouble();
		}
		Account account = new Account(numeroConta, nome, quantia);
		
		System.out.println("Account data: " + account);
		
		System.out.println("Enter a deposit value: ");
		quantia = sc.nextDouble();
		account.deposito(quantia);
		System.out.println("Updated account data: " + account);
		
		System.out.println("Enter a withdraw value: ");
		quantia = sc.nextDouble();
		account.saque(quantia);
		System.out.println("Updated account data: " + account);
		
		sc.close();

	}

}
