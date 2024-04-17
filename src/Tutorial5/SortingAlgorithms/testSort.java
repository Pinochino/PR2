import java.util.Scanner;
public class testSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        IntSortingAlgorithms s1 = new BubbleSort(arr);
        s1.sort();
        System.out.println(s1);

        IntSortingAlgorithms s2 = new SelectionSort(arr);
        s2.sort();
        System.out.println(s2);

        IntSortingAlgorithms s3 = new QuickSort(arr);
        s3.sort();
        System.out.println(s3);
        sc.close();
    }
}
