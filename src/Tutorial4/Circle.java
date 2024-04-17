package Tutorial4;

public class Circle {
    private double radius;
    private String color;

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
        double area = Math.PI * radius * 2;
        return area;
    }

}
