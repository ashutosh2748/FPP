package lesson5;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	
	protected double grossSales;
	protected double commissionRate;

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return grossSales*commissionRate;
	}
	

	public CommissionEmployee(String firstName, String lastName, String ssn) {
		super(firstName, lastName, ssn);
	}


	public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}
	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
		
	}

	@Override
	public String toString() {
		return String.format("CommissionEmployee [grossSales=%s, commissionRate=%s, firstName=%s, lastName=%s, ssn=%s]",
				grossSales, commissionRate, firstName, lastName, ssn);
	}
	@Override
	 public void modifyEmployee()
	{
		System.out.println("Enter your new Commissionrate");
		Scanner in=new Scanner(System.in);
		this.commissionRate=in.nextDouble();
		in.close();
	}

	
}
