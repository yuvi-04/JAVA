package com.uv.inh;

class account1//every class extends to Object..
{

}

class SavingAc1 extends account1
{
	
}

class JandhanAc1 extends account1
{
	
}

class Point1
{
	int x,y;

	public Point1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "This is a Point string representation";
	}
	@Override
	public boolean equals(Object ob)
	{
		try
		{
			Point1 obAsPt = (Point1) ob;
			if(this.x == obAsPt.x && this.y == obAsPt.y)
				return true;
			else return false;
		}
		catch (Exception e)
		{
			return super.equals(ob);
		}
	}
	
}//every object has # code
public class ObjectClassDemo {
	public static void main(String[] args) {
		
		Object ob = "Hello";// Object is super class of all classes
		String str = "Hello";
		JandhanAc1 ac = new JandhanAc1();
		System.out.println(ac.getClass());
		Point1 point1 = new Point1(4,6);
		System.out.println(point1);
		int hashcode = point1.hashCode();
		System.out.println(hashcode);
		
		Point1 p1 = new Point1(3,4);
		Point1 p2 = new Point1(3,4);
		if(p1==p2)
		{
			System.out.println("equals");//your student and aata is waiting
		}
		else System.out.println("not equal");
		
		if(p1.equals(p2))
			System.out.println("equals");
		else System.out.println("not equal");
	}
}
