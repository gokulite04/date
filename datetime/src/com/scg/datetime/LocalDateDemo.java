package com.scg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate localdate= LocalDate.now();//yyyy-MM-dd
		LocalTime localtime= LocalTime.now();//HH-mm-ss-ns
		LocalDateTime localdatetime= LocalDateTime.now();//yyyy-MM-dd-HH-mm-ss-ns
	    LocalDateTime localdatetime2= LocalDateTime.of(localdate, localtime);
	    LocalDateTime localdatetime3 = LocalDateTime.parse("2021-04-14T22:25:19.031959");
		
		System.out.println("Date :"+localdate);
		System.out.println("Time :"+localtime);
		System.out.println("Date & Time using now:"+localdatetime);
		System.out.println("Date & Time using of:"+localdatetime2);
		System.out.println("Day of month "+localdate.getDayOfMonth());
		System.out.println("Today is "+localdate.getDayOfWeek());
		
		
		System.out.println("\nLocaldatetime using now:"+localdatetime);
		System.out.println("Localdatetime using of:"+localdatetime2);
		System.out.println("Localdatetime parse:"+ localdatetime3);
		
		System.out.println("Date separatively: "+localdatetime.toLocalDate());
		System.out.println("Time separatively: "+localdatetime.toLocalTime());
		} 

}
