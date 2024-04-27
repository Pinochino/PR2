package Tutorial1.src;

import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine().toUpperCase();
        System.out.println("Hello, " + name + ", nice to meet you!");
        input.close();
    }
}
