package lesson5;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary ;
	
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return baseSalary+this.grossSales*this.commissionRate;
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasePlusCommissionEmployee [baseSalary=");
		builder.append(baseSalary);
		builder.append(", grossSales=");
		builder.append(grossSales);
		builder.append(", commissionRate=");
		builder.append(commissionRate);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", ssn=");
		builder.append(ssn);
		builder.append("]");
		return builder.toString();
	}
	


}
