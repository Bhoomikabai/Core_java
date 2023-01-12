package Praties;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n,count=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+"is a prime");
		}
		else
		{
			System.out.println(n+"is not prime");
		}
		
	}

}
