package Tutorial8.src.Course;

import java.util.Comparator;

public class NameCourseComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
