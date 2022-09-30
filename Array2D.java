package com.uv.main;

public class Array2D {
	public static void main(String[] args) {
		
		int a[][]=new int[3][4];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				a[i][j]=i+j;
			}
		}
		printArray(a);
	}

	private static void printArray(int[][] a) {
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
		}
	}
	private static int[][] matrixSum(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		int i,j;
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	private static int[] sumOfConsecutive(int a[])
	{
		int b[];
		int i,j=0;
		if(a.length%2==0)
		{
			b=new int[a.length/2];
		}
		else
		{
			b=new int[a.length/2+1];
		}
		for(i=0; i<a.length/2; )// 1 2 3 4 5 6 7
		{
			for(j=0; j<a.length; )
			{
				b[i]=a[i]+a[i+1];
				i++;
				j=j+2;
			}
		}
		if(a.length%2!=0)
		{
			b[i+1]=a[j+1];
		}
		return b;
	}
}
