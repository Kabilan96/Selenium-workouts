package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);

		Set<Integer> intSet = new LinkedHashSet<Integer>();
		Set<Integer> intSet1 = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			boolean add = intSet.add(arr[i]);
			if (add == false) {
				intSet1.add(arr[i]);

			}
		}

		System.out.println("The set elements : " + intSet);
		System.out.println("The duplicate elements : " + intSet1);
	}

}
