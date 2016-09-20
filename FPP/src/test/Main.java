package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter your choice (C/R/T");
		Scanner in=new Scanner(System.in);
		char choice=in.next().charAt(0);
		switch (choice) {
		case 'c':
		case 'C':
		{
			System.out.println("Enter Radius");
			int radius = in.nextInt();
			Circle c = new Circle();
			c.setCircle(radius);
			System.out.println("Area Circle:"+c.computeArea());
			System.out.println("Perimeter Circle:"+c.computePerimeter());
			c.readShapeDate();
			break;
			}
		case 'r': 
		case 'R' :
		{	
			System.out.println("Enter Length:");
			int length = in.nextInt();
			System.out.println("Enter Breadth:");
			int breadth = in.nextInt();
			Rectangle r = new Rectangle();
			r.setRectangle(length, breadth);
			System.out.println("Area Rectangle:"+r.computeArea());
			System.out.println("Perimeter Rectangle:"+r.computePerimeter());
			r.readShapeDate();
			break;
			}
		case 't':
		case 'T':	
		{
			System.out.println("Enter Base:");
			int base = in.nextInt();
			System.out.println("Enter Height:");
			int height = in.nextInt();
			RtTriangle rt = new RtTriangle();
			
			rt.setRtTriangle(base, height);
			System.out.println("Area rtTriangle:"+rt.computeArea());
			System.out.println("Perimeter rtTriangle:"+rt.computePerimeter());
			rt.readShapeDate();
			break;
		}

		default:
			System.out.println("Enter Values as Integer Only");
			break;
		}
	}
}









