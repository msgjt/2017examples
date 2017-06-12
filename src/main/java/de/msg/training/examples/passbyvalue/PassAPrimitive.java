package de.msg.training.examples.passbyvalue;

public class PassAPrimitive {

  public static void main(final String args[]) {
    int five = 5;
    PassAPrimitive pbv = new PassAPrimitive();
    System.out.println("Before: " + five);
    pbv.increment(five);
    System.out.println("After: " + five);
  }


  public void increment(int integer) {
    integer++;
    System.out.println("Incremented: " + integer);
  }

}
