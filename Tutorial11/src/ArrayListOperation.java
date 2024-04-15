import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer: ");
        List<Integer> l1 = new ArrayList<>(Collections.singleton(sc.nextInt()));
        System.out.println("Interger number is: " + l1);
        sc.nextLine();

        System.out.println("Enter Float: ");
        List<Float> l2 = new ArrayList<>(Collections.singleton(sc.nextFloat()));
        System.out.println("Float number is: " + l2);
        sc.nextLine();

        System.out.println("Enter Boolean: ");
        List<Boolean> l3 = new ArrayList<>(Collections.singleton(sc.nextBoolean()));
        System.out.println("Boolean number is: " + l3);
        sc.nextLine();

        System.out.println("Enter String: ");
        List<String> l4 = new ArrayList<>(Collections.singleton(sc.nextLine()));
        System.out.println("String number is: " + l4);

    }
}
