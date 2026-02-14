import java.util.*;

/**
 * Java Type Conversion (Automatic/Implicit) demonstration:
 * - Widening conversions (smaller to larger data types)
 * - Automatic promotion in expressions
 * - Safe conversions without data loss
 */
public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Automatic Type Conversion ===\n");

        // int to float conversion (automatic)
        int a = 134;
        float b = a; // Automatic conversion
        long c = a; // Automatic conversion

        System.out.println("Original int value: " + a);
        System.out.println("Converted to float: " + b);
        System.out.println("Converted to long: " + c);

        // Demonstration with calculations
        System.out.println("\n=== Mixed Type Calculations ===");
        int intValue = 10;
        float floatResult = intValue * 3.14f; // int promotes to float
        System.out.println("int * float = " + floatResult);

        // Character to int conversion
        char ch = 'A';
        int asciiValue = ch; // Automatic conversion
        System.out.println("Character '" + ch + "' ASCII value: " + asciiValue);

        sc.close();
    }
}