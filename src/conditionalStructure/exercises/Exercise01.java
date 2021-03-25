package conditionalStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("It's a negative number");
		} else {
			System.out.println("It's a positive number");
		}

		sc.close();
	}

}
