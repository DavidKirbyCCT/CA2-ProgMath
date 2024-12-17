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

        System.out.println("Enter array size: ");
        int n = reader.nextInt();
        int[] unsortedArray = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < unsortedArray.length; i++) {
            int x = reader.nextInt();
            unsortedArray[i] = x;
        }

        System.out.println(obj.CheckRepeatedElement(unsortedArray));

    }
}
