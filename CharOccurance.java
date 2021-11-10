package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char find = 'e';
		char[] array = str.toCharArray();
		int len = array.length;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == find) {
				count = count + 1;
				
			}
			
		}
		System.out.println("The number of occurrences of char 'e' in the String is: " + count);

	}

}
