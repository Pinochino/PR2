package Tutorial8.src.person;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        double gpaCompare = o1.getGpa() - o2.getGpa();
        if (gpaCompare > 0.0) {
            return 1;
        } else if (gpaCompare < 0.0) {
            return -1;
        } else {
            return 0;
        }
    }
}
