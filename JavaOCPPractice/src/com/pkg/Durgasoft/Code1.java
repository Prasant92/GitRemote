package com.pkg.Durgasoft;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the number to be checked");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int count=0;
		for(int x=1;x<=a;x++)
		{
			int rem=0;
			rem=a%x;
			if(rem==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println(a+" is not a prime");
		}
		else 
			System.out.println(a+" is a prime");
		sc.close();
	}
}
