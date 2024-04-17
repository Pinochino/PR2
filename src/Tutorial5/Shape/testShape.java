package Tutorial5.Shape;


public class testShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("Green", false);
        System.out.println(s1);

       Rectangle r1 = new Rectangle(3.5, 4.5, "Green", false);
       System.out.println(r1);

       Square sq1 = new Square(4.6, "Yellow", true);
       System.out.println(sq1);
    }
}
