package Tutorial4.src;

public class Circle {
    private final double radius;
    private final String color;

    Circle() {
        radius = 2.0;
        color = "blue";
    }

    Circle(double radius) {
        this.radius = radius;
        color= "red";
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * radius * 2;
    }

}
