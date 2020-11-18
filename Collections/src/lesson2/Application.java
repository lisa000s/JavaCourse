package lesson2;

import java.util.ArrayList;  //Ctr+Shift + O   = import shortcut 

public class Application {

	public static void main(String[] args) {
//		ArrayList<String> animals = new ArrayList<String>();    //animals here is a collection. Type should complex data type, cannot be primitive data type. 
//		animals.add("Lion");
//		animals.add("Bird");
//		animals.add("Cat");
//		animals.add("Dog");
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		for (String value: animals ) {
//			System.out.println(value);
//		}
//		
		
		ArrayList <Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 12000, false); //   false = not a 4 wheel drive
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		Vehicle vehicle3 = new Vehicle("Jeep", "Wrangler", 8000, true);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		
		for (Vehicle value : vehicles) {
			System.out.println(value);
		}
	}

}
