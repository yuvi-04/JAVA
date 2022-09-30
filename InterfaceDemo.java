package com.uv.interf;

interface Shape
{
	int colour = 1;// BY DEFAULT PUBLIC STATIC AND FINAL 
	 public String getname();// by default all methods declared are abstract and public 
	public double area();
	
	public static void draw()//static methods cannot be overridden 
	{
		System.out.println("A Shape is Drawn ");
	}
	public default void drawShape()//optional to override 
	{
		System.out.println("Default : A Shape is drawn " + this.getname());
	}
}

interface ShapeWithBoundary extends Shape
{
	double getmaxX();
	double getmaxY();
}

class Square implements ShapeWithBoundary
{
	double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public String getname() {
		return "Square";
	}

	@Override
	public double area() {
		return side*side;
	}

	@Override
	public double getmaxX() {
		return side;
	}

	@Override
	public double getmaxY() {
		return side;
	}
	
}

class Rectangle implements Shape, Comparable<Rectangle>
{
	double length , width;

	public Rectangle(double length, double width) {
		super();
		System.out.println("COLOR " + Shape.colour);
		this.length = length;
		this.width = width;
	}

	@Override
	public String getname() {
		return "Rectangle";
	}

	@Override
	public double area() {
		return length*width;
	}

	@Override
	public int compareTo(Rectangle o) {

		if(this.area() > o.area())
		{
			return 1;
		}
		if(this.area() < o.area())
			return -1;
		else
			return 0;
		
	}

	@Override
	public void drawShape() {
		System.out.println("Customised : Rectangle is drawn as a shape");
	}
}

class Circle implements Shape
{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String getname() {
		return "Circle";
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
public class InterfaceDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape shape; // Shape will behave like base class (super class)
		shape = new Rectangle(5,4);
		
		System.out.println(shape.getname());
		System.out.println(shape.area());
		
		shape.drawShape();
		shape = new Circle(5);
		shape.drawShape();
		
		ShapeWithBoundary shapeB = new Square(5);
		Shape sh = new Square(4);
		
		System.out.println(shape.area());
		System.out.println(shapeB.area());
		System.out.println(shapeB.getname());
		System.out.println(sh.getname());
		System.out.println(sh.area());
	}

	public static double sumOfArea(Shape[] shape)
	{
	double sum = 0;
		for(Shape sh : shape)
		{
			sum += sh.area();
		}
		return sum;
	}
}