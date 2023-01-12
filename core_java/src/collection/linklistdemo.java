package collection;

import java.util.LinkedList;

public class linklistdemo 
{
	public static void main(String[] args) {
		
		LinkedList l =new LinkedList();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add("cat");
		l.add(null);
	 System.out.println(l);
	 
	 l.addFirst("anu");
	 System.out.println(l);
	 
	 l.addLast("22");
	 System.out.println(l);
	 
	 System.out.println(l.getFirst());
	 System.out.println(l.getLast());
	 
	 System.out.println(l.removeFirst());
	 System.out.println(l.removeLast());
	 System.out.println(l);
	 
	 
	}

}
