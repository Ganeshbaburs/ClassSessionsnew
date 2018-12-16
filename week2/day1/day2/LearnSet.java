package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> allModels = new LinkedHashSet<String>();

		// To find size
		System.out.println(allModels.size());
		allModels.add("Hero");
		boolean add = allModels.add("BSA");
		// To insert values in list
		allModels.add("atlas");
		boolean add2 = allModels.add("atlas");
		System.out.println(add2);
		System.out.println(allModels.size());
		for (String eachModel : allModels) {
			System.out.println(eachModel);
		}
		List<String> everyModel = new ArrayList<>(allModels);
		System.out.println(everyModel.get(0));
		
	}

}









