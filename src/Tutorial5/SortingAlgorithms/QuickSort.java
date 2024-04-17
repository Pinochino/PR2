public class QuickSort extends IntSortingAlgorithms {
    public int left;
    public int right;
    QuickSort(int[] arr) {
        super("Quick Sort", arr);
    }
    public static int partition(int[] arr, int left, int right) {
        int down = left;
        int up = right;
        int pivot = arr[left];

        while (down < up) {
            while (arr[down] <= pivot && down < right) {
                down++;
            }
            while (arr[up] > pivot) {
                up--;
            }
            if (down < up) {
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        arr[left] = arr[up];
        arr[up] = pivot;
        return up;
    }
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int j = partition(arr, left, right);
            quickSort(arr, left, j - 1);
            quickSort(arr, j + 1, right);
        }
    }
    @Override
    public void sort() {
        quickSort(arr, 0, arr.length - 1);
        System.arraycopy(arr, 0, sortedArray, 0, arr.length); // Copy the sorted array to sortedArray
    }
}


