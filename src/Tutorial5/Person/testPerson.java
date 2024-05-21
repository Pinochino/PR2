package Tutorial5.Person;

public class testPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Hung", "Haiphong");
        System.out.println(p1);
        Staff p2 = new Staff("Ngoc", "Hanoi", "Transputer", 300);
        System.out.println(p2);
        Student s1 = new Student("Gang", "HaiPhong", "Counting ", 300, 4);
        System.out.println(s1);
        System.out.println(p2);
    }
}
