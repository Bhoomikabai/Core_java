package constructors;

public class demo6 
{
 demo6()
 {
	 System.out.println("inside demo6");
	 
 }
 demo6(int x)
 {
	 System.out.println("inside demo6 int argument constructor");
	 System.out.println(x);

 }
 demo6(String name)
 {
	 System.out.println("inside string constructor");
	 System.out.println(name);
 }
 public static void main(String[] args) {
	demo6 d1 = new demo6();
	demo6 d2 = new demo6(23);
	demo6 d3 = new demo6("bmk");
	System.out.println(d1);

	
}
}
