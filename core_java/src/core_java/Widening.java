package core_java;

public class Widening 
{
 public static void main(String[] args)
 {
	 //implicit type casting: lower dataType to higher dataType, no data loss
	 byte a =80;
	 int b = a;
	 System.out.println(b);
	 
	  short x = 675;
	  int y = x;
	  System.out.println(y);
	  
	  char letter = 'B';
	  int val= letter;
	  System.out.println(val);
 }
}
