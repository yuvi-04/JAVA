package com.uv.main;

import java.util.Arrays;

public class Arraysdemo {
		public static void main(String[] args) {
			int a[]= {1,12,35,4,45,6,27,8,79,10};
			Arrays.sort(a);
			String string=Arrays.toString(a);
			System.out.println(string);
			int pos=Arrays.binarySearch(a,663);
			if(pos<0)
			{
				System.out.println("not found");
			}
			else
			{
				System.out.println("found at "+ pos);
			}
			Arrays.fill(a, 8);
			printArray(a);
			
			char charAr[]= {'a','b','c','d','a','b','b','p','p','p','p','r'};
			char ch=maxContinuousChar(charAr);
			int maxDiff=getMaxAbsoluteDiff(a);
			System.out.println("max abs diiference " + maxDiff);
		}

		private static int getMaxAbsoluteDiff(int[] a) {
			
			int i,max,x;
			int b[]=new int[a.length-1];
			for(i=0; i<a.length-1; i++)
			{
				x=a[i]-a[i+1];
				x=Math.abs(x);
				b[i]=x;
			}
			max=b[0];
			for(i=1; i<b.length; i++)
			{
				if(b[i]>max)
				{
					max=b[i];
				}
			}
			return max;
		}

		private static char maxContinuousChar(char[] charAr) {
			
			return 0;
		}

		private static void printArray(int[] a) {
			
			for(int x : a)
			{
				System.out.print(x + " ");
			}
		}
} 
  		