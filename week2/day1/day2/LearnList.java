package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> allModels = new ArrayList<>();
		// To find size
		System.out.println(allModels.size());
		boolean add = allModels.add("BSA");
		// To insert values in list
		allModels.add("Atlas");
		allModels.add("Hero");
		allModels.add("Atlas");
		allModels.add(1, "BSA");
		//		allModels.remove("Atlas");
		// To delete all values in list
		//		allModels.clear();
		boolean empty = allModels.isEmpty();
		System.out.println(empty);
		System.out.println(allModels.size());
		// To sort the list
		Collections.sort(allModels);

		// To print all the values in list
		for (String eachModel : allModels) {
			System.out.println(eachModel);
		}
		// To get particular value
		/*String last = allModels
				.get(allModels.size() -1);
		System.out.println(last);*/

	}

}









