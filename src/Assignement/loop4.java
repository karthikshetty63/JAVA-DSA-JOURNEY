package Assignement;
// Factorial of a number.

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("the factorial of the numbers are" + factorial);

    }

}
