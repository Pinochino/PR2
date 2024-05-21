package Tutorial11.src;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntegerLoop {
    private ArrayList<Integer> intArr;
    private int amountOfNumbers;

    public ArrayListIntegerLoop(int amountOfNumbers) {
        this.amountOfNumbers = amountOfNumbers;
        this.intArr = new ArrayList<Integer>();
    }

    public void getIntegers() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= this.amountOfNumbers; i++) {
            System.out.println("Enter number at position " + i);
            // TODO catch InputMismatchException
            this.intArr.add(sc.nextInt()); // TextIO
        }
        sc.close();
    }

    public void printAllElements() {
        int count = 1;
        for (Integer integer : intArr) {
            System.out.println("Number " + count + ": " + integer);
            count++;
        }
    }
}