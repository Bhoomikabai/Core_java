package Threads;
public class demo2Thread{
	public static void main(String[] args)
	{
		demo1 d = new demo1();
	    Thread t1 = new Thread(d);
		t1.start();
		demo1 d2 = new demo1();
		Thread t2 = new Thread(d2);	
		t2.start();
	}
}
