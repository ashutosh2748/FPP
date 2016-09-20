package lesson4;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
private double OverTimeHours ;



public Secretary(String name, LocalDate hiredate, Double salary, double overTimeHours) {
	super(name, hiredate, salary);
	OverTimeHours = overTimeHours;
}

public double getOverTimeHours() {
	return OverTimeHours;
}

public void setOverTimeHours(double overTimeHours) {
	OverTimeHours = overTimeHours;
}
@Override
public double computeSalary()
{
	return this.salary+12*this.getOverTimeHours();
}

}
