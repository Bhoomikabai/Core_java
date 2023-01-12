package cursors;
import java.util.Iterator;
import java.util.ArrayList;
public class iteratorDemo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(19);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		Iterator i1 = a.iterator();
		while(i1.hasNext()) 
		{
			int i =(Integer)i1.next();
			System.out.println(i);
			
		}
	}

}
