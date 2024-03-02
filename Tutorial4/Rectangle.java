package Tutorial4;

public class Rectangle {

    private float width = 1.0f;
    private float length = 1.0f;

    Rectangle() {}

    Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea() {
        float area = length * width;
        return area;
    }

    public float getPerimeter() {
        float perimeter = 2 * (length + width);
        return perimeter;
    }

    public String toString() {
        return "The information of rectangle2 is " + "\n" + "Length is " + length + "\n" + "Width is " + width + "\n"
                + "Area is " + getArea() + "\n" + "Perimeter is " + getPerimeter();
    }

}
