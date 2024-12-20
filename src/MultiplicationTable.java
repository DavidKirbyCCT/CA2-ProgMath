import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    // creates a user defined array and fills it with the multiplation values of
    // that user definition

    public String createMultiplicationArray(int userInput) {
        int[][] multiplicationArray = new int[userInput][userInput];

        for (int i = 0; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = i * userInput + j * userInput; 

                System.out.print(multiplicationArray[i][j] + " ");
                if (j == multiplicationArray[i].length - 1) {
                    System.out.println(); // move onto new line
                }
            }
        }

        return Arrays.deepToString(multiplicationArray);
    }

    public static void main(String[] args) {
        // https://github.com/DavidKirbyCCT/CA2-ProgMath
        
        MultiplicationTable obj = new MultiplicationTable();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter matrix size (n*n): ");
            int n = reader.nextInt();
            if (n <= 1) {
                throw new IllegalArgumentException("Please enter a number greater than one.");
            }

            obj.createMultiplicationArray(n);
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a size greater than one.");
        } catch (Exception e) {
            System.out.println("Please enter a valid array size.");
        } finally {
            reader.close();
        }
    }
}
