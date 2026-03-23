package Assignement;

/*Use the following sorting algorithms to sort an array in DESCENDING order:

a) Bubble Sort  
b) Selection Sort  
c) Insertion Sort  
d) Counting Sort  

Use the array:
// [3, 6, 2, 1, 8, 7, 4, 5, 3, 1] */
public class sorting {
    public static void bubblesort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] < num[j + 1]) { // For descending order
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 2, 3, 1 };
        bubblesort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + "");

        }
    }
}
