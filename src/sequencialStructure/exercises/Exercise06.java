package sequencialStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		double pi = 3.14159;
		double rightAngleArea, trapeziumArea, squareArea, rectangleArea, circleArea;

		System.out.println("Enter three numbers bellow:" );
		System.out.println("Let's calculate the area of a Right-angled triangle, a circle, a trapeze, a square and a rectangle using all of them." );
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		rightAngleArea = (a * c) / 2;
		circleArea = Math.pow(c, 2) * pi;
		trapeziumArea = (a + b) * c / 2;
		squareArea = Math.pow(b, 2);
		rectangleArea = a * b;

		System.out.printf("Right-angle Area: %.3f%n", rightAngleArea);
		System.out.printf("Circle Area: %.3f%n", circleArea);
		System.out.printf("Trapezium Area: %.3f%n", trapeziumArea);
		System.out.printf("Square Area: %.3f%n", squareArea);
		System.out.printf("Rectangle Area: %.3f%n", rectangleArea);

		sc.close();
	}
}
