package Tutorial9.CountLetter;// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************

import java.util.IllegalFormatException;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try{
                System.out.println("Factorial(" + val + ") = "
                        + MathUtils.factorial(val));
            } catch (IllegalFormatException | IllegalAccessException e){
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
