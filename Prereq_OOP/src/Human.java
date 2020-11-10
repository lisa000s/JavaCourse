
public class Human {
String name;
int age;
int heightInInches;
String eyeColor;

//public Human() {
//	age = 5;
//	eyeColor = "brown";
//	heightInInches = 60;
//	name = "Tom Zsabo";
//}
	
public void speak() {
	System.out.println("Hello, my name is " + name);
	System.out.println("I am " + age);
	System.out.println("My height is " + heightInInches);
	System.out.println("My eye color is " + eyeColor);
}


public Human(String name, int age, int heightInInches, String eyeColor) {
	super();
	this.name = name;
	this.age = age;
	this.heightInInches = heightInInches;
	this.eyeColor = eyeColor;
}


public void eat() {
	System.out.println("eating...");
}

public void walk() {
	System.out.println("walking...");
}
public void work() {
	System.out.println("working...");
}
}
