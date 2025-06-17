
package xyz;
import java.util.*;

public class Hash {
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();
        hs.add("KUSHAL");
        hs.add("VAMSI");
        hs.add("mohan");
        hs.add("nithin");

       
        System.out.println("HashSet: " + hs);

       
        String nameToCheck = "SRUJAN";
        boolean exists = hs.contains(nameToCheck);
        System.out.println("Does '" + nameToCheck + "' exist? " + exists);

  
        ArrayList<String> arrayList = new ArrayList<>(hs);
        System.out.println("ArrayList: " + arrayList);
    }
}
