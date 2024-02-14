public class Circle2D {

    private Point2D center;
    private double radius;

    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public boolean contains(Point2D point) {
        double distance = Point2D.getDistance(center, point);
        return distance <= radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Point2D.getDistance(center, circle.center);
        return distance + circle.radius <= radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Point2D.getDistance(center, circle.center);
        return distance < radius + circle.radius && distance > Math.abs(radius - circle.radius);
    }

    public String toString() {
        return "Center: " + center + ", Radius: " + radius;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(new Point2D(2, 2), 5.5);
        System.out.println(c1);
        System.out.println(c1.contains(new Circle2D(new Point2D(4, 5), 10.5)));
    }
}
