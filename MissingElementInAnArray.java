package week1.day2;
import java.util.Arrays;
import java.util.Iterator;
public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
	
		for (int i = arr[0]; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (i != j) {
					System.out.println(arr[j]);
					}
			}
			break;	
					
			}
		}
		
		
	}
	
