import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntegerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(10);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
