package assignment3;


	

	import java.util.Scanner;

	public class DriverForBill {
		 
			 public static void main (String[] args)
			 {
				 Scanner in =new Scanner(System.in);
				 int choice;
				 double cp=0;
				 int quantity=1;
				 double discount=0;
				 
				 System.out.println("Enter Choice \nPress 1 for Single book \nPress 2 for Multiple books and \nPress 3 for offering discount:");
				 
				 choice=in.nextInt();
				 
				 switch(choice)
				 {
				 
				 case 1 : 
					 System.out.println("Enter Labelled Price:");
							cp = in.nextDouble();
							System.out.println("Your Total Cost Price:"+ComputeBill.computeBill(cp));
							break;
				
				 case 2 :  
					 System.out.println("Enter Labelled Price:");
					 cp = in.nextDouble();
					 System.out.println("Enter Quantity:");
							quantity = in.nextInt();
							
							 System.out.println("Your Total Cost Price:"+ComputeBill.computeBill(cp,quantity));
							 break;
				 case 3 :
					 
					 System.out.println("Enter Labelled Price:");
					 cp = in.nextDouble();
					 System.out.println("Enter Quantity:");
							quantity = in.nextInt();   
					     
							System.out.println("Enter Discount Rate:");
											discount = in.nextDouble();
											
					System.out.println("Your Total Cost Price:"+ComputeBill.computeBill(cp,quantity,discount));
					break;
					
					default:
						System.out.println("Wrong input Try again :");
				 }
					
				
				 //System.out.println(Billing.computeBill(cp));
				
				 
				 
				 
			 }
			 }
		 





