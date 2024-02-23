package Tutorial4;

public class Circle2D {
    private double radius;
    private Point2D center;

    public Circle2D() {
        this(1, 0, 0);
    }

    public Circle2D(double radius, double x, double y) {
        this.radius = radius;
        this.center = new Point2D(x, y);
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public boolean contains(Point2D point) {
        double distanceSquared = Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2);
        return distanceSquared <= radius * radius;
    }

    public boolean contains(Circle2D circle) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle.getCenter().getX() - center.getX(), 2) + Math.pow(circle.getCenter().getY() - center.getY(), 2));
        return distanceBetweenCenters + circle.getRadius() <= radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle.getCenter().getX() - center.getX(), 2) + Math.pow(circle.getCenter().getY() - center.getY(), 2));
        return distanceBetweenCenters < radius + circle.getRadius() && distanceBetweenCenters > Math.abs(radius - circle.getRadius());
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(5, 0, 0);
        System.out.println(c1.contains(new Point2D(3, 8))); // Should print true
        Circle2D c2 = new Circle2D(2, 0, 0);
        System.out.println(c2.contains(new Point2D(1, 0))); // Should print true
        Circle2D c3 = new Circle2D(5, 0, 0);
        System.out.println(c3.overlaps(new Circle2D(4, 0, 0))); // Should print true
    }
}
