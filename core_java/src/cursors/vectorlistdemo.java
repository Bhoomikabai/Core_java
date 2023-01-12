package cursors;
import java.util.Vector;
import java.util.Enumeration;
public class vectorlistdemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(30);
		v.add(40);
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			int i = (Integer)e.nextElement();
			System.out.println(i);
		}
		
		
	}

}
