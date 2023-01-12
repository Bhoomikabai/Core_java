package constructors;

public class demo2 
//Argumented constructor
{
	demo2(String name)
	{
		System.out.println("inside construcor demo2");
		System.out.println(name);
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		demo2 d2 = new demo2("bhumi");
		System.out.println("inside main method");
		}
	

}
