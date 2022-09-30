package com.uv.coll;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateDemo {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		//SimpleDateFormat format = new SimpleDateFormat("EEEEEE, dd/mm/yyyy hh:mm:ss", Locale CANADA);
		SimpleDateFormat format = new SimpleDateFormat();
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-mm-yyyy, EEEEEEEE, hh:mm:ss");
		System.out.println(myFormat.format(date));
		String dateFormated = format.format(date);
		System.out.println(dateFormated);
		Calendar cal = new GregorianCalendar();
		Date time = cal.getTime();
		System.out.println(time);
		cal.add(cal.YEAR, 3);
		System.out.println(cal.getTime());
	}
}
