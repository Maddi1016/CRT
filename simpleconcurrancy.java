
package xyz;

class MyTask extends Thread {
    private String taskNames;

    public MyTask(String taskName) {
        this.taskNames = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskNames + "steps" + i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(taskNames + "was interrupted.");
            }
        }
    }
}

public class SimpleConcurrancy {

    public static void main(String[] args) {
        MyTask t1 = new MyTask("cooking");
        MyTask t2 = new MyTask("washing");

        t1.start();
        t2.start();
    }
}
