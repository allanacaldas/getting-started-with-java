package vectors.application;

import java.util.Locale;
import java.util.Scanner;

import vectors.entities.Product;

public class AveragePriceProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		double sum = 0;
		Product[] vect = new Product[number];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		double averagePrice = sum / vect.length;
		System.out.printf("Average price: %.2f%n", averagePrice);
		sc.close();
	}

}
