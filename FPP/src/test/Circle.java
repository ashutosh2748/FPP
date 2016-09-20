package test;



public class Circle extends Shape{
private double radius;

public void setCircle(double radius){
	this.radius = radius;
	}

public double getRadius() {
	return radius;
}

@Override
public double computeArea() {
	return Math.PI * Math.pow(radius, 2);
}

@Override
public double computePerimeter() {
	// TODO Auto-generated method stub
	return 2 * Math.PI * getRadius();
}

@Override
public void readShapeDate() {
	System.out.println("Circle [radius=" + radius + "]");
	
}
	
}