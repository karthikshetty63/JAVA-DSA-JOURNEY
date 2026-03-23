package problems;

import java.util.*;

public class functions {
    public static void PrintHello() {
        System.out.println("hello world");
        return;
    }

    public static int CalculateSum(int num1, int num2) {// this is the formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int k, int m)// 😎😎😎😎😎😎 CALL BY VALUE FUNCTION
    {
        int temp = k;
        k = m;
        m = temp;
        System.out.println("the a value is" + k);
        System.out.println("the value of b is" + m);
        return;

    }

    public static int Product(int l, int j) {// the product of two value with call by value 🤷‍♂️🤷‍♂️🤷‍♂️
        int temp = l;
        l = j;
        j = temp;
        System.out.println("the value of l =" + l);
        System.out.println("the value of j=" + j);
        int sum = l * j;

        System.out.println("the product of this is" + sum);
        return sum;

    }

    public static int bincoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);

        int fact_nmr = factorial(n - r);
        int bincoff = fact_n / (fact_r * fact_nmr);
        // System.out.println("the factorial of number is" + summ);
        return bincoff;

    }

    public static int factorial(int n)// factorail of number😎

    {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;

    }

    // 🌱🌱🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️function over loading
    // sum of 2 num
    public static int add(int a, int b) {

        return a + b;
    }
    // sum of 3 (int)

    public static float add(float a, float b, float c) {

        return a + b + c;
    }

    public static boolean prime(int y)// 🤷‍♂️🤷‍♂️prime or not
    {
        boolean isPrime = true;

        for (int i = 2; i < -y - 1; i++) {
            if (y % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("the y is prime");
        } else {
            System.out.println("the y is not prime");
        }
        return isPrime;
    }

    // 😎😎 prime or not optimized method using built in function
    public static boolean primeaa(int t) {

        boolean isPrime = true;

        if (t <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(t); i++) {

                if (t % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime == true) {
            System.out.println("the t is prime");
        } else {
            System.out.println("the t is not prime");
        }

        return isPrime;
    }

    // print a prime in a range;
    public static void primee(int v) {

        for (int i = 2; i <= v; i++) {
            if (isprimee(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper function to check if number is prime
    public static boolean isprimee(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // public static int BinaryToDecimal(int binNum) { int myNum = binNum;
    // int pow = 0;
    // int dec = 0;

    // while (binNum > 0) {
    // int lastdigit = binNum % 10;
    // dec = dec + (lastdigit * (int) Math.pow(2, pow));
    // pow++;
    // binNum = binNum / 10;
    // }
    // System.out.println("decimal" + myNum + "=" + dec);

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // // int z = sc.nextInt();
    // // int y = sc.nextInt();
    // // int sum = CalculateSum(a, b);// this is the actual parameter
    // // System.out.println("the sum is " + sum);
    // // PrintHello();
    // // swap(a, b);
    // // int sum = Product(z, y);

    // // System.out.println(factorial(3));
    // // int w = sc.nextInt();
    // // int z = sc.nextInt();
    // // int summ = bincoff(w, z);
    // // System.out.println(bincoff(5, 2));
    // // System.out.println(add(2, 5));
    // // System.out.println(add(2.1f, 2.2f, 2.3f));
    // // System.out.println(prime(7));
    // // System.out.println(primeaa(4));

    // // sc.close();
    // }

}
