package practiesEx;

public class demo1overload {
	int checkNum()
	{
		System.out.println("inside 0 argumrnts");
		return 0;
		
	}
	int checkNum(int n)
	{
		System.out.println("inside 1 argumrnts");
		return 10;
		
	}
	int checkNum(String n, int y)
	{
		System.out.println("inside 2 argumrnts");
		return 20;
		
	}
	
	public static void main(String[] args) {
	demo1overload d = new demo1overload();
	int a =	d.checkNum();
	int b =	d.checkNum(4);
	int c =	d.checkNum("hello", 4);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}

}
