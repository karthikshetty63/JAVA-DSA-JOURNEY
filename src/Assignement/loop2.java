package Assignement;

// Print even numbers from 1 to 100.
public class loop2 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("the odd numbers are " + i);
            }
        }

    }
}
