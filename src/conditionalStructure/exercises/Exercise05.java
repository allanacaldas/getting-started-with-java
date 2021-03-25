package conditionalStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double numero = sc.nextDouble();

		if (numero > 0 && numero <= 25) {
			System.out.println("Interval: [0-25]");
		} else if (numero > 25 && numero <= 50) {
			System.out.println("Interval: [25-50]");
		} else if (numero > 50 && numero <= 75) {
			System.out.println("Interval: [50-75]");
		} else if (numero > 75 && numero <= 100) {
			System.out.println("Interval: [75-100]");
		} else {
			System.out.println("Out of Interval");
		}
		sc.close();
	}

}
