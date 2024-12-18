package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String username;
		int userAge = 69420;
		double shoeSize = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Your name? ");
		username = scanner.next();
		System.out.print("Your age? ");
		try {
			userAge = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("We just made you 69420 years old, since you don't want to comply.\n");
		}
		
		System.out.print("Shoe size? ");
		try {
			shoeSize = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Well we ignored that bruh.\n");
		}
		
		
		Person user = new Person(username, userAge);
		
		if (shoeSize != 0) {
			user.shoeSize = shoeSize;
		}
		user.speak();
		
		
		System.out.println("\nlookie here an npc! ");
		CoolPerson chilldude = new CoolPerson("chill guy", 21, 9);
		chilldude.speak();
		
		System.out.println("\nheres the dlc!");
		
		DLC nutDLC = new DLC();
		
		nutDLC.play();
		
		scanner.close();
	}
}
