package june20session;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		int[] array= new int[10];
		//Syntax to create the List
		List<Integer> list= new ArrayList<Integer>();
		list.add(567);
		list.add(123);
		list.add(445);
		list.add(789);
		list.add(123);
		//to insert a value in the list use list.add(index,element)
		list.add(2, 786);
		//to remove value use list.remove(index)
		list.remove(3);
		list.set(0, 99); //value will be updated once modifying in the list.
		
		//list.clear--helps you to clear all the values from list(flush the list)
		//list.clear();
		//to check if list is empty or not
		//list.isEmpty();
		//ctrl+2+L
		int size = list.size();
		System.out.println("Size of the list:"+size);
		System.out.println(list);
		//for sorting 
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		Collections.max(list);
		//use list.get to display the list value
		//System.out.println(list.get(1));
		//shortcut for forloop for ctrl+space+enter
		/*
		 * for (int i = 0; i < size; i++) { System.out.println(list.get(i));
		 * System.out.println("------------");
		 * 
		 * for (int i =size - 1; i > = 0; i--) { System.out.println(list.get(i)); }
		 * 
		 * //syntax for foreachloop for (Integer eachInteger : list) {
		 * System.out.println(eachInteger); } }
		 */	
		
	}

}
