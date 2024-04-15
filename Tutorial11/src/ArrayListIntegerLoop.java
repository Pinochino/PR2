import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntegerLoop {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        myArray.add(10);


        for (Integer e : myArray) {
            System.out.print(e + " ");
        }
    }
}
