package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		/* VERSÃO ANTIGA
		  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double xA;
		double xB;
		double xC;
		double yA;
		double yB;
		double yC;

		System.out.println("Enter the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else if (areaX == areaY) {
			System.out.println("They have igual area");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	*/
		Scanner sc = new Scanner(System.in);
		Triangle triangleX = new Triangle();
		Triangle triangleY = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		triangleX.a = sc.nextDouble();
		triangleX.b = sc.nextDouble();
		triangleX.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		triangleY.a = sc.nextDouble();
		triangleY.b = sc.nextDouble();
		triangleY.c = sc.nextDouble();
		
		double areaX = triangleX.getArea();
		double areaY = triangleY.getArea();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else if (areaX == areaY) {
			System.out.println("They have igual area");
		} else {
			System.out.println("Larger area: Y");
		}
		
		
		sc.close();
	}
		
}
