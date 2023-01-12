package classandobjects;

public class demo3 
{
	float x = 90.12f;
	 char sybl = 'a';
	 static String place = "bangalore";

	public static void main(String[] args) {
		System.out.println(demo3.place);
		//object 1 is created 
		demo3 b = new demo3();
		System.out.println(b.x);
		System.out.println(b.sybl);
		
		//object 2 is created
		demo3 c = new demo3();
		c.sybl ='p';
		c.x=99;
		System.out.println(c.sybl);
		System.out.println(c.x);
		
		//printing hashcode value is printed
		System.out.println(b);
		System.out.println(c);
	}

}
