package classandobjects;

public class demo2 
{
 float x = 90.12f;
 char sybl = 'a';
 static String place = "bangalore";
 public static void main(String[] args) 
 {
	System.out.println(demo2.place);
	//object 1 is created 
	demo2 b = new demo2();
	System.out.println(b.x);
	System.out.println(b.sybl);
	
	//object 2 is created
	demo2 c = new demo2();
	System.out.println(c.x);
	System.out.println(c.sybl);
	
	//printing hashcode value is printed
	System.out.println(b);
	System.out.println(c);
	
	
}
}
