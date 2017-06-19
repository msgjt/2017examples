package de.msg.training.examples._instanceof.visitor;

import de.msg.training.examples._instanceof.vmodel.VBoat;
import de.msg.training.examples._instanceof.vmodel.VCar;
import de.msg.training.examples._instanceof.vmodel.VPlane;

public interface VehicleVisitor {

  void visit(final VCar car);


  void visit(final VPlane plane);


  void visit(final VBoat boat);
}
