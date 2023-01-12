
package core_java;

public class Assignment1 
{
	public static void main(String[] args)
	{
		int x=1;
		int y=1;
		
		int resx = x++ + ++x + x + x++;
		int resy = y++ - --y + y++ + +y;
		
		System.out.println(+resx);
		System.out.println(+resy);
		
				
	}

}
