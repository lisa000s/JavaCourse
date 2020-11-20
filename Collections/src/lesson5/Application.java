package lesson5;

import java.util.HashMap;  //Ctr+SHift+O
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
//		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
//		dictionary.put("Brave", "ready to face danger");
//		dictionary.put("Brilliant", "exceptional");
//		dictionary.put("Joy", "feeling of pleasure");
//		dictionary.put("Confidence", "certain about smt");
//		
////		for (String word: dictionary.keySet()) {
////			System.out.println(dictionary.get(word));
////			//System.out.println(word);
////		}
//		
//		for (Map.Entry<String, String> entry  :dictionary.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		
		
		
		
		TreeMap<String, String> dictionary = new TreeMap<String, String>();   // sort the keys in their natural order - strings alphabetically, ints asc
		dictionary.put("Brave", "ready to face danger");
		dictionary.put("Brilliant", "exceptional");
		dictionary.put("Joy", "feeling of pleasure");
		dictionary.put("Confidence", "certain about smt");
		
		
		
		dictionary.put("Brilliant", "xxxxxxxxx");   //will override dups, cannot have two keys
		
//		for (String word: dictionary.keySet()) {
//		for (String word: dictionary.values()) {
//			System.out.println(dictionary.get(word));
//			//System.out.println(word);
//		}
		
		for (Map.Entry<String, String> entry  :dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
	}
	

}
