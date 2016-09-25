package lesson8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class MarketingComparatorDifferentClass {
	

	
		String employeeName;
		String productName;
		Double SalesAmount;
		public MarketingComparatorDifferentClass(String employeeName, String productName, Double salesAmount) {
			
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
			
			
			ArrayList<MarketingComparatorDifferentClass> values=new ArrayList();
			
			//MarketComparator t =values.new MarketComparator();
			values.add(new MarketingComparatorDifferentClass("Bina Gautam","Lenovo",24000.0));
			values.add(new MarketingComparatorDifferentClass("Shila Gautam","DELL",34555.0));
			values.add(new MarketingComparatorDifferentClass("Nisha Gautam","Lenovo",24000.0));
			values.add(new MarketingComparatorDifferentClass("Anup Gautam","Nokia",24000.0));
			values.add(new MarketingComparatorDifferentClass("Sharmila Gautam","Lenovo",89000.0));
			values.add(new MarketingComparatorDifferentClass("Sovit Gautam","Lenovo",24000.0));
			System.out.println(values.size() +" is the current size of the list");
			System.out.println(values.toString());
			values.remove(2);
			System.out.println(values.size() +" is the current size of the list");
			System.out.println(values.toString());
			System.out.println(values.size() +" is the current size of the list");
			values.set(3, values.get(1));
			System.out.println(values.toString());
			System.out.println(values.size() +" is the current size of the list");
			Outer mm=new Outer();
			Collections.sort(values,mm);
			Outer1 nn=new Outer1();
			
			System.out.println("Sorted Output by EmployeeID\n");
			Iterator it =values.iterator();
			while(it.hasNext())
				System.out.println(it.next());
			Collections.sort(values,nn);
			it=values.iterator();
			System.out.println("Sorted Output by SalesAmount\n");

			
			while(it.hasNext())
				System.out.println(it.next());
			
			
			
			
			
			
			


			
		}

		
		/*@Override
		public  int compare (Marketing arg0, Marketing arg1)
		{
			// TODO Auto-generated method stub
			return arg0.employeeName.compareTo(arg1.employeeName);
			//return 0;
		}*/


		

		
		

	

}
class Outer implements Comparator<MarketingComparatorDifferentClass> {
	//@Override
	@Override
	public  int compare (MarketingComparatorDifferentClass arg0, MarketingComparatorDifferentClass arg1)
	{
		// TODO Auto-generated method stub
		return arg0.employeeName.compareTo(arg1.employeeName);
		//return 0;
	}
}

class Outer1 implements Comparator<MarketingComparatorDifferentClass> {
	//@Override
	@Override
	public  int compare (MarketingComparatorDifferentClass arg0, MarketingComparatorDifferentClass arg1)
	{
		// TODO Auto-generated method stub
		return arg0.SalesAmount.compareTo(arg1.SalesAmount);
		//return 0;
	}
}
