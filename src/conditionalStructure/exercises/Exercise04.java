package conditionalStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price, total;
		System.out.println("Enter the product ID and the quantity of products: ");
		int productID = sc.nextInt();
		int quantity = sc.nextInt();

		switch (productID) {
		case 1:
			price = 4.00;
			break;
		case 2:
			price = 4.50;
			break;
		case 3:
			price = 5.00;
			break;
		case 4:
			price = 2.00;
			break;
		case 5:
			price = 1.50;
			break;
		default:
			price = 0;
			break;
		}

		total = price * quantity;
		System.out.printf("Total: $%.2f%n", total);

		sc.close();
	}
}
