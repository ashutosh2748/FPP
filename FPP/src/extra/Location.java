package extra;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Location {
  public static void main(String[] args) {
	    
	  
    DateTimeFormatter format = DateTimeFormatter
        .ofPattern("MMM d yyyy  hh:mm a");
    LocalDateTime leaving = LocalDateTime.of(2016, Month.AUGUST, 20, 20, 30);

    // Leaving from California on August 20, 2016, at 8:30 p.m.

    ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
    ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

    System.out.println("Estimated Total Time of Travel: 4Hrs 20 Minutes");
    String out1 = departure.format(format);
    System.out.printf("DEPARTURE:  %s (%s)%n", out1, leavingZone);

    // Flight is 4 hrs Twenty minutes
    ZoneId arrivingZone = ZoneId.of("America/Chicago");
    ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusHours(10).plusMinutes(20);

    String out2 = arrival.format(format);
    System.out.printf("ARRIVAL: %s (%s)%n", out2, arrivingZone);
    

  }
}
