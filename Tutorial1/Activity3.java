package Tutorial1;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your eggs: ");
        int eggs = input.nextInt();
        int gross = eggs / 144;
        int dozen = eggs / 12 % 12;
        int remain = eggs - ((gross * 144) + (dozen * 12));
        System.out.println("eggs = " + gross +" * 144 + " + dozen + " *12 + " + remain);
        input.close();
    }
}
