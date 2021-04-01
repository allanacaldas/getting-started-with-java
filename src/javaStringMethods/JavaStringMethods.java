package javaStringMethods;

public class JavaStringMethods {
	public static void main(String[] args) {

		// How to convert all the String characters into lower case letter:
		String original = "abc ABC def DEF abc ABC def DEF ";
		String string1 = original.toLowerCase();
		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase -" + string1 + "-");

		// Now, we're going to do the opposite, convert all of them into upper case
		// letter
		String string2 = original.toUpperCase();
		System.out.println("toUpperCase -" + string2 + "-");

		// Using a trim() function, we can remove the whitespace from both ends of a
		// String.
		String string3 = original.trim();
		System.out.println("Trim -" + string3 + "-");

		// The Substring method is used when we want to get a part of the given String
		String string4 = original.substring(4);
		System.out.println("Substring -" + string4 + "-");
		String string5 = original.substring(4, 7);
		System.out.println("Substring -" + string5 + "-");

		// The Replace method is used when we want to replace a character by another one
		String string6 = original.replace("a", "v");
		System.out.println("Replace -" + string6 + "-");
		String string7 = original.replace("abc", "vwx");
		System.out.println("Replace -" + string7 + "-");

		// Returns the position of the first found occurrence of specified characters in
		// a string
		int x = original.indexOf("bc");
		System.out.println("IndexOf: " + x );

		// Returns the position of the last found occurrence of specified characters in
		// a string
		int y = original.lastIndexOf("bc");
		System.out.println("lastIndexOf: " + y);

		// Splits a string into an array of substrings
		String fruits = "banana apple lemon grape";
		String [] vect = fruits.split(" ");
		System.out.println("Split: " + vect.length);
		String fruit1 = vect[0];
		String fruit2 = vect[1];
		String fruit3 = vect[2];
		String fruit4 = vect[3];
		
		System.out.println(fruit1);
		System.out.println(fruit2);
		System.out.println(fruit3);
		System.out.println(fruit4);

	}

}
