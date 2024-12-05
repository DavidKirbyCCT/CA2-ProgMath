
import java.util.Scanner;

public class DiagonalSum {
    public int calculateDiagonalSum(int[][] arrayInput) {
        int sum = 0;
        int j = arrayInput.length;

        for (int i = 0; i < j; i++) {
            sum += arrayInput[i][i];
            sum += arrayInput[i][j - 1 - i];
            System.out.println(sum);
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

        System.out.println("Enter array size: ");
        int n = reader.nextInt();
        int[][] userInput = new int[n][n];

        System.out.println("Enter Array Elements:");
        for (int[] userInput1 : userInput) {
            for (int j = 0; j < userInput1.length; j++) {
                int x = reader.nextInt();
                userInput1[j] = x;
            }
        }
        reader.close();

        obj.calculateDiagonalSum(userInput);
    }
}
