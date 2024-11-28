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

        System.out.println("Enter matrix size (n*n): ");
        int n = reader.nextInt(); 
        reader.close();

        obj.createMultiplicationArray(n);
    }

}
