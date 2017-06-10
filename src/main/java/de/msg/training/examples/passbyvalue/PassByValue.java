package de.msg.training.examples.passbyvalue;

public class PassByValue {

  public static void main(final String args[]) {
    int five = 5;
    PassByValue pbv = new PassByValue();
    System.out.println("Before: " + five);
    pbv.increment(five);
    System.out.println("After: " + five);
  }


  public void increment(int integer) {
    integer++;
    System.out.println("Incremented: " + integer);
  }

}
