package Assignement;
// Reverse a number.

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        int result = reversee(numbers);
        System.out.println("the reversed numbers are" + result);
        sc.close();

    }

    public static int reversee(int numbers) {
        int reverse = 0;
        while (numbers != 0) {
            int lastdigit = numbers % 10;
            reverse = reverse * 10 + lastdigit;
            numbers = numbers / 10;

        }
        return reverse;
    }

}
