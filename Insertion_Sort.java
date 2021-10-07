package ALGOAPP.Algos;

public class Insertion_Sort {
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                // swap
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                --j;
            }
        }
    }
}
