package lesson4;

public class Notebook extends Computer {
	double height;
	double width;
	double weight;
	public Notebook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}
	public double screenSize()
	{
		return this.width*this.height;
	}
	@Override
	public String toString() {
		return String.format(
				"Notebook [height=%s, width=%s, weight=%s, manufacturer=%s, processor=%s, ramSize=%s, diskSize=%s, processorSpeed=%s]",
				height, width, weight, manufacturer, processor, ramSize, diskSize, processorSpeed);
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	
}
