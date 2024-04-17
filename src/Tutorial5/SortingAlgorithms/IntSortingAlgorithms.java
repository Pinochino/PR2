import java.util.Arrays;

public class IntSortingAlgorithms {
    public String name;
    public int[] arr;
    public int[] sortedArray;

    public IntSortingAlgorithms(String name, int[] arr) {
        this.name = name;
        this.arr = Arrays.copyOf(arr, arr.length);
        this.sortedArray = new int[arr.length];
    }

    public void sort() {
      
    }

    public boolean isSorted() {
        for (int i = 0; i < arr.length - 1; i++) { // Fix loop condition
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "Sorted Array: " + Arrays.toString(sortedArray) + ", isSorted: " + isSorted();
    }
}
