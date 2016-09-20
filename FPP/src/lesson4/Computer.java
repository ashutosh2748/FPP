package lesson4;

public class Computer {
	
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		//super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	public double getRamSize() {
		return (double)ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public double getDiskSize() {
		return (double)diskSize;
	}
	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	public double computePower()
	{
		return this.ramSize*this.processorSpeed;
	}
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diskSize;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
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
		Computer other = (Computer) obj;
		if (diskSize != other.diskSize)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (Double.doubleToLongBits(processorSpeed) != Double.doubleToLongBits(other.processorSpeed))
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Computer [manufacturer=%s, processor=%s, ramSize=%s, diskSize=%s, processorSpeed=%s]",
				manufacturer, processor, ramSize, diskSize, processorSpeed);
	}
	


}
