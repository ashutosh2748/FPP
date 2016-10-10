package Lab5.Lab5_2_duckApp;

public interface QuakBehavior {
	public void quack();
}
class Quack implements QuakBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
	System.out.println("Can Quacks");	
	}
	
}
class Squeak implements QuakBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quacks by squeaking");
	}
	
}
class MuteQuack implements QuakBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
	System.out.println("Cannot quack");	
	}
	
}

