package core_java;

public class array3 
{
 public static void main(String[] args) 
{
  int[] array1= {10,20,30,40};
  int[] array2= {50,60,70,80,90};
  int[] array3= {10,20,30,40,50,60,70,80};
  for(int i=0;i<array3.length;i++)
  {
	  if(i<array1.length) 
	  {
	   array3[i]=array3[i];
	  }
	  else
	  {
		  array3[i]=array2[i-array1.length];
	  }
	  System.out.println("numbers are"+array3[i]);

  }
}
}
