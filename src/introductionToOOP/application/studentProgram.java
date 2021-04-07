package introductionToOOP.application;

import java.util.Locale;
import java.util.Scanner;

import introductionToOOP.entities.Student;

public class studentProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Nome do aluno: ");
		student.nome = sc.nextLine();

		System.out.print("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Third Grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final grade %.2f%n", student.finalGrade());
		
		if(student.finalGrade()<60) {
			System.out.println("Failed");
			System.out.printf("Missing Points: %.2f%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		
		sc.close();
		
	}

}
