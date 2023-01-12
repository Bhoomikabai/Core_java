package hybrid;


public class Sample {
	public static void main(String[] args){
       B b = new B();
       System.out.println(b.a);
       System.out.println(b.j);
       b.display();
       b.name();
       C c = new C();
       System.out.println(c.a);
       System.out.println(c.f);
       System.out.println(c.r);
       c.put();
       c.name();
       D d = new D();
       System.out.println(d.j);
       System.out.println(d.a);
       System.out.println(d.g);
       d.get();
       d.display();
       d.name();
       
}
}