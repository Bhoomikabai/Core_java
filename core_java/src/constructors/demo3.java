package constructors;

public class demo3 
//multiple argumented constructor
{
demo3(int age, String name){
	System.out.println("inside demo2");
	System.out.println(age);
	System.out.println(name);
}
public static void main(String[] args) {
	System.out.println("inside main method");
	demo3 d3 = new demo3(21, "bhumi");
	System.out.println("complete");
	
}
}
