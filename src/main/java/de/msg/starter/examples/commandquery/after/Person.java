package de.msg.starter.examples.commandquery.after;

public class Person {

	private String name;

	public String getName() {
		return this.name;
	}

	// This method is command/query separated
	public void transformNameToLowerCase() {
		this.name = this.name.toLowerCase();
	}

}
