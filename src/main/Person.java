package main;

public class Person {
	
	public String name;
	public int age;
	public double shoeSize;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void speak() {
		if (this.shoeSize != 0) {
			System.out.println("Hey! My name's " + this.name + ". I'm " + this.age + " years old, and my shoe size is " + this.shoeSize);
		} else {
			System.out.println("Hey! My name's " + this.name + ". I'm " + this.age + " years old.");
		}
	}
}
