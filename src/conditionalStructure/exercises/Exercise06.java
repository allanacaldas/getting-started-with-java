package conditionalStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		System.out.println("Enter the X value");
		x = sc.nextDouble();
		System.out.println("Enter the Y value");
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Quadrant I");
		} else if (x > 0 && y < 0) {
			System.out.println("Quadrant IV");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrant II");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrant III");
		} else if (x == 0 && y == 0) {
			System.out.println("Origin");
		} else if (y == 0) {
			System.out.println("Y axis");
		} else if (x == 0) {
			System.out.println("X axis");
		}

		sc.close();
	}
}
