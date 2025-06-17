package xyz;

import java.util.*;

public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.addFirst("@");
        ll.addLast("@");
        ll.add(2, "C");
        System.out.println("List after adding elements: " + ll);
        
        ll.removeFirst();
        ll.removeLast();
        ll.remove(2);
        System.out.println("List after removing elements: " + ll);   
        System.out.println("First element: " + ll.getFirst());
    }
}