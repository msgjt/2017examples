package de.msg.training.examples._instanceof;

import java.util.ArrayList;
import java.util.List;

import de.msg.training.examples._instanceof.model.Boat;
import de.msg.training.examples._instanceof.model.Car;
import de.msg.training.examples._instanceof.model.Plane;
import de.msg.training.examples._instanceof.model.Vehicle;

public class VehicleContainer {

  private List<Car> carList = new ArrayList<>();

  private List<Plane> planeList = new ArrayList<>();

  private List<Boat> boatList = new ArrayList<>();


  public void add(final Vehicle vehicle) {
    if (vehicle instanceof Car)
      carList.add((Car) vehicle);
    else if (vehicle instanceof Boat)
      boatList.add((Boat) vehicle);
    else if (vehicle instanceof Plane)
      planeList.add((Plane) vehicle);
    else
      throw new UnsupportedOperationException();
  }


  public List<Car> getCarList() {
    return carList;
  }


  public List<Plane> getPlaneList() {
    return planeList;
  }


  public List<Boat> getBoatList() {
    return boatList;
  }

}
