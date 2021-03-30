package repetitionStructure.exercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("First, enter the quantity of numbers to be verified: ");
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		System.out.println();
		System.out.println("After that, enter all of the numbers you wanna check if are inside of the interval of [10,20] ");
		for (int i = 0; i < x; i++) {
			int value = sc.nextInt();
			if (value >= 10 && value <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + ": inside of the interval");
		System.out.println(out + ": not in the interval");

		sc.close();
	}

}
