package problems;

public class selectionsort {
    public static void selectionsort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int minposition = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minposition] > num[j]) {
                    minposition = j;

                }

            }
            int temp = num[minposition];
            num[minposition] = num[i];
            num[i] = temp;

        }

    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 3, 2 };
        selectionsort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "" + "" + "" + "" + "");
        }
    }

}
