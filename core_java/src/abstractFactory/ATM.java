package abstractFactory;

public class ATM implements transaction
{
 
public void withdraw() 
{
System.out.println("amount withdrawn");	
}

public void verifypin() 
{
System.out.println("verifying the pin");	
}
public static void main(String[] args) {
	transaction t = new ATM();
	t.withdraw();
	t.verifypin();
}
}
