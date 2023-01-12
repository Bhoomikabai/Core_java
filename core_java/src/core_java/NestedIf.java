package core_java;

public class NestedIf 
{
  public static void main(String[] args) 
  {
	int pin = 12345;
	int withdrawal = 6000;
	int accountbal=10000;
	if(pin == 12345)
	{
		if(accountbal>withdrawal)
		{
			System.out.println("amount withdrawal succesfully");
			
			accountbal = accountbal-withdrawal;
			System.out.println("your account balance is " +accountbal);
			
		}
		else
		{
			System.out.println("insufficient fond");
			
		}
	}
	else
	{
		System.out.println("incorrect password");
	}
  }
}
