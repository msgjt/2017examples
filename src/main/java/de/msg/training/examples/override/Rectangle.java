package de.msg.training.examples.override;

public class Rectangle extends Square {

  @Override
  public void printName() {
    System.out.println("I am a Rectangle");
  }


  @Override
  // return type is Integer instead of Number
  public Integer getOrder() {
    return 5;
  }

}
