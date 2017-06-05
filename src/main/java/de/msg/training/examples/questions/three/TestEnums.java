package de.msg.training.examples.questions.three;

public class TestEnums {

  public enum Days {
    MON,
    TUE,
    WED
  };


  public static void main(final String args[]) {
    for (Days d : Days.values())
      ;
    Days[] d2 = Days.values();
    System.out.println(d2[2]);
  }

}
