package ALGOAPP.Algos;

public class Selection_Sort {

    public static int[] selectionSort(int inputArray[]) {
        for (int i = 0; i < inputArray.length; i++) {
            // Searching for lowest index
            int index = i;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[index]) {
                    index = j;
                }
            }
            int smallerNumber = inputArray[index];
            int temp = inputArray[i];
            inputArray[i] = smallerNumber;
            inputArray[index] = temp;
        }
        return inputArray;
    }

}
