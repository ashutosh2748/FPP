package lesson4;

public class ComputerMain {
	
	public static void main(String [] args)throws CloneNotSupportedException{
	Computer a=new Computer("HP","Intel",4,500,5);
	Notebook b=new Notebook("Lenovo","Intel",6,900,8,16,17,10);
	Computer c=new Computer("HP","Intel",4,500,5);
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	System.out.println("IF computer a equals computer b):"+a.equals(b));
	System.out.println("IF computer a equals computer c):"+a.equals(c));
	System.out.println("Computer A B and C hash codes\n"+a.hashCode()+"\n"+b.hashCode()+"\n"+c.hashCode());
	
	}

}
