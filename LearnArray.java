package week1.day2;
 import java.util.Arrays;
import java.util.Iterator;
public class LearnArray {

	public static void main(String[] args) {
		int array[] = {100,49,398,34,1,267};
		Arrays.sort(array);
		int len = array.length;
		System.out.println("Second largest number: " + array[len-2]);
		System.out.println("Second smallest number: " +array[1]);
		System.out.print("Array values: ");
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i]+" ");
		}
		for (int i = len-1; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
