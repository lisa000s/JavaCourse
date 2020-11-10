
public class Earth {

	public static void main(String[] args) {
//		Human tom = new Human();   //instance variable, object is created when statement executed
//		tom.age = 5;
//		tom.eyeColor = "brown";
//		tom.heightInInches = 60;
//		tom.name = "Tom Zsabo";
//		tom.speak();
//
//		
//		Human joe = new Human();
//		joe.name = "Joe Smith";
//		joe.age = 10;
//		joe.eyeColor = "blue";
//		joe.heightInInches = 70;
//		joe.speak();
		
		Human human1 = new Human("Tom", 5, 76, "blue");
		Human human2 = new Human("Joe", 25, 10, "gray");
		Human human3 = new Human("John", 15, 50, "brown");
		human1.speak();
		human2.speak();
		human3.speak();
	}

}
