import java.util.ArrayList;
import java.util.Scanner;

public class SpiralTraversal {
    public ArrayList createTraversalArray(int userInput1, int userInput2) {
        int[][] traversalArray = new int[userInput1][userInput2];
        ArrayList<Integer> traversalValues = new ArrayList<>();
        int arrayValueCounter = 0;

        // fills array with values
        for (int i = 0; i < traversalArray.length; i++) {
            for (int j = 0; j < traversalArray[i].length; j++) {
                traversalArray[i][j] = arrayValueCounter;
                arrayValueCounter++;
            }
        }

        int top = 0;
        int right = traversalArray[0].length - 1;
        int bottom = traversalArray.length - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                traversalValues.add(traversalArray[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                traversalValues.add(traversalArray[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    traversalValues.add(traversalArray[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    traversalValues.add(traversalArray[i][left]);
                }
                left++;
            }
        }
        System.out.println(traversalValues);
        return traversalValues;
    }


    public static void main(String[] args) {
        SpiralTraversal obj = new SpiralTraversal();
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter row length: ");
        int n = reader.nextInt();
        System.out.println("Enter column length: ");
        int n1 = reader.nextInt();
        reader.close();

        obj.createTraversalArray(n, n1);
    }
}