package com.uv.interf;

class Pair<T,S>
{
	public T first;
	public S second;
	public Pair(T first, S second) {
		super();
		this.first = first;
		this.second = second;
	}
	public Pair() {
		super();
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second = second;
	}
}

public class GenericDemo {
	
	public static void main(String[] args) {
		
		Pair<Integer,Integer> p = new Pair(34,65);
		System.out.println(p.first);
		System.out.println(p.second);
		System.out.println(p);
		int x;//x is a integer in stack
		
//		Wrapper class
//		boolean : Boolean
//		byte : Byte
//		char : Character
//		short : Short 
//		long : Long
//		float : Float
//		int : Integer
//		
		Integer y = new Integer(34);//y is a reference pointing to an object in heap
		
		//y can be null x cannot be null
		
		Integer z = 23;//auto boxing...z pointing to a box containing 23
		int val = z;//un-boxing
	}
}
