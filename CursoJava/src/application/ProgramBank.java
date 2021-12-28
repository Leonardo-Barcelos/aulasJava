package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String name;
		double value = 0;

		System.out.println("******************************");
		System.out.println("Welcome to the bank X");
		System.out.println("starting account creation process...");

		System.out.print("Enter account number: ");
		number = sc.nextInt();

		System.out.print("Enter account owner: ");
		name = sc.next();

		System.out.print("Is there na initial deposit (y/n): ");
		String choice = sc.next();

		if (choice.equals("y")) {
			
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
		} 
		BankAccount account = new BankAccount(name, value, number);
		
		
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
