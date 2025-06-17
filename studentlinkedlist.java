package xyz;
import java.util.*;

public class Studentlinkedlist {
    public static void main(String[] args) {
        HashSet<String> std = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names of 5 Students");

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = sc.next();
            std.add(name);
        }

        System.out.println("\nThe unique student names entered are:");
        for(String st : std) {
            System.out.print(st + " ");
        }

        sc.close();
    }
}