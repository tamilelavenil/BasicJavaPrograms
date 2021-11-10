package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String palin = "madam";
		String rev = "";
		int len = palin.length();
		System.out.println("");
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + palin.charAt(i);
			if (rev.equals(palin)) {
				System.out.println(rev);
						
			}
			}
		}

}
