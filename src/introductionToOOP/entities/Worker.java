package introductionToOOP.entities;

public class Worker {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		double percentual = percentage/100;
		grossSalary = grossSalary * (1 + percentual);
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());

	}

}
