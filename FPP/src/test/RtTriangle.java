package test;

public class RtTriangle extends Shape{
private double base;
private double height;

public void setRtTriangle(double base, double height){
	this.base = base;
	this.height = height;
}

public double getBase() {
	return base;
}

public double getHeight() {
	return height;
}

@Override
public double computeArea() {
	return 0.5 * getBase() * getHeight();
}
@Override
public double computePerimeter() {
	return getBase() + getHeight()
			 + Math.sqrt(Math.pow(base, 2)+ Math.pow(height, 2));
}
@Override
public void readShapeDate() {
 System.out.println("RtTriangle [base=" + base + ", height=" + height + "]");
}
}
