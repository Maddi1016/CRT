import java.util.ArrayList;
import java.util.Scanner;

public class TaskMgr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nTaskMgr");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Option (1-4): ");

            String in = sc.nextLine();
            int opt;
            try {
                opt = Integer.parseInt(in);
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Enter 1-4.");
                continue;
            }

            if (opt == 1) {
                System.out.print("Task: ");
                String t = sc.nextLine().trim();
                if (!t.isEmpty()) {
                    tasks.add(t);
                    System.out.println("Added!");
                } else {
                    System.out.println("Empty task.");
                }
            } else if (opt == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks.");
                } else {
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (opt == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks.");
                } else {
                    System.out.print("Delete #: ");
                    String del = sc.nextLine();
                    int idx;
                    try {
                        idx = Integer.parseInt(del);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                        continue;
                    }
                    if (idx >= 1 && idx <= tasks.size()) {
                        tasks.remove(idx - 1);
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Invalid #.");
                    }
                }
            } else if (opt == 4) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Choose 1-4.");
            }
        }

        sc.close();
    }
}