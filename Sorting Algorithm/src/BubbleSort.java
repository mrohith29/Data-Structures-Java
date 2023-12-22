import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] inputArray = new int[input];
        for (int i=0;i <inputArray.length; i++) {
            if (sc.hasNextInt()) {
                inputArray[i] = sc.nextInt();
            }
        }

        for (int i = 0; i<input;i++) {
            for (int ii = 0; ii < input - i - 1; ii++) {
                if (inputArray[ii] > inputArray[ii + 1]) {
                    int temp = inputArray[ii + 1];
                    inputArray[ii + 1] = inputArray[ii];
                    inputArray[ii] = temp;
                }
            }
        }

        for (int i :
                inputArray) {
            System.out.print(i+" ");
        }
    }
}
