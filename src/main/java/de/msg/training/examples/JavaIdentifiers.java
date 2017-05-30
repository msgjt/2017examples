package de.msg.training.examples;

/**
 * Created by szucsa.
 */
public class JavaIdentifiers {

  /**
   * Invalid identifiers
   */
  //  private String 4;
  //  private String %percent;
  //  private String #include;
  //  private String switch;

  private String _v4r1abl3;

  private Integer wellMyDearFriendThisIdentifierIsGoingToBeAnExceptioanallyLongIdentifierCommaWhichIsUsedForWhateverPurposeYouWantOrCanUseAnIntegerVariable;

  private static String $sign = "\u0024";

  private static String \u0024;


  public static void main(final String... args) {
    $ = "This is strange indeed";
    System.out.println($sign);
    System.out.println("\u0041");
    System.out.println($);
  }
}
