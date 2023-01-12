package core_java;

public class StringDEmo2 
{
 public static void main(String[] args) 
{
 String stn = "bhumika";
 char[] ary=stn.toCharArray();
 for(int i=ary.length-1;i>0;i--)
 {
	 System.out.println(ary[i]);
 }
 
 }
}

