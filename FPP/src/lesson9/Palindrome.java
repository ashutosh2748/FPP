package lesson9;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	
	

	    public static void main(String[] args) {
	    	Scanner in=new Scanner(System.in);
	    	System.out.println("Enter a String");
	    	

	        String input = in.next();
	        Stack<Character> stack = new Stack<Character>();

	        for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }

	        String reverseInput = "";

	        while (!stack.isEmpty()) {
	            reverseInput += stack.pop();
	        }

	        if (input.equals(reverseInput))
	            System.out.println("The Provided String "+input+ " is a palindrome.");
	        else
	        	 System.out.println("The Provided String "+input+ " is not a palindrome.");
	    
	    in.close();
	    }
	}

