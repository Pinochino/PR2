package person;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa().compareTo(o2.getGpa());
    }
}
