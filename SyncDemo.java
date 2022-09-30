package com.uv.thr;

class Printer
{
	synchronized public void print(String msg)
	{
		System.out.println("[");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		System.out.println("]");
	}
}

class MsgThread extends Thread
{
	Printer printer;
	String message;
	public MsgThread(Printer printer, String message) {
		super();
		this.printer = printer;
		this.message = message;
	}
	public void run()
	{
		printer.print(message);
	}
}

public class SyncDemo {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		MsgThread t1 = new MsgThread(printer, "Java");
		MsgThread t2 = new MsgThread(printer, "Threads");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
