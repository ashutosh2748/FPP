package assignment3;

public class Television {
	final private String MANUFACTURER;
	final private int SCREEN_SIZE;
	private boolean powerOn=false;
	private int channel=1;
	private int volume=0;
	
	Television(String Manu,int Screen)
	{
	MANUFACTURER=Manu;
	SCREEN_SIZE=Screen;
	}
	public String getMANUFACTURER() {
		return MANUFACTURER;
	}
	
	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}
	
	public void power()
	{
		if(this.powerOn)
		this.powerOn=false;
		else this.powerOn=true;
			
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void increaseVolume()
	{
		if(this.volume<50&&this.powerOn)this.volume++;
		
	}
	public void decreaseVolume()
	{
		if(this.volume>0&&this.powerOn)this.volume--;
		
	}
		

}
