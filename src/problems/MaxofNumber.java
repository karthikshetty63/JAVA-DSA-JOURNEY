package problems;

public class MaxofNumber {

    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int c = 20;

        if (a > b) {
            if (a > c) {
                System.out.println("Largest is " + a);
            } else {
                System.out.println("Largest is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest is " + b);
            } else {
                System.out.println("Largest is " + c);
            }
        }
    }
}