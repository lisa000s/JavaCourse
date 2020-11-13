
public class Sparrow extends Bird implements Flyable {

	public Sparrow(String name, String color, String gender, int age) {
		super(name, color, gender, age);
		
	}

	@Override
	public void fly() {		
		System.out.println("Sparrow flies..");
	}

}
