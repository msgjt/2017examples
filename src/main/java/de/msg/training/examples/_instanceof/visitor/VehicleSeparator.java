package de.msg.training.examples._instanceof.visitor;

import de.msg.training.examples._instanceof.VehicleContainer;
import de.msg.training.examples._instanceof.vmodel.VisitableBoat;
import de.msg.training.examples._instanceof.vmodel.VisitableCar;
import de.msg.training.examples._instanceof.vmodel.VisitablePlane;

public class VehicleSeparator implements VehicleVisitor {

  private VehicleContainer container;


  public VehicleSeparator(final VehicleContainer container) {
    this.container = container;
  }


  @Override
  public void visit(final VisitableCar car) {
    container.getCarList().add(car);
  }


  @Override
  public void visit(final VisitablePlane plane) {
    container.getPlaneList().add(plane);
  }


  @Override
  public void visit(final VisitableBoat boat) {
    container.getBoatList().add(boat);
  }

}
