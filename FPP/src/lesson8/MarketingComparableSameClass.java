package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketingComparableSameClass implements Comparable<MarketingComparableSameClass>{
	String employeeName;
	String productName;
	Double SalesAmount;
	public MarketingComparableSameClass(String employeeName, String productName, Double salesAmount) {
		
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
		
		ArrayList<MarketingComparableSameClass> values=new ArrayList();
		//MarketComparator t =values.new MarketComparator();
		values.add(new MarketingComparableSameClass("Bina Gautam","Lenovo",24000.0));
		values.add(new MarketingComparableSameClass("Shila Gautam","DELL",34555.0));
		values.add(new MarketingComparableSameClass("Nisha Gautam","Lenovo",24000.0));
		values.add(new MarketingComparableSameClass("Anup Gautam","Nokia",24000.0));
		values.add(new MarketingComparableSameClass("Sharmila Gautam","Lenovo",89000.0));
		values.add(new MarketingComparableSameClass("Sovit Gautam","Lenovo",24000.0));
		System.out.println(values.size() +" is the current size of the list");
		System.out.println(values.toString());
		values.remove(2);
		System.out.println(values.size() +" is the current size of the list");
		System.out.println(values.toString());
		System.out.println(values.size() +" is the current size of the list");
		values.set(3, values.get(1));
		System.out.println(values.toString());
		System.out.println(values.size() +" is the current size of the list");
		Collections.sort(values);
		System.out.println("Sorted Output \n");
		
		System.out.println(values);

		
	}

	
	/*@Override
	public  int compare (Marketing arg0, Marketing arg1)
	{
		// TODO Auto-generated method stub
		return arg0.employeeName.compareTo(arg1.employeeName);
		//return 0;
	}*/


	@Override
	public int compareTo(MarketingComparableSameClass o) {
		// TODO Auto-generated method stub
		if(this.SalesAmount>o.SalesAmount)return 1;
		else if(this.SalesAmount<o.SalesAmount)return -1;
		else return 0;
		//return 0;
	}


	
	

}
