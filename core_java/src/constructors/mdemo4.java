package constructors;

public class mdemo4 
//non static and argumented method
{
void add(int a, int b)
{
	int sum = a+b;
	System.out.println(sum);
}
public static void main(String[] args) {
	mdemo4 d2 = new mdemo4();
	d2.add(20, 40);
	d2.add(25, 60);
}
}
