package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// Input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		// Counts
		int letter = 0, space = 0, num = 0, specialChar = 0;
		// Covert string to char array
		char[] testArr = test.toCharArray();
		// Traverse through each character and find out char type
		for (int i = 0; i < testArr.length; i++) {
			if (Character.isLetter(testArr[i])) {
				letter = letter + 1;
			} else if (Character.isDigit(testArr[i])) {
				num = num + 1;
			} else if (Character.isSpaceChar(testArr[i])) {
				space = space + 1;
			} else {
				specialChar = specialChar + 1;
			}

		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
