package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of the numbers " + sum);
		return sum;
	}

	public int sub(int num3, int num4) {
		int subtract = num3 - num4;
		System.out.println("Subtract two numbers: " + subtract);
		return subtract;
	}

	public double mul(double num1, double num2) {
		double multiply = num1 * num2;
		System.out.println("Multiply two numbers: " + multiply);
		return multiply;
	}

	public float div(float num1, float num2) {
		float multiply = num1 / num2;
		System.out.println("Division of numbers: " + multiply);
		return multiply;
	}

}
