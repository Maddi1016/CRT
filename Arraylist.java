
package xyz;
import java.util.*;
public class Arraylist {
		
		public static void main(String[] args) {
			
			ArrayList<String> names = new ArrayList<String>();
			names.add("mohan");
			names.add("shiva");
			names.add(null);
			names.add("sagar");
			System.out.println(names);
	
			System.out.println(names.get(2)); 
			names.set(0, "Mohan Reddy"); 
			System.out.println(names);
			System.out.println(names.remove(3)); 
			System.out.println(names);
		}
	}

