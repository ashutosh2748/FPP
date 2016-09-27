package lesson12;

public class Question1 {
	public static void main(String [] args)
	{
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		
		try {
		for(int i=0;i<numer.length;i++)
			{
			
			try {
				System.out.println("Result of "+numer[i]+"/"+denom[i]+"is:");
				System.out.println(numer[i]/denom[i]);
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println("An Error occured");
				System.out.println(e.getMessage()+"  "+e.getClass());
			}
			
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program has finished");
		}
			}
		
		
		
		
}


