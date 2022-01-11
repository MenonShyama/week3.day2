package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each

		// a) Convert the String to character array
		char[] arr = test.toCharArray();
		// b) Traverse through each character (using loop)
		for (char ch : arr) {
			if (Character.isLetter(ch)) {
				// System.out.println(arr[i]+" is a alphabet");
				letter++;
			} else if (Character.isDigit(ch)) {
				num++;
			} else if (Character.isSpaceChar(ch)) {
				space++;
			} else {
				specialChar++;
			}

		}
		System.out.println("Number of alphabets in the sentence is " + letter);
		System.out.println("Number of digits in the sentence is " + num);
		System.out.println("Number of space in the sentence is " + space);
		System.out.println("Number of special characters in the sentence is " + specialChar);

	}
}
