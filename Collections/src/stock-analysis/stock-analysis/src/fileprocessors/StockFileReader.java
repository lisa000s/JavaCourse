package fileprocessors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StockFileReader {

	String filePath = null;

	public StockFileReader(String filePath) {
		this.filePath = filePath;
	}

	public List<String> getHeaders() throws IOException {
		String line = readFirstLine(filePath);
		String[] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}

	static String readFirstLine(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	/**
	 * Complete the body of this method.
	 * 
	 * @return List
	 * @throws IOException
	 */
	public List<String> readFileData() throws IOException {
		List<String> lines = new ArrayList<String>();
//		FileReader fileReader = new FileReader(filePath);
//		BufferedReader bufferedReader = new BufferedReader(fileReader);		
//		String line = bufferedReader.readLine();
//		while (line!=null) {
//			line = bufferedReader.readLine();
//			lines.add(line);
//		}	
//		bufferedReader.close();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			//skip first line
				br.readLine();
				String line = null;
				//advance from the second line
				while ((line = br.readLine()) != null) {
					lines.add(line);
				}
			}
		
		
		
		return lines;
	}

}
