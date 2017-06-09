package edu.msg.ro.examples.date.time.instantto.zonedtime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantZonedDateTime1 {

    public static void main(String[] argv) {
        // Z = UTC+0
        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        // Japan = UTC+9
        ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("ZonedDateTime : " + jpTime);

        System.out.println("OffSet : " + jpTime.getOffset());
    }

}
