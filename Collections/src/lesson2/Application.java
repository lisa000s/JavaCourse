package lesson2;

import java.util.ArrayList;  //Ctr+Shift + O   = import shortcut 
import java.util.LinkedList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();    //animals here is a collection. Type should complex data type (wrapper classes), cannot be primitive data type. 
		animals.add("Lion");
		animals.add("Bird");
		animals.add("Cat");
		animals.add("Dog");
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		for (String value: animals ) {
//			System.out.println(value);
//		}
//		
		
		List <Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 12000, false); //   false = not a 4 wheel drive
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		Vehicle vehicle3 = new Vehicle("Jeep", "Wrangler", 8000, true);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		
//		for (Vehicle value : vehicles) {
//			System.out.println(value);
//		}
		printElements(vehicles);
		printElements(animals);
	}
	
	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++)
		System.out.println(someList.get(i));
	}

}
