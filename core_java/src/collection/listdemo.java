package collection;
import java.util.ArrayList;

public class listdemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add("cat");
		l.add(null);
	 System.out.println(l);
	 
	 System.out.println(l.size());//size of  objects
	 System.out.println(l.get(2));//getting an object
	 
	 l.add(0, "pvn"); // add an objects
	 System.out.println(l);
	 
	 l.remove(3); //remove an object
	 System.out.println(l);
	 
	 l.set(2, "bmk");//upadte
	 System.out.println(l);
	}

}
