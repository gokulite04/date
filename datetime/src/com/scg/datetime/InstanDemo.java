package com.scg.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstanDemo {

	public static void main(String[] args) {
		Instant instant = Instant.now();  
	    System.out.println(instant);   
	   /* instant = instant.minus(Duration.ofDays(31));  
	   System.out.println(instant); 
	    Instant inst1 = Instant.parse("2020-12-15T03:59:15.524564Z");  
	    Instant inst2 = inst1.plus(Duration.ofDays(31));  
	    System.out.println(inst2);
	    */
	    ZonedDateTime zone =ZonedDateTime.now();  
	    System.out.println(zone);  
	    System.out.println(zone.getZone());
	    String output = zone.getZone().toString() ;  
	    
	    
	    ZoneId  z = ZoneId.of(output); 
	    ZonedDateTime zdt = instant.atZone( z );
	    System.out.println();
	}
	

}
