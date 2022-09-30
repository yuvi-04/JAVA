package com.uv.str;

class Point
{
	int x,y;
}

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = "He " + "llo";
		String s6 = "He";
		String s7 = "llo";
		String s8 = s6 + s7;
		
		System.out.println(s1 .equals( s2));// true 
		System.out.println(s2 .equals( s3));// true. 
		System.out.println(s3 .equals( s4));// true .
		System.out.println(s2 .equals( s5));// false
		System.out.println(s4 .equals( s5));// false
		System.out.println(s5 .equals( s8));// true .
		System.out.println(s4 .equals( s8));// true.
		
		Point p1 = new Point(); p1.x = 4; p1.y = 7;
		Point p2 = p1;
		
		p2.x = 44; p2.y = 77;
		System.out.println(p1.x + "," + p2.x);
		
		String str1 = "Abhishek";
		String str2 = str1;
		
		str2 = str2 + "Verma";
		
		System.out.println(str1);
		System.out.println(str2);
		
		String alpha = "";
		for(char ch='a'; ch<='z'; ch++)
		{
			alpha = alpha + ch;
			System.gc();
		}
		System.out.println(alpha);
		
		StringBuilder sb = new StringBuilder();
		for(char ch='a'; ch<='z'; ch++)
		{
			sb.append(ch);
		}
		
		StringBuffer sbf = new StringBuffer();
		//thread safe 
		
		alpha = sb.toString();
		System.out.println(alpha);
	}
}