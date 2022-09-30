package com.uv.interf;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//unchecked : Daily routine exceptions
//throws not required
//RunTimeException and sub classes

//checked : no something specific : io exception, class not found exception, file not found
//throws is required
//all others except RunTimeException and it's sub classes are checked

class UnderflowException extends Exception
{

}

class MyStack
{
	int a[] = new int[10];
	int top = -1;
	
	public void push(int x)
	{
		if(top==9)
		{
			System.out.println("Overflow has occured");
			return;
		}
		a[++top] = x;
	}
	int pop() throws Exception
	{
		if(top == -1)
		{
			System.out.println("Underflow has occured");
			throw new UnderflowException();
		}
		else
			return a[top--];
	}
}

public class ExceptionDemoThrow {
	
	public static int sumOfArray(int a[])
	{
		int s = 0;
		for(int i=0; i<=a.length; i++)
		{
			s = s + a[i];
		}
		return s;
	}
	
	public static void  readFile(String name) throws FileNotFoundException, IOException
	{
		FileReader fr = new FileReader(name);
		int ch = fr.read();
		System.out.println((char) ch);
		fr.close();
	}
	
	public static void main(String[] args) {
		
		try
		{
			int a[][] = { {1,2,3,4},{1,2,3,4},{1,2,3,4}, };
			int b[][] = { {1,2,3},{1,2,3},{1,2,3} };
			int c[][] = maxtrixMultiply(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static int [][] maxtrixMultiply(int a[][],int b[][]) throws Exception
	{//throws : inform the caller of this function to be careful and write code with proper 
		//exception handling
		if(a[0].length != b.length)
		{
			Exception e = new Exception("Cloumns of a not eauql to rows in b can't multiply");
			throw e;//create an object of exception class and throw it to inform the caller
			//about the error
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word of length > 6");
		String word = sc.next();
		if(word.length() <= 5)
		{
			Exception e = new Exception("Word Length is less than 6");
			throw e;
		}
		return null;
	}
}
