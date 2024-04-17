package Tutorial1;

import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your eggs: ");
        int eggs = input.nextInt();
        int gross = eggs / 144;
        int remainEggs = eggs % 144;
        int dozen = remainEggs / 12;
        int remain = remainEggs % 12;
        System.out.println("Eggs is " + gross + " * 144 + " + dozen + " * 12 + " + remain);
        input.close();
    }
}
