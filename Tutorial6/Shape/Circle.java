package Tutorial6.Shape;

public class Circle extends Shape2D {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, Colors color, boolean filled){
        this(radius);
    }

    Circle(double radius, Colors color, boolean filled, Point2D position){
      this(radius);
      setColors(color);
      setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI  * Math.pow(radius, 2);
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = Math.PI  * 2 * radius;
        return perimeter;
    }
}
