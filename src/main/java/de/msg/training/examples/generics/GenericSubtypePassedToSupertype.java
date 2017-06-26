package de.msg.training.examples.generics;

public class GenericSubtypePassedToSupertype {

  // ArrayList<Integer> cannot be passed to parameter of type ArrayList<Number> even though Integer is a subtype of Number

  public static void main(final String[] args) {

    add(new Double[3]);

  }


  public static void add(final Number[] param) {
    param[0] = new Integer(5);
  }

}
