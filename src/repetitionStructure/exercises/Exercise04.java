package repetitionStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("Sorry, dividing a number by zero isn't possible :( ");
			} else {
				double result = (double) a /b;
				System.out.printf("The result is %.2f%n", result);
			}
		}

		sc.close();
	}

}
