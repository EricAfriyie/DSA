package ALGOAPP.Algos;

import java.util.Arrays;

public class Radix_Sort {

    private static int getMaxItem(int UserInput_Array[]) {
        int MaxItem = UserInput_Array[0];
        for (int i = 0; i < UserInput_Array.length; i++) {
            if (UserInput_Array[i] > MaxItem) {
                MaxItem = UserInput_Array[i];
            }
        }
        return MaxItem;
    }

    static void count_Sort(int array[], int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(array[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        // Copy numbers to their correct indexes.
        for (i = 0; i < n; i++)
            array[i] = output[i];
    }

    public static void radix_sort(int UserInput_Array[]) {
        // Find the maximum item to be able to determine number of digits
        int max = getMaxItem(UserInput_Array);

        // Count sort for each digit.
        for (int exp = 1; max / exp > 0; exp *= 10)
            count_Sort(UserInput_Array, UserInput_Array.length, exp);
    }
}
