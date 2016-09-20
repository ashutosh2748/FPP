package assignment3;

public class ComputeBill {
	

	
		public static double computeBill(double price)
		{
			return price*1.08;
		}
		public static double computeBill(double price,int number)
		{
			return price*1.08*number;
		}
		public static double computeBill(double price,int number, double discount)
		{
			//double temp;
			price=price-price*discount/100;
			return price*1.08*number;
		}


	



}
