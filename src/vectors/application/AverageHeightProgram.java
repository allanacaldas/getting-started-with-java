package vectors.application;

import java.util.Locale;
import java.util.Scanner;

public class AverageHeightProgram {

		public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Let's calculate the average height of Basketball players");
			sc.nextLine();
			
			System.out.print("Enter the quantity of players: ");
			int quantity = sc.nextInt();
			double[] vect = new double[quantity];
			double sum = 0;

			for (int i = 0; i < vect.length; i++) {
				vect[i] = sc.nextDouble();
				sum += vect[i];
			}
			double avg = sum / quantity;

			System.out.printf("Average Height: %.2f%n", avg);

			sc.close();
		}
	

}
