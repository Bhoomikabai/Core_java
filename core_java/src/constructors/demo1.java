package constructors;

public class demo1 
//no-argument constructor
{
	demo1()
	{
		System.out.println("inside construcor demo1");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		demo1 d = new demo1();
		System.out.println("inside main method");
	}

}
