package edu.msg.ro.examples.date.time.date.temporal.adjustments;

import java.time.LocalDate;

public class TestNextChristmas {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("current date : " + localDate);

		localDate = localDate.with(new NextChristmas());
		System.out.println("Next Christmas : " + localDate);

	}

}
