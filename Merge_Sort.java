package ALGOAPP.Algos;

public class Merge_Sort {
    private static void merge(int array[], int g, int h, int r) {
        int n1 = h - g + 1;
        int n2 = r - h;

        int Left_side[] = new int[n1];
        int Right_side[] = new int[n2];

        /* Data is copied to a temporary array. */
        for (int i = 0; i < n1; ++i)
            Left_side[i] = array[g + i];
        for (int j = 0; j < n2; ++j)
            Right_side[j] = array[h + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // The initial index of the combined subarray
        int k = g;
        while (i < n1 && j < n2) {
            if (Left_side[i] <= Right_side[j]) {
                array[k] = Left_side[i];
                i++;
            } else {
                array[k] = Right_side[j];
                j++;
            }
            k++;
        }

        /* If there are any remaining items on the Left side[], copy them. */
        while (i < n1) {
            array[k] = Left_side[i];
            i++;
            k++;
        }

        /* If there are any remaining items on the Right side[], copy them. */
        while (j < n2) {
            array[k] = Right_side[j];
            j++;
            k++;
        }
    }

    private static void sort(int array[], int g, int r) {
        if (g < r) {
            // Determine the midpoint.
            int h = g + (r - g) / 2;

            // Sort the first and second half together.
            sort(array, g, h);
            sort(array, h + 1, r);

            // Join the two sorted halves together.
            merge(array, g, h, r);
        }
    }

    public static void mergeSort(int array[]) {
        sort(array, 0, array.length - 1);
    }
}