package core_java;

import java.util.Scanner;

public class arrayD3 
{
 public static void main(String[] args) 
{
 int[] sub = new int[5];
 int total=0;//obtain mark
 double percentage; //percentage
 Scanner scn = new Scanner(System.in);
 System.out.println("Enter marks for 5 subjects");
 for(int i=0;i<5;i++)
 {
	 System.out.println("Enter marks for subject["+i+"]:");
	 sub[i]=scn.nextInt();
 }
	for(int i=0;i<5;i++)
	{
	 total=total+sub[i];
	}
	System.out.println("total marks "+total);
	percentage=(double)total/5;
 System.out.println("Percentage "+percentage);
}
}

