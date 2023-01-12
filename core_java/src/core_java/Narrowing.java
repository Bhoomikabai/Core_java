package core_java;

public class Narrowing 
{
	public static void main(String[] args)
	{
		//explicit type casting:higher dataType to lower dataType
		int x = -348;
		byte y = (byte)x;
		System.out.println(y);
		
		float a = 354.89f;
		int b = (int)a;
		System.out.println(b);
	}
	

}
