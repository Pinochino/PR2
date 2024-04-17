package Tutorial4;

import Tutorial4.Circle;

public class testCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The information of circe 1: ");
        System.out.println("radius = " + c1.getRadius());
        System.out.println("color = " +   c1.getColor());
        System.out.println("area = " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The information of circe 2: ");
        System.out.println("radius = " +  c2.getRadius());
        System.out.println("color = " +   c2.getColor());
        System.out.println("area = " +  c2.getArea());
       
        Circle c3 = new Circle(1.0, "red");
        System.out.println("The information of circe 3: ");
        System.out.println("radius = " +   c3.getRadius());
        System.out.println("color = " +    c3.getColor());
        System.out.println("area = " +  c3.getArea());
       
    }
}
