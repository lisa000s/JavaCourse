package car_dealership;

public class Employee {
String name = "John S.";
String title = "Sales Associate";

public void sellCar(Vehicle vehicle) {
	System.out.println(name + "sold " + vehicle);
}

public void introduceThemselves() {
	System.out.println("Hello, my name is " + name + "I am your " + title);
}
public void runCreditHistoryCheck (Customer cust, double doubleAmount) {
	System.out.println("Credit Check Passed");
}
public void processTransaction() {
	System.out.println("Transaction processed");
}

public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle, double doubleAmount) {
	if ((finance == true) && (vehicle.getPrice() <= cust.getCashOnHand())) {
		runCreditHistoryCheck(cust, doubleAmount);
		processTransaction();
	}
	else {
		System.out.println("Customer needs to bring more money");
	}
		
	}
}

