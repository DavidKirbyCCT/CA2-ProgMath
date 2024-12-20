import java.util.ArrayList;
import java.util.Scanner;

public class SpiralTraversal {
    // returns the spiral traversal values of a 2d Array 

    public ArrayList<Integer> createTraversalArray(int userInput1, int userInput2) {
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

        // boundary definitions
        int top = 0; 
        int right = traversalArray[0].length - 1;
        int bottom = traversalArray.length - 1;
        int left = 0;

        
        while (top <= bottom && left <= right) {
            // top row left to right - TL -> TR 
            for (int i = left; i <= right; i++) {
                traversalValues.add(traversalArray[top][i]);
            }
            top++;
            // top row - TR -> BR 
            for (int i = top; i <= bottom; i++) {
                traversalValues.add(traversalArray[i][right]);
            }
            right--;
            // bottom row - BR <- BL
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    traversalValues.add(traversalArray[bottom][i]);
                }
                bottom--;
            }
            // Bottom row - BL <- TL
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
        // https://github.com/DavidKirbyCCT/CA2-ProgMath

        SpiralTraversal obj = new SpiralTraversal();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter row length: ");   
            int n = reader.nextInt();
            if (n <= 1) {
                throw new IllegalArgumentException("Please enter a number greater than 1.");
            }
            System.out.println("Enter column length: ");
            int n1 = reader.nextInt();
            if (n1 <= 1) {
                throw new IllegalArgumentException("Please enter a number greater than 1.");
            }
    
            obj.createTraversalArray(n, n1);
        }catch (IllegalArgumentException e) {
            System.out.println("Please enter a size greater than 1.");
        } catch (Exception e) {
            System.out.println("Please enter a valid array size.");
        } finally {
            reader.close();
        }

    }
}