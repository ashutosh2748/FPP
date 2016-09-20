package assignment4;

import java.util.Arrays;

public class Recursion {

	public static void main(String[] args)
	{
		String s1="ademngh";
		String s2="bfgjiuy";
		System.out.println("Merged String:"+mergeOrder(s1,s2));
		System.out.println("Minimum character:"+findMinChar("opabcdz",0)+"in opabcdz" );
		int [] temp={1,2,3,4,5,6,7,8,9,0};
		System.out.println("Sum of integer array is : "+findSum(temp));
		int[] n = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println("The position of given number is :"+recursiveBinarySearch(13,n));
		String s3="abababa";
		String s4="abcd";
		System.out.println("The statement that string "+s3+"is palindrome is "+isPalindrome(s3));
		System.out.println("The statement that string "+s4+"is palindrome is"+isPalindrome(s4));			
	}
	public static String mergeOrder(String s1,String s2)
	{
		String str=new String("");
		//str.concat(str)
		if(s1.isEmpty())return s2;
		if(s2.isEmpty())return s1;
		else
		{
			if(s1.compareTo(s2)<1)
			{
				
				
				Character.toString(s1.charAt(0)).concat(str);
			str=str.concat(Character.toString(s1.charAt(0)));
			str=str.concat(mergeOrder(s1.substring(1),s2));
		}
			else{
				str=str.concat(Character.toString(s2.charAt(0)));
				str=str.concat(mergeOrder(s1,s2.substring(1)));
			}
		//String str="a";
		}
		return str;
		}
	
	
	public static int findSum (int a[])
	{
		if (a.length==1) {return a[a.length - 1];}
           
		else return a[0]+findSum(Arrays.copyOfRange(a, 1, a.length));
		
	}
	
	public static int recursiveBinarySearch(int n, int[] array) {
	    if(array.length==1) {
	        if(array[0]==n) {
	            return 0;
	        } else {
	            return -1;
	        }
	    } else {
	        int mid = (array.length-1)/2;
	        if(array[mid]==n) {
	            return mid;
	        } else if(array[mid]>n) {
	            return recursiveBinarySearch(n, Arrays.copyOfRange(array, 0, mid));
	        } else {
	            int returnIndex = recursiveBinarySearch(n, Arrays.copyOfRange(array, mid+1, array.length));
	            if(returnIndex>=0) {
	                return returnIndex+mid+1;
	            } else {
	                return returnIndex;
	            }
	        }
	    }
	    
	    
	}
	public static char findMinChar(String x, int z){
	    char min = '~';
	    if(z < x.length()){
	        if(x.charAt(z) < min){
	            min = x.charAt(z);
	        }
	        char min2 = findMinChar(x, z+1); 
	        if (min2 < min) 
	        	min = min2; 
	    }
	    return min;
	}
	
	public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            
            return isPalindrome(s.substring(1, s.length()-1));

        
        return false;
    }
	
	
	
}
