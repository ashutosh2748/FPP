package lesson8;

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
}
public String getLastName() // get only the last name
{ return null;}
} // end class Person
class PersonArrayOpe
{
private Person[] a; // reference to array
private int size; // No. of elements currently hold
public PersonArrayOpe(int max)
{// constructor to initialize person array with size max {
}
public Person find(String searchName) // Pass Lastname as an argument
{
	Person p=new Person("Ashutosh","Ghimire",1);
	return p;
}
public void insert(String last, String first, int age)// Insert at last
{
}
public boolean delete(String searchName) // Shift down the elements. Argument should
//be lastname
{
	return false;
}
public void displayAll() // displays array contents
{
	
}
public int size() // Return the number of persons stored in the array
{
	return this.size;
}
private void resize()
{
}

}