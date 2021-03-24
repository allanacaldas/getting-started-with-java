package sequencialStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Let's calculate the area of a circle");
		System.out.println();
		
		double radius;
		double area;
		double pi = 3.14159;
		
		System.out.println("Enter the radius value: ");
		radius = sc.nextDouble();

		area = pi * (Math.pow(radius, 2.0));
		System.out.printf("The circle's area is: %.3f%n", area);
		sc.close();

	}
}
