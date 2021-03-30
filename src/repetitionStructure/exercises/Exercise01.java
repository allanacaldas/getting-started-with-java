package repetitionStructure.exercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 1000:");
		
		int number = sc.nextInt();

		if (number >= 1 && number < 1000) {
			for (int i = 1; i <= number; i++) {
				if (i % 2 != 0) {System.out.println(i);}
			}
		} else {
			System.out.println("Pay attention! You must enter a valid number between 1 and 1000");
		}

		sc.close();
	}
}
