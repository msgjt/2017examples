package edu.msg.ro.examples.def.methods.first.java8;

public interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}
}
