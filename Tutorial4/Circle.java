public class Circle {

    private double radius;
    private String color;

    Circle() {
        radius = 2.0;
        color = "blue";
    }

    Circle(String color) {
        radius = 2.0;
        color = "red";
    }
    Circle(double radius) {
        radius = 1.0;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {

    }
}