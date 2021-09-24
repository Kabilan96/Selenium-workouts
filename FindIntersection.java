package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		 int [] num1 = { 3, 2, 11, 4, 6, 7 };
		  int [] num2 = { 1, 2, 8, 4, 9 ,7 };
		  List<Integer> list1 = new ArrayList<Integer>();
		  List<Integer> list2 = new ArrayList<Integer>();   
		  
		  for (int i = 0; i < num1.length; i++) {
			  list1.add(num1[i]);		 
		}
		  System.out.println("The Value List1:"+ list1);
		  for (int j = 0; j < num2.length; j++) {
			  list2.add(num2[j]);	  
		}
		  System.out.println("The Value List2:"+ list2);
		  list1.retainAll(list2);
		  System.out.println("Final List :"+ list1);
	}

}
