import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {

    public String createMultiplicationArray(int userInput) {
        int[][] multiplicationArray = new int[userInput][userInput];
        int counter = 0;

        for (int i = 0; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = counter * userInput;
                counter += 1;
                String output = multiplicationArray[i][j] + " ";

                if (counter % userInput == 0) {
                    System.out.println(output);
                } else {
                    System.out.print(" " + output);
                }

            }
        }

        return Arrays.deepToString(multiplicationArray);

    }

    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter matrix size (n*n): ");
            int n = reader.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Please enter a number greater than zero.");
            }

            obj.createMultiplicationArray(n);
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a size greater than zero.");
        } catch (Exception e) {
            System.out.println("Please enter a valid array size.");
        } finally {
            reader.close();
        }
    }
}
