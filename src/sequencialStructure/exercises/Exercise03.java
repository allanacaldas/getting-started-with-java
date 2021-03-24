package sequencialStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, difference;
		System.out.println("Enter four numbers bellow: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		difference = (a*b-c*d);
		
		System.out.println("The difference between (a x b) and (c x d) is: " + difference);
		
		sc.close();		
	}
}
