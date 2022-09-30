package com.uv.str;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		String s = "    this is  a string   for   testing in java  , this is  not so big but ok"    ;
		int x = s.length();
		boolean contains = s.contains("for");
		int indexOf = s.indexOf("not");
		
		s.indexOf("is");
		s.lastIndexOf("is");
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,11));
		System.out.println(s);
		System.out.println(s.trim());
		
		String ans = removeExtraSpaces(s);
		System.out.println(s);
	}
	public static String removeExtraSpaces(String str)
	{
		str = str.trim();
		String ans = str.replaceAll("\\s+", " ");
		return ans;
	}
	public static int countStrings(String big,String small)
	{
		return 0;
	}
}
