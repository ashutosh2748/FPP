package lesson12;

import java.util.Scanner;

public class Question2 {

	public static void main(String [] args)
	{
		String input;
		double marks=0.0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Marks");
		input=in.next();
		try {
			marks=Double.parseDouble(input);
			if(marks<0)throw new NumberFormatException("Negative Number input");
			System.out.println(marks);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
System.out.println(e.getClass()+" "+e.getMessage());	

		}
		in.close();
		
		
	}
}
