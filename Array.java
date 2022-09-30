package com.uv.main;

import java.util.Scanner;

public class Array
{
	public static void main(String[] args) {
		
		int a[];
		a=new int[10];
		int b[]=new int[a.length/2];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		for(int x : a)
		{
			System.out.print(x + " ");
		}
	}
	
}