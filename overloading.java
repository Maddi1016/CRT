
package xyz;

class calculator {
    int add(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println("calculate(int, int): " + c.calculate(12, 30)); 
        System.out.println("calculate(double, double): " + c.calculate(12.5, 3.5));
        System.out.println("calculate(int, int, int): " + c.calculate(10, 20, 30));
    }
}
