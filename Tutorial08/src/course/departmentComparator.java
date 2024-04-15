package course;

import java.util.Comparator;

public class departmentComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}
