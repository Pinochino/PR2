package Tutorial5.Shape;

public class Circle extends Shape {
    private double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter = Math.PI * 2 * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + " ,radius= " + radius + "]";
    }
}
