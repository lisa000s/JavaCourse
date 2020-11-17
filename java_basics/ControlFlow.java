package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = false;
		if(hungry) 
		{
			System.out.println("Im starving");
		}
		else 
		{
			System.out.println("not hungry");
	}
		
		int hungerRating = 5;
		if (!(hungerRating < 6)) {
			System.out.println("Not hungry");
		}
		else {
			System.out.println("Hungry");
		}
	}
}
