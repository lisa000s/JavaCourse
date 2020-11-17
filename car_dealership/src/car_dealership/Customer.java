package car_dealership;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	
	public void goesToDealership () {
		System.out.println(name + " came to the dealdership to buy a car");
	}
public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance ) {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getCashOnHand() {
	return cashOnHand;
}
public void setCashOnHand(double cashOnHand) {
	cashOnHand = cashOnHand +500;
	this.cashOnHand = cashOnHand;
}
}