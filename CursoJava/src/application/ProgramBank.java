package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BankAccount account;

		System.out.println("******************************");
		System.out.println("Welcome to the bank X");
		System.out.println("starting account creation process...");

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account owner: ");
		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n): ");
		char choice = sc.next().charAt(0);

		if (choice == 'y') {

			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(name, number, initialDeposit);

		} else {

			account = new BankAccount(name, number);

		}

		System.out.print(account.toString() + "\n");

		System.out.println("******************************");
		System.out.print("Enter a  deposit value: ");
		double depositValue = sc.nextDouble();

		account.deposit(depositValue);
		System.out.println("Account update data : \n" + account.toString());

		System.out.println("******************************");
		System.out.print("Enter a  withdraw value: ");
		double withdrawValue = sc.nextDouble();

		account.withdraw(withdrawValue);
		System.out.println("Account update data : \n" + account.toString());

		System.out.println("******************************");

		sc.close();

	}

}
