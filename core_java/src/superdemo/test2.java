package superdemo;

public class test2 extends test1
{
	int x = 40;
	void update()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
	{
		System.out.println("inside update method");
	}

}
