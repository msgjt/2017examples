package edu.msg.ro.examples.streams.map.second.before.and.java8;

import java.math.BigDecimal;

public class Staff {
	private String name;
    private int age;
    private BigDecimal salary;
    
    public Staff(String name, int age, BigDecimal sallary) {
		this.name = name;
		this.age = age;
		salary = sallary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
