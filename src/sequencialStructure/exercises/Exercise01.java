package sequencialStructure.exercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Find the sum of two numbers");
		System.out.println("Enter a number: ");
		int a = sc.nextInt();		
		System.out.println();
		System.out.println("Enter another one: ");
		int b = sc.nextInt();
		int sum = a+b;
		
		System.out.println("The total is: " + sum);
		
		sc.close();
		
	}
}
