package june20session;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAssignment1 {

	public static void main(String[] args) {
		//syntax to create list
		List<String> list =new ArrayList<String>();
		list.add("Adam");
		list.add("Balaji");
		list.add("Candy");
		list.add("David");
		list.add("Emma");
		//update 2nd value as zara
		list.add(2, "Zara");
		//remove last value
		list.remove(5);
		int size= list.size();
		System.out.println("Size of the list: "+size);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		String max =Collections.max(list);
		System.out.println(list);
		
		//printing the names with S 
		ArrayList <String> list2= new ArrayList<String>();
		list2.add("Solomon");
		list2.add("Shankar");
		list2.add("Peter");
		list2.add("John");
		list2.add("Francis");
		list2.add("Saranya");
		System.out.println("Printing list 2 which starts with S");
		for (int i = 0; i < list2.size(); i++) {
			if(list2.get(i).startsWith("S"))
				System.out.println(list2.get(i));
		}
			//for each 
			System.out.println("------------------");
			for (String eachString :list) {
				System.out.println(eachString);
			}
		}
		
	}
