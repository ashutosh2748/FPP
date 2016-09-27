package lesson12;

import java.util.Scanner;

public class Question3 {
	private String customerName;
	private int accountNo;
	private double balance;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Question3(String customerName, int accountNo, double balance) {
		super();
		this.customerName = customerName;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public static void main(String[] args)
	{
		Question3 obj=new Question3("Ashutosh",123456,25000.0);
		Scanner in=new Scanner(System.in);
		try {
		
		String transaction;
		double transamount=0.0;
		int choice=0;
		while (true)
		{
			System.out.println("Enter your Choice ? Press 0 for Balance Inquiry ,1 for Deposit ,2 for Withdraw and any other number for exit:");
			
				try {
					choice=Integer.parseInt(in.next());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("Enter your Choice Correctly");
					continue;
				}
				if(choice==0){
					System.out.println("Your balance is :"+obj.getBalance());
					continue;
				}
				if(!(choice==1||choice==2))break;
				else {
				System.out.println("Enter your amount");
				transaction=in.next();
				try {
					transamount=Double.parseDouble(transaction);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("Enter your amount properly");
				}
				if(choice==1)
				
					obj.deposit(transamount);
				
				else if(choice==2)		
					
		try {
			obj.withdraw(transamount);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
				}
		}
		}
		finally
		{
			in.close();
		}
		
		System.out.println("Thank You");
		System.out.println("Have a Nice Day!!!");
		
	}
	private void withdraw(double d) throws Exception{
		// TODO Auto-generated method stub
		Exception ov =new Exception("Balance Overdraft not available by default:");
		if (d>balance) throw ov;
		else balance-=d;
				}
	
	private void deposit(double d) {
		// TODO Auto-generated method stub
		balance+=d;
	}

}
