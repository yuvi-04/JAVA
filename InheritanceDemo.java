package com.uv.inh;

class Point
{
	int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void show2d()
	{
		System.out.println("this is 2D point " + x + "," + y);
	}
	public void show()
	{
		System.out.println("this is 2D point " + x + "," + y);
	}
}

class Point3D extends Point
{
	int z;
	public Point3D()
	{
		super(0,0);
		z=0;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Point3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	public void show3D()
	{
		System.out.println("this is 3D point " + x + "," + y + "," + z);
	}
	
	public void show()
	{
		System.out.println("this is 3D point " + x + "," + y + "," + z);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		
		Point p1=new Point(3,4);
		Point p2=new Point(6,7);
		Point3D p3=new Point3D();
		Point3D p4=new Point3D(7,6,5);
		p1.show2d();
		p2.show2d();
		p3.show3D();
		p3.show2d();
		
		p1=p3;
		p1.getX();
		p1.getY();
		
		p1.show();
		p3.show();
		
	}
}
