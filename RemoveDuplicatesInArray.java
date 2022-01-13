package week3.day2;

import java.util.ArrayList;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		Set<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);

		}
		System.out.println(list);
	}

}
