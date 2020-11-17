package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Apple St");
		cust1.setCashOnHand(2000);
		cust1.goesToDealership();
		Employee emp = new Employee();
		emp.introduceThemselves();
		Vehicle vehicle = new Vehicle(null, 0, 0);
		vehicle.setModel("Lexus");
		vehicle.setPrice(2000);
		vehicle.setYear(2020);
		cust1.purchaseCar(vehicle, emp, false);
		
		
		
		
	}

}
