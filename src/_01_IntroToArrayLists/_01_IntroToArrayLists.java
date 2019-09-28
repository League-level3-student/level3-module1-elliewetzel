package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		String s = "sri";
		names.add(s);
		String m = "mia";
		names.add(m);
		String b = "bianca";
		names.add(b);
		String f = "fumika";
		names.add(f);
		String l = "lisa";
		names.add(l);
		//3. Print all the Strings using a standard for-loop
		
		
		for(int j = 0; j < names.size(); j++) {
			String a = names.get(j);
			System.out.println(names.get(j));
		}
		
		
		//4. Print all the Strings using a for-each loop
		for(String a : names) {
			System.out.println(a);
		}
		
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i++));
		}
				
		
		//6. Print all the Strings in reverse order.
		for(int h = names.size(); h <= 0; h--) {
			System.out.println(names.get(h));
		}
		String r = "e";
		//7. Print only the Strings that have the letter 'e' in them.
		for(int g = 0; g < names.size(); g++) {
			if(names.get(g).contains(r)) {
				System.out.println(names.get(g));
			}
		}
	}
}
