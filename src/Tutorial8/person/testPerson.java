package Tutorial8.person;

import java.util.ArrayList;
import java.util.List;

public class testPerson {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1, "Hung", "22/11/2004", "Hung@gmail.com", "0335250819","HP");
        Person p2 = new Person(2, "Anna", "21/10/1999", "Hung@gmail.com", "0335250819","HP");
        Person p3 = new Person(3, "Thai", "10/09/2005", "Hung@gmail.com", "0335250819","HP");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.sort(new nameComparator());
        System.out.println("Sort by Name: ");
        for (Person person: list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        list.sort(new AgeComparator());
        System.out.println("Sort by Name: ");
        for (Person person: list) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
