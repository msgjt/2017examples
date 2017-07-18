package globalization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NumberFormatDemo {

	public static void displayNumber(Locale currentLocale) {
		Integer quantity = new Integer(123456);
		Double amount = new Double(345987.246);
		NumberFormat numberFormatter;
		String quantityOut;
		String amountOut;
		numberFormatter = NumberFormat.getNumberInstance(currentLocale);
		quantityOut = numberFormatter.format(quantity);
		amountOut = numberFormatter.format(amount);
		System.out.println(quantityOut + " " + currentLocale);
		System.out.println(amountOut + " " + currentLocale);
	}

	public static void displayCurrency(Locale currentLocale) {
		Double currency = new Double(9876543.21);
		NumberFormat currencyFormatter;
		String currencyOut;
		currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		currencyOut = currencyFormatter.format(currency);
		System.out.println(currencyOut + " " + currentLocale.toString());
	}

	public static void displayPercent(Locale currentLocale) {
		Double percent = new Double(0.75);
		NumberFormat percentFormatter;
		String percentOut;
		percentFormatter = NumberFormat.getPercentInstance(currentLocale);
		percentOut = percentFormatter.format(percent);
		System.out.println(percentOut + " " + currentLocale.toString());
	}

	public static void main(String[] args) {
		Locale[] locales = { new Locale("fr", "FR"), new Locale("de", "DE"), new Locale("en", "GB"),
				new Locale("en", "US") };
		for (int i = 0; i < locales.length; i++) {
			System.out.println();
			displayNumber(locales[i]);
			displayCurrency(locales[i]);
			displayPercent(locales[i]);
			Date currentDate = new Date();
			SimpleDateFormat myDateFormatter = new SimpleDateFormat("YYYY*MM*dd", locales[i]);
			System.out.println(currentDate);
			System.out.println(
					DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, locales[i]).format(currentDate));
		}

	}
}
