import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstRepeatedElement {

    public String CheckRepeatedElement(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    String repeatedElement = "First Repeated Element: " + Integer.toString(input[i]);
                    return repeatedElement;
                }
            }
        }
        return "No repeated elements found";
    };

    public static void main(String[] args) {
        FirstRepeatedElement obj = new FirstRepeatedElement();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter array size: ");
            int n = reader.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Please enter a number greater than zero.");
            }
            
            int[] unsortedArray = new int[n];

            System.out.println("Enter Array Elements:");
            for (int i = 0; i < unsortedArray.length; i++) {
                while (true) {
                    try {
                        unsortedArray[i] = reader.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("please enter a valid integer.");
                        reader.next();
                    }
                }
            }

            System.out.println(obj.CheckRepeatedElement(unsortedArray));
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a size greater than zero.");
        } catch (Exception e) {
            System.out.println("Please enter a valid array size.");
        } finally {
            reader.close();
        }

    }
}
