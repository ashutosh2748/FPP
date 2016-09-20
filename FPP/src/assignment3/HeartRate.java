package assignment3;
import java.time.LocalDate;
import java.time.Period;
//import java.util.Date;
//import java.util.Scanner;

public class HeartRate {
	
	public HeartRate(String firstname, String lastname, LocalDate dOB) {
		//super();
		Firstname = firstname;
		Lastname = lastname;
		DOB = dOB;
	}
	String Firstname;
	String Lastname;
	LocalDate DOB;
	final int RHR=70;
    final double LB=0.5;
    final double UB=0.85;
   
    public double maximum (int Age)
    {
    double MHR=220-Age;
    return MHR;
    }
    public void target(int Age)
    {
    double AHR=this.maximum(age())-RHR;
    double LBHR=(AHR * LB)+RHR;
    double UBHR=(AHR * UB)+RHR;
    System.out.println("The persons target heart rate lies between "+LBHR+"and"+UBHR);
    }
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public int age ()
	{
		LocalDate currentDate = LocalDate.now();
		return Period.between(this.DOB, currentDate).getYears();
		
	}
	
       
              
}
