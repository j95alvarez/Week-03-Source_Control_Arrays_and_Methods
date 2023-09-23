//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] arr = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println(arr[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println(arr[arr.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(arr[6]); // Throws ArrayIndexOutOfBoundsException
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(arr[-1]); // Throws ArrayIndexOutOfBoundsException
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
		
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int element : arr)
			System.out.println(element);
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		int sum = 0;
		for (int element : arr)
			sum += element;
			
		System.out.println("Sum or array: " + sum);
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		int average = sum / arr.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		for (int element : arr) 
			if (element % 2 == 1)
				System.out.println(element);
		
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert", "Juan"};
		
		// 12. Calculate the sum of all the letters in the new array
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		int sumOfLetters = 0;
		for (int i = 0; i < names.length; i++) {
			sumOfLetters += names[i].length();
		}
		
		System.out.println(sumOfLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		String name = "Juan";
		gretting(name);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("Hello " + greetingsReturned(name) + "!");
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		String word = "Civic";
		int length = 5;
		System.out.println(stringGreaterThanInt(word, length));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		String[] words = {"Hello", "World", "There", "Food"};
		String newNord = "There";
		System.out.println(stringinArray(words, newNord));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println(smallestNumberinArray(arr));		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		double[] doubleArr = {1.0, 5.0, 2.0, 8.0, 13.0, 6.0};
		System.out.println(doubleAverage(doubleArr));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		int[] temp = stringSizeInArray(names);
		for (int i : temp)
			System.out.println(i);
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println(evenWordsGreaterThanOdd(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println(idPalindrome(word));
		
		
	}

	

	
	// Method 13:
	public static void gretting(String name) {
		System.out.println("Hello " + name + "!");
		
	}

	// Method 14:
	public static String greetingsReturned(String name) {
		return name;
	}
	
	// Method 15:
	public static boolean stringGreaterThanInt(String word, int length) {
		return word.length() > length;
	}
	
	// Method 16:
	public static boolean stringinArray(String[] words, String word) {
		for (String i : words) {
			if (i.equals(word))
				return true;
		}
		return false;
	}
	
	// Method 17:
	public static int smallestNumberinArray(int[] arr) {
		int temp = arr[0];
		
		for (int num : arr)
			if (num < temp)
				temp = num;
		return temp;
	}
	
	// Method 18:
	public static double doubleAverage(double[] arr) {
		int avg = 0;
		for (double i : arr)
			avg += i;
		
		return avg / arr.length;
	}
	
	// Method 19:
	public static int[] stringSizeInArray(String[] names) {
		int[] temp = new int[names.length];
		for (int i = 0; i < names.length; i++)
			temp[i] = names[i].length();
		
		return temp;
	}
	
	// Method 20:
	public static boolean evenWordsGreaterThanOdd(String[] names) {
		int even = 0;
		int odd = 0;
		
		for (String name : names)
			if (name.length() % 2 == 0)
				even++;
			else
				odd++;
		
		return even > odd;
	}
	
	// Method 21:
	public static boolean idPalindrome(String word) {
		for (int i = 0; i < word.length() / 2; i++)
			if(word.charAt(i) != word.charAt(word.length() - i - 1))
				return false;
		return true;
	}

}