package globalization;
import java.util.Locale;

public class AllLocales {

	public static void main(String[] args) {
		Locale[] list = Locale.getAvailableLocales();
		for (Locale l : list)
			System.out.println(l.getLanguage() + " " + l.getCountry());
	}
}
