package assignment4;
import java.util.Scanner;
public class Palindrome
{

    public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            
            return isPalindrome(s.substring(1, s.length()-1));

        
        return false;
    }

    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Palindrome checker check if a word is a palindrome recursively\n Write a word to check if its a palindrome or not");
        String input = in.nextLine();
        if(isPalindrome(input))
            System.out.println(input + " is a palindrome");
        else
            System.out.println(input + " is not a palindrome");
        in.close();
    }
    
}