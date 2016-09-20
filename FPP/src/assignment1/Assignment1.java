package assignment1;

import java.util.Scanner;

import java.util.Random;

public class Assignment1 {

	
	public static void main(String a[])
	{
		//dollarFragmentor();
		//isLeapYear();
		//isPalindrome();
		//randomUsername();
		//removeDups();
		//checkerBoard();
		//relativeGravity();
		//multipleGrade();
		System.out.println(Integer.valueOf('a'));
}

	
	public static void isLeapYear()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=0;
		year=in.nextInt();
		
		if(year%400==0||year%4==0&&year%100!=0)
			System.out.println(year+" is a Leap year.");
		else System.out.println(year+" is not a Leap year.");
		in.close();
		
		
	}
	
	public static void isPalindrome()
	{
		Scanner in =new Scanner (System.in);
		System.out.println("Enter a 5 digit number");
		//int test=in.nextInt();
		int test=in.nextInt();
		
		while(test<10000||test>99999){
			System.out.println("Error Enter a digit again");
			test=in.nextInt();
			in.close();
		}
		
	int a[]=new int[5];
	for(int i=0;i<5;i++)
		{
		a[i]=test%10;
		test/=10;
		}
	boolean ppp=true;
	for(int i=0;i<2;i++)
	{
		if(a[i]==a[4-i])continue;
		else {
			ppp=false;
			System.out.println("Number is not  a Palindrome");
			break;
			}
		
	}
	if(ppp==true)System.out.println("Number is a Palindrome");
	}
	
	public static void randomUsername()
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First name:");
		String Fname=in.next();
		System.out.println("Enter Lastname:");
		String Lastname=in.next();
		//int test;
		Random ran=new Random();
		int test=ran.nextInt(1000);
		System.out.println("Your Username:\n");
		System.out.println(Fname.substring(0, 3)+test+Lastname.substring(0, 5));
		in.close();
				
	}
	
	public static void dollarFragmentor()
	{
		
		Scanner in=new Scanner(System.in);
		System.out.print("Input your amount in Dollars?");
		float InputNum=in.nextFloat();
		System.out.println("Your Number:"+InputNum);
		int dollars,quarters,dimes,nickels,pennies;
		InputNum=InputNum*100;
		int testnum=(int)InputNum;
		dollars=testnum/100;
		//System.out.println(testnum);
		testnum=testnum%100;
		//System.out.println(testnum);
		quarters=testnum/25;
		testnum%=25;
		dimes=testnum/10;
		testnum%=10;
		nickels=testnum/5;
		testnum%=5;
		pennies=testnum;
		System.out.println(dollars+" dollars "+quarters+" Quarters "+dimes+" dimes"+nickels+" nickels "+pennies+" pennies");
		in.close();
			
	}
		
	public static void removeDups()
	{
		int Counter=5;
		
		
		System.out.println("Strings Duplicates Will be automatically deleted");
		System.out.println("Enter number of String inputs:");
		
		Scanner in=new Scanner(System.in);
		Counter=in.nextInt();
		String[] original=new String[Counter];
		System.out.println("Enter Strings:");
		for (int i=0;i<Counter;i++)
		{
			System.out.println("Enter String "+i+": ");
			original[i]=in.next();
		}
		System.out.println("Your input strings:\n");
		for (int i=0;i<original.length;i++)
		{
			System.out.println(original[i]);
			System.out.println("\n");
		}
		String[] modified =new String[Counter];
		modified[0]=original[0];
		boolean dups=false;
		for (int i=0,j;i<original.length;i++)
		{
			for (j=0;j<original.length&&modified[j]!=null ;j++)
				{
				if(original[i].compareTo(modified[j])==0)
				
				{
						dups=true;
						break;
				}
				}
			if(dups==false)
			{
				modified[j]=original[i];
				
			}
		
				dups=false;
		}
	
		System.out.println("Your strings: modified \n");
		for (int i=0;i<modified.length&&modified[i]!=null;i++)
		{
			System.out.println(modified[i]);
			System.out.println("\n");
		}
		
		
		in.close();
				
	}
	
	public static void checkerBoard()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number");
		int count=in.nextInt();
	
		for (int i=0;i<count;i++)
			{ 
			if(i%2==0)
			{
			for (int j=0;j<count;j++)
			
				
			System.out.print("* ");
			System.out.println("");
			}
		
			if(i%2==1) { 
				for(int j=0;j<count;j++)
			System.out.print(" *");
			System.out.println("");
			}
			
			
			}
		
	}
	
		public static void relativeGravity()
		{
			System.out.println("Relative Gravity Calculator:");
			System.out.println("Enter your Weight in pounds:");
			Scanner in= new Scanner(System.in);
			double weight=in.nextDouble();
			double relative=0;
			System.out.println("Enter choice of Planet:");
			System.out.println("Choice \t Planet \n 1 \t Venus \n 2 \t Mars \n 3 \t Jupiter \n 4 \t Saturn \n 5 \t Uranus \n 6 \t Neptune ");
			int choice=in.nextInt();
			switch (choice)
			
			{
			case 1 :relative=weight*0.78;
			case 2 :relative=weight*0.39;
			case 3 :relative=weight*2.65;
			case 4 :relative=weight*1.17;
			case 5 :relative=weight*1.05;
			case 6 :relative=weight*1.23;
			
			}
			System.out.println("Your weight in planet of your choice is "+relative);
			in.close();
			
			
		
		}
		
		public static void multipleGrade()
		{
			char [][] student =
					{
					{'A','B','A','C','C','D','E','E','A','D'},
					{'D','B','A','B','C','A','E','E','A','D'},
					{'E','D','D','A','C','B','E','E','A','D'},
					{'C','B','A','E','D','C','E','E','A','D'},
					{'A','B','D','C','C','D','E','E','A','D'},
					{'B','B','E','C','C','D','E','E','A','D'},
					{'B','B','A','C','C','D','E','E','A','D'},
					{'E','B','E','C','C','D','E','E','A','D'}
					};
			char key[]={'D','B','D','C','C','D','A','E','A','D'};
			int[] result={0,0,0,0,0,0,0,0};
			for(int i=0;i<8;i++)
				for(int j=0;j<10;j++)
				if(key[j]==student[i][j])result[i]++;
			
			for(int i=0;i<8;i++)
				System.out.printf("Student %d's correct count is %d\n",i,result[i]);
					
					
			
			
			
		}
}
	
	
	
