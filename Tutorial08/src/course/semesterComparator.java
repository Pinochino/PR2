package course;

import java.util.Comparator;

public class semesterComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getSemester().compareTo(o2.getSemester());
    }
}
