package superdemo;

public class DemoSamplew 
{
    static String collegeName="besant";
    String name;
    int rollnum;
    DemoSamplew(String name,int num)
    {
    	this.name=name;
    	this.rollnum=num;
    }
    void printstudentdetails()
    {
    	System.out.println("The name of the  student is "+name);
    	System.out.println("The rollnum of the student is "+rollnum);
    }
}
