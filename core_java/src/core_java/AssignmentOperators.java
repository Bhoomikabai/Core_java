package core_java;

public class AssignmentOperators 
{
   public static void main(String[] args)
   {
	   //using |= and &=
	   int a = 10, b = 20, c = 10, d = 20;
	   boolean n = false;
	   n |= d > c;
	   System.out.println("n is " +n);
	   
	   n &= d > c;
	   System.out.println("n is " +n);
	   
	//  using +=,-+,*=,/=,and %= 
	   
	    a+=30;
	    System.out.println(" a is " +a);
	    
	    b-=30;
	    System.out.println("b is " +b);
	    
	    c*=30;
	    System.out.println("c is " +c);
	    
	    d/=30;
	    System.out.println("b is " +b);
	    
	    d%=20;
	    System.out.println("d is " +d);
   }
   
}
