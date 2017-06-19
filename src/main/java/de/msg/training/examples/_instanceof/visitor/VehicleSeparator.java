package de.msg.training.examples._instanceof.visitor;

import de.msg.training.examples._instanceof.VehicleContainer;
import de.msg.training.examples._instanceof.vmodel.VBoat;
import de.msg.training.examples._instanceof.vmodel.VCar;
import de.msg.training.examples._instanceof.vmodel.VPlane;

public class VehicleSeparator implements VehicleVisitor {

  private VehicleContainer container;


  public VehicleSeparator(final VehicleContainer container) {
    this.container = container;
  }


  @Override
  public void visit(final VCar car) {
    container.getCarList().add(car);
  }


  @Override
  public void visit(final VPlane plane) {
    container.getPlaneList().add(plane);
  }


  @Override
  public void visit(final VBoat boat) {
    container.getBoatList().add(boat);
  }

}
