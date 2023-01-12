package core_java;

public class ternaryOperator 
{
 public static void main(String[] args)
 {
	 int a = 56;
	  String res=  a > 0 ? "a is positive ": "a is negative";
	  System.out.println(res);
	  
	  int b = 10, c = 20;
	  int bigNum = b > c ? b : c;
	  System.out.println(bigNum);
	  
 }
}
