package main;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;

		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234597;

		System.out.println("Products:");

		System.out.printf("%s , witch price is $ %.2f%n", product1, price1);

		System.out.printf("%s , witch price is $ %.2f%n", product2, price2);

		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

		System.out.print("Measure with six decimal places : ");
		System.out.printf("%.6f%n", measure);

		System.out.print("Rouded ( three decimal places): ");
		System.out.printf("%.3f%n", measure);

		System.out.print("US decimal point: ");

		System.out.printf(Locale.US, "%.3f%n", measure);
	}

}
