package assignment3;

import java.util.Scanner;
import java.time.LocalDate;

public class HeartrRateDriver {
	public static void main(String [] args){
	
 	    int Age=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter First Name:");
        String first=in.next();
        System.out.println("Enter Last Name:");
        String last=in.next();
        // System.out.println("Enter your age: ");
       System.out.println("Enter you Date of birth mm dd yyyy");
        int month = in.nextInt();
        int date=in.nextInt();
        int year=in.nextInt();
        
        HeartRate HR= new HeartRate(first,last,LocalDate.of(year, month, date));
        System.out.println("Your age in years is "+HR.age());
        System.out.println("Your Maximum Heart Rate is :"+HR.maximum(HR.age()));
        final int RHR=70;
        final double LB=0.5;
        final double UB=0.85;
       
        float MHR=220-Age;
        float AHR=MHR-RHR;
        double LBHR=(AHR * LB)+RHR;
        double UBHR=(AHR * UB)+RHR;
       
        System.out.println("Target Heart Rate range from "+ LBHR +"to " +UBHR );

}
}
