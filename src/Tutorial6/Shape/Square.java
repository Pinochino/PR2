package Tutorial6.Shape;

public class Square extends Rectangle {
    private  double side;
    Square(double v, String yellow, boolean b){}

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
