import java.util.Scanner;

public class Point2D {
    private double x;
    private double y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(Point2D p1, Point2D p2) {
        double deltaX = p2.getX() - p1.getX();
        double deltaY = p2.getY() - p1.getY();
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return  "( " + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point1's x-coordinate: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter point1's y-coordinate: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter point2's x-coordinate: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter point2's x-coordinate: ");
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.printf("Enter point1's x-, y-coordinates: %s%n", p1);
        System.out.printf("Enter point2's x-, y-coordinates: %s%n", p2);

        System.out.println("The distance between p1 and p2 is " + getDistance(p1, p2));
        sc.close();

    }
}
