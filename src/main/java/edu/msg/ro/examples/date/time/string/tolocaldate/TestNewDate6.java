package edu.msg.ro.examples.date.time.string.tolocaldate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TestNewDate6 {

	public static void main(String[] argv) {

		String dateInString = "2016-08-16T15:23:01Z";

		Instant instant = Instant.parse(dateInString);

		System.out.println("Instant : " + instant);

		// get date time only
		LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));

		// get localdate
		System.out.println("LocalDate : " + result.toLocalDate());

		// get date time + timezone
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(zonedDateTime);

		// get date time + timezone
		ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
		System.out.println(zonedDateTime2);

	}

}