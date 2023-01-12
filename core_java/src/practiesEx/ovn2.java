package practiesEx;

public class ovn2 extends ovn1 {
	void update()
	{
		System.out.println("inside update method");
	}
	void delete()
	{
		System.out.println("delete all rows");
	}
	public static void main(String[] args) {
		ovn1 n = new ovn2();
		n.insert();
		n.delete();
		
	}
}
