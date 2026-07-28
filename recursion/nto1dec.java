package recursion;

public class nto1dec {

    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n + "");
        printdec(n - 1);

    }

    public static void printinc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println("" + n);
        printinc(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printinc(n);

    }

}
