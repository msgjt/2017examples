package de.msg.training.examples.operators;

public class IncrementDecrementOperators {

  public static void main(final String args[]) {

    Integer ping = 1;
    Integer pong = 1;

    ping += +pong++;

    System.out.println("=====================");

    System.out.println("The value of ping: " + ping);
    System.out.println("The value of pong: " + pong);

    System.out.println("=====================");

    pong -= -++ping;

    System.out.println("The value of ping: " + ping);
    System.out.println("The value of pong: " + pong);
    System.out.println("=====================");
  }

}
