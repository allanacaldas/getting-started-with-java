package introductionToOOP.application;

import java.util.Locale;
import java.util.Scanner;

//Resolvendo um problema sem orientação a objetos

public class TriangleWithoutPOO {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter the measures of triangle X");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y");
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();

		double pX = (a + b + c) / 2;
		double areaX = Math.sqrt(pX * (pX - a) * (pX - b) * (pX - c));
		double pY = (d + e + f) / 2;
		double areaY = Math.sqrt(pY * (pY - a) * (pY - b) * (pY - c));

		System.out.printf("Triangle X area:  %.4f%n", areaX);
		System.out.printf("Triangle Y area:  %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X " );
		} else {
			System.out.println("Larger area: Y " );
		}

		sc.close();
	}

}
