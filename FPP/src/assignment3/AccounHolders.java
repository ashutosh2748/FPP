package assignment3;

public class AccounHolders {
	

		public static void main(String[] args) {
			SavingsAccount saver1 = new SavingsAccount(2000,0.04);
			SavingsAccount saver2 = new SavingsAccount(3000,0.04);
			double b1 = saver1.calculateMonthlyInterest();
			double b2 = saver2.calculateMonthlyInterest();
			System.out.printf("The new balance of first saver is: %.2f\n",b1);
			System.out.printf("The new balance of second saver is: %.2f\n",b2);
			
		System.out.println("The balance of savers for 12 months is given by:");
		for (int i=0;i<12;i++)
		{
			System.out.println("Monthly balances for saver 1 for "+i+"month are"+saver1.getBalance(i));
			System.out.println("Monthly balances for saver 2 for "+i+"month are"+saver2.getBalance(i));		}
			System.out.println("After setting annual Interest rate to 5%");
			SavingsAccount.modifyAnnualInterestRate(0.05);
			
			System.out.printf("The new balance after one month for first saver is: %.2f\n",saver1.getBalance());
			System.out.printf("The new balance after one month for second saver is: %.2f\n",saver2.getBalance());
		}

	}

