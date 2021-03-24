package sequencialStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantity1, quantity2;
		double itemPrice1, itemPrice2, total;

		System.out.println("Enter the quantity and the item price respectively");
		quantity1 = sc.nextInt();
		itemPrice1 = sc.nextDouble();

		System.out.println("Enter the quantity and the item price respectively");
		quantity2 = sc.nextInt();
		itemPrice2 = sc.nextDouble();

		total = (quantity1 * itemPrice1 + quantity2 * itemPrice2);
		System.out.println("Total: " + total);

		sc.close();
	}
}
