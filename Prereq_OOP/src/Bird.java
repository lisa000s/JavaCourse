
public class Bird extends Animal {
	
public Bird(String name, String color, String gender, int age) {
		super(name, color, gender, age);
		
	}

@Override
public void move() {
	System.out.println("Flapping wings");
	
}

}
