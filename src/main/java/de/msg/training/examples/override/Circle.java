package de.msg.training.examples.override;

public class Circle extends Shape {

  @Override
  public void printName() {
    System.out.println("I am a Circle");
  }


  public void doCircleStuff() {
    // to be implemented
  }


  public void trickyStuff(final Object firstObject, final Object secondObject) {
    System.out.println("Hi! This is tricky stuff from Circle");
  }

}
