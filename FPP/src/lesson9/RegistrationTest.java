package lesson9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


class Registration
{
 int regno; // Registration number
 String cname; // Name of the Course
 String sname; // Name of the student
 String sid; // Student id
// Create a constructor to initialize the values
public Registration(int regno, String cname, String sname, String sid)  {
	
	this.regno = regno;
	this.cname = cname;
	this.sname = sname;
	this.sid = sid;
}
@Override
public String toString() {
	return String.format("Registration [regno=%s, cname=%s, sname=%s, sid=%s]", regno, cname, sname, sid);
}

 
 }


public class RegistrationTest 
{
	public static void main(String [] args)
	{
		
		PriorityQueue<Registration> obj = new PriorityQueue(sidComparator);
		//PriorityQueue<Registration> obj = new PriorityQueue(idComparator);
		obj.add(new Registration(985378,"compro","Ashutosh Ghimire","MS985378"));
		obj.add(new Registration(985379,"compro","Anita Neupane","CS985378"));
		obj.add(new Registration(985380,"compro","Prajil Maharjan","DS985378"));
		obj.add(new Registration(985381,"compro","Suntali Tamang","AS985378"));
		obj.add(new Registration(985381,"compro","Nisha Gautam","ZS985378"));
		obj.add(new Registration(985378,"compro","Anup Devkota","XS985378"));
		
		System.out.println("PeekOBJ"+obj.peek());
		System.out.println("Size of Queue"+obj.size());
		
		Iterator it = obj.iterator();
		System.out.println("List of Elements :" + obj);
		while(it.hasNext()){
			Registration ob = obj.remove();
			System.out.println(ob);
		}	
		System.out.println("List of Elements :" + obj);
		System.out.println("Status of Queue:"+obj.isEmpty());
		//PriorityQueue<Registration> obj = new PriorityQueue(sidComparator);
		//PriorityQueue<Registration>
		obj = new PriorityQueue(idComparator);
		obj.add(new Registration(985378,"compro","Ashutosh Ghimire","MS985378"));
		obj.add(new Registration(985379,"compro","Anita Neupane","CS985378"));
		obj.add(new Registration(985380,"compro","Prajil Maharjan","DS985378"));
		obj.add(new Registration(985381,"compro","Suntali Tamang","AS985378"));
		obj.add(new Registration(985381,"compro","Nisha Gautam","ZS985378"));
		obj.add(new Registration(985378,"compro","Anup Devkota","XS985378"));
		
		//Iterator //
		it = obj.iterator();
		System.out.println("List of Elements :" + obj);
		while(it.hasNext()){
			Registration ob = obj.poll();
			System.out.println(ob);
		}	
		System.out.println("List of Elements :" + obj);
		
	}
public static Comparator<Registration> idComparator = new Comparator<Registration>(){
        
        @Override
        public int compare(Registration r1, Registration r2) {
        	  	return (int) (r1.regno - r2.regno);
        }
    };
    
public static Comparator<Registration> sidComparator = new Comparator<Registration>(){
        
        @Override
        public int compare(Registration r1, Registration r2) {
        	  	return (r1.sid.compareTo(r2.sid));
        }
    };

        
       
}

