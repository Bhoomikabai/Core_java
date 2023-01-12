package exceptionhandling;

public class exceptinDemo 
{
	public static void main(String[] args) {
		try
		{
			int x = 10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		System.out.println("code is continue");
	}

}
