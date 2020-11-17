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
public void runCreditHistoryCheck (Customer cust1, double loanAmount) {
	System.out.println("Credit Check Passed");
}
public void processTransaction() {
	System.out.println("Transaction processed in cash");
}

public void handleCustomer(Vehicle vehicle, Customer cust1, boolean finance) {   //finance true - means customer wants to finance a car
	if (finance == true) {
		double loanAmount = vehicle.getPrice() - cust1.getCashOnHand();
		runCreditHistoryCheck (cust1, loanAmount);
	}
	else if (vehicle.getPrice() <= cust1.getCashOnHand()) { 		
		processTransaction();
		System.out.println("Customer purchased car " + vehicle);
	}
	else {
		System.out.println("Customer needs to bring more money");
	}
		
	}
}

