package introductionToOOP.application;

import java.util.Locale;
import java.util.Scanner;

import introductionToOOP.entities.Triangle;

public class TriangleUsingOPP {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures os triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures os triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		System.out.printf("The X area is: %.2f%n", areaX);		
		System.out.printf("The Y area is: %.2f%n ", areaY);
		

		if (areaX > areaY) {
			System.out.println("The triangle X has the largest area");
		} else {
			System.out.println("The triangle Y has the largest area");
		}

		sc.close();

	}

}
