package de.msg.training.examples._instanceof.vmodel;

import de.msg.training.examples._instanceof.model.Plane;
import de.msg.training.examples._instanceof.visitor.VehicleVisitor;
import de.msg.training.examples._instanceof.visitor.Visitable;

public class VPlane extends Plane implements Visitable {

  @Override
  public void accept(final VehicleVisitor visitor) {
    visitor.visit(this);
  }

}
