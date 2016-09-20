package lesson4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
	Professor ram=new Professor("Ram",LocalDate.now(),25000.0,5);
	Professor laxman=new Professor("Laxman",LocalDate.now(),25000.0,5);
	Secretary sita=new Secretary("Sita",LocalDate.now(),15000.0,55.0);
	DeptEmployee[] department  = new DeptEmployee[5];
	department[0]=ram;
	department[1]=laxman;
	department[2]=sita;
	System.out.println("Do you want to everyones Salary and sum of all salary?");
	Scanner in=new Scanner(System.in);
	char C=in.next().charAt(0);
	if(C=='Y'||C=='y')
	{
		double salarySum=0;
		for(int i=0;i<department.length&&department[i]!=null;i++)
		{
			System.out.println("Staff\'s Name:"+department[i].getName());
			System.out.println("Staff\'s Salary:"+department[i].computeSalary());
			salarySum+=department[i].computeSalary();
		}
		System.out.println("The sum of all Salaries:"+salarySum);
	}
	
	
	
	in.close();
	}
}
