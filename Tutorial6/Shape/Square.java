package Tutorial6.Shape;

import Tutorial6.Shape.Colors;
import Tutorial6.Shape.Point2D;
import Tutorial6.Shape.Rectangle;

public class Square extends Rectangle {
    private  double side;
    Square(){}

    Square(double side){
        super();
    }

    Square(double side, Colors color, boolean filled, Point2D position){
        setFilled(filled);
        setColors(color);
        this.side = side;
        this.getPosition();
    }

    @Override
    public double getArea() {
        double area = side * side;
        return  area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = side * 4;
        return perimeter;
    }
    public  String toString(){
        return "";
    }
}
