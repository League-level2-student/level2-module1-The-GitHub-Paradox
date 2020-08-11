package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		//done
		//2. Add five Strings to your list
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++){
			String s = strings.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : strings){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("b");
		System.out.println("d");
		//6. Print all the Strings in reverse order.
		System.out.println("e");
		System.out.println("d");
		System.out.println("c");
		System.out.println("b");
		System.out.println("a");
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("e");
	}
}
