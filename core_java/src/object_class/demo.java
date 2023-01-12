package object_class;

public class demo 
{
public static void main(String[] args) {
	String s1 = "sunil";
	String s2 = "sunil";
	
	
	//content comparision
	boolean check = s1.equals(s2);
	System.out.println(check);
	
	
	//reference comparision
	boolean check2 = s1==s2;
	System.out.println(check2);
	
	String s3= new String("sunil");
	String s4 = new String("sunil");
	
	//content comparision
	boolean check1 = s3.equals(s4);
	System.out.println(check1);
	
	//reference comparision
	boolean check3= s2==s3;
	System.out.println(check3);
}
}
