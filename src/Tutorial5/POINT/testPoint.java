package Tutorial5.POINT;

public class testPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1.5f, 1.5f);
        System.out.println(p1);
        MovablePoint p3 = new MovablePoint(1.5f, 1.5f, 2.6f, 3.4f);
        System.out.println(p3.move());
    }
}
