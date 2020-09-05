package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> hm =  new HashMap<>();
		hm.put("Smail", 25);
		hm.put("Albert", 38);
		hm.put("Sarah", 28);
		
//		for (String name : hm.keySet()) {
//			System.out.println(name+" is "+ hm.get(name)+" years old.");
//		}
//		System.out.println();
		
//		Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
//		for(Map.Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry.getKey() + " is "+ entry.getValue()+ " years old.");
//		}
//		System.out.println();
		/*#################################################*/
//		Iterator<Map.Entry<String, Integer>> entrySet = hm.entrySet().iterator();
//		while(entrySet.hasNext()) {
//			Map.Entry<String, Integer> entry = entrySet.next();
//			System.out.println(entry.getKey() + " is "+ entry.getValue()+ " years old.");
//		}
//		Iterator<String> keySetIterator = hm.keySet().iterator();
//		while(keySetIterator.hasNext()) {
//			String key = keySetIterator.next();
//			System.out.println(key + " is "+ hm.get(key) +" years old.");
//		}
//		Set<String> keySet = hm.keySet();
//		for (String name : keySet) {
//			System.out.println(name + " is "+ hm.get(name) + " years old.");
//		}
//		hm.forEach((name,age) -> {
//			System.out.println(name + "is "+ age + " years old.");
//		});
//		hm.entrySet().forEach((entry) -> {
//			System.out.println(entry.getKey() + " is "+ entry.getValue()+ " years old.");
//		});
//		hm.entrySet().stream().forEach(entry -> 
//		System.out.println(entry.getKey() + 
//				" is "+ entry.getValue()+ " years old."));
//		Stream.of(hm.entrySet()).forEach((entry)->{
//			System.out.println(entry);
//		});
		hm.entrySet().iterator().forEachRemaining(entry ->
				System.out.println(entry.getKey() + " is "+ 
						entry.getValue()+" years old.")
				);
	}

}
