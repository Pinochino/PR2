package Tutorial4.src;

import java.util.Scanner;
public class Point2D {
    private double x;
    private double y;
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return y;
    }

    public double Distance(double x2, double y2){
        return Math.sqrt((Math.pow(x2-x, 2)) + (Math.pow(y2-y, 2)));
    }

    public double distance(Point2D p) {
        // Solved 02
        double deltaX = p.getX() - this.x;
        double deltaY = p.getY() - this.y;
//		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public String toString(){
        return "p1 is Tutorial4.Point2D [x = " + x + " , y =  " + y + " ] ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point1's x-coordinates: ");
        double x = sc.nextDouble();
        System.out.println("Enter point1's y-coordinates: ");
        double y = sc.nextDouble();
        Point2D p1 = new Point2D(x, y);
        System.out.println("Enter point2's x-coordinates: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter point2's y-coordinates: ");
        double y2 = sc.nextDouble();
        System.out.println("Distance is " + p1.Distance(x2,  y2));
        sc.close();
    }
}
