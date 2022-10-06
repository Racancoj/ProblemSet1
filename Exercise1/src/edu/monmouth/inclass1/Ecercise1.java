package edu.monmouth.inclass1;

public class Ecercise1 {

	public static void main(String[] args) {
		Person me;
		me = new Person();
		System.out.println("age: " + me.getAge() + "name: " + me.getName());
		
		me.setAge(20);
		me.setName("Ez");
		System.out.println("age: " + me.getAge() + "name: " + me.getName());
		
		Person you = new Person();
		you.setAge(87);
		you.setName("pete");
		
		

	}

}
