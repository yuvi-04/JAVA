package com.uv.interf;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
			
		Scanner sc = null;
		try
		{
			try
			{
				System.out.println("Nested try");
				String str = null;
				int x = str.length();
				System.out.println("len = " + x);
				int ar[] = new int[3];
				ar[5] = 23;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				
			}
			int x,y,z;
			sc = new Scanner(System.in);
			System.out.println("enter two int" );
			x = sc.nextInt();
			y = sc.nextInt();
			z = x/y;
			int a[] = {1,2,3,4,5,6,7,8,9,10};
			for(int i=0; i<a.length-1; i++)
			{
				System.out.println(a[i]-a[i+1]);
			}
			System.out.println("After the loop");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Some unknown exception occured");
		}
		finally
		{
			sc.close();
			System.out.println("this will always run either exception occurs or not");
		}
		String name = "Yuvraj";
		System.out.println("The Name = " + name);
	}
}
