import Tutorial10.Student;

public class testPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Hung", "Haiphong");
        System.out.println(p1);
        Person p2 = new Staff("Ngoc", "Hanoi", "Tranphu", 300);
        System.out.println(p2);
        Person p3 = new Student("Duong", "QuangNam", "Logistic", 300, 5);
        System.out.println(p3);
        Staff p4 = (Staff) p2;
        System.out.println(p4);
    }
}
