package lists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lists.entities.Employee;


public class EmployeeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();

		System.out.println("How many employees will be registered?");
		int quantity = sc.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Employee #" + i + ": ");

			System.out.println("Insert and ID number: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.println("Insert the employee's name: ");
			String name = sc.nextLine();

			System.out.println("Enter the salary amount");
			Double salary = sc.nextDouble();

			Integer pos = position(list, id);
			if (pos == null) {
				Employee emp = new Employee(id, name, salary);
				list.add(emp);
			} else {
			System.out.println("Sorry, but this ID +  has been already registered");
			}

		}
		
		System.out.print("Enter the employee ID that will have a salary increase: ");
		int idSalary = sc.nextInt();

		Integer position = position(list, idSalary);
		if (position == null) {
			System.out.println("Sorry, This ID wasn't found in our workers's database");

		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(position).increaseSalary(percent);

		}
		
		
		System.out.println("List of employees: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		sc.close();

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
