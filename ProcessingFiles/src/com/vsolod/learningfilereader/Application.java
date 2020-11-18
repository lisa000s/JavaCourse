package com.vsolod.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) throws IOException {
		File file = new File("text.txt");
		
		try (FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);) { //reads line by line, not the whole file
			String line = bufferedReader.readLine();
			while (line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
		} catch (IOException e) {
			
			System.out.println("Problem reading the file" + file.getName());
		}
		
	}

}
