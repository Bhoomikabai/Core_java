package hierachial;

public class sample 
{
 public static void main(String[] args) {
	demo3 d = new demo3();
	System.out.println(d.f);
	System.out.println(d.r);
	d.print();
	d.run();
	
	demo2 d2 = new demo2();
	d2.print();
	d2.display();
	System.out.println(d2.r);
	System.out.println(d2.x);
	System.out.println(demo2.s);
}
}
