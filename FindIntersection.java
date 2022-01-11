package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// a) Declare An array
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };

		// b) Declare another array
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		// c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr1.length; i++) {
			// d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr2.length; j++) {
				// e) Compare Both the arrays using a condition statement
				if (arr1[i] == arr2[j]) {
					// f) Print the first array (shoud match item in both arrays)
					System.out.println("Numbers present in both the arrays are " + arr1[i]);
				}
			}
		}

	}

}
