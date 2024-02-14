public class Rectangle {
    private float length;
    private float width;

    Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getHeight(){
        return length;
    }
    public void setHeight(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        double area = length * width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (length + width) * 2;
        return perimeter;
    }
    public String toString(){
        return "The length is " + length + " and the width is " + width;
    }

}
