package Tutorial4.src;

import java.util.Scanner;
public class Point2D {
    private double x1;
    private double y1;
    Point2D(double x1, double y1){
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setX(double x){
        this.x1 = x;
    }

    public double getX(){
        return x1;
    }

    public void setY(double y){
        this.y1 = y;
    }

    public double getY(){
        return y1;
    }

    public double Distance(double x2, double y2){
        double distance = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));
        return distance;
    }

    public String toString(){
        return "p1 is Tutorial4.Point2D [x = " + x1 + " , y =  " + y1 + " ] ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point1's x-coordinates: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter point1's y-coordinates: ");
        double y1 = sc.nextDouble();
        Point2D p1 = new Point2D(x1, y1);
        System.out.println("Enter point2's x-coordinates: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter point2's y-coordinates: ");
        double y2 = sc.nextDouble();
        System.out.println("Distance is " + p1.Distance(x2,  y2));
        sc.close();
    }
}
