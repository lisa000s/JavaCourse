import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Application {

	public static void main(String[] args)  {
//		for (int i=0; i<=3; i++) {
//		System.out.println("Enter some text: ");
//		Scanner input = new Scanner(System.in);
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
//		}
//		
		try {
		File file = new File("text.txt");
		Scanner input;
		
			input = new Scanner(file);
	
		while (input.hasNextLine()) {
		String line = input.nextLine();
		System.out.println(line);
		}
		input.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	}

}
