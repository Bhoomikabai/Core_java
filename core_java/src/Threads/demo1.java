package Threads;

public class demo1 extends Thread
{
	public void run()
	{
	for(int i = 0;i<5;i++)
	{
		System.out.println("inside run method"+Thread.currentThread().getName());
	}
}
}
