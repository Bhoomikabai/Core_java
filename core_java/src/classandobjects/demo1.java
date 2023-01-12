package classandobjects;

public class demo1 
{
 int x = 10;//instance variable
 String name = "bhoomi";
 static int y = 20;//static variable
 public static void main(String[] args) 
{
	System.out.println(demo1.y);
	
	demo1 a = new demo1();
	System.out.println(a.x);
	System.out.println(a.name);
}
}
