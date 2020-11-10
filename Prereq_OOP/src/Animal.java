
public abstract class Animal {
String name;
String color;
String gender;
int age;


public void eat() {
	System.out.println("eating..");
}

public void aboutAnimal() {
	System.out.println("This animal is " + name);
	System.out.println("Color is  " + color);
	System.out.println("Female or male? " + gender);
	System.out.println("How old?  " + age);
}

public Animal(String name, String color, String gender, int age) {
	super();
	this.name = name;
	this.color = color;
	this.gender = gender;
	this.age = age;
}


public abstract void move();
}
