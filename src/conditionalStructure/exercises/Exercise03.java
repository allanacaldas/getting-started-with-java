package conditionalStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("Enter two numbers to find out if each one of them is multiple of the other");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Multiples");
		} else {
			System.out.println("Not Multiples");
		}
		sc.close();
	}
}
