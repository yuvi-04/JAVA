package com.uv.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IODemoWithScanner {
	
	public static void main(String[] args) {
		
		FileInputStream fr = null;
		FileOutputStream fw = null;
		int sum = 0;
		int i=0;
		try {
			fr = new FileInputStream("numbers.txt");
			fw = new FileOutputStream("sum.txt");
			
			Scanner sc = new Scanner(new BufferedInputStream(fr));
			
			while(sc.hasNext())
			{
				String line = sc.nextLine();
				String[] numsAr = line.split("\\s+");
				for(i=0; i<numsAr.length; i++)
				{
					int x = Integer.parseInt(numsAr[i]);
					sum = sum+x;
				}
				String sumStr = ""+sum + "\n";
				try {
					fw.write(sumStr.getBytes());
					sum = 0;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
