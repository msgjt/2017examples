package edu.msg.ro.examples.date.time.string.tolocaldate;

import java.time.LocalDate;

public class TestNewDate1 {

	public static void main(String[] argv) {

		String date = "2016-08-16";

		// default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(date);

		System.out.println(localDate);

	}

}