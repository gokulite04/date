package com.scg.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonetimeDemo {
   public static void main(String[] args) {
	//   Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
	// availableZoneIds.forEach(System.out::println);
	   
	   ZonedDateTime zone =ZonedDateTime.now();  
	    System.out.println(zone);  
	    System.out.println(zone.getZone());
  
	    LocalDateTime  ldt = LocalDateTime.of(2021, Month.APRIL,  19,   15,   26);  
	    ZoneId  india = ZoneId.of("Asia/Kolkata");   
	    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
	    System.out.println("In India Central Time Zone: " + zone1);  
	    
	    
	    //It is used to return a copy of this date-time with the specified amount subtracted.
	    ZonedDateTime m = zone.minus(Period.ofDays(126)); 
	    System.out.println(m);
	 	//It is used to return a copy of this date-time with the specified amount added.
	    ZonedDateTime n= m.plus(Period.ofDays(126));
	    System.out.println(n);
	}

}
