package com.scg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		String format = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("Basic iso date: "+format);
		
		String format2= localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("Iso date time: "+format2); 
		
		String format3 = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Iso date: "+format3);
		
		String format4 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Customizing Formats: "+format4);
	}

}
