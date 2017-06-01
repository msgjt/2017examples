package de.msg.training.examples.enums;

import java.io.PrintStream;

public class CoffeeSizeUser {

  private static PrintStream CONSOLE = System.out;


  public static void main(final String args[]) {

    //    Cannot invoke enum constructor
    //    CoffeeSize customSize = new CoffeeSize(500);

    // where did values() come from ?
    for (CoffeeSize coffeeSize : CoffeeSize.values())
      // See how enum declaration order matters
      CONSOLE.println(coffeeSize);
  }

}
