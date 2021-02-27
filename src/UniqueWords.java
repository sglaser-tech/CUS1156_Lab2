/* Project: Lab2
 * Class: UniqueWords.java
 * Author: Sarah Glaser
 * Date: February 28th, 2021
 * This program counts the number of distinct elements.
 */

import java.util.ArrayList;

public class UniqueWords {

	// ----------------------------------------------------------------------------------------------------------
	// This method counts the number of unique strings in a list.
	public static int countUnique(ArrayList<String> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			boolean isUnique = true;
			for (int j = 0; j < i; j++) {
				if (list.get(i) == list.get(j)) {
					isUnique = false;
				}
			}
			if (isUnique) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
