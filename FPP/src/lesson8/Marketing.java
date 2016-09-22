package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Marketing implements Comparator<Marketing>{
	String employeeName;
	String productName;
	Double SalesAmount;
	public Marketing(String employeeName, String productName, Double salesAmount) {
		
		this.employeeName = employeeName;
		this.productName = productName;
		SalesAmount = salesAmount;
	}
	
	
	@Override
	public String toString() {
		return String.format("Marketing [employeeName=%s, productName=%s, SalesAmount=%s]\n", employeeName, productName,
				SalesAmount);
	}


	public static void main(String [] args)
	{
		ArrayList<Marketing> values=new ArrayList();
		values.add(new Marketing("Bina Gautam","Lenovo",24000.0));
		values.add(new Marketing("Shila Gautam","DELL",34555.0));
		values.add(new Marketing("Nisha Gautam","Lenovo",24000.0));
		values.add(new Marketing("Anup Gautam","Nokia",24000.0));
		values.add(new Marketing("Sharmila Gautam","Lenovo",89000.0));
		values.add(new Marketing("Sovit Gautam","Lenovo",24000.0));
		System.out.println(values.size() +" is the current size of the list");
		System.out.println(values.toString());
		values.remove(2);
		System.out.println(values.size() +" is the current size of the list");
		System.out.println(values.toString());
		System.out.println(values.size() +" is the current size of the list");
		values.set(3, values.get(1));
		System.out.println(values.toString());
		System.out.println(values.size() +" is the current size of the list");
		//Comparator<Marketing> t1= new Comparator1();
		//Collections.sort(values);

		
	}


	@Override
	public int compare(Marketing arg0, Marketing arg1) {
		// TODO Auto-generated method stub
		return arg0.employeeName.compareTo(arg1.employeeName);
		//return 0;
	}
	

}
