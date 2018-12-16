package week2.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> bicycle =new HashMap<>();
		bicycle.put("BSA", 10);
		bicycle.put("hercules", 20);
		bicycle.put("Atlas", 10);
		bicycle.put("BSA", 20);
		int max=0;
		for (Entry<String, Integer> each : bicycle.entrySet()) {
			if(max<each.getValue()) {
				max=each.getValue();
			}
		} 
		for (Entry<String, Integer> each : bicycle.entrySet()) {
			if(max == each.getValue()) {
				System.out.println(each.getKey());
			}
		}








		//System.out.println(bicycle.containsKey("BSA"));








		//System.out.println(bicycle);
		//System.out.println(bicycle.get("Atlas"));
		// System.out.println(bicycle.keySet()); 
		// System.out.println(bicycle.values()); 
	}

}







