public class BubbleSort  extends IntSortingAlgorithms{
    
    BubbleSort(int[] arr){
        super("Bubble Sort", arr);
    }
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    @Override
    public void sort() {
        sortArray(arr);
        System.arraycopy(arr, 0, sortedArray, 0, arr.length); // Copy the sorted array to sortedArray
    }

}
