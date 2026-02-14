import java.util.*;

public class conditionalstatements {
    public static void main(String[] args) {
    //     greater than or less than
        int a = 10;
        int b = 20;

        if (a > b) {
        System.out.println("a is greater than b");
        }
        if (a < b) {
        System.out.println("b is greater than a");
        }

        else {
        System.out.println("b is greater than a");

        }
        // //😎 even or odd
        int num = 5;
        if (num % 2 == 0) {
        System.out.println(num + " is even");
        }
        if (num % 2 != 0) {
        System.out.println(num + " is odd");
        } else {
        System.out.println(num + " is odd");
        }

        // //😎 (else-if)

        int age = 16;
        if (age >= 18) {
        System.out.println("you are eligibele to vote,drive and marry");

        } else if (age < 18 && age >= 16) {
        System.out.println("you are not eligible to marry");

        } else if (age < 16 && age >= 14) {
        System.out.println("you are not eligible to drive");

        } else {
        System.out.println("you are not eligible to vote");
        }
        // 😎income tax calculate
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
        tax = (int) (income * 0.05);

        System.out.println("you have to pay :" + tax);
        } else if (income >= 500000 && income < 1000000) {
        tax = (int) (income * 0.2);

        System.out.println("you have to pay :" + tax);

        } else {
        tax = (int) (income * 0.3);

        System.out.println("you have to pay :" + tax);
        }
        // 😎print the largest of three numbers
        int k = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        if (k >= f && k >= g) {
        System.out.println("k is the largest");
        } else if (f >= k && f >= g) {
        System.out.println("f is the largest");
        } else {
        System.out.println("g is the largest");
        }

        // 🌱ternary operater
        int marks = sc.nextInt();
        String result = (marks >= 33) ? "pass" : "fail";
        System.out.println("You " + result);

        😎 print number is positive or negative
        int num = sc.nextInt();
        if (num < 0) {
        System.out.println("the number is negative");
        } else if (num == 0) {
        System.out.println("the number is zero");
        } else if (num > 0) {
        System.out.println("the number is positive");
        }

        😁 switch statement in java
        int num = sc.nextInt();
        switch (num) {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Invalid day number");

        🌱calculater using Conditional statement
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
         
    }
}
}