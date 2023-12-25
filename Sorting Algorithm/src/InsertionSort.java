import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of inputs : ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                input[i] = sc.nextInt();
            }
        }
        for (int i = 1; i < n; i++) {
            int temp = input[i];
            int j = i;
            while (j > 0 && input[j - 1] > temp) {
                input[j] = input[j - 1];
                j--;
            }
            input[j] = temp;
        }

        System.out.println("Sorted list of elements : ");
        for (int i : input) {
            System.out.print(i+" ");
        }
    }
}
