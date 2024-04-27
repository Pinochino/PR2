package Tutorial6.Shape;

public class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width, Colors color, boolean filled){
        // this constructor must not assign a Tutorial4.Point2D object to the position attribute
       this(length, width);
       setFilled(filled);
       setColors(color);
    }

    Rectangle(double length, double width, Colors colors, boolean filled, Point2D position){
        super(colors, filled, position);
        this.length = length;
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length =length;
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return (length + width) * 2;
    }

    public String toString(){
        return "Tutorial4.Rectangle[length=  " + length + " ,width= " + width + " ,and perimeter is " + getPerimeter() + " ,and area is " + getArea();
    }
    
}
