package StringPractice;

public class FoorLoop {

	public static void main(String[] args) {
		int counter = 0;
//		for (int i = 0; i <= 100; i = i+2) {
//			System.out.println(i);
//			int temp = counter +1;
//			counter = temp;

		for (int idx = 0; idx < 100; idx++) {		
			for (int j = 0; j < 100; j++) {
System.out.println("Idx value is " + idx + " and j value is  " + j);
counter++;
			}

		}
System.out.println(counter);
	}

}
