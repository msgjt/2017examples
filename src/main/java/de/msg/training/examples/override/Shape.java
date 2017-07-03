package de.msg.training.examples.override;

import java.io.IOException;
import java.io.InputStream;

public class Shape implements Order {

  public void printName() {
    System.out.println("I am a Shape");
  }


  public void readDataFromFile(final InputStream inputStream) throws IOException {
    // to be implemented
  }


  protected void protectedMethod() {
    // to be implemented
  }


  public Number getOrderNumber() {
    return 1;
  }


  public void trickyStuff(final Object... objects) {
    System.out.println("I am the trickies method in the (Java) world!");
  }

}
