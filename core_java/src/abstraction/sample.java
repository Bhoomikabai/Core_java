package abstraction;

public class sample 
{
void view()
{
	System.out.println("view method is");
}
void display()
{
	System.out.println("display method is");
}
void print()
{
	System.out.println("print the method is");
}
void delete()
{
	System.out.println("delete method is");
}
public static void main(String[] args) {
	sample s = new sample();
	s.view();
	s.display();
    s.print();
	s.delete();
}
}
