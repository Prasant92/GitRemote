package com.pkg.Durgasoft;

import java.util.Scanner;

public class Code {

	public static void main(String[] args)
	{
		System.out.println("Enter the a and b");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		a=b-a;
		b=b-a;
		a=a+b;
		System.out.println(a+" "+b);
		sc.close();
	}
}
