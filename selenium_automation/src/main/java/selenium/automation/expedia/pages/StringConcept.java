package selenium.automation.expedia.pages;

import java.util.HashMap;
import java.util.Scanner;

public class StringConcept {

	static String inputString = "Count string length is";
	static int length = 0;

	public static void main(String[] args) {

		// StringConcept.stringLenghtCount();
		StringConcept.reverseString();
		// StringConcept.charCountFromString();

	}

	// Length of String without using predefine method
	public static void stringLenghtCount() {

		String updatedString = inputString.replace(" ", "");

		for (char c : updatedString.toCharArray()) {
			length++;
		}

		System.out.println("Length of String without using predefine method ->>>>> " + length);

	}

	// Reverse string
	public static void reverseString() {
		String reverseString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + inputString.charAt(i);
		}

		System.out.println("Reverse string is without predefine method ->>>>>> " + reverseString);

		// With predefine method
		StringBuilder reversString = new StringBuilder(inputString);
		System.out.println("Reverse string is with predefine method ->>>>>> " + reversString.reverse().toString());

	}

	// Count individual character count in given string
	public static void charCountFromString() {

		Scanner inputData = new Scanner(System.in);
		System.out.println("Enter input");

		String inputString = inputData.nextLine();

		char[] strArray = inputString.toCharArray();

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char c : strArray) {

			if (charCountMap.containsKey(c)) {

				// charCountMap.put(c, charCountMap.get(c) + 1);
			} else
				charCountMap.put(c, 1);

		}
		System.out.println("Individual character count is given string is: " + charCountMap);
	}
}
