package constructors;

public class demo8 
{
	demo8()
	{
		this(30);
		
			System.out.println("inside zero argu");
		}
		demo8(int num)
		{
			this("rockey");
				System.out.println("inside num argument");
			}
			
		
		demo8(String name)
		{
			System.out.println("inside str argument");

}
		public static void main(String[] args) {
			demo8 d  = new demo8();
			System.out.println("inside main method");
		}
}