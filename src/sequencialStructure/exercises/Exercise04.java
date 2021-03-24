package sequencialStructure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id, hoursWorked;
		double hourlyWage, salary;
		System.out.println("Enter the ID's worker ");
		id = sc.nextInt();
		System.out.println("Enter the number of hours worked: ");
		hoursWorked = sc.nextInt();
		System.out.println("Enter the hourly wage: ");
		hourlyWage = sc.nextDouble();
		salary = hoursWorked * hourlyWage;
		System.out.println("ID: " + id);
		System.out.printf("Salary: $%.2f%n", salary);

		sc.close();
	}
}
