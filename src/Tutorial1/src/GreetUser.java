package Tutorial1.src;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        greetUser();
    }

    public static void greetUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        if (name == null) {
            System.out.println("Name cannot be null.");
        } else if (name.isEmpty()) {
            System.out.println("Please provide a valid name.");
        } else if (name.matches("")) {
            System.out.println("Invalid input. The name should not contain numbers.");
        } else {
            String uppercaseName = name.toUpperCase();
            System.out.println("Hello, " + uppercaseName + ", nice to meet you!");
        }
    }
}
