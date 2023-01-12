package constructors;

public class demo7 
{
 String empID;
 double empsal;
 demo7(String empID,double empsal){
	 this.empID=empID;
	 this.empsal=empsal;
 }
 public static void main(String[] args) {
	 demo7 d = new demo7("U120",32000);
	 System.out.println(d.empID);
	 System.out.println(d.empsal);
		
}
}
