package week1.day1;

public class Factorial {

	public static void main(String[] args) {

		int input = 5; // Declaring input for finding factorial of number

		int fact = 1; // Declaring counter value for i = 1

		for (int i = 1; i <= input; i++) {
			fact = i * fact; // Multiply fact with the iterator variable and Assigning it to the 'fact'
								// variable)
		}
		System.out.println("The factorial for the input is: " + fact);

	}

}
