package de.msg.training.examples.io.character;

import java.nio.charset.Charset;
import java.util.Arrays;

public class Encoding {

  private static final String COLON = ": ";
  private static final String ASCII = "ASCII";
  private static final String UTF_8 = "UTF-8";


  public static void main(final String args[]) {
    //String to be encoded
    String taxi = "Täxii";

    //encode with UTF-8 encoding
    byte[] utf8Encoded = Charset.forName(UTF_8).encode(taxi).array();
    //encode with ASCII encoding
    byte[] asciiEncoded = Charset.forName(ASCII).encode(taxi).array();

    System.out.println(UTF_8 + COLON + Arrays.toString(utf8Encoded));
    System.out.println(ASCII + COLON + Arrays.toString(asciiEncoded));
  }

}
