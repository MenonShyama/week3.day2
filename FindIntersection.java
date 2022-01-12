package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// a) Declare An array
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		List list1 = new ArrayList();
		List list2 = new ArrayList();

		for (int num1 : arr1) {
			list1.add(num1);
		}
		for (int num2 : arr2) {
			list2.add(num2);
		}

		for (int i = 0; i < list1.size(); i++) {

			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					System.out.println(list1.get(i) + "");
				}

			}

		}

	}
}
