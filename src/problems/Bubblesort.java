package problems;

public class Bubblesort {

    public static void bubble(int num[]) {

        for (int turn = 0; turn < num.length - 1; turn++) {

            for (int j = 0; j < num.length - 1 - turn; j++) {

                if (num[j] > num[j + 1]) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int number[] = { 5, 4, 1, 3, 2 };

        bubble(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}