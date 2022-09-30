package com.uv.inh;

class Box
{
	double len, wid, ht;

	public Box(double len, double wid, double ht) {
		super();
		this.len = len;
		this.wid = wid;
		this.ht = ht;
	}
	public double surfaceArea()
	{
		return 2 * (len *wid + wid * ht + ht * len);
	}
}

class OpenBox extends Box
{
	public OpenBox(double len, double wid, double ht) {
		super(len, wid, ht);
}

	@Override
	public double surfaceArea()
	{
		return super.surfaceArea() - len * wid ;
	}
}

class A
{
	public void show()
	{
		final int x = 34;
		System.out.println(1);
	}
}
class B extends A
{
	@Override
	public void show()
	{
		System.out.println(2);
	}
}
class C extends B
{
	@Override
	public void show()
	{
		System.out.println(3);
	}
}

class Figure
{
	public double area()
	{
		return 0;
	}
}
class Rectangle extends Figure
{
	double length, width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public double area()
	{
		return length * width;
	}
}

class Circle extends Figure
{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public double area()
	{
		return Math.PI * radius * radius;
	}
}

public class OverrideDemo {
	public static void main(String[] args) 
	{	
		Figure f = new Figure();
		Rectangle r = new Rectangle(5,4);
		Circle c = new Circle(7);
		
		f=r;
		System.out.println(f.area());
		f=c;
		System.out.println(r.area());
		System.out.println(c.area());
		System.out.println(r.length + "," + r.width);
		System.out.println(f.area());
		
		Figure[] ar = new Figure[5];
		ar[0] = new Figure();
		ar[1] = new Rectangle(7,6);
		ar[2] = new Rectangle(7,61);
		ar[3] = new Rectangle(17,6);
		ar[4] = new Circle(6);
		System.out.println("Sum Of Area Of all Figures = " + sumFigures(ar));
	}


	private static void call(A a)
	{
		a.show();
	}
	public static double sumFigures(Figure[] Figures)
	{
		double sum=0.0;
		for(Figure f : Figures)
		{
			sum += f.area();
		}
		return sum;
	}
	public static double sumFigures(Figure f1 , Figure f2)
	{
		return 0;
	}
}
	
	