package week2.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		String data = sc.next();
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] ch = data.toCharArray();
        for (char c : ch) {
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)+1);
        	} else  
			 map.put(c, 1);
		}
        System.out.println(map);
	}

}






