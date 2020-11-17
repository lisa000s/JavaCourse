package java_basics;

public class MyUtils {
	public static void printSomeJunk(String args) {
		System.out.println("Bla Bla " + args);
	}
	
	public static int printSomeJunk(int args) {
			System.out.println("Testing printSomeJunk method " + args);
		return args;
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg+secondArg);
	}
	public  int add10 (int someArg) {   //int is a return type of this method call   (first line - method signature, method body)
		 int result = someArg + 10;
		 return result;
		 
	}
}


