package de.msg.training.examples._instanceof;

import de.msg.training.examples._instanceof.visitor.VehicleSeparator;
import de.msg.training.examples._instanceof.visitor.VehicleVisitor;
import de.msg.training.examples._instanceof.visitor.Visitable;

public class VehicleContainerExtended extends VehicleContainer {

  private VehicleVisitor visitor = new VehicleSeparator(this);


  public void add(final Visitable visitable) {
    visitable.accept(visitor);
  }

}
