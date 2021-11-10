package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "welcome";
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			if (i%2==0) {
				System.out.print(Character.toUpperCase(chr[i]));
			}

			else {
				System.out.print(chr[i]);
			}
		}
	}

}
