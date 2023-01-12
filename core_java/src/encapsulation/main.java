package encapsulation;

public class main 
{
public static void main(String[] args) {
	demo d = new demo("abc",123.45,112);
	String name = d.getEmpName();
	System.out.println(d.getEmpName());
	System.out.println(d.getsalary());
	System.out.println(d.getEmpId());
	
	d.setEmpName("xyz");
	d.setsalary(123.87);
	d.setEmpId(123);
	
	System.out.println(d.getEmpName());
	System.out.println(d.getsalary());
	System.out.println(d.getEmpId());
	
	
	
	
}
}
