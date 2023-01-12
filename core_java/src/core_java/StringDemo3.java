package core_java;

public class StringDemo3 
{
public static void main(String[] args) {
	String s1 ="automation using selenium";
	String[] ary=s1.split(" ");
	for(int i=0;i<ary.length;i++) {
		String temp=ary[i];
		char[] ary1=temp.toCharArray();
		for(int j=ary1.length-1;j>=0;j--)
		{
			System.out.print(ary1[j]);
		}
		System.out.println(" ");
	}
	
}
}
