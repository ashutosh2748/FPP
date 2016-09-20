package assignment2;

public class PairOfDice {
public int die1; // Number showing on the first die.
public int die2; // Number showing on the second die.
public PairOfDice() {
// Constructor. Rolls the dice, so that they initially
// show some random values. Call the roll() method to roll the dice.
	roll();
}
public PairOfDice(int val1, int val2) {
// Constructor. Creates a pair of dice that
// are initially showing the values val1 and val2.
	die1=val1;
	die2=val2;
}
public void roll() {
// Roll the dice by setting each of the dice (die1, die2) to be
// a random number between 1 and 6.
	die1=(int)Math.floor(Math.random()*5+1);
	die2=(int)Math.floor(Math.random()*5+1);
	
}
public int sum()
{
	return die1+die2;
}
}