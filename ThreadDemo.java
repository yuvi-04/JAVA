package com.uv.thr;

class ChildThread extends Thread
{
	public void run()
	{
		System.out.println("Current Thread " + Thread.currentThread());
		for(int i=0; i<=100; i++)
		{
			System.out.println("Child " + i);
		}
	}
}

class SomeRunnable implements Runnable
{
	Thread t;
	public SomeRunnable(Thread t) {
		super();
		this.t = t;
	}
	public void run()
	{
		System.out.println("Current Thread = " + Thread.currentThread());
		for(int i=0; i<=100; i++)
		{
			System.out.println("Some " + i);
			if(i == 50)
			{
				try
				{
					t.join();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Current Thread = " + Thread.currentThread());
		
		ChildThread t1 = new ChildThread();
		t1.setName("Child Counting");
		t1.start();
		
		SomeRunnable some = new SomeRunnable(t1);
		Thread t2 = new Thread(some);
		t2.setName("Some Name");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("both finished now main will work");
		for(int i=0; i<=100; i++)
		{
			System.out.println("main " + i);
		}
	}
}
