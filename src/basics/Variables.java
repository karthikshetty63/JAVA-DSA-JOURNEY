/**
 * Java Variables and Data Types demonstration:
 * - All primitive data types
 * - Variable declaration and initialization
 * - Type mixing in expressions
 * - Comments (single-line and multi-line)
 */
public class Variables {
    public static void main(String[] args) {
        // Integer types
        int a = 10;
        int b = 20;
        byte c = 100;
        long e = 1000000000L;

        // Floating point types
        float d = 3.14f;
        double f = 3.141592653589793;

        // Character and Boolean
        char name = 't';
        boolean g = true;

        // Basic operations
        System.out.println("The sum of a and b is: " + (a + b));

        // Variable assignment
        a = b;
        System.out.println("The value of a after assignment: " + a);

        // Mixed type calculation
        double sum = a + b + c + d;
        System.out.println("The sum of a, b, c and d is: " + sum);

        // Display all variable values
        System.out.println("\n--- All Variables ---");
        System.out.println("int a = " + a);
        System.out.println("int b = " + b);
        System.out.println("byte c = " + c);
        System.out.println("float d = " + d);
        System.out.println("long e = " + e);
        System.out.println("double f = " + f);
        System.out.println("char name = " + name);
        System.out.println("boolean g = " + g);

        // This is a single-line comment
        /*
         * This is a
         * multi-line comment
         */
    }
}