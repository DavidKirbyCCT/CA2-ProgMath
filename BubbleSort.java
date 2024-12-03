import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int passes = 0;
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j+1]) {
                    int holder = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = holder;
                    swapped = true;
                }   
                         
            }

            passes++;
            System.out.println("bubblesort passes: " + passes);

            if (!swapped) {
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = reader.nextInt();
        int[] unsortedArray = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < unsortedArray.length; i++) {
            int x = reader.nextInt();
            unsortedArray[i] = x;
        }

        reader.close();
        System.out.println(Arrays.toString(unsortedArray));

        obj.bubbleSort(unsortedArray);
    }

}
