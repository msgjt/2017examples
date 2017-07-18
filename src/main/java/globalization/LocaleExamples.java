package globalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleExamples {
	public static void main(String... args) {
		Locale currentLocale;
		ResourceBundle messages;
		try {
			currentLocale = new Locale("ro", "RO");
		} catch (Exception e) {
			currentLocale = Locale.getDefault();
		}
		messages = ResourceBundle.getBundle("globalization.MessagesBundle", currentLocale);

		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
		System.out.println(messages.getString(LabelConstants.welcomeMessageStart));
	}
}
