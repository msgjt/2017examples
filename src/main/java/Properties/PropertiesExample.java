package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String args[]) {
		try {
			Properties grades = new Properties();

			// load the properties file using load() and an input stream
			FileInputStream in = new FileInputStream("src/main/java/Properties/schoolGrades.properties");
			grades.load(in);
			in.close();

			// iterate properties file to get key-value pairs
			for (String key : grades.stringPropertyNames()) {
				String value = grades.getProperty(key);
				System.out.println("The grade in " + key + " is: " + value);
			}

			// search for key-value pair not in the list
			// you must define a default value, so as to return it
			// in case the key is not found in the main list
			String str = grades.getProperty("History", "No Grade");
			System.out.println("The grade in History is " + str);

			grades.setProperty("History", "22");
			str = grades.getProperty("History", "No Grade");
			System.out.println("The grade in History is " + str);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
