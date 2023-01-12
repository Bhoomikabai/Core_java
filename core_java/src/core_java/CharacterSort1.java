package core_java;

import java.util.Arrays;

public class CharacterSort1 
{
 public static void main(String[] args) 
{
	 String str= "Bhoomika"; 
	 char[] str1=str.toCharArray();
	 Arrays.sort(str1);
	 System.out.println("Charecter arrays: ");
     for(int i=0;i<str1.length;i++) {
    	 System.out.println(str1[i]);
     }
    	
		int count=1;
		for(int i=0;i<str1.length-1;i++)
		{
			
			if(str1[i]==str1[i+1]) 
			{
				
				count++;
			}
			else
			{
				
			System.out.println(str1[i]+"="+count);
			count=1;
			}
			for(i=0;i<str1.length;i++)
			{
				if(str1[i]!=0) {
					System.out.println();
				}
			}
           
		}
		
		}
		
		
}
 
 
         	


