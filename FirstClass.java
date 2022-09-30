/**
 * 
 */
package com.uv.main;

/**
 * @author yuvraj
 *
 */
public class FirstClass {
	public static void main(String arg[])
	{
		System.out.println("Hello friends ! welcome to java");
		int i,x,found=0,n,b=50;
		for(i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" Even");
			}
			else
			{
				System.out.println(i+" Odd");
			} 
		}
		for(n=5; n<=b; n++)
		{
			found=0;
			for(x=2; x<n; x++)
			{
				if(n%x==0)
				{
					found=1;
				}
			}
			if(found==0)
			{
				System.out.println(n);
			}

		}
		
	}
}