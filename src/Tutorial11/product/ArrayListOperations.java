import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(10.6f);
        arr.add(true);
        arr.add("Hello World");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
    }
}
