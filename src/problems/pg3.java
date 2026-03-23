//Patterns🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️

package problems;

import java.util.*;

public class pg3 {
    public static void main(String[] args) {
        // for (int line = 1; line <= 4; line++) {
        // for (int star = 1; star <= line; star++)

        // {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // 😎iverted patten
        Scanner sc = new Scanner(System.in);
        int n = 4;

        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= n - line + 1; star++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // 🌱🌱half pyramid patterns
        // for (int line = 1; line <= n; line++) {
        // for (int number = 1; number <= line; number++) {
        // System.out.print(number);
        // }
        // System.out.println();

        // }
        // char ch = 'A';
        // for (int line = 1; line <= n; line++) {
        // for (int chrs = 1; chrs <= line; chrs++)

        // {
        // System.out.print(ch);
        // ch++;

        // }
        // System.out.println();
        // }
        // 🤷‍♂️🤷‍♂️inverted star pattern
        for (int line = 1; line <= n; line++) {
            for (int star = 1; line <= n + line - 1; line--) {
                System.out.print("*");
            }
        }
        System.out.println();

    }

}
