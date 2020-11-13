
public class Fish extends Animal {

	public Fish(String name, String color, String gender, int age) {
		super(name, color, gender, age);
		
	}

	public void swim() {
		System.out.println("Fish swimming..");
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming");
		
	}
}
