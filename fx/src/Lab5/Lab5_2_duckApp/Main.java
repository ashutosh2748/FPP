package Lab5.Lab5_2_duckApp;
public class Main {
	public static void main(String[] args) {
		Duck[] ducks = 
			{new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly.fly();
			d.quack.quack();
			d.swim();
			System.out.println("");
		}
	}
}
/*
MallardDuck:
This is MallardDuck----
Flying with Wings
Can Quacks
Can Swim 

DecoyDuck:
This is DecoyDuck----
Cannot fly with wings
Cannot quack
Can Swim 

RedheadDuck:
This is RedheadDuck----
Flying with Wings
Can Quacks
Can Swim 

RubberDuck:
This is RubberDuck----
Cannot fly with wings
Quacks by squeaking
Can Swim 
*/