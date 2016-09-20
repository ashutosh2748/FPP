package lesson5;

public abstract class Employee implements Payable{
	protected String firstName;
	protected String lastName;
	final protected String ssn;
	public Employee(String firstName, String lastName, String ssn) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	//public double setGrossSales();
	@Override
	abstract public String toString() ;
	void test(){
		//return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	
	abstract public void modifyEmployee();
	
	

}
