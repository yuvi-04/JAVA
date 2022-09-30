package com.uv.main;

import java.util.Scanner;

public class Point {
	public int x,y;
	static int count=0;
	
	public static int orgx=0, orgy=0;
	static
	{
		System.out.println("in static block ");
		System.out.println("initializing static data ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new integers for orgx and orgy");
		orgx=sc.nextInt(); orgy=sc.nextInt();
		sc.close();
	}
	{
		count++;
	}
	public static int getcount()
	{
		return count;
	}
	
	public void printX() {
		System.out.println("x = "+ x);
	}
	
	public void printY() {
		System.out.println("y = "+ y);
	}
	
	public double ditancefromorigin()
	{
		double d = (double) x*x + (double) y*y;
		return Math.sqrt(d);
	}
	//constructor
	//OVERLOADING : SAME FUNCTION NAME WITH DIFFERENT ARGUMENTS 
	public Point(int a,int b)
	{
		x=a;
		y=b;
	}
	public Point()
	{
		x=0;
		y=0;
	}
	public Point(int x)
	{
		this.x=x;
		y=0;
	}
	public Point farPoint(Point p)
	{
		if(this.ditancefromorigin()>p.ditancefromorigin())
		{
			return this;
		}
		else return p;
	}
}

