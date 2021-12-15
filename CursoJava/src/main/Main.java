package main;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		final String withPrice = ", witch price is $";
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234597;
		
		 
		
		System.out.println("Products:");
		
		System.out.println(product1 + withPrice + price1);
		
		System.out.println(product2 + withPrice + price2);
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender:" + gender);
		
		System.out.print("Measure with six decimal places : ");
		System.out.printf("%6f%n", measure);
		
		System.out.print("Rouded ( three decimal places): ");
		System.out.printf("%3f%n", measure);
		
		System.out.print("BR decimal point: ");
		System.out.printf(Locale.ROOT, "%3f%n" ,measure);
	}

}
