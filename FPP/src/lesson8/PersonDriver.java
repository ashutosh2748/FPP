package lesson8;

public class PersonDriver {
	
		public static void main(String Args[])
		{
			
			PersonArrayOpe l = new PersonArrayOpe(4);
			l.insert("Ashutosh","Ghimire",34);
			l.insert("Renuka","Khatiwada",28);
			l.insert("Arvin","Ghimire",4);
			l.insert("Ananda","Ghimire",45);
			l.insert("Sunanda","Ghimire",20);
			l.insert("Aalok","Ghimire",24);
			System.out.println("The list of size "+l.size()+" is "+l);
			l.displayAll();
			l.delete("Ashutosh");
			l.insert("Arvin","Ghimire",4);
			l.displayAll();
			System.out.println(l.find("Renuka"));

		}
			

}
