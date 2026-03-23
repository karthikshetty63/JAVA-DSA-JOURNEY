package problems;

public class Maxsubarraysum {
    public static void max(int number[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++)

            {
                cursum = 0;
                for (int k = i; k <= j; k++) {
                    cursum += number[k];
                }
            }
            System.out.println("the cursum is" + cursum);
            if (maxsum < cursum) {
                maxsum = cursum;
            }

        }
        System.out.println("the maximum sum is" + maxsum);

    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        max(num);
    }
}
