package lesson1;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		ArrayList <String> words = new ArrayList<String>();  // doubles the size of array when you exceed 10 = 20, when exceed 20 = 40. 
		//Good for retrieving data. You can go to the specific index of the array and get the data
		
		//  <type> is called parameterization. Java is a type-safe language
		words.add("hello");
		words.add("there");
		words.add("10");
	
		
		String items1 = (String) words.get(0);
		String item2 = words.get(2);

		// System.out.println(item2);
		LinkedList<Integer> numbers= new LinkedList<Integer>(); //Good for manipulating the data (adding or removing things). But not good for retrieving, it needs to traverse through the list to get the data. 
		numbers.add(100);
		numbers.add(30);
		numbers.remove();
		for (int number : numbers) { //For Each Loop
			System.out.println(number);
		}
	}
	
	

}
