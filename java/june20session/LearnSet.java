package june20session;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//syntax to create a set
		Set<String> set= new HashSet<String>();
		//syntax for LinkedHashSet
		//Set<String> set= new LinkedHashSet<String>();
		//Syntax for TreeSet
		//Set<String> set= new TreeSet<String>();
		//to check whether the duplicate is ignored and 
		boolean add1 = set.add("Harry");
		System.out.println(add1);
		set.add("Adam");
		set.add("Zoe");
		boolean add2 = set.add("Harry");
		System.out.println(add2);
		set.add("Ginger");
		set.add("Cadbury");
		System.out.println(set);
		System.out.println("------------------");
		//Foreach Syntax
		for (String eachName :set) {
			System.out.println(eachName);
			
		//converting set into List
			//List<String> list=new ArrayList<String>(set);
			//we can use list.addAll() to convert the set into list
			List<String> list=new ArrayList<String>();
			list.addAll(set);
			//System.out.println(list.get(1));
		
		}
	}
}
