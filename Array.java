
package xyz;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("KUSHAL");
        al.add("RAVI");
        al.add("MOHAN");

        System.out.println(al.get(1)); 

        System.out.println(al.remove(0)); 

        System.out.println(al); 

        Collections.reverse(al);
        System.out.println("Reversed list: " + al); 

        al.add("Siva");
        System.out.println("After adding Siva: " + al);

        Collections.sort(al);
        System.out.println("Sorted list: " + al);
    
        String nameToCheck = "Harsha";
        boolean exists = al.contains(nameToCheck);
        System.out.println("Exists: " + exists);

        String nameToCheckS = "MOHAN";
        boolean exist = al.contains(nameToCheckS);
        System.out.println("Exist: " + exist);
    }
}
