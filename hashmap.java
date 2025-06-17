
package xyz;
import java.util.*;
public class Hashmap {
		public static void main(String[] args) {
			
			HashMap<Float, String> hmap = new HashMap<Float, String>();
	        HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
	        hmap.put(0.1F, "MOHAN");
	        hmap.put(0.2F, "DHONI");
	        hmap.put(0.3F, "ESWAR");
	        hmap.put(0.5F, "SAGAR");
	        hmap.put(0.4F, "SHIVA");    
	        System.out.println(hmap);

	        hmap1.put("RAM", 939027193);
	        hmap1.put("RAM1", 939207294);
	        hmap1.put("RAM2", 939200974);
	        hmap1.put("RAM3", 294724923);
	        hmap1.put("RAM4", 923050934);

	        System.out.println(hmap1);
	        
	        System.out.println(hmap.get(0.9F));
			
		}
	}

