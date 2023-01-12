package object_class;

public class tostring 
{
public String toString() {
	return getClass().getName()+"$"+Integer.toHexString(123);
}
public static void main(String[] args) {
	tostring d = new tostring();
	System.out.println(d);
}
}
