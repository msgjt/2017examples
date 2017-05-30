package de.msg.training.examples.accessmodifiers.order;

import de.msg.training.examples.accessmodifiers.Address;

public final class OrderWithShipping {

  private Order order;

  private Address address;


  public String getAddress() {
    return address.street + " " + address.postalCode + " " + address.getNumber();
  }

}
