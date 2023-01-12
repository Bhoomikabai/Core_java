package interfaceMultiLevel;

public class sample implements demo1,demo2
{

	
	public void put() 
	{
	System.out.println("inside put method");	
	}

	public void login() 
	{
	System.out.println("login to mac, phones");	
	}

	
	public void post() 
	{
	 System.out.println("inside post method");	
	}
	public static void main(String[] args) {
		sample s = new sample();
		s.post();
		s.put();
		s.login();
	}

}
