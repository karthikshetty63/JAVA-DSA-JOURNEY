package oops;

public class p1 {
    public void array(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("the number is " + numbers[i]);
                }
            }
        }

    }

}

public static void main(String[]args)
{
    p1 karthik =new p1();
    int arr[]={1,2,3,1};
    karthik.array(arr);
}