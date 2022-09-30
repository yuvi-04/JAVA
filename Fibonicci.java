package com.uv.main;

public class Fibonicci {
	public static void main(String[] args) {
		printFibonicci(15);
		printCombinedTables(3,5,9);
	}
	static void printFibonicci(int n)
	{
		int i,a=1,b=1,c;
		System.out.print(a+" "+b+" ");
		for(i=0; i<n; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c + " ");
		}
	}
	static void printCombinedTables(int a,int b,int terms)
	{
		int i;
		//System.out.println(a + " " + b + " ");
		System.out.println();
		for(i=1; i<=terms/2; i++)
		{
			System.out.print(a*i + " " + b*i + " ");
		}
		if(terms%2!=0)
		{
			System.out.println(a*((terms/2)+1));
		}
	}
} 
