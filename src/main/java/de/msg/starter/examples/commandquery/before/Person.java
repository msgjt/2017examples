package de.msg.starter.examples.commandquery.before;

public class Person {

	private String name;

	public String getName() {
		return this.name;
	}

	// This method is not command/query separated
	public String getNameAndTransformItToLowerCase() {
		this.name = this.name.toLowerCase();
		return this.name;
	}

}
