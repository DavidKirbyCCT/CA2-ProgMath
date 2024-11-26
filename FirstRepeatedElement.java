public class FirstRepeatedElement {

    public String CheckRepeatedElement(int arrayLength, int[] input) {
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (input[i] == input[j]) {
                    String repeatedElement = Integer.toString(input[i]);
                    return repeatedElement;
                }
            }
        }
        return "No repeated elements found";
    };

    public static void main(String[] args) {
        int[] inputData = {4,5,6,7,4,8,7,4,8,4,9};
        int[] inputData2 = {1,2,3,4,5,6,7,8,9}; 
        FirstRepeatedElement obj = new FirstRepeatedElement();

        System.out.println(obj.CheckRepeatedElement(inputData.length, inputData));
        System.out.println(obj.CheckRepeatedElement(inputData2.length, inputData2));

    }
}
