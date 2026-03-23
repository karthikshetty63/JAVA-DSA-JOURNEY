package problems;

import java.util.Scanner;

public class Arrays {
    public static int LinearSerach(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;

            }

        }
        return -1;
    }

    public static int GetLargest(int number[]) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i];
            }
        }
        // System.out.println("the largest value is"+Largest);
        return Largest;

    }

    public static void main(String[] args) {
        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();// phy
        // marks[1] = sc.nextInt();// chem
        // marks[2] = sc.nextInt();// math
        // System.out.println("phy :" + marks[0]);
        // System.out.println("chem :" + marks[1]);
        // System.out.println("math :" + marks[2]);
        // marks[2] = 100;
        // System.out.println("math :" + marks[2]);
        // marks[1] = marks[1] + 5;
        // System.out.println("chem :" + marks[1]);
        // // 😁😁😁percetage of marks
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage is ="+percentage);
        // int num[] = { 12, 12, 13, 10, 14, 15 };
        // int key = 10;
        // int index = LinearSerach(num, key);
        // if (index == -1) {
        // System.out.println("the key is not found");

        // } else {
        // System.out.println("the key is" + index);
        // }
        int number[] = { 1, 4, 6, 7, 4 };
        System.out.println("the largest value is" + (GetLargest(number)));

    }

}
