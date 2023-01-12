package exceptionhandling;

public class multicatchDemo {
public static void main(String[] args) {
	try {
		int x = 10/0;
	}
	catch(ArithmeticException a)
	{
		a.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
