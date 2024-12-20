import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {
    // Method to perform Bubble Sort on an array

    public int[] bubbleSort(int[] arr) {
        int passes = 0; // tracks how many passes have been made over the full array
        boolean swapped; // tracks whether an element has been swapped in the array

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int holder = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = holder;
                    swapped = true;
                }

            }

            passes++;
            System.out.println("bubblesort passes: " + passes);

            if (!swapped) {
                break; // exits the loop if no swaps occur
            }

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter array size: ");
            int n = reader.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Please enter a number greater than zero.");
            }

            int[] unsortedArray = new int[n]; // initialise array with user defined size

            System.out.println("Enter Array Elements:");
            for (int i = 0; i < unsortedArray.length; i++) {
                while (true) {
                    try {
                        unsortedArray[i] = reader.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("please enter a valid integer.");
                        reader.nextInt();
                    }
                }
            }

            System.out.println(Arrays.toString(unsortedArray));
            obj.bubbleSort(unsortedArray);

        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a size greater than zero.");
        } catch (Exception e) {
            System.out.println("Please enter a valid array size.");
        } finally {
            reader.close();
        }
    };
}
