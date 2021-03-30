package repetitionStructure.exercises;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			int square = (int) Math.pow(i, 2);
			int cube = (int) Math.pow(i, 3);
			System.out.println(i + " " + square + " " + cube);
		}

		sc.close();
	}

}
