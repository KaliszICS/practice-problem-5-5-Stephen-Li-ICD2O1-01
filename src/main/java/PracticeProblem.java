/*
File: Lesson 5.5 - Arrays and iterating
Author: Stephen Li
Date Created: May 6, 2026
Date Last Modified: May 6, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome(String word1) {
		word1 = word1.toLowerCase().replace(" ", "");
		if (word1.equals("")) {
			return true;
		}
		int left = 0;
		int right = word1.length() - 1;
		while (left < right) {
			if (word1.charAt(left) != (word1.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
