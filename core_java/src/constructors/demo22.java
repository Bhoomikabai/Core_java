package constructors;

public class demo22 {

	demo22(double height)
	{
		System.out.println("inside construcor demo22");
		System.out.println(height);
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		demo22 d2 = new demo22(43.1);
		System.out.println("inside main method");
		}
	



}
