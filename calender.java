
package xyz;
import java.util.Scanner;
public class Calender {
	public static void main(String [] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter the day:");
		String day=Sc.nextLine().toLowerCase();
		switch(day){
		case "monday":
			System.out.println("lets learn python");
			break;
		case "Tuesaday":
			System.out.println("lets learn java");
			break;
		case "wednesday":
			System.out.println("lets learn c++");
			break;
		case "Thursday":
			System.out.println("lets learn c");
			break;
		case "friday":
			System.out.println("lets learn sql");
			break;
		case "saturday":
			System.out.println("lets learn machine learning");
			break;
	    default:
	        System.out.println("");
		}
		Sc.close();
		
	}

}
