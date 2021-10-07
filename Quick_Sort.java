package ALGOAPP.Algos;

public class Quick_Sort {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int[] array, int low, int high) {
        // pivot
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            // p index is the partitioning index,
            // and array[p] is now in the correct position.
            int p_index = partition(array, low, high);

            // Separately sort elements before
            // partition and after partition
            sort(array, low, p_index - 1);
            sort(array, p_index + 1, high);
        }
    }

    public static void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
