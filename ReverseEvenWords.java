package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] strArray = test.split(" ");
//		String str = "";
		String str1 = "";
	//	System.out.println(strArray);
		for (int i = 0; i < strArray.length; i++) {
			if (i%2!=0) {
				str1 = str1 + new StringBuilder(strArray[i]).reverse()+" ";}
			else {
				str1 = str1 + strArray[i]+ " ";
			}
		}

		System.out.println(str1);
		

	}
}





