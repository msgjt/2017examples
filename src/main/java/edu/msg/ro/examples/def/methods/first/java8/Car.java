package edu.msg.ro.examples.def.methods.first.java8;

public class Car implements Vehicle, FourWheeler {
	@Override
	public void print() {
		Vehicle.super.print();
	}

	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}
