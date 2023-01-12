package interfaceSingleLevel;

public class sample implements demo2 {

	
	public void display() 
	{
	 System.out.println("inside display method");	
	}

	
	public void camera() 
	{
	System.out.println("inside camera method");	
	}

	
	public void m1() 
	{
	System.out.println("inside m1 method");	
	}

	
	public void m2() 
	{
	System.out.println("inside m2 method");	
	}
	public static void main(String[] args) {
		sample s  = new sample();
		s.camera();
		s.display();
		s.m1();
		s.m2();
	}

}
