package car_dealership;

public class Vehicle {
private String  model;
private int year;
private float price;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
@Override
public String toString() {
	return "Vehicle [model=" + model + ", year=" + year + ", price=" + price + "]";
}
public Vehicle(String model, int year, float price) {
	super();
	this.model = "Lexus";
	this.year = 2019;
	this.price = 10000;
}
public void setYear(int year) {
	this.year = year;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
}
