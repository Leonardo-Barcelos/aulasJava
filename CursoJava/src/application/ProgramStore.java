package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramStore {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + product);

		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("\nUpdate data: " + product);
		
		System.out.print("\nEnter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("\nUpdate data: " + product);
		
		sc.close();

	}

}
