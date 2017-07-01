package de.msg.training.examples.io.streams;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Encoding {

  private static final String COLON = ": ";
  private static final String ASCII = "ASCII";
  private static final String UTF_8 = "UTF-8";


  public static void main(final String args[]) {
    //String to be encoded
    String taxi = "T�xii";

    //encode with UTF-8 encoding
    byte[] utf8Encoded = Charset.forName(UTF_8).encode(taxi).array();
    //encode with ASCII encoding
    byte[] asciiEncoded = Charset.forName(ASCII).encode(taxi).array();

    System.out.println(UTF_8 + COLON + Arrays.toString(utf8Encoded));
    System.out.println(ASCII + COLON + Arrays.toString(asciiEncoded));

    //if we use the wrong encoding we will get funny characters
    String wrongDecoding;
    try {
      wrongDecoding = new String(asciiEncoded, UTF_8);
      System.out.println(wrongDecoding);
    }
    catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }

}
