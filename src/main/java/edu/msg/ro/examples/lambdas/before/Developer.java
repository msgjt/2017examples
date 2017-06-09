package edu.msg.ro.examples.lambdas.before;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private BigDecimal sallary;
	private int age;

	public Developer(String name, BigDecimal sallary, int age) {
		this.name = name;
		this.sallary = sallary;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSallary() {
		return sallary;
	}

	public void setSallary(BigDecimal sallary) {
		this.sallary = sallary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", sallary=" + sallary + ", age=" + age + "]";
	}

}
