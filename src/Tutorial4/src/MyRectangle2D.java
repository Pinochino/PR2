package Tutorial4.src;

public class MyRectangle2D {
    private double width;
    private double heigth;
    private Tutorial4.src.Point2D Point2D;

    MyRectangle2D(){
        width = 1;
        heigth = 1;
        Point2D(0, 0);
    }

    MyRectangle2D(Point2D p1, double heigth, double width){
        this.Point2D= p1;
        this.heigth = heigth;
        this.width = width;
    }
    
    private void Point2D(int i, int j) {}

    public Point2D getPoint2D(){
        return Point2D;
    }

    public void setPoint2D(Point2D p){
        this.Point2D = p;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double  width){
        this.width = width;
    }


    public double getHeight(){
        return heigth;
    }

    public void setHeigth(double heigth){
        this.heigth = heigth;
    }


}

