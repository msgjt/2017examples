package de.msg.training.examples._instanceof.visitor;

import de.msg.training.examples._instanceof.vmodel.VisitableBoat;
import de.msg.training.examples._instanceof.vmodel.VisitableCar;
import de.msg.training.examples._instanceof.vmodel.VisitablePlane;

public interface VehicleVisitor {

  void visit(final VisitableCar car);


  void visit(final VisitablePlane plane);


  void visit(final VisitableBoat boat);
}
