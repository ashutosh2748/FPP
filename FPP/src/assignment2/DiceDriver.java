package assignment2;


public class DiceDriver {
public static void main(String[] args) 
{
// Create two object for the PairOfDice
 // Roll the two pairs of dice for both objects until the totals are same.
 // Display how many times needed to get the same total

PairOfDice userA=new PairOfDice();
PairOfDice userB=new PairOfDice();
int count=0;
do
{
	userA.roll();
	userB.roll();
	System.out.println("First pair come up with total "+userA.sum());
	System.out.println("Second pair come up with total :"+userB.sum());
	
count++;
}while(userA.sum()!=userB.sum());
System.out.printf("It took %d times to reach the same value.",count);

}
}