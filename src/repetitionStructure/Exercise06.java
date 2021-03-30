package repetitionStructure;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Now, you're gonna find out the divisors of a number");
		System.out.println();

		System.out.print("First, enter the choosen number:");
		int x = sc.nextInt();
		System.out.println("Here are the divisors of " + x);
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
