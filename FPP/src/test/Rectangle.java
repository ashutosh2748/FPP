package test;



public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public void setRectangle(double length, double breadth){
		this.breadth = breadth;
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	@Override
	public double computeArea() {
		return getLength()* getBreadth();
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (getBreadth() + getLength());
	}

	@Override
	public void readShapeDate() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle [breadth=" + breadth + " Length" + length +"]");
	}

}
