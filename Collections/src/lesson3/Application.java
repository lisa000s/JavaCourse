package lesson3;

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Animal> animals = new HashSet<Animal>();   //Set data structure prevents dups. Use LinkedHashSet to keep the order of insertion
		Animal animal1 = new Animal("Dog", 2);
		Animal animal2 = new Animal("Cat", 2);
		Animal animal3 = new Animal("Bird", 2);
		Animal animal4 = new Animal("Dog", 2);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		
		
		System.out.println(animal1.equals(animal4));
		
		System.out.println(animal1.hashCode());
		System.out.println(animal4.hashCode());
		
		
		
		
		for (Animal value: animals) {
			System.out.println(value);
		}
	}

}
