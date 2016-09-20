package assignment3;

	class SavingsAccount{
		public static double annualInterestRate;
		private double savingsBalance;
		public SavingsAccount(double savingsBalance, double annualInterestRate){
			this.savingsBalance = savingsBalance;
			this.annualInterestRate = annualInterestRate;
		}

		double calculateMonthlyInterest(){
			for(int i=0; i<12; i++){
			double monthlyInterest = savingsBalance * (annualInterestRate/12);
			savingsBalance += monthlyInterest;
//			System.out.printf("Account balance for month"+(i+1)+" %.2f\n",savingsBalance); // This will give every-months balance
			}
			return savingsBalance;
		}
		public static void modifyAnnualInterestRate(double newRate){
			annualInterestRate = newRate; 
			//double monthlyInterest = savingsBalance * (annualInterestRate/12);
			//savingsBalance += monthlyInterest;
			//return savingsBalance;
		}
		public double getBalance()
		{
			double monthlyInterest = savingsBalance * (annualInterestRate/12);
			//savingsBalance += monthlyInterest;
			return savingsBalance+monthlyInterest;
			
	}
		public double getBalance(int month)
		{
			double monthlyInterest = savingsBalance*Math.pow((1+annualInterestRate/(month*12)),month)-savingsBalance;
			//savingsBalance += monthlyInterest;
			return savingsBalance+monthlyInterest;
			//principal * Math.pow((1 + rate/100),time); 
	}


	

}
