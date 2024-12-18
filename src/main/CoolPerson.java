package main;

public class CoolPerson extends Person {
	public double coolness;
	
	public CoolPerson(String name, int age, double coolness) {
		super(name, age);
		this.coolness = coolness;
	}
	
	public void speak() {
		if (this.shoeSize != 0) {
			System.out.println("Hey! My name's " + this.name + ". I'm " + this.age + " years old, and my shoe size is " + this.shoeSize);
		} else {
			System.out.println("Hey! My name's " + this.name + ". I'm " + this.age + " years old.");
		}
		
		System.out.println("Oh right, I'm also cool for some reason, " + this.name + ", out!");
	}
}
