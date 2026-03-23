package problems;

public class Reversearray {
    public static int rverse(int numbers[]) {
        int start = 0;
        int last = numbers.length - 1;
        while (start < last) {

            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;
            start++;
            last--;

        }
        return -1;

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10 };
        rverse(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i]);

        }
        System.out.println();

    }
}
