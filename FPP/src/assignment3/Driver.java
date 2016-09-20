package assignment3;



	public class Driver {
		//private television rooma=new television("Samsung",32);
		
		public static void main(String[] args)
		{
			tvTest();
			
			
				
		}
		
		public static void tvTest()
		{
			Television rooma=new Television("Samsung",32);
			System.out.println("Manufacturer"+rooma.getMANUFACTURER());
			System.out.println("Screen Size"+rooma.getSCREEN_SIZE());
			rooma.power();
			rooma.increaseVolume();
			System.out.println("volume:"+rooma.getVolume());
			rooma.increaseVolume();
			rooma.increaseVolume();
			System.out.println("volume:"+rooma.getVolume());
			rooma.decreaseVolume();
			System.out.println("volume:"+rooma.getVolume());
			rooma.decreaseVolume();
			rooma.setChannel(10);
			System.out.println("Channel:"+rooma.getChannel());
			System.out.println("volume:"+rooma.getVolume());
		}
		

	}



