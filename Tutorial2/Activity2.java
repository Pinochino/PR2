package Tutorial2;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dollars = input.nextDouble();
        System.out.println("The dollars you have: " + dollars);
        int nicker = (int) dollars * 20;
        int penny = (int) dollars * 100;
        int dimes = (int) penny * 10;
        int quarter = (int) penny * 4;
        System.out.println(
                "nicker is " + nicker + " ,penny is " + penny + " ,dime is " + dimes + " , quarter is " + quarter);
        input.close();
    }
}
