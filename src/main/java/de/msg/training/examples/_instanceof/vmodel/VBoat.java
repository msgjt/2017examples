package de.msg.training.examples._instanceof.vmodel;

import de.msg.training.examples._instanceof.model.Boat;
import de.msg.training.examples._instanceof.visitor.VehicleVisitor;
import de.msg.training.examples._instanceof.visitor.Visitable;

public class VBoat extends Boat implements Visitable {

  public VBoat(final String licenseNumber) {
    super(licenseNumber);
  }


  @Override
  public void accept(final VehicleVisitor visitor) {
    visitor.visit(this);
  }

}
