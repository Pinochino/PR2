package Tutorial6.Shape;

public class Point2D{

    private double X;
    private double Y;

    public Point2D(){
        this.X = 0.0;
        this.Y = 0.0;
    }

    public Point2D(double x, double y){
        this.X = x;
        this.Y = y;
    }

    public double getX(){
        return X;
    }

    public void setX(double x){
        this.X = x;
    }


    public double getY(){
        return Y;
    }

    public void setY(double y){
        this.Y = y;
    }

    public double getDistanceTo(double x, double y){
        double distance = Math.sqrt(Math.pow((x-getX()), 2) + Math.pow((y-getY()), 2));
        return distance;
    }
    public double getDistanceTo(Point2D point){
        double distance = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
        return distance;
    }
}