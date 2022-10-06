package edu.monmouth.inclass1;

public class Person {
	private String name;
	private int age;

	public Person() {
		setName("unknown");
		setAge(-1);
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
	

}
