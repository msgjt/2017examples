package de.msg.training.examples.statickeyword;

class Animal {

  static void name() {
    System.out.println("Animal");
  }

}

class Dog extends Animal {

  static void name() {
    System.out.println("Dog");
  }
}

public class Tricky {

  @SuppressWarnings("static-access")
  public static void main(final String args[]) {
    Animal[] a = { new Animal(), new Dog(), new Animal() };
    for (int x = 0; x < a.length; x++)
      a[x].name();
    Dog.name();
  }

}
