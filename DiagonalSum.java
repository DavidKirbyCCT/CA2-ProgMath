import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiagonalSum {
    public int calculateDiagonalSum(int userInput) {
        int[][] diagonalSumArray = new int[userInput][userInput];
        Set<Integer> s = new HashSet<>();

        int arrayValue = 0;
        int counter = 0;
        int sum = 0;

        // fills array with values 
        for (int i = 0; i < diagonalSumArray.length; i++) {
            for (int j = 0; j < diagonalSumArray[i].length; j++) {
                diagonalSumArray[i][j] = arrayValue;
                arrayValue++;
            }
        }
        // adds unique diagonal values to set 
        for (int i = 0; i < diagonalSumArray.length; i++) {
            s.add(diagonalSumArray[i][counter]);
            s.add(diagonalSumArray[i][(diagonalSumArray.length - 1) - counter]);
            counter++;
        }
        // sums set
        for (int value : s) {   
            sum += value;
        }

        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        Scanner reader = new Scanner(System.in); 

        System.out.println("Enter matrix size (n*n): ");
        int n = reader.nextInt(); 
        reader.close();

        obj.calculateDiagonalSum(n);
    }
}
