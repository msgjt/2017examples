package de.msg.training.examples.accessmodifiers;

abstract class Address {

  protected String street;

  private Integer number;

  String postalCode;


  String getStreet() {
    return street;
  }


  protected Integer getNumber() {
    return number;
  }


  String getPostalCode() {
    return postalCode;
  }


  public void setStreet(final String street) {
    this.street = street;
  }


  public void setNumber(final Integer number) {
    this.number = number;
  }


  public void setPostalCode(final String postalCode) {
    this.postalCode = postalCode;
  }

}
