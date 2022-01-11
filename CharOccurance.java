package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		// convert the string into char array
		char search = 'e';
		char[] arr = str.toCharArray();
		int length = arr.length;
		for (int i = 1; i < length; i++) {

			if (str.charAt(i) == search)
				count++;

		}
		System.out.println("Given alphabet 'e' occur " + count + " times in a sentence");

	}

}
