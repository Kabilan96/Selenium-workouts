package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArra {

	public static void main(String[] args) {
		

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {

			intList.add(arr[i]);
			
			if(intList.get(i)!=(i+1)) {
				System.out.println("The missing element in array : "+(i+1));
				break;
			}
		}
	}

}
