package introductionToOOP.application;
import java.util.Locale;
import java.util.Scanner;

import introductionToOOP.entities.Product;

public class ProductProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter the product data");
		System.out.println();

		System.out.println("Enter the product name");
		product.name = sc.next();
		System.out.println("Enter the product price");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock:");
		product.quantity = sc.nextInt();
		
		System.out.println("Enter the quantity of products to be added");
		product.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + product);

		
		System.out.println("Enter the quantity of products to be removed");
		product.removeProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + product);

		
		System.out.println(product);
		//"Name: " + product.name +", price: $" + product.price + ", quantity in stock: " + product.quantity
		
		
		sc.close();
	}

}
