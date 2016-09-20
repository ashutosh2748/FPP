package lesson5;

public class SalariedEmployee extends Employee {
	private double salary;
	protected double jpt;

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return salary;
	}

	public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
		super(firstName, lastName, ssn);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	final public void setSalary(double salary) {
		this.salary = salary;
	}
	final public void setSalary(int salary)
	{
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn="
				+ ssn + "]";
	}

	@Override
	public void modifyEmployee() {
		// TODO Auto-generated method stub
		
	}
	

}
