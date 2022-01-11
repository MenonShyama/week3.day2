package week3.day2;

import java.util.Arrays;
import java.util.List;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)

		String test = "I am a software tester";
		// a) split the words and have it in an array
		String[] split = test.split(" ");
		// b) Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++) {
			// c) find the odd index within the loop (use mod operator)
			if (i % 2 == 1) {
				char[] cs = split[i].toCharArray();
				// System.out.println(cs);
				for (int j = cs.length - 1; j >= 0; j--) {
					System.out.print(cs[j]);
				}
				System.out.print(" ");

			} else {
				System.out.print(split[i] + " ");
			}

		}
//d)split the words and have it in an array
		List<String> listTest = Arrays.asList(split);
//if(split==even)
		{

		}

//		
//		e)print the even position words in reverse order using another loop (nested loop)
//		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
//		

	}

}
