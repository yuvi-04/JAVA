package com.uv.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		try
		{
			fr = new FileReader("src/com/uv/io/IODemo.java");
			fw = new FileWriter("IODemoCopy.java");
			int ch = fr.read();
			while(ch != -1)
			{
				fw.write(ch);
				ch = fr.read();
			}
			System.out.println("file copied");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
