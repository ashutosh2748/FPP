package lesson8;

import java.util.Arrays;



class Person
{
private String lastName;
private String firstName;
private int age;
public Person(String last, String first, int a)
{ // constructor to initialize the values
	this.lastName=last;
	this.firstName=first;
	this.age=a;
}
//[ or ] Override the toString()
public void displayPerson() // Display fisrtName, lastName and age
{
	System.out.println(this.toString());
}
@Override
public String toString() {
	return String.format("Person [lastName=%s, firstName=%s, age=%s]", lastName, firstName, age);
}

public String getLastName() // get only the last name
{ return this.lastName;}
} // end class Person
class PersonArrayOpe
{
private Person[] a; // reference to array
private int size; // No. of elements currently hold
public PersonArrayOpe(int max)
{// constructor to initialize person array with size max {
	a=new Person[max];
	size=0;
}
public Person find(String searchName) // Pass Lastname as an argument
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i].getLastName().equals(searchName))return a[i];
	}
	//
	return null;
}
public void insert(String last, String first, int age)// Insert at last
{
	if(a.length==size())resize();
	a[size]=new Person(last,first,age);
	size++;
}
public boolean delete(String searchName) // Shift down the elements. Argument should
//be lastname
{
	Boolean found=false;
	for(int i=0;i<size;i++)
		{
		if(a[i].getLastName().equals(searchName)||found==true)
	    if(i<size-1)
		a[i]=a[i+1];
	    else a[i]=null;
		found=true;
			
		}
	size--;
	return found;
}
public void displayAll() // displays array contents
{
	int i=0;
	System.out.println("Total number of Elements in this array:"+size);
	for(;i<a.length&&a[i]!=null;i++)
	{
System.out.printf(i+ " ");
a[i].displayPerson();

	}
	
}
public int size() // Return the number of persons stored in the array
{
	return this.size;
}
private void resize()
{
	
	a=Arrays.copyOf(a, a.length*2);
	
	}
}


	

