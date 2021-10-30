package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int int1 = 0;
		int int2 = 1;
		int range = 8;
		// Printing first number
		System.out.println("The First number is : " + int1);
		// Iterating from 1 to the range
		for (int i = 1; i < range; i++) {

			int sum = int1 + int2; // adding first and second number and assigning to sum

			int1 = int2; // Assign second number to the first number

			int2 = sum; // Assign sum to the second number

			System.out.print(sum + " "); // print sum
		}

	}

}
