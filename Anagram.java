package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Declare a String
		String text1 = "stops";
		int num1 = text1.length();
		// Declare another String
		String text2 = "potss";
		int num2 = text2.length();
		// a) Check length of the strings are same then (Use A Condition)

		if (num1 != num2) {
			System.out.println("Not anagram.........");
		} else {
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2) == true) {

				System.out.println("Given words are Anagram");
			} else {
				System.out.println("Given words are not Anagram");
			}
		}
	}
}
