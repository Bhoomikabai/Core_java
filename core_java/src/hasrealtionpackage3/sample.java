package hasrealtionpackage3;

public class sample 
{
	public static void main(String[] args) {
		demo1 obj = new demo1();
		demo2 d2 = new demo2(obj);
		System.out.println(d2.x);
		d2.check();
		System.out.println(d2.d1.m);
		d2.d1.view();
		
		
		
	}
}
