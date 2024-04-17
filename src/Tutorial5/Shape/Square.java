package Tutorial5.Shape;



public class Square extends Rectangle {
    private double side;

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Tutorial6.Shape.Square[" + super.toString() + "]";
    }
}
