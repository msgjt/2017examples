package de.msg.training.examples.accessmodifiers.product;

abstract final class Product {

  double getPrice() {
    return calculatePrice() * getProfitMargin();
  }


  public final String getName() {
    return "Wash & Go";
  }


  private double calculatePrice() {
    return 100;
  }


  protected double getProfitMargin() {
    return .1;
  }

}
