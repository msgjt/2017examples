package de.msg.training.examples.override;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Square extends Shape {

  @Override
  public void printName() {
    System.out.println("I am a Square");
  }


  @Override
  // wow ... we have changed the access modifier from protected to public, and we throw an exception
  public void protectedMethod() throws RuntimeException {
    // here's how you invoke the superclass method
    super.protectedMethod();

    // this is not possible
    // super.super.protectedMethod();
  }


  @Override
  public void readDataFromFile(final InputStream inputStream) throws FileNotFoundException {
    // to be implemented
  }

}
