package Tutorial5.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    public String toString() {
        return super.toString() + " ,width= " + width + " ,length" + length + "]";
    }
}
