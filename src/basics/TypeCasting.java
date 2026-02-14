/**
 * Java Type Casting (Explicit) demonstration:
 * - Narrowing conversions (larger to smaller data types)
 * - Explicit casting syntax
 * - Potential data loss examples
 */
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("=== Explicit Type Casting ===\n");

        // double to float casting
        double a = 2.399484844888585858;
        float b = (float) a; // Explicit casting required
        System.out.println("Original double: " + a);
        System.out.println("Casted to float: " + b);
        System.out.println("Precision lost: " + (a != b) + "\n");

        // float to int casting (decimal part lost)
        float d = 3.99f;
        int e = (int) d; // Explicit casting required
        System.out.println("Original float: " + d);
        System.out.println("Casted to int: " + e);
        System.out.println("Decimal part lost!\n");

        // long to int casting (potential data loss)
        long largeValue = 2147483648L; // Larger than int max
        int intValue = (int) largeValue;
        System.out.println("Large long value: " + largeValue);
        System.out.println("Casted to int: " + intValue);
        System.out.println("Data overflow occurred!\n");

        // Safe casting example
        long safeValue = 1000L;
        int safeInt = (int) safeValue;
        System.out.println("Safe long value: " + safeValue);
        System.out.println("Safely casted to int: " + safeInt);
    }
}