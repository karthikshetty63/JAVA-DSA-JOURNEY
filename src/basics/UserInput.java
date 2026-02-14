import java.util.*;

/**
 * Java User Input demonstration using Scanner class:
 * - Different input types (String, int, float, boolean)
 * - next() vs nextLine() differences
 * - Practical examples and calculations
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Java Input Examples ===\n");

        // String input - single word
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.println("Hello " + firstName + "!\n");

        // Clear the buffer
        sc.nextLine();

        // String input - full line
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Nice to meet you, " + fullName + "!\n");

        // Integer input and calculation
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum + "\n");

        // Float input - circle area calculation
        System.out.print("Enter radius of circle: ");
        float radius = sc.nextFloat();
        float area = 3.14159f * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area + "\n");

        // Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        System.out.println("Student status: " + isStudent);

        sc.close();
        System.out.println("\nProgram completed successfully!");
    }
}