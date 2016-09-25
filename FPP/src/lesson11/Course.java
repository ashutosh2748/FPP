package lesson11;

import java.util.Arrays;
import java.util.HashMap;

public class Course {
	
		String c_name;
		String[] faculty;
		
		public Course(String c_name, String[] faculty) {
			super();
			this.c_name = c_name;
			this.faculty = faculty;
		}
		public String getC_name() {
			return c_name;
		}
		public void setC_name(String c_name) {
			this.c_name = c_name;
		}
		public String[] getFaculty() {
			return faculty;
		}
		public void setFaculty(String[] faculty) {
			this.faculty = faculty;
		}
		
		
@Override
		public String toString() {
			return String.format("Course [c_name=%s, faculty=%s]", c_name, Arrays.toString(faculty));
		}
public static void main(String [] args)
{
	HashMap<String,Course> the =new HashMap();
	String[] A={"Renuka","Joe Lermon", "Paul"};
	Course test=new Course("FPP",A);
	String[] B={"Ramesh","Chandra", "Amit"};
	Course test1=new Course("Database",B);
	the.put("CS390", test1);
	the.put("CS309", test1);
	System.out.println("Checking the keys for CS309:"+the.containsKey("CS309"));
	System.out.println("Retrieving Only the keys:"+the.keySet());
	System.out.println("Retrieving all values:"+the.values());
	System.out.println("Size of hashmap:"+the.size());
	System.out.println("Everything Organised:\n"+the.entrySet());
	
	
}
}
