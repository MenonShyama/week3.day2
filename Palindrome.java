package week3.day2;


public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
		//a) Declare A String value as"madam"
		String string="Madam";
		String str = string.toLowerCase();
		 //b) Declare another String rev value as ""
		String rev="";
		 // c) Iterate over the String in reverse order
		int str1=str.length();
		for(int i=str1-1;i>=0;--i)
		{
			rev=rev+(str.charAt(i));
		}
		if(str.equals(rev))
		{
			System.out.println(rev +" is palindrom");
		}
		else
		{
			System.out.println(rev+" is not a palindrom");	
		}
	}
	}