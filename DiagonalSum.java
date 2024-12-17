
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiagonalSum {
    public int calculateDiagonalSum(int[][] arrayInput) {
        int sum = 0;
        int j = arrayInput.length;

        for (int i = 0; i < j; i++) {
            sum += arrayInput[i][i];
            sum += arrayInput[i][j - 1 - i];
        }

        if (j % 2 == 1) {
            sum -= arrayInput[j / 2][j / 2];
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter single digit(n) for array size - n*n: ");
            int n = reader.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Please enter a number greater than zero.");
            }

            int[][] userInput = new int[n][n];

            System.out.println("Enter Array Elements:");
            for (int[] userInput1 : userInput) {
                for (int j = 0; j < userInput1.length; j++) {
                    while (true) {
                        try {
                            userInput1[j] = reader.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("please enter a valid integer.");
                            reader.next();
                        }
                    }
                }
            };

            obj.calculateDiagonalSum(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a size greater than zero.");
        } catch (Exception e) {
            System.out.println("Please enter a valid array size.");
        } finally {
            reader.close();
        }
    }
}
