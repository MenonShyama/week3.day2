package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		List<String> asList = Arrays.asList(split);
		Set<String> set = new LinkedHashSet<String>(asList);
		System.out.println(set);

		String[] array = new String[set.size()];
		set.toArray(array);
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}
	}

}
