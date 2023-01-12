package constructors;

public class demo33 
{

demo33(float weight, String place){
	System.out.println("inside demo2");
	System.out.println(weight);
	System.out.println(place);
}
public static void main(String[] args) {
	System.out.println("inside main method");
	demo33 d3 = new demo33(10.7f, "bnglr");
	System.out.println("complete");
	
}

}
