import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                input[i] = sc.nextInt();
            }
        }

    }
}
