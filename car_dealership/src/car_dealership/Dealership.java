package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Apple St");
		cust1.setCashOnHand(22000);
		cust1.goesToDealership();
		//cust1.purchaseCar(vehicle, emp, true);
		Employee emp = new Employee();
		emp.introduceThemselves();
		Vehicle vehicle = new Vehicle();
		emp.handleCustomer(cust1, true , vehicle, cust1.getCashOnHand());
		
		
		
		
	}

}
