package cursors;
import java.util.ListIterator;
import java.util.LinkedList;
public class listiteratorDemo {
	public static void main(String[] args) {
		LinkedList  l = new LinkedList();
		l.add("cat");
		l.add("rat");
		l.add("mat");
		l.add("sat");
		l.add("bat");
		System.out.println(l);
		
		ListIterator i =l.listIterator();
		while(i.hasNext()) 
		{
			String m = (String)i.next();
			System.out.println(m);
		}
			System.out.println(" ");
			while(i.hasPrevious()) 
			{
				String m = (String)i.previous();
				System.out.println(m);

				
			}
		}
	}

