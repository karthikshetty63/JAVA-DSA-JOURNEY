package Assignement;

// Sum of first n numbers
public class loop3 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum is " + sum);
    }
}