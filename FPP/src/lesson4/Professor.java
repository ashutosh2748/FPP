package lesson4;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	int numberOfPublications;
	

	public Professor(String name, LocalDate hiredate, Double salary, int numberOfPublications) {
		super(name, hiredate, salary);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
