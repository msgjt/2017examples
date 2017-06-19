package de.msg.training.examples._instanceof.vmodel;

import de.msg.training.examples._instanceof.model.Car;
import de.msg.training.examples._instanceof.visitor.VehicleVisitor;
import de.msg.training.examples._instanceof.visitor.Visitable;

public class VCar extends Car implements Visitable {

  @Override
  public void accept(final VehicleVisitor visitor) {
    visitor.visit(this);
  }

}
