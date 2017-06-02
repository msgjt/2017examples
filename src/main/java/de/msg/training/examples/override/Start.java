package de.msg.training.examples.override;

public class Start {

  public static void main(final String args[]) {
    Shape shape = new Shape();
    shape.printName();

    Shape square = new Square();
    square.printName();

    Shape circle = new Circle();
    circle.printName();
    // you have to cast to Circle to access Circle specific methods
    ((Circle) circle).doCircleStuff();

    circle.trickyStuff("I have no effect");
  }

}
