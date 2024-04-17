public class SelectionSort extends IntSortingAlgorithms {

    SelectionSort(int[] arr) {
        super("Selection Sort", arr);
    }
    @Override
    public void sort() {
        int n = arr.length;
        System.arraycopy(arr, 0, sortedArray, 0, n); // Copy the original array to sortedArray

        for (int i = n - 1; i >= 1; i--) {
            int pos = i;
            int max = sortedArray[i]; // Fixed variable name
            for (int j = i - 1; j >= 0; j--) {
                if (sortedArray[pos] < sortedArray[j]) { // Fixed comparison
                    max = sortedArray[j];
                    pos = j;
                }
            }
            sortedArray[pos] = sortedArray[i];
            sortedArray[i] = max;
        }
    }

}
