package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
        int[] data = {3,2,11,4,6,7};
		
		List<Integer> listArray = new ArrayList<Integer>();
		for(int i =0;i<data.length;i++) {
			listArray.add(data[i]);
		}
		Collections.sort(listArray);
		System.out.println("The List Array : "+listArray);
		int size = listArray.size();
		System.out.println("The size of the Array is: " + size);

		int secondLast = size-2;
		System.out.println("The second last element in the list: " + listArray.get(secondLast));
	}

}
