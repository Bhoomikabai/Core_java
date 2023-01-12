package constructors;

public class mdemo5 
{
	void add()
	{
		int a = 10 +20;
		System.out.println(a);
		
	}
	static void sub(int a, int b)
	{
		int diff = a - b;
		System.out.println(diff);
	}
	void multi(int m) {
		int prd = m *200;
		System.out.println(prd);
	}
	void printname(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		mdemo5.sub(49, 30);
		mdemo5 d = new mdemo5();
		d.add();
		d.multi(6);
        d.printname("abs");
		
	}
 
}
