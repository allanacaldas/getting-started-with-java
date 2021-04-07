package introductionToOOP.application;

import java.util.Locale;
import java.util.Scanner;

import introductionToOOP.entities.Worker;

public class WorkerProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Worker worker = new Worker();
		
		worker.name = sc.nextLine();
		worker.grossSalary = sc.nextDouble();
		worker.tax = sc.nextDouble();
		
		System.out.println(worker);
		
		System.out.println("Whice percentage to increase salary? ");
		worker.increaseSalary(sc.nextDouble());
		
		System.out.println(worker);
		
		sc.close();
	}

}
