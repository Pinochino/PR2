package Tutorial4;

import java.util.Scanner;
public class testRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The width is ");
        float width1 = sc.nextFloat();
        System.out.println("The height is ");
        float length1 = sc.nextFloat();

        System.out.println("The information of r1 is ");
        Rectangle r1 = new Rectangle(width1, length1);
        r1.setLength(length1);
        System.out.println("Length is: " + r1.getLength());
        r1.setWidth(width1);
        System.out.println("Width is " + r1.getWidth());
        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(side, side);
        System.out.println(r2);

        sc.close();
    }
}
