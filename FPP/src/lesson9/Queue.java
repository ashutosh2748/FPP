package lesson9;

import java.util.Arrays;

class Person
{
private String lastName;
private String firstName;
private int age;
Person(String last, String first, int a)
{ // constructor to initialize the values
	this.lastName=last;
	this.firstName=first;
	this.age=a;
}

@Override
public String toString() {
	return String.format("Person [lastName=%s, firstName=%s, age=%s]", lastName, firstName, age);
}

}

public class Queue {
    Person [] p=new Person[5];
    int count=0;
    public void add (Person obj)
    {
    	p[count]=obj;
    	count++;
    	    }
    public Person remove()
    {
    	if(p[0]!=null)
    	{
    	Person temp=p[0];
    	for(int i=0;i<count;i++)
    		p[i]=p[i+1];
    	
    	count--;
    	
    	return temp;
    	}
    	return null;
    }
    public Person peek()
    {
    return p[count];	
    }
    
    public int size()
    {
    	return count;
    }
    public boolean isEmpty()
    {
    	if (count==0) return true;
    	else return false;
    }
    public static void main(String [] args) {
    	Person a=new Person("ashu","ashu",2);
    	Queue thequeue=new Queue();
    	System.out.println("Is the Queue Empty:"+thequeue.isEmpty());
    	System.out.println("Adding Persons in queue:");
    	thequeue.add(a);
    	thequeue.add(new Person("aalok","ghimire",45));
    	System.out.println("Size of Queue:"+thequeue.size());
    	
    	System.out.println(thequeue.toString());
    	thequeue.peek();
    	System.out.println("Size of Queue:"+thequeue.size());
    	System.out.println(thequeue.toString());
    	thequeue.remove();
    	System.out.println("Size of Queue:"+thequeue.size());
    	System.out.println(thequeue.toString());
    	thequeue.add(new Person("Abhishek","Dahal",90));
       	System.out.println(thequeue.toString());
       	System.out.println("Size of Queue:"+thequeue.size());
       	System.out.println("Is the Queue Empty:"+thequeue.isEmpty());
       	System.out.println("Emptying queue:.....................");
    	while(thequeue.size()>0)
    	{
    		thequeue.remove();
    	}
    	
    	System.out.println("Is the Queue Empty:"+thequeue.isEmpty());
    	
       	
    	
    	}
	@Override
	public String toString() {
		return String.format("Queue [p=%s, count=%s]", Arrays.toString(p), count);
	}
    
    
    	//a. Element
    }
	
	


