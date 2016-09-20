package lesson5;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return wage*hours;
	}
	public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", firstName=" + firstName + ", lastName="
				+ lastName + ", ssn=" + ssn + "]";
	}
	@Override
	public void modifyEmployee() {
		// TODO Auto-generated method stub
		
	}
	

}
